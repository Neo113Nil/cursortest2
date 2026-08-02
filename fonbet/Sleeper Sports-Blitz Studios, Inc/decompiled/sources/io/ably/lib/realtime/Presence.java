package io.ably.lib.realtime;

import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.PresenceSerializer;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.util.Log;
import io.ably.lib.util.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public class Presence {
    public static final String GET_CLIENTID = "clientId";
    public static final String GET_CONNECTIONID = "connectionId";
    public static final String GET_WAITFORSYNC = "waitForSync";
    private static final String TAG = Channel.class.getName();
    private final Channel channel;
    private String currentSyncChannelSerial;
    private final PresenceMap internalPresence;
    private final Multicaster listeners;
    private final PresenceMap presence;
    public boolean syncComplete;
    private final EnumMap<PresenceMessage.Action, Multicaster> eventListeners = new EnumMap<>(PresenceMessage.Action.class);
    private final List<QueuedPresence> pendingPresence = new ArrayList();

    public interface PresenceListener {
        void onPresenceMessage(PresenceMessage presenceMessage);
    }

    public synchronized PresenceMessage[] get(Param... paramArr) throws AblyException {
        Collection<PresenceMessage> collection;
        if (this.channel.state == ChannelState.failed) {
            throw AblyException.fromErrorInfo(new ErrorInfo("channel operation failed (invalid channel state)", 90001));
        }
        this.channel.attach();
        try {
            collection = this.presence.get(paramArr);
        } catch (InterruptedException e) {
            Log.v(TAG, String.format(Locale.ROOT, "Channel %s: get() operation interrupted", this.channel.name));
            throw AblyException.fromThrowable(e);
        }
        return (PresenceMessage[]) collection.toArray(new PresenceMessage[collection.size()]);
    }

    public synchronized PresenceMessage[] get(boolean z) throws AblyException {
        return get(new Param(GET_WAITFORSYNC, String.valueOf(z)));
    }

    public synchronized PresenceMessage[] get(String str, boolean z) throws AblyException {
        return get(new Param(GET_WAITFORSYNC, String.valueOf(z)), new Param(GET_CLIENTID, str));
    }

    void addPendingPresence(PresenceMessage presenceMessage, CompletionListener completionListener) {
        synchronized (this.channel) {
            this.pendingPresence.add(new QueuedPresence(presenceMessage, completionListener));
        }
    }

    public void subscribe(PresenceListener presenceListener, CompletionListener completionListener) throws AblyException {
        implicitAttachOnSubscribe(completionListener);
        this.listeners.add(presenceListener);
    }

    public void subscribe(PresenceListener presenceListener) throws AblyException {
        subscribe(presenceListener, (CompletionListener) null);
    }

    public void unsubscribe(PresenceListener presenceListener) {
        this.listeners.remove(presenceListener);
        Iterator<Multicaster> it = this.eventListeners.values().iterator();
        while (it.hasNext()) {
            it.next().remove(presenceListener);
        }
    }

    public void subscribe(PresenceMessage.Action action, PresenceListener presenceListener, CompletionListener completionListener) throws AblyException {
        implicitAttachOnSubscribe(completionListener);
        subscribeImpl(action, presenceListener);
    }

    public void subscribe(PresenceMessage.Action action, PresenceListener presenceListener) throws AblyException {
        subscribe(action, presenceListener, (CompletionListener) null);
    }

    public void unsubscribe(PresenceMessage.Action action, PresenceListener presenceListener) {
        unsubscribeImpl(action, presenceListener);
    }

    public void subscribe(EnumSet<PresenceMessage.Action> enumSet, PresenceListener presenceListener, CompletionListener completionListener) throws AblyException {
        implicitAttachOnSubscribe(completionListener);
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            subscribeImpl((PresenceMessage.Action) it.next(), presenceListener);
        }
    }

    public void subscribe(EnumSet<PresenceMessage.Action> enumSet, PresenceListener presenceListener) throws AblyException {
        subscribe(enumSet, presenceListener, (CompletionListener) null);
    }

    public void unsubscribe(EnumSet<PresenceMessage.Action> enumSet, PresenceListener presenceListener) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            unsubscribeImpl((PresenceMessage.Action) it.next(), presenceListener);
        }
    }

    public void unsubscribe() {
        this.listeners.clear();
        this.eventListeners.clear();
    }

    private void implicitAttachOnSubscribe(CompletionListener completionListener) throws AblyException {
        if (!this.channel.attachOnSubscribeEnabled()) {
            if (completionListener == null) {
                return;
            }
            String format = String.format("Channel %s: attachOnSubscribe=false doesn't expect attach completion callback", this.channel.name);
            Log.e(TAG, format);
            throw AblyException.fromErrorInfo(new ErrorInfo(format, 400, 40000));
        }
        if (this.channel.state == ChannelState.failed) {
            String format2 = String.format(Locale.ROOT, "Channel %s: subscribe in FAILED channel state", this.channel.name);
            Log.e(TAG, format2);
            throw AblyException.fromErrorInfo(new ErrorInfo(format2, 90001));
        }
        this.channel.attach(completionListener);
    }

    private void endSync() {
        List<PresenceMessage> endSync = this.presence.endSync();
        for (PresenceMessage presenceMessage : endSync) {
            presenceMessage.action = PresenceMessage.Action.leave;
            presenceMessage.id = null;
            presenceMessage.timestamp = System.currentTimeMillis();
        }
        broadcastPresence(endSync);
    }

    private void updateInnerPresenceMessageFields(ProtocolMessage protocolMessage) {
        for (int i = 0; i < protocolMessage.presence.length; i++) {
            PresenceMessage presenceMessage = protocolMessage.presence[i];
            try {
                presenceMessage.decode(this.channel.options);
            } catch (MessageDecodeException e) {
                Log.e(TAG, String.format(Locale.ROOT, "%s on channel %s", e.errorInfo.message, this.channel.name));
            }
            if (presenceMessage.connectionId == null) {
                presenceMessage.connectionId = protocolMessage.connectionId;
            }
            if (presenceMessage.timestamp == 0) {
                presenceMessage.timestamp = protocolMessage.timestamp;
            }
            if (presenceMessage.id == null) {
                presenceMessage.id = protocolMessage.id + AbstractJsonLexerKt.COLON + i;
            }
        }
    }

    void onSync(ProtocolMessage protocolMessage) {
        String str;
        String str2 = protocolMessage.channelSerial;
        if (StringUtils.isNullOrEmpty(str2)) {
            str = null;
        } else {
            String[] split = str2.split(":");
            String str3 = split[0];
            str = split.length > 1 ? split[1] : "";
            if (this.presence.syncInProgress && !StringUtils.isNullOrEmpty(this.currentSyncChannelSerial) && !this.currentSyncChannelSerial.equals(str3)) {
                endSync();
            }
            this.presence.startSync();
            if (!StringUtils.isNullOrEmpty(str)) {
                this.currentSyncChannelSerial = str3;
            }
        }
        onPresence(protocolMessage);
        if (StringUtils.isNullOrEmpty(str2) || StringUtils.isNullOrEmpty(str)) {
            endSync();
            this.currentSyncChannelSerial = null;
        }
    }

    void onPresence(ProtocolMessage protocolMessage) {
        boolean put;
        updateInnerPresenceMessageFields(protocolMessage);
        ArrayList arrayList = new ArrayList();
        for (PresenceMessage presenceMessage : protocolMessage.presence) {
            boolean equals = presenceMessage.connectionId.equals(this.channel.ably.connection.id);
            int i = AnonymousClass2.$SwitchMap$io$ably$lib$types$PresenceMessage$Action[presenceMessage.action.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                PresenceMessage presenceMessage2 = (PresenceMessage) presenceMessage.clone();
                presenceMessage2.action = PresenceMessage.Action.present;
                put = this.presence.put(presenceMessage2);
                if (equals) {
                    this.internalPresence.put(presenceMessage);
                }
            } else if (i != 4) {
                put = false;
            } else {
                put = this.presence.remove(presenceMessage);
                if (equals) {
                    this.internalPresence.remove(presenceMessage);
                }
            }
            if (put) {
                arrayList.add(presenceMessage);
            }
        }
        broadcastPresence(arrayList);
    }

    private void broadcastPresence(List<PresenceMessage> list) {
        for (PresenceMessage presenceMessage : list) {
            this.listeners.onPresenceMessage(presenceMessage);
            Multicaster multicaster = this.eventListeners.get(presenceMessage.action);
            if (multicaster != null) {
                multicaster.onPresenceMessage(presenceMessage);
            }
        }
    }

    private static class Multicaster extends io.ably.lib.util.Multicaster<PresenceListener> implements PresenceListener {
        private Multicaster() {
            super(new PresenceListener[0]);
        }

        @Override // io.ably.lib.realtime.Presence.PresenceListener
        public void onPresenceMessage(PresenceMessage presenceMessage) {
            Iterator<PresenceListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onPresenceMessage(presenceMessage);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void subscribeImpl(PresenceMessage.Action action, PresenceListener presenceListener) {
        Multicaster multicaster = this.eventListeners.get(action);
        if (multicaster == null) {
            multicaster = new Multicaster();
            this.eventListeners.put((EnumMap<PresenceMessage.Action, Multicaster>) action, (PresenceMessage.Action) multicaster);
        }
        multicaster.add(presenceListener);
    }

    private void unsubscribeImpl(PresenceMessage.Action action, PresenceListener presenceListener) {
        Multicaster multicaster = this.eventListeners.get(action);
        if (multicaster != null) {
            multicaster.remove(presenceListener);
            if (multicaster.isEmpty()) {
                this.eventListeners.remove(action);
            }
        }
    }

    public void enter(Object obj, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "enter(); channel = " + this.channel.name);
        updatePresence(new PresenceMessage(PresenceMessage.Action.enter, null, obj), completionListener);
    }

    public void update(Object obj, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "update(); channel = " + this.channel.name);
        updatePresence(new PresenceMessage(PresenceMessage.Action.update, null, obj), completionListener);
    }

    public void leave(Object obj, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "leave(); channel = " + this.channel.name);
        updatePresence(new PresenceMessage(PresenceMessage.Action.leave, null, obj), completionListener);
    }

    public void leave(CompletionListener completionListener) throws AblyException {
        leave(null, completionListener);
    }

    public void enterClient(String str) throws AblyException {
        enterClient(str, null);
    }

    public void enterClient(String str, Object obj) throws AblyException {
        enterClient(str, obj, null);
    }

    public void enterClient(String str, Object obj, CompletionListener completionListener) throws AblyException {
        if (str == null) {
            String format = String.format(Locale.ROOT, "Channel %s: unable to enter presence channel (null clientId specified)", this.channel.name);
            Log.v(TAG, format);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(format, 40000));
                return;
            }
        }
        Log.v(TAG, "enterClient(); channel = " + this.channel.name + "; clientId = " + str);
        updatePresence(new PresenceMessage(PresenceMessage.Action.enter, str, obj), completionListener);
    }

    private void enterClientWithId(String str, String str2, Object obj, CompletionListener completionListener) throws AblyException {
        if (str2 == null) {
            String format = String.format(Locale.ROOT, "Channel %s: unable to enter presence channel (null clientId specified)", this.channel.name);
            Log.v(TAG, format);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(format, 40000));
                return;
            }
        }
        PresenceMessage presenceMessage = new PresenceMessage(PresenceMessage.Action.enter, str2, obj);
        presenceMessage.id = str;
        Log.v(TAG, "enterClient(); channel = " + this.channel.name + "; clientId = " + str2);
        updatePresence(presenceMessage, completionListener);
    }

    public void updateClient(String str) throws AblyException {
        updateClient(str, null);
    }

    public void updateClient(String str, Object obj) throws AblyException {
        updateClient(str, obj, null);
    }

    public void updateClient(String str, Object obj, CompletionListener completionListener) throws AblyException {
        if (str == null) {
            String format = String.format(Locale.ROOT, "Channel %s: unable to update presence channel (null clientId specified)", this.channel.name);
            Log.v(TAG, format);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(format, 40000));
                return;
            }
        }
        Log.v(TAG, "updateClient(); channel = " + this.channel.name + "; clientId = " + str);
        updatePresence(new PresenceMessage(PresenceMessage.Action.update, str, obj), completionListener);
    }

    public void leaveClient(String str) throws AblyException {
        leaveClient(str, null);
    }

    public void leaveClient(String str, Object obj) throws AblyException {
        leaveClient(str, obj, null);
    }

    public void leaveClient(String str, Object obj, CompletionListener completionListener) throws AblyException {
        if (str == null) {
            String format = String.format(Locale.ROOT, "Channel %s: unable to leave presence channel (null clientId specified)", this.channel.name);
            Log.v(TAG, format);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(format, 40000));
                return;
            }
        }
        Log.v(TAG, "leaveClient(); channel = " + this.channel.name + "; clientId = " + str);
        updatePresence(new PresenceMessage(PresenceMessage.Action.leave, str, obj), completionListener);
    }

    public void updatePresence(PresenceMessage presenceMessage, CompletionListener completionListener) throws AblyException {
        String str = TAG;
        Log.v(str, "updatePresence(); channel = " + this.channel.name);
        AblyRealtime ablyRealtime = this.channel.ably;
        try {
            ablyRealtime.auth.checkClientId(presenceMessage, false, ablyRealtime.connection.state == ConnectionState.connected);
            presenceMessage.encode(null);
            synchronized (this.channel) {
                int i = AnonymousClass2.$SwitchMap$io$ably$lib$realtime$ChannelState[this.channel.state.ordinal()];
                if (i == 1) {
                    this.channel.attach();
                } else if (i != 2) {
                    if (i == 3) {
                        Log.v(str, "updatePresence(); send message to connection manager");
                        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.presence, this.channel.name);
                        protocolMessage.presence = new PresenceMessage[]{presenceMessage};
                        ablyRealtime.connection.connectionManager.send(protocolMessage, ablyRealtime.options.queueMessages, completionListener);
                    } else {
                        throw AblyException.fromErrorInfo(new ErrorInfo("Unable to enter presence channel in detached or failed state", 400, 91001));
                    }
                }
                Log.v(str, "updatePresence(); put message in pending presence queue");
                this.pendingPresence.add(new QueuedPresence(presenceMessage, completionListener));
            }
        } catch (AblyException e) {
            if (completionListener != null) {
                completionListener.onError(e.errorInfo);
            }
        }
    }

    /* renamed from: io.ably.lib.realtime.Presence$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$realtime$ChannelState;
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$types$PresenceMessage$Action;

        static {
            int[] iArr = new int[ChannelState.values().length];
            $SwitchMap$io$ably$lib$realtime$ChannelState = iArr;
            try {
                iArr[ChannelState.initialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.attaching.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.attached.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PresenceMessage.Action.values().length];
            $SwitchMap$io$ably$lib$types$PresenceMessage$Action = iArr2;
            try {
                iArr2[PresenceMessage.Action.enter.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.update.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.present.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.leave.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.absent.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public PaginatedResult<PresenceMessage> history(Param[] paramArr) throws AblyException {
        return history(this.channel.ably.http, paramArr);
    }

    PaginatedResult<PresenceMessage> history(Http http, Param[] paramArr) throws AblyException {
        return historyImpl(http, paramArr).sync();
    }

    public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
        historyImpl(this.channel.ably.http, paramArr).async(callback);
    }

    void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
        historyImpl(http, paramArr).async(callback);
    }

    private BasePaginatedQuery.ResultRequest<PresenceMessage> historyImpl(Http http, Param[] paramArr) {
        try {
            Param[] replacePlaceholderParams = Channel.replacePlaceholderParams(this.channel, paramArr);
            AblyRealtime ablyRealtime = this.channel.ably;
            return new BasePaginatedQuery(http, this.channel.basePath + "/presence/history", HttpUtils.defaultAcceptHeaders(ablyRealtime.options.useBinaryProtocol), replacePlaceholderParams, PresenceSerializer.getPresenceResponseHandler(this.channel.options)).get();
        } catch (AblyException e) {
            return new BasePaginatedQuery.ResultRequest.Failed(e);
        }
    }

    private static class QueuedPresence {
        public CompletionListener listener;
        public PresenceMessage msg;

        QueuedPresence(PresenceMessage presenceMessage, CompletionListener completionListener) {
            this.msg = presenceMessage;
            this.listener = completionListener;
        }
    }

    private void sendQueuedMessages() {
        CompletionListener completionListener;
        Log.v(TAG, "sendQueuedMessages()");
        AblyRealtime ablyRealtime = this.channel.ably;
        boolean z = ablyRealtime.options.queueMessages;
        ConnectionManager connectionManager = ablyRealtime.connection.connectionManager;
        int size = this.pendingPresence.size();
        if (size == 0) {
            return;
        }
        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.presence, this.channel.name);
        Iterator<QueuedPresence> it = this.pendingPresence.iterator();
        PresenceMessage[] presenceMessageArr = new PresenceMessage[size];
        protocolMessage.presence = presenceMessageArr;
        int i = 0;
        if (size == 1) {
            QueuedPresence next = it.next();
            presenceMessageArr[0] = next.msg;
            completionListener = next.listener;
        } else {
            CompletionListener.Multicaster multicaster = new CompletionListener.Multicaster(new CompletionListener[0]);
            while (it.hasNext()) {
                QueuedPresence next2 = it.next();
                int i2 = i + 1;
                presenceMessageArr[i] = next2.msg;
                if (next2.listener != null) {
                    multicaster.add(next2.listener);
                }
                i = i2;
            }
            boolean isEmpty = multicaster.isEmpty();
            completionListener = multicaster;
            if (isEmpty) {
                completionListener = null;
            }
        }
        this.pendingPresence.clear();
        try {
            connectionManager.send(protocolMessage, z, completionListener);
        } catch (AblyException e) {
            Log.e(TAG, "sendQueuedMessages(): Unexpected exception sending message", e);
            if (completionListener != null) {
                completionListener.onError(e.errorInfo);
            }
        }
    }

    private void failQueuedMessages(ErrorInfo errorInfo) {
        Log.v(TAG, "failQueuedMessages()");
        for (QueuedPresence queuedPresence : this.pendingPresence) {
            if (queuedPresence.listener != null) {
                try {
                    queuedPresence.listener.onError(errorInfo);
                } catch (Throwable th) {
                    Log.e(TAG, "failQueuedMessages(): Unexpected exception calling listener", th);
                }
            }
        }
        this.pendingPresence.clear();
    }

    void onAttached(boolean z) {
        this.presence.startSync();
        if (!z) {
            endSync();
        }
        sendQueuedMessages();
        enterInternalMembers();
    }

    void enterInternalMembers() {
        for (final PresenceMessage presenceMessage : this.internalPresence.members.values()) {
            try {
                enterClientWithId(presenceMessage.id, presenceMessage.clientId, presenceMessage.data, new CompletionListener() { // from class: io.ably.lib.realtime.Presence.1
                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onSuccess() {
                    }

                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onError(ErrorInfo errorInfo) {
                        String format = String.format(Locale.ROOT, "Cannot automatically re-enter %s on channel %s (%s)", presenceMessage.clientId, Presence.this.channel.name, errorInfo == null ? "" : errorInfo.message);
                        Log.e(Presence.TAG, format);
                        Presence.this.channel.emitUpdate(new ErrorInfo(format, 91004), true);
                    }
                });
            } catch (AblyException e) {
                String format = String.format(Locale.ROOT, "Cannot automatically re-enter %s on channel %s (%s)", presenceMessage.clientId, this.channel.name, e.errorInfo.message);
                Log.e(TAG, format);
                this.channel.emitUpdate(new ErrorInfo(format, 91004), true);
            }
        }
    }

    void onChannelDetachedOrFailed(ErrorInfo errorInfo) {
        synchronized (this.presence) {
            this.presence.notifyAll();
        }
        this.presence.clear();
        this.internalPresence.clear();
        failQueuedMessages(errorInfo);
    }

    void onChannelSuspended(ErrorInfo errorInfo) {
        synchronized (this.presence) {
            this.presence.notifyAll();
        }
        failQueuedMessages(errorInfo);
    }

    private class PresenceMap {
        private final HashMap<String, PresenceMessage> members;
        private Collection<String> residualMembers;
        private boolean syncInProgress;

        private PresenceMap() {
            this.members = new HashMap<>();
        }

        synchronized void waitForSync() throws AblyException, InterruptedException {
            String format;
            int i;
            boolean z;
            while (Presence.this.channel.state == ChannelState.attaching) {
                wait();
            }
            boolean z2 = false;
            if (Presence.this.channel.state == ChannelState.attached) {
                do {
                    z = !this.syncInProgress && Presence.this.syncComplete;
                    if (!z) {
                        wait();
                    }
                } while (!z);
                z2 = z;
            }
            if (Presence.this.channel.state == ChannelState.suspended) {
                format = String.format(Locale.ROOT, "Channel %s: presence state is out of sync due to the channel being in a SUSPENDED state", Presence.this.channel.name);
                i = 91005;
            } else if (!z2) {
                format = String.format(Locale.ROOT, "Channel %s: cannot get presence state because channel is in invalid state", Presence.this.channel.name);
                i = 90001;
            }
            Log.v(Presence.TAG, format);
            throw AblyException.fromErrorInfo(new ErrorInfo(format, i));
        }

        synchronized Collection<PresenceMessage> get(Param[] paramArr) throws AblyException, InterruptedException {
            HashSet hashSet;
            String str = null;
            boolean z = true;
            String str2 = null;
            for (Param param : paramArr) {
                String str3 = param.key;
                int hashCode = str3.hashCode();
                if (hashCode != -485951537) {
                    if (hashCode != 908408390) {
                        if (hashCode == 1923106969 && str3.equals(Presence.GET_CONNECTIONID)) {
                            str2 = param.value;
                        }
                    } else if (str3.equals(Presence.GET_CLIENTID)) {
                        str = param.value;
                    }
                } else if (str3.equals(Presence.GET_WAITFORSYNC)) {
                    z = Boolean.parseBoolean(param.value);
                }
            }
            hashSet = new HashSet();
            if (z) {
                waitForSync();
            }
            for (PresenceMessage presenceMessage : this.members.values()) {
                if (str == null || presenceMessage.clientId.equals(str)) {
                    if (str2 == null || presenceMessage.connectionId.equals(str2)) {
                        hashSet.add(presenceMessage);
                    }
                }
            }
            return hashSet;
        }

        synchronized boolean put(PresenceMessage presenceMessage) {
            String memberKey = memberKey(presenceMessage);
            Collection<String> collection = this.residualMembers;
            if (collection != null) {
                collection.remove(memberKey);
            }
            if (hasNewerItem(memberKey, presenceMessage)) {
                return false;
            }
            this.members.put(memberKey, presenceMessage);
            return true;
        }

        synchronized boolean hasNewerItem(String str, PresenceMessage presenceMessage) {
            PresenceMessage presenceMessage2 = this.members.get(str);
            if (presenceMessage2 == null) {
                return false;
            }
            if (presenceMessage.connectionId != null && presenceMessage2.connectionId != null && (!presenceMessage.id.startsWith(presenceMessage.connectionId) || !presenceMessage2.id.startsWith(presenceMessage2.connectionId))) {
                return presenceMessage2.timestamp >= presenceMessage.timestamp;
            }
            String[] split = presenceMessage.id.split(":", 3);
            String[] split2 = presenceMessage2.id.split(":", 3);
            if (split.length < 3 || split2.length < 3) {
                return false;
            }
            try {
                long parseLong = Long.parseLong(split[1]);
                long parseLong2 = Long.parseLong(split[2]);
                long parseLong3 = Long.parseLong(split2[1]);
                long parseLong4 = Long.parseLong(split2[2]);
                if (parseLong3 > parseLong || (parseLong3 == parseLong && parseLong4 >= parseLong2)) {
                    r0 = true;
                }
                return r0;
            } catch (NumberFormatException unused) {
                return false;
            }
        }

        synchronized boolean remove(PresenceMessage presenceMessage) {
            String memberKey = memberKey(presenceMessage);
            if (hasNewerItem(memberKey, presenceMessage)) {
                return false;
            }
            PresenceMessage remove = this.members.remove(memberKey);
            if (remove != null) {
                if (remove.action == PresenceMessage.Action.absent) {
                    return false;
                }
            }
            return true;
        }

        synchronized void startSync() {
            Log.v(Presence.TAG, "startSync(); channel = " + Presence.this.channel.name + "; syncInProgress = " + this.syncInProgress);
            if (!this.syncInProgress) {
                this.residualMembers = new HashSet(this.members.keySet());
                this.syncInProgress = true;
            }
        }

        synchronized List<PresenceMessage> endSync() {
            ArrayList arrayList;
            Log.v(Presence.TAG, "endSync(); channel = " + Presence.this.channel.name + "; syncInProgress = " + this.syncInProgress);
            arrayList = new ArrayList();
            if (this.syncInProgress) {
                Iterator<Map.Entry<String, PresenceMessage>> it = this.members.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().action == PresenceMessage.Action.absent) {
                        it.remove();
                    }
                }
                Iterator<String> it2 = this.residualMembers.iterator();
                while (it2.hasNext()) {
                    PresenceMessage remove = this.members.remove(it2.next());
                    if (remove != null) {
                        arrayList.add((PresenceMessage) remove.clone());
                    }
                }
                this.residualMembers = null;
                this.syncInProgress = false;
            }
            Presence.this.syncComplete = true;
            notifyAll();
            return arrayList;
        }

        synchronized void clear() {
            this.members.clear();
            Collection<String> collection = this.residualMembers;
            if (collection != null) {
                collection.clear();
            }
        }

        public String memberKey(PresenceMessage presenceMessage) {
            return presenceMessage.memberKey();
        }
    }

    private class InternalPresenceMap extends PresenceMap {
        private InternalPresenceMap() {
            super();
        }

        @Override // io.ably.lib.realtime.Presence.PresenceMap
        public String memberKey(PresenceMessage presenceMessage) {
            return presenceMessage.clientId;
        }
    }

    Presence(Channel channel) {
        this.listeners = new Multicaster();
        this.presence = new PresenceMap();
        this.internalPresence = new InternalPresenceMap();
        this.channel = channel;
    }
}
