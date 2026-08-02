package io.ably.lib.realtime;

import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.objects.RealtimeObjects;
import io.ably.lib.realtime.ChannelStateListener;
import io.ably.lib.rest.RestAnnotations;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.transport.Defaults;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelMode;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ChannelProperties;
import io.ably.lib.types.DecodingContext;
import io.ably.lib.types.DeltaExtras;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageAnnotations;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.MessageSerializer;
import io.ably.lib.types.MessageVersion;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.Summary;
import io.ably.lib.util.CollectionUtils;
import io.ably.lib.util.EventEmitter;
import io.ably.lib.util.Log;
import io.ably.lib.util.Multicaster;
import io.ably.lib.util.ReconnectionStrategy;
import io.ably.lib.util.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public abstract class ChannelBase extends EventEmitter<ChannelEvent, ChannelStateListener> {
    private static final String KEY_FROM_SERIAL = "fromSerial";
    private static final String KEY_UNTIL_ATTACH = "untilAttach";
    static ErrorInfo REASON_NOT_ATTACHED = new ErrorInfo("Channel not attached", 400, 90001);
    private static final String TAG = Channel.class.getName();
    final AblyRealtime ably;
    public final RealtimeAnnotations annotations;
    private boolean attachResume;
    private Timer attachTimer;
    final String basePath;
    private boolean decodeFailureRecoveryInProgress;
    private final DecodingContext decodingContext;
    private String lastPayloadMessageId;
    private String lastPayloadProtocolMessageChannelSerial;
    private final LiveObjectsPlugin liveObjectsPlugin;
    private Set<ChannelMode> modes;
    public final String name;
    ChannelOptions options;
    private Map<String, String> params;
    private AttachRequest pendingAttachRequest;
    private DetachRequest pendingDetachRequest;
    public final Presence presence;
    public ErrorInfo reason;
    private Timer reattachTimer;
    public ChannelState state;
    public ChannelProperties properties = new ChannelProperties();
    private int retryAttempt = 0;
    private AtomicBoolean released = new AtomicBoolean(false);
    private MessageMulticaster listeners = new MessageMulticaster();
    private HashMap<String, MessageMulticaster> eventListeners = new HashMap<>();

    public interface MessageListener {
        void onMessage(Message message);
    }

    public RealtimeObjects getObjects() throws AblyException {
        LiveObjectsPlugin liveObjectsPlugin = this.liveObjectsPlugin;
        if (liveObjectsPlugin == null) {
            throw AblyException.fromErrorInfo(new ErrorInfo("LiveObjects plugin hasn't been installed, add runtimeOnly('io.ably:liveobjects:<ably-version>') to your dependency tree", 400, 40019));
        }
        return liveObjectsPlugin.getInstance(this.name);
    }

    private static class AttachRequest {
        final CompletionListener completionListener;
        final boolean forceReattach;

        private AttachRequest(boolean z, CompletionListener completionListener) {
            this.forceReattach = z;
            this.completionListener = completionListener;
        }
    }

    private static class DetachRequest {
        final CompletionListener completionListener;

        private DetachRequest(CompletionListener completionListener) {
            this.completionListener = completionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(ChannelState channelState, ErrorInfo errorInfo) {
        setState(channelState, errorInfo, false, true);
    }

    private void setState(ChannelState channelState, ErrorInfo errorInfo, boolean z) {
        setState(channelState, errorInfo, z, true);
    }

    private void setState(ChannelState channelState, ErrorInfo errorInfo, boolean z, boolean z2) {
        ChannelStateListener.ChannelStateChange channelStateChange;
        Log.v(TAG, "setState(): channel = " + this.name + "; setting " + channelState);
        synchronized (this) {
            channelStateChange = new ChannelStateListener.ChannelStateChange(channelState, this.state, errorInfo, z);
            this.state = channelStateChange.current;
            this.reason = channelStateChange.reason;
        }
        if (this.liveObjectsPlugin != null && channelState != ChannelState.attached) {
            try {
                this.liveObjectsPlugin.handleStateChange(this.name, channelState, false);
            } catch (Throwable th) {
                Log.e(TAG, "Unexpected exception in liveObjectsPlugin.handle", th);
            }
        }
        if (channelState != ChannelState.attaching && channelState != ChannelState.suspended) {
            this.retryAttempt = 0;
        }
        if (channelState == ChannelState.detached || channelState == ChannelState.suspended || channelState == ChannelState.failed) {
            this.properties.channelSerial = null;
        }
        if (z2) {
            emit(channelState, channelStateChange);
        }
        if (channelState == ChannelState.detached && this.pendingAttachRequest != null) {
            Log.v(TAG, "Pending attach request after detach- now reattaching channel:" + this.name);
            attach(this.pendingAttachRequest.forceReattach, this.pendingAttachRequest.completionListener);
            this.pendingAttachRequest = null;
            return;
        }
        if (channelState != ChannelState.attached || this.pendingDetachRequest == null) {
            return;
        }
        Log.v(TAG, "Pending detach request after attach. Now detaching channel:" + this.name);
        try {
            detach(this.pendingDetachRequest.completionListener);
            this.pendingDetachRequest = null;
        } catch (AblyException e) {
            Log.e(TAG, "Channel failed to detach after attach:" + this.name, e);
        }
    }

    public void attach() throws AblyException {
        attach(null);
    }

    public void attach(CompletionListener completionListener) throws AblyException {
        attach(false, completionListener);
    }

    void attach(boolean z, CompletionListener completionListener) {
        clearAttachTimers();
        attachWithTimeout(z, completionListener, null);
    }

    synchronized void transferQueuedPresenceMessages(List<ConnectionManager.QueuedMessage> list) {
        this.state = ChannelState.attaching;
        if (list != null) {
            for (ConnectionManager.QueuedMessage queuedMessage : list) {
                PresenceMessage[] presenceMessageArr = queuedMessage.msg.presence;
                if (presenceMessageArr != null && presenceMessageArr.length > 0) {
                    for (PresenceMessage presenceMessage : presenceMessageArr) {
                        this.presence.addPendingPresence(presenceMessage, queuedMessage.listener);
                    }
                }
            }
        }
    }

    private void attachImpl(boolean z, CompletionListener completionListener, ErrorInfo errorInfo) throws AblyException {
        String str = TAG;
        Log.v(str, "attach(); channel = " + this.name);
        if (!z) {
            int i = AnonymousClass7.$SwitchMap$io$ably$lib$realtime$ChannelState[this.state.ordinal()];
            if (i == 1) {
                if (completionListener != null) {
                    on(new ChannelStateCompletionListener(completionListener, ChannelState.attached, ChannelState.failed));
                    return;
                }
                return;
            } else if (i == 2) {
                this.pendingAttachRequest = new AttachRequest(z, completionListener);
                return;
            } else if (i == 3) {
                callCompletionListenerSuccess(completionListener);
                return;
            } else if (i == 4) {
                this.reason = null;
            }
        }
        ConnectionManager connectionManager = this.ably.connection.connectionManager;
        if (!connectionManager.isActive()) {
            throw AblyException.fromErrorInfo(connectionManager.getStateErrorInfo());
        }
        ConnectionState connectionState = connectionManager.getConnectionState().state;
        if (connectionState == ConnectionState.connecting || connectionState == ConnectionState.disconnected) {
            if (completionListener != null) {
                on(new ChannelStateCompletionListener(completionListener, ChannelState.attached, ChannelState.failed));
            }
            setState(ChannelState.attaching, errorInfo);
            return;
        }
        Log.v(str, "attach(); channel = " + this.name + "; sending ATTACH request");
        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.attach, this.name);
        ChannelOptions channelOptions = this.options;
        if (channelOptions != null) {
            if (channelOptions.hasParams()) {
                protocolMessage.params = CollectionUtils.copy(this.options.params);
            }
            if (this.options.hasModes()) {
                protocolMessage.setFlags(this.options.getModeFlags());
            }
        }
        protocolMessage.channelSerial = this.properties.channelSerial;
        if (this.decodeFailureRecoveryInProgress) {
            Log.v(str, "attach(); message decode recovery in progress, setting last message channelserial");
            protocolMessage.channelSerial = this.lastPayloadProtocolMessageChannelSerial;
        }
        if (completionListener != null) {
            on(new ChannelStateCompletionListener(completionListener, ChannelState.attached, ChannelState.failed));
        }
        if (this.attachResume) {
            protocolMessage.setFlag(ProtocolMessage.Flag.attach_resume);
        }
        setState(ChannelState.attaching, errorInfo);
        connectionManager.send(protocolMessage, true, null);
    }

    public void detach() throws AblyException {
        detach(null);
    }

    public void markAsReleased() {
        this.released.set(true);
    }

    public void detach(CompletionListener completionListener) throws AblyException {
        clearAttachTimers();
        detachWithTimeout(completionListener);
    }

    private void detachImpl(CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "detach(); channel = " + this.name);
        int i = AnonymousClass7.$SwitchMap$io$ably$lib$realtime$ChannelState[this.state.ordinal()];
        if (i == 1) {
            this.pendingDetachRequest = new DetachRequest(completionListener);
            return;
        }
        if (i == 2) {
            if (completionListener != null) {
                on(new ChannelStateCompletionListener(completionListener, ChannelState.detached, ChannelState.failed));
                return;
            }
            return;
        }
        if (i == 4) {
            ErrorInfo errorInfo = this.reason;
            if (errorInfo == null) {
                errorInfo = new ErrorInfo("Channel state is failed", 90000);
            }
            callCompletionListenerError(completionListener, errorInfo);
            return;
        }
        if (i == 5 || i == 6) {
            callCompletionListenerSuccess(completionListener);
            return;
        }
        if (i == 7) {
            setState(ChannelState.detached, null);
            callCompletionListenerSuccess(completionListener);
        } else {
            ConnectionManager connectionManager = this.ably.connection.connectionManager;
            if (!connectionManager.isActive()) {
                throw AblyException.fromErrorInfo(connectionManager.getStateErrorInfo());
            }
            sendDetachMessage(completionListener);
        }
    }

    private void sendDetachMessage(CompletionListener completionListener) throws AblyException {
        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.detach, this.name);
        if (completionListener != null) {
            on(new ChannelStateCompletionListener(completionListener, ChannelState.detached, ChannelState.failed));
        }
        this.attachResume = false;
        if (this.released.get()) {
            setDetached(null);
        } else {
            setState(ChannelState.detaching, null);
        }
        this.ably.connection.connectionManager.send(protocolMessage, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callCompletionListenerSuccess(CompletionListener completionListener) {
        if (completionListener != null) {
            try {
                completionListener.onSuccess();
            } catch (Throwable th) {
                Log.e(TAG, "Unexpected exception calling CompletionListener", th);
            }
        }
    }

    @Deprecated
    public void sync() throws AblyException {
        Log.w(TAG, "sync() method is intended only for internal testing purpose as per RTP19");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callCompletionListenerError(CompletionListener completionListener, ErrorInfo errorInfo) {
        if (completionListener != null) {
            try {
                completionListener.onError(errorInfo);
            } catch (Throwable th) {
                Log.e(TAG, "Unexpected exception calling CompletionListener", th);
            }
        }
    }

    private void setAttached(ProtocolMessage protocolMessage) {
        clearAttachTimers();
        this.properties.attachSerial = protocolMessage.channelSerial;
        this.params = protocolMessage.params;
        this.modes = ChannelMode.toSet(protocolMessage.flags);
        this.attachResume = true;
        if (this.state == ChannelState.detaching || this.state == ChannelState.detached) {
            Log.v(TAG, "setAttached(): channel is in detaching state, as per RTL5k sending detach message!");
            try {
                sendDetachMessage(null);
                return;
            } catch (AblyException e) {
                Log.e(TAG, e.getMessage(), e);
                return;
            }
        }
        LiveObjectsPlugin liveObjectsPlugin = this.liveObjectsPlugin;
        if (liveObjectsPlugin != null) {
            try {
                liveObjectsPlugin.handleStateChange(this.name, ChannelState.attached, protocolMessage.hasFlag(ProtocolMessage.Flag.has_objects));
            } catch (Throwable th) {
                Log.e(TAG, "Unexpected exception in liveObjectsPlugin.handle", th);
            }
        }
        if (this.state == ChannelState.attached) {
            Log.v(TAG, String.format(Locale.ROOT, "Server initiated attach for channel %s", this.name));
            if (protocolMessage.hasFlag(ProtocolMessage.Flag.resumed)) {
                return;
            }
            emitUpdate(protocolMessage.error, false);
            this.presence.onAttached(protocolMessage.hasFlag(ProtocolMessage.Flag.has_presence));
            return;
        }
        setState(ChannelState.attached, protocolMessage.error, protocolMessage.hasFlag(ProtocolMessage.Flag.resumed));
        this.presence.onAttached(protocolMessage.hasFlag(ProtocolMessage.Flag.has_presence));
    }

    private void setDetached(ErrorInfo errorInfo) {
        clearAttachTimers();
        Log.v(TAG, "setDetached(); channel = " + this.name);
        this.presence.onChannelDetachedOrFailed(errorInfo);
        setState(ChannelState.detached, errorInfo);
    }

    private void setFailed(ErrorInfo errorInfo) {
        clearAttachTimers();
        Log.v(TAG, "setFailed(); channel = " + this.name);
        this.presence.onChannelDetachedOrFailed(errorInfo);
        this.attachResume = false;
        setState(ChannelState.failed, errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void clearAttachTimers() {
        Timer[] timerArr = {this.attachTimer, this.reattachTimer};
        this.reattachTimer = null;
        this.attachTimer = null;
        for (int i = 0; i < 2; i++) {
            Timer timer = timerArr[i];
            if (timer != null) {
                timer.cancel();
                timer.purge();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachWithTimeout(CompletionListener completionListener) throws AblyException {
        attachWithTimeout(false, completionListener, null);
    }

    private synchronized void attachWithTimeout(boolean z, final CompletionListener completionListener, ErrorInfo errorInfo) {
        checkChannelIsNotReleased();
        try {
            final Timer timer = new Timer();
            this.attachTimer = timer;
            try {
                attachImpl(z, new CompletionListener() { // from class: io.ably.lib.realtime.ChannelBase.1
                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onSuccess() {
                        ChannelBase.this.clearAttachTimers();
                        ChannelBase.callCompletionListenerSuccess(completionListener);
                    }

                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onError(ErrorInfo errorInfo2) {
                        ChannelBase.this.clearAttachTimers();
                        ChannelBase.callCompletionListenerError(completionListener, errorInfo2);
                    }
                }, errorInfo);
            } catch (AblyException e) {
                this.attachTimer = null;
                callCompletionListenerError(completionListener, e.errorInfo);
            }
            Timer timer2 = this.attachTimer;
            if (timer2 == null) {
                return;
            }
            timer2.schedule(new TimerTask() { // from class: io.ably.lib.realtime.ChannelBase.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    String format = String.format(Locale.ROOT, "Attach timed out for channel %s", ChannelBase.this.name);
                    Log.v(ChannelBase.TAG, format);
                    synchronized (ChannelBase.this) {
                        if (ChannelBase.this.attachTimer != timer) {
                            return;
                        }
                        ChannelBase.this.attachTimer = null;
                        if (ChannelBase.this.state == ChannelState.attaching) {
                            ChannelBase.this.setSuspended(new ErrorInfo(format, 90007), true);
                            ChannelBase.this.reattachAfterTimeout();
                        }
                    }
                }
            }, Defaults.realtimeRequestTimeout);
        } catch (Throwable th) {
            callCompletionListenerError(completionListener, ErrorInfo.fromThrowable(th));
        }
    }

    private void checkChannelIsNotReleased() {
        if (this.released.get()) {
            throw new IllegalStateException("Unable to perform any operation on released channel");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void reattachAfterTimeout() {
        try {
            final Timer timer = new Timer();
            this.reattachTimer = timer;
            this.retryAttempt++;
            this.reattachTimer.schedule(new TimerTask() { // from class: io.ably.lib.realtime.ChannelBase.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    synchronized (ChannelBase.this) {
                        if (timer != ChannelBase.this.reattachTimer) {
                            return;
                        }
                        ChannelBase.this.reattachTimer = null;
                        if (ChannelBase.this.state == ChannelState.suspended) {
                            try {
                                ChannelBase.this.attachWithTimeout(null);
                            } catch (AblyException e) {
                                Log.e(ChannelBase.TAG, "Reattach channel failed; channel = " + ChannelBase.this.name, e);
                            }
                        }
                    }
                }
            }, ReconnectionStrategy.getRetryTime(this.ably.options.channelRetryTimeout, this.retryAttempt));
        } catch (Throwable unused) {
        }
    }

    private synchronized void detachWithTimeout(final CompletionListener completionListener) {
        final ChannelState channelState = this.state;
        try {
            final Timer timer = this.released.get() ? null : new Timer();
            this.attachTimer = timer;
            try {
                detachImpl(this.released.get() ? null : new CompletionListener() { // from class: io.ably.lib.realtime.ChannelBase.4
                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onSuccess() {
                        ChannelBase.this.clearAttachTimers();
                        ChannelBase.callCompletionListenerSuccess(completionListener);
                    }

                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onError(ErrorInfo errorInfo) {
                        ChannelBase.this.clearAttachTimers();
                        ChannelBase.callCompletionListenerError(completionListener, errorInfo);
                    }
                });
            } catch (AblyException e) {
                this.attachTimer = null;
                callCompletionListenerError(completionListener, e.errorInfo);
            }
            Timer timer2 = this.attachTimer;
            if (timer2 == null) {
                return;
            }
            timer2.schedule(new TimerTask() { // from class: io.ably.lib.realtime.ChannelBase.5
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    synchronized (ChannelBase.this) {
                        if (timer != ChannelBase.this.attachTimer) {
                            return;
                        }
                        ChannelBase.this.attachTimer = null;
                        if (ChannelBase.this.state == ChannelState.detaching) {
                            ErrorInfo errorInfo = new ErrorInfo("Detach operation timed out", 90007);
                            ChannelBase.callCompletionListenerError(completionListener, errorInfo);
                            ChannelBase.this.setState(channelState, errorInfo);
                        }
                    }
                }
            }, Defaults.realtimeRequestTimeout);
        } catch (Throwable th) {
            callCompletionListenerError(completionListener, ErrorInfo.fromThrowable(th));
        }
    }

    public void setConnected() {
        if (this.state.isReattachable()) {
            attach(true, null);
        }
    }

    public void setConnectionFailed(ErrorInfo errorInfo) {
        clearAttachTimers();
        if (this.state == ChannelState.attached || this.state == ChannelState.attaching) {
            setFailed(errorInfo);
        }
    }

    public void setConnectionClosed(ErrorInfo errorInfo) {
        clearAttachTimers();
        if (this.state == ChannelState.attached || this.state == ChannelState.attaching) {
            setDetached(errorInfo);
        }
    }

    public synchronized void setSuspended(ErrorInfo errorInfo, boolean z) {
        clearAttachTimers();
        if (this.state == ChannelState.attached || this.state == ChannelState.attaching) {
            Log.v(TAG, "setSuspended(); channel = " + this.name);
            this.presence.onChannelSuspended(errorInfo);
            setState(ChannelState.suspended, errorInfo, false, z);
        }
    }

    public synchronized void setReinitialized() {
        clearAttachTimers();
        setState(ChannelState.initialized, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ably.lib.util.EventEmitter
    public void apply(ChannelStateListener channelStateListener, ChannelEvent channelEvent, Object... objArr) {
        try {
            channelStateListener.onChannelStateChanged((ChannelStateListener.ChannelStateChange) objArr[0]);
        } catch (Throwable th) {
            Log.e(TAG, "Unexpected exception calling ChannelStateListener", th);
        }
    }

    public synchronized void unsubscribe() {
        Log.v(TAG, "unsubscribe(); channel = " + this.name);
        this.listeners.clear();
        this.eventListeners.clear();
    }

    protected boolean attachOnSubscribeEnabled() {
        ChannelOptions channelOptions = this.options;
        return channelOptions == null || channelOptions.attachOnSubscribe;
    }

    public synchronized void subscribe(MessageListener messageListener) throws AblyException {
        Log.v(TAG, "subscribe(); channel = " + this.name);
        this.listeners.add(messageListener);
        if (attachOnSubscribeEnabled()) {
            attach();
        }
    }

    public synchronized void unsubscribe(MessageListener messageListener) {
        Log.v(TAG, "unsubscribe(); channel = " + this.name);
        this.listeners.remove(messageListener);
        Iterator<MessageMulticaster> it = this.eventListeners.values().iterator();
        while (it.hasNext()) {
            it.next().remove(messageListener);
        }
    }

    public synchronized void subscribe(String str, MessageListener messageListener) throws AblyException {
        Log.v(TAG, "subscribe(); channel = " + this.name + "; event = " + str);
        subscribeImpl(str, messageListener);
        if (attachOnSubscribeEnabled()) {
            attach();
        }
    }

    public synchronized void unsubscribe(String str, MessageListener messageListener) {
        Log.v(TAG, "unsubscribe(); channel = " + this.name + "; event = " + str);
        unsubscribeImpl(str, messageListener);
    }

    public synchronized void subscribe(String[] strArr, MessageListener messageListener) throws AblyException {
        Log.v(TAG, "subscribe(); channel = " + this.name + "; (multiple events)");
        for (String str : strArr) {
            subscribeImpl(str, messageListener);
        }
        if (attachOnSubscribeEnabled()) {
            attach();
        }
    }

    public synchronized void unsubscribe(String[] strArr, MessageListener messageListener) {
        Log.v(TAG, "unsubscribe(); channel = " + this.name + "; (multiple events)");
        for (String str : strArr) {
            unsubscribeImpl(str, messageListener);
        }
    }

    private void onMessage(ProtocolMessage protocolMessage) {
        String str = TAG;
        Log.v(str, "onMessage(); channel = " + this.name);
        Message[] messageArr = protocolMessage.messages;
        Message message = messageArr[0];
        Message message2 = messageArr[messageArr.length - 1];
        DeltaExtras delta = message.extras == null ? null : message.extras.getDelta();
        if (delta != null && !delta.getFrom().equals(this.lastPayloadMessageId)) {
            Log.e(str, String.format(Locale.ROOT, "Delta message decode failure - previous message not available. Message id = %s, channel = %s", message.id, this.name));
            startDecodeFailureRecovery();
            return;
        }
        int i = 0;
        while (i < messageArr.length) {
            Message message3 = messageArr[i];
            if (message3.connectionId == null) {
                message3.connectionId = protocolMessage.connectionId;
            }
            if (message3.timestamp == 0) {
                message3.timestamp = protocolMessage.timestamp;
            }
            if (message3.id == null) {
                message3.id = protocolMessage.id + AbstractJsonLexerKt.COLON + i;
            }
            if (message3.version == null) {
                message3.version = new MessageVersion(message3.serial, Long.valueOf(message3.timestamp));
            }
            if (message3.version.serial == null) {
                message3.version.serial = message3.serial;
            }
            if (message3.version.timestamp == 0) {
                message3.version.timestamp = message3.timestamp;
            }
            if (message3.annotations == null) {
                message3.annotations = new MessageAnnotations();
            }
            if (message3.annotations.summary == null) {
                message3.annotations.summary = new Summary(new HashMap());
            }
            try {
                if (message3.data != null) {
                    message3.decode(this.options, this.decodingContext);
                }
            } catch (MessageDecodeException e) {
                if (e.errorInfo.code == 40018) {
                    Log.e(TAG, String.format(Locale.ROOT, "Delta message decode failure - %s. Message id = %s, channel = %s", e.errorInfo.message, message3.id, this.name));
                    startDecodeFailureRecovery();
                    while (true) {
                        i++;
                        if (i >= messageArr.length) {
                            return;
                        }
                        String str2 = messageArr[i].id;
                        if (str2 == null) {
                            str2 = protocolMessage.id + AbstractJsonLexerKt.COLON + i;
                        }
                        Log.v(TAG, String.format(Locale.ROOT, "Delta recovery in progress - message skipped. Message id = %s, channel = %s", str2, this.name));
                    }
                } else {
                    Log.e(TAG, String.format(Locale.ROOT, "Message decode failure - %s. Message id = %s, channel = %s", e.errorInfo.message, message3.id, this.name));
                }
            }
            MessageMulticaster messageMulticaster = this.eventListeners.get(message3.name);
            if (messageMulticaster != null) {
                messageMulticaster.onMessage(message3);
            }
            i++;
        }
        this.lastPayloadMessageId = message2.id;
        this.lastPayloadProtocolMessageChannelSerial = protocolMessage.channelSerial;
        for (Message message4 : messageArr) {
            this.listeners.onMessage(message4);
        }
    }

    private void startDecodeFailureRecovery() {
        if (this.decodeFailureRecoveryInProgress) {
            return;
        }
        Log.w(TAG, "Starting delta decode failure recovery process");
        this.decodeFailureRecoveryInProgress = true;
        attach(true, new CompletionListener() { // from class: io.ably.lib.realtime.ChannelBase.6
            @Override // io.ably.lib.realtime.CompletionListener
            public void onSuccess() {
                ChannelBase.this.decodeFailureRecoveryInProgress = false;
            }

            @Override // io.ably.lib.realtime.CompletionListener
            public void onError(ErrorInfo errorInfo) {
                ChannelBase.this.decodeFailureRecoveryInProgress = false;
            }
        });
    }

    private static class MessageMulticaster extends Multicaster<MessageListener> implements MessageListener {
        private MessageMulticaster() {
            super(new MessageListener[0]);
        }

        @Override // io.ably.lib.realtime.ChannelBase.MessageListener
        public void onMessage(Message message) {
            Iterator<MessageListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onMessage(message);
                } catch (Throwable th) {
                    Log.e(ChannelBase.TAG, "Unexpected exception calling listener", th);
                }
            }
        }
    }

    private void subscribeImpl(String str, MessageListener messageListener) throws AblyException {
        MessageMulticaster messageMulticaster = this.eventListeners.get(str);
        if (messageMulticaster == null) {
            messageMulticaster = new MessageMulticaster();
            this.eventListeners.put(str, messageMulticaster);
        }
        messageMulticaster.add(messageListener);
    }

    private void unsubscribeImpl(String str, MessageListener messageListener) {
        MessageMulticaster messageMulticaster = this.eventListeners.get(str);
        if (messageMulticaster != null) {
            messageMulticaster.remove(messageListener);
            if (messageMulticaster.isEmpty()) {
                this.eventListeners.remove(str);
            }
        }
    }

    public void publish(String str, Object obj) throws AblyException {
        publish(str, obj, null);
    }

    public void publish(Message message) throws AblyException {
        publish(message, (CompletionListener) null);
    }

    public void publish(Message[] messageArr) throws AblyException {
        publish(messageArr, (CompletionListener) null);
    }

    public void publish(String str, Object obj, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "publish(String, Object); channel = " + this.name + "; event = " + str);
        publish(new Message[]{new Message(str, obj)}, completionListener);
    }

    public void publish(Message message, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "publish(Message); channel = " + this.name + "; event = " + message.name);
        publish(new Message[]{message}, completionListener);
    }

    public synchronized void publish(Message[] messageArr, CompletionListener completionListener) throws AblyException {
        Log.v(TAG, "publish(Message[]); channel = " + this.name);
        ConnectionManager connectionManager = this.ably.connection.connectionManager;
        ConnectionManager.State connectionState = connectionManager.getConnectionState();
        boolean z = this.ably.options.queueMessages;
        if (!connectionManager.isActive() || (connectionState.queueEvents && !z)) {
            throw AblyException.fromErrorInfo(connectionState.defaultErrorInfo);
        }
        boolean z2 = connectionState.sendEvents;
        try {
            for (Message message : messageArr) {
                this.ably.auth.checkClientId(message, true, z2);
                message.encode(this.options);
            }
            ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.message, this.name);
            protocolMessage.messages = messageArr;
            int i = AnonymousClass7.$SwitchMap$io$ably$lib$realtime$ChannelState[this.state.ordinal()];
            if (i == 4 || i == 7) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Unable to publish in failed or suspended state", 400, 40000));
            }
            connectionManager.send(protocolMessage, z, completionListener);
        } catch (AblyException e) {
            callCompletionListenerError(completionListener, e.errorInfo);
        }
    }

    private static class FailedMessage {
        ConnectionManager.QueuedMessage msg;
        ErrorInfo reason;

        FailedMessage(ConnectionManager.QueuedMessage queuedMessage, ErrorInfo errorInfo) {
            this.msg = queuedMessage;
            this.reason = errorInfo;
        }
    }

    static Param[] replacePlaceholderParams(Channel channel, Param[] paramArr) throws AblyException {
        if (paramArr == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Param param : paramArr) {
            if (KEY_UNTIL_ATTACH.equals(param.key)) {
                if ("true".equalsIgnoreCase(param.value)) {
                    if (channel.state != ChannelState.attached) {
                        throw AblyException.fromErrorInfo(new ErrorInfo("option untilAttach requires the channel to be attached", 40000, 400));
                    }
                    hashSet.add(new Param(KEY_FROM_SERIAL, channel.properties.attachSerial));
                } else if (!"false".equalsIgnoreCase(param.value)) {
                    throw AblyException.fromErrorInfo(new ErrorInfo("option untilAttach is invalid. \"true\" or \"false\" expected", 40000, 400));
                }
            } else {
                hashSet.add(param);
            }
        }
        return (Param[]) hashSet.toArray(new Param[hashSet.size()]);
    }

    public PaginatedResult<Message> history(Param[] paramArr) throws AblyException {
        return historyImpl(this.ably.http, paramArr).sync();
    }

    PaginatedResult<Message> history(Http http, Param[] paramArr) throws AblyException {
        return historyImpl(http, paramArr).sync();
    }

    public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        historyAsync(this.ably.http, paramArr, callback);
    }

    void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        historyImpl(http, paramArr).async(callback);
    }

    private BasePaginatedQuery.ResultRequest<Message> historyImpl(Http http, Param[] paramArr) {
        try {
            return new BasePaginatedQuery(http, this.basePath + "/history", HttpUtils.defaultAcceptHeaders(this.ably.options.useBinaryProtocol), replacePlaceholderParams((Channel) this, paramArr), MessageSerializer.getMessageResponseHandler(this.options)).get();
        } catch (AblyException e) {
            return new BasePaginatedQuery.ResultRequest.Failed(e);
        }
    }

    public void setOptions(ChannelOptions channelOptions) throws AblyException {
        setOptions(channelOptions, null);
    }

    public void setOptions(ChannelOptions channelOptions, CompletionListener completionListener) throws AblyException {
        this.options = channelOptions;
        if (shouldReattachToSetOptions(channelOptions)) {
            attach(true, completionListener);
        } else {
            callCompletionListenerSuccess(completionListener);
        }
    }

    boolean shouldReattachToSetOptions(ChannelOptions channelOptions) {
        if (this.state == ChannelState.attached || this.state == ChannelState.attaching) {
            return channelOptions.hasModes() || channelOptions.hasParams();
        }
        return false;
    }

    public Map<String, String> getParams() {
        return CollectionUtils.copy(this.params);
    }

    public ChannelMode[] getModes() {
        Set<ChannelMode> set = this.modes;
        if (set == null) {
            return new ChannelMode[0];
        }
        return (ChannelMode[]) set.toArray(new ChannelMode[set.size()]);
    }

    public ChannelOptions getOptions() {
        return this.options;
    }

    private class ChannelStateCompletionListener implements ChannelStateListener {
        private CompletionListener completionListener;
        private final ChannelState failureState;
        private final ChannelState successState;

        ChannelStateCompletionListener(CompletionListener completionListener, ChannelState channelState, ChannelState channelState2) {
            this.completionListener = completionListener;
            this.successState = channelState;
            this.failureState = channelState2;
        }

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateListener.ChannelStateChange channelStateChange) {
            if (channelStateChange.current.equals(this.successState)) {
                ChannelBase.this.off(this);
                this.completionListener.onSuccess();
            } else if (channelStateChange.current.equals(this.failureState)) {
                ChannelBase.this.off(this);
                this.completionListener.onError(ChannelBase.this.reason);
            }
        }
    }

    ChannelBase(AblyRealtime ablyRealtime, String str, ChannelOptions channelOptions, LiveObjectsPlugin liveObjectsPlugin) throws AblyException {
        Log.v(TAG, "RealtimeChannel(); channel = " + str);
        this.ably = ablyRealtime;
        this.name = str;
        this.basePath = "/channels/" + HttpUtils.encodeURIComponent(str);
        setOptions(channelOptions);
        this.presence = new Presence((Channel) this);
        this.attachResume = false;
        this.state = ChannelState.initialized;
        this.decodingContext = new DecodingContext();
        this.liveObjectsPlugin = liveObjectsPlugin;
        if (liveObjectsPlugin != null) {
            liveObjectsPlugin.getInstance(str);
        }
        this.annotations = new RealtimeAnnotations(this, new RestAnnotations(str, ablyRealtime.http, ablyRealtime.options, channelOptions));
    }

    void onChannelMessage(ProtocolMessage protocolMessage) {
        String str;
        if (!StringUtils.isNullOrEmpty(protocolMessage.channelSerial) && (protocolMessage.action == ProtocolMessage.Action.message || protocolMessage.action == ProtocolMessage.Action.presence || protocolMessage.action == ProtocolMessage.Action.attached)) {
            Log.v(TAG, String.format(Locale.ROOT, "Setting channel serial for channelName - %s, previous - %s, current - %s", this.name, this.properties.channelSerial, protocolMessage.channelSerial));
            this.properties.channelSerial = protocolMessage.channelSerial;
        }
        switch (AnonymousClass7.$SwitchMap$io$ably$lib$types$ProtocolMessage$Action[protocolMessage.action.ordinal()]) {
            case 1:
                setAttached(protocolMessage);
                break;
            case 2:
            case 3:
                int i = AnonymousClass7.$SwitchMap$io$ably$lib$realtime$ChannelState[this.state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 7) {
                            Log.v(TAG, String.format(Locale.ROOT, "Server initiated detach for channel %s; attempting reattach", this.name));
                            attachWithTimeout(true, null, protocolMessage.error);
                            break;
                        }
                    } else {
                        setDetached(protocolMessage.error != null ? protocolMessage.error : REASON_NOT_ATTACHED);
                        break;
                    }
                } else {
                    Log.v(TAG, String.format(Locale.ROOT, "Server initiated detach for channel %s whilst attaching; moving to suspended", this.name));
                    setSuspended(protocolMessage.error, true);
                    reattachAfterTimeout();
                    break;
                }
                break;
            case 4:
                if (this.state == ChannelState.attached) {
                    onMessage(protocolMessage);
                    break;
                } else {
                    if (this.decodeFailureRecoveryInProgress) {
                        str = "Delta recovery in progress - message skipped.";
                    } else {
                        str = "Message skipped on a channel that is not ATTACHED.";
                    }
                    for (Message message : protocolMessage.messages) {
                        Log.v(TAG, String.format(str.concat(" Message id = %s, channel = %s"), message.id, this.name));
                    }
                    break;
                }
            case 5:
                this.presence.onSync(protocolMessage);
                break;
            case 6:
                this.presence.onPresence(protocolMessage);
                break;
            case 7:
                setFailed(protocolMessage.error);
                break;
            case 8:
                this.annotations.onAnnotation(protocolMessage);
                break;
            default:
                Log.e(TAG, "onChannelMessage(): Unexpected message action (" + protocolMessage.action + ")");
                break;
        }
    }

    /* renamed from: io.ably.lib.realtime.ChannelBase$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$realtime$ChannelState;
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$types$ProtocolMessage$Action;

        static {
            int[] iArr = new int[ProtocolMessage.Action.values().length];
            $SwitchMap$io$ably$lib$types$ProtocolMessage$Action = iArr;
            try {
                iArr[ProtocolMessage.Action.attached.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.detach.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.detached.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.message.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.sync.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.presence.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.error.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.annotation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChannelState.values().length];
            $SwitchMap$io$ably$lib$realtime$ChannelState = iArr2;
            try {
                iArr2[ChannelState.attaching.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.detaching.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.attached.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.initialized.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.detached.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.suspended.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    void emitUpdate(ErrorInfo errorInfo, boolean z) {
        if (this.state == ChannelState.attached) {
            emit((ChannelBase) ChannelEvent.update, ChannelStateListener.ChannelStateChange.createUpdateEvent(errorInfo, z));
        }
    }

    public void emit(ChannelState channelState, ChannelStateListener.ChannelStateChange channelStateChange) {
        super.emit((ChannelBase) channelState.getChannelEvent(), channelStateChange);
    }

    public void on(ChannelState channelState, ChannelStateListener channelStateListener) {
        super.on((ChannelBase) channelState.getChannelEvent(), (ChannelEvent) channelStateListener);
    }

    public void once(ChannelState channelState, ChannelStateListener channelStateListener) {
        super.once((ChannelBase) channelState.getChannelEvent(), (ChannelEvent) channelStateListener);
    }

    public void sendProtocolMessage(ProtocolMessage protocolMessage, CompletionListener completionListener) throws AblyException {
        this.ably.connection.connectionManager.send(protocolMessage, this.ably.options.queueMessages, completionListener);
    }
}
