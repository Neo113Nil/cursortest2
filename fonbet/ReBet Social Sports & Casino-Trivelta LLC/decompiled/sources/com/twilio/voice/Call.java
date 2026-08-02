package com.twilio.voice;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import com.twilio.voice.Constants;
import com.twilio.voice.ThreadUtils;
import com.twilio.voice.Voice;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes4.dex */
public class Call extends InternalCall {
    private static final Logger logger = Logger.getLogger(Call.class);
    private final CallInvite callInvite;
    private CallMessageListener callMessageListener;
    private CallMessageListenerProxy callMessageListenerProxy;
    private Set<CallQualityWarning> currentCallQualityWarning;
    EventListener eventListenerProxy;
    private Listener listener;
    private MediaFactory mediaFactory;
    private long nativeCallDelegate;
    private Queue<Pair<Handler, StatsListener>> statsListenersQueue;
    private final ThreadUtils.ThreadChecker threadChecker;
    private List<LocalAudioTrack> localAudioTracks = Collections.EMPTY_LIST;
    private ConnectivityReceiver connectivityReceiver = null;
    private final Listener callListenerProxy = new AnonymousClass1();
    private final StatsListener statsListenerProxy = new StatsListener() { // from class: com.twilio.voice.d
        @Override // com.twilio.voice.StatsListener
        public final void onStats(List list) {
            Call.b(Call.this, list);
        }
    };

    /* renamed from: com.twilio.voice.Call$1, reason: invalid class name */
    public class AnonymousClass1 implements Listener {
        public AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, Set set, Call call, Set set2) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onCallQualityWarningsChanged(): {" + Call.this + "}");
            Call.this.currentCallQualityWarning = set;
            Call.this.listener.onCallQualityWarningsChanged(call, set, set2);
        }

        public static /* synthetic */ void b(AnonymousClass1 anonymousClass1, Call call, CallException callException) {
            anonymousClass1.getClass();
            Call.logger.d("Call::callListenerProxy::onDisconnected(): {" + Call.this + "}");
            Call.this.threadChecker.checkIsOnValidThread();
            Call.this.releaseCall();
            Call call2 = Call.this;
            call2.unregisterConnectivityBroadcastReceiver(call2.context);
            Voice.calls.remove(Call.this);
            Voice.rejects.remove(Call.this);
            Call call3 = Call.this;
            call3.state = State.DISCONNECTED;
            call3.release();
            Call.this.listener.onDisconnected(call, callException);
        }

        public static /* synthetic */ void c(AnonymousClass1 anonymousClass1, Call call, CallException callException) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onReconnecting(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.RECONNECTING;
            call2.listener.onReconnecting(call, callException);
        }

        public static /* synthetic */ void d(AnonymousClass1 anonymousClass1, Call call) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onConnectFailure(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.CONNECTED;
            call2.listener.onReconnected(call);
        }

        public static /* synthetic */ void e(AnonymousClass1 anonymousClass1, Call call, CallException callException) {
            anonymousClass1.getClass();
            Call.logger.d("Call::callListenerProxy::onConnectFailure(): {" + Call.this + "}");
            Call.this.threadChecker.checkIsOnValidThread();
            Call.this.releaseCall();
            Call call2 = Call.this;
            call2.unregisterConnectivityBroadcastReceiver(call2.context);
            Voice.calls.remove(Call.this);
            Voice.rejects.remove(Call.this);
            Call call3 = Call.this;
            call3.state = State.DISCONNECTED;
            call3.release();
            Call.this.listener.onConnectFailure(call, callException);
        }

        public static /* synthetic */ void f(AnonymousClass1 anonymousClass1, Call call) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onConnected(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.CONNECTED;
            call.sid = call2.nativeGetSid(call2.nativeCallDelegate);
            Call.this.listener.onConnected(call);
        }

        public static /* synthetic */ void g(AnonymousClass1 anonymousClass1, Call call) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onRinging(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.RINGING;
            call.sid = call2.nativeGetSid(call2.nativeCallDelegate);
            Call.this.listener.onRinging(call);
        }

        @Override // com.twilio.voice.Call.Listener
        public void onCallQualityWarningsChanged(final Call call, final Set<CallQualityWarning> set, final Set<CallQualityWarning> set2) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.j
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.a(Call.AnonymousClass1.this, set, call, set2);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onConnectFailure(@NonNull final Call call, @NonNull final CallException callException) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.h
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.e(Call.AnonymousClass1.this, call, callException);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onConnected(@NonNull final Call call) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.e
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.f(Call.AnonymousClass1.this, call);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onDisconnected(@NonNull final Call call, final CallException callException) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.i
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.b(Call.AnonymousClass1.this, call, callException);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onReconnected(@NonNull final Call call) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.f
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.d(Call.AnonymousClass1.this, call);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onReconnecting(@NonNull final Call call, @NonNull final CallException callException) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.k
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.c(Call.AnonymousClass1.this, call, callException);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onRinging(@NonNull final Call call) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.g
                @Override // java.lang.Runnable
                public final void run() {
                    Call.AnonymousClass1.g(Call.AnonymousClass1.this, call);
                }
            });
        }
    }

    public interface CallMessageListener {
        void onMessageFailure(String str, String str2, VoiceException voiceException);

        void onMessageReceived(String str, CallMessage callMessage);

        void onMessageSent(String str, String str2);
    }

    public enum CallQualityWarning {
        WARN_HIGH_RTT("high-rtt"),
        WARN_HIGH_JITTER("high-jitter"),
        WARN_HIGH_PACKET_LOSS("high-packet-loss"),
        WARN_LOW_MOS("low-mos"),
        WARN_CONSTANT_AUDIO_IN_LEVEL("constant-audio-input-level"),
        WARN_CONSTANT_AUDIO_OUTPUT_LEVEL("constant-audio-output-level");

        private final String warningName;

        CallQualityWarning(String str) {
            this.warningName = str;
        }

        public static CallQualityWarning fromString(String str) {
            CallQualityWarning callQualityWarning = WARN_HIGH_RTT;
            if (str.equals(callQualityWarning.warningName)) {
                return callQualityWarning;
            }
            CallQualityWarning callQualityWarning2 = WARN_HIGH_JITTER;
            if (str.equals(callQualityWarning2.warningName)) {
                return callQualityWarning2;
            }
            CallQualityWarning callQualityWarning3 = WARN_HIGH_PACKET_LOSS;
            if (str.equals(callQualityWarning3.warningName)) {
                return callQualityWarning3;
            }
            CallQualityWarning callQualityWarning4 = WARN_LOW_MOS;
            if (str.equals(callQualityWarning4.warningName)) {
                return callQualityWarning4;
            }
            CallQualityWarning callQualityWarning5 = WARN_CONSTANT_AUDIO_IN_LEVEL;
            if (str.equals(callQualityWarning5.warningName)) {
                return callQualityWarning5;
            }
            CallQualityWarning callQualityWarning6 = WARN_CONSTANT_AUDIO_OUTPUT_LEVEL;
            if (str.equals(callQualityWarning6.warningName)) {
                return callQualityWarning6;
            }
            throw new RuntimeException("Unsupported warning name string -> " + str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.warningName;
        }
    }

    public interface EventListener {
        void onEvent(Map<String, Pair<String, Class>> map);

        void onMetric(Map<String, Pair<String, Class>> map);
    }

    public enum Issue {
        NOT_REPORTED("not-reported"),
        DROPPED_CALL("dropped-call"),
        AUDIO_LATENCY("audio-latency"),
        ONE_WAY_AUDIO("one-way-audio"),
        CHOPPY_AUDIO("choppy-audio"),
        NOISY_CALL("noisy-call"),
        ECHO("echo");

        private final String issueName;

        Issue(String str) {
            this.issueName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.issueName;
        }
    }

    public interface Listener {
        default void onCallQualityWarningsChanged(@NonNull Call call, @NonNull Set<CallQualityWarning> set, @NonNull Set<CallQualityWarning> set2) {
        }

        void onConnectFailure(@NonNull Call call, @NonNull CallException callException);

        void onConnected(@NonNull Call call);

        void onDisconnected(@NonNull Call call, CallException callException);

        void onReconnected(@NonNull Call call);

        void onReconnecting(@NonNull Call call, @NonNull CallException callException);

        void onRinging(@NonNull Call call);
    }

    public enum Score {
        NOT_REPORTED(0),
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);

        private final int score;

        Score(int i10) {
            this.score = i10;
        }

        public int getValue() {
            return this.score;
        }
    }

    public enum State {
        CONNECTING,
        RINGING,
        CONNECTED,
        RECONNECTING,
        DISCONNECTED
    }

    public Call(Context context, CallInvite callInvite, Listener listener) {
        Preconditions.checkApplicationContext(context, "must create Call with application context");
        this.context = context;
        this.listener = listener;
        this.from = callInvite.getFrom();
        this.to = callInvite.getTo();
        this.sid = callInvite.getCallSid();
        this.bridgeToken = callInvite.getBridgeToken();
        this.callInvite = callInvite;
        this.disconnectCalled = false;
        this.direction = Constants.Direction.INCOMING;
        Handler createHandler = Utils.createHandler();
        this.handler = createHandler;
        this.threadChecker = new ThreadUtils.ThreadChecker(createHandler.getLooper().getThread());
        this.state = State.CONNECTING;
        EventPublisher eventPublisher = new EventPublisher(context, Constants.getClientSdkProductName(), this.bridgeToken);
        this.publisher = eventPublisher;
        eventPublisher.addListener(this);
        this.statsListenersQueue = new ConcurrentLinkedQueue();
    }

    public static /* synthetic */ void b(Call call, final List list) {
        final Pair<Handler, StatsListener> poll = call.statsListenersQueue.poll();
        if (poll != null) {
            ((Handler) poll.first).post(new Runnable() { // from class: com.twilio.voice.c
                @Override // java.lang.Runnable
                public final void run() {
                    ((StatsListener) poll.second).onStats(list);
                }
            });
        }
    }

    private boolean isPermittedNetworkChangeEvent(Voice.NetworkChangeEvent networkChangeEvent) {
        if (networkChangeEvent != Voice.NetworkChangeEvent.CONNECTION_CHANGED) {
            return true;
        }
        State state = this.state;
        return (state == State.CONNECTING || state == State.RINGING) ? false : true;
    }

    private native long nativeAccept(AcceptOptions acceptOptions, Listener listener, StatsListener statsListener, EventListener eventListener, CallMessageListener callMessageListener, Handler handler, long j10);

    private native long nativeConnect(ConnectOptions connectOptions, Listener listener, StatsListener statsListener, EventListener eventListener, CallMessageListener callMessageListener, long j10, Handler handler);

    private native void nativeDisconnect(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeGetSid(long j10);

    private native void nativeGetStats(long j10);

    private native void nativeHold(long j10, boolean z10);

    private native void nativeMute(long j10, boolean z10);

    private native void nativeNetworkChange(long j10, Voice.NetworkChangeEvent networkChangeEvent);

    private native long nativeReject(AcceptOptions acceptOptions, Listener listener, EventListener eventListener, CallMessageListener callMessageListener, Handler handler, long j10);

    private native void nativeRelease(long j10);

    private native void nativeReleaseCall(long j10);

    private native String nativeSendCallMessage(long j10, CallMessage callMessage);

    private native void nativeSendDigits(long j10, String str);

    private void registerConnectivityBroadcastReceiver(Context context) {
        ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
        this.connectivityReceiver = connectivityReceiver;
        context.registerReceiver(connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void releaseCall() {
        long j10 = this.nativeCallDelegate;
        if (j10 != 0) {
            nativeReleaseCall(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterConnectivityBroadcastReceiver(Context context) {
        context.unregisterReceiver(this.connectivityReceiver);
        this.connectivityReceiver = null;
    }

    public void accept(AcceptOptions acceptOptions, long j10) {
        logger.d("Call::accept(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        registerConnectivityBroadcastReceiver(this.context);
        Voice.calls.add(this);
        publishLoggerEventToInsights();
        CallOptions.checkAudioTracksReleased(acceptOptions.getAudioTracks());
        this.localAudioTracks = acceptOptions.getAudioTracks();
        CallMessageListener callMessageListener = acceptOptions.getCallMessageListener();
        this.callMessageListener = callMessageListener;
        this.callMessageListenerProxy = new CallMessageListenerProxy(this.publisher, callMessageListener);
        this.eventListenerProxy = new EventListenerProxy((EventListener) null, this.handler, this.publisher, this.callInvite);
        synchronized (this.callListenerProxy) {
            try {
                try {
                    Voice.loadLibrary(this.context);
                    this.mediaFactory = MediaFactory.instance(this, this.context);
                    this.nativeCallDelegate = nativeAccept(acceptOptions, this.callListenerProxy, this.statsListenerProxy, this.eventListenerProxy, this.callMessageListenerProxy, this.handler, j10);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void connect(ConnectOptions connectOptions) {
        logger.d("Call::connect(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        registerConnectivityBroadcastReceiver(this.context);
        Voice.calls.add(this);
        publishLoggerEventToInsights();
        CallOptions.checkAudioTracksReleased(connectOptions.getAudioTracks());
        this.localAudioTracks = connectOptions.getAudioTracks();
        CallMessageListener callMessageListener = connectOptions.getCallMessageListener();
        this.callMessageListener = callMessageListener;
        this.callMessageListenerProxy = new CallMessageListenerProxy(this.publisher, callMessageListener);
        this.eventListenerProxy = new EventListenerProxy(this.tempCallSid, false, connectOptions.getEventListener(), this.handler, this.publisher);
        synchronized (this.callListenerProxy) {
            try {
                try {
                    Voice.loadLibrary(this.context);
                    MediaFactory instance = MediaFactory.instance(this, this.context);
                    this.mediaFactory = instance;
                    this.nativeCallDelegate = nativeConnect(connectOptions, this.callListenerProxy, this.statsListenerProxy, this.eventListenerProxy, this.callMessageListenerProxy, instance.getNativeMediaFactoryHandle(), this.handler);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // com.twilio.voice.InternalCall
    public synchronized void disconnect() {
        logger.d("Call::disconnect(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        if (!this.disconnectCalled && isValidState()) {
            long j10 = this.nativeCallDelegate;
            if (j10 != 0) {
                this.disconnectCalled = true;
                nativeDisconnect(j10);
            }
        }
    }

    public Set<CallQualityWarning> getCallQualityWarnings() {
        return this.currentCallQualityWarning;
    }

    public String getFrom() {
        return this.from;
    }

    @Override // com.twilio.voice.InternalCall
    public String getSid() {
        return this.sid;
    }

    @Override // com.twilio.voice.InternalCall
    @NonNull
    public State getState() {
        return this.state;
    }

    public synchronized void getStats(@NonNull StatsListener statsListener) {
        this.threadChecker.checkIsOnValidThread();
        Preconditions.checkNotNull(statsListener, "statsListener must not be null");
        if (this.state == State.DISCONNECTED) {
            return;
        }
        this.statsListenersQueue.offer(new Pair<>(Utils.createHandler(), statsListener));
        nativeGetStats(this.nativeCallDelegate);
    }

    public String getTo() {
        return this.to;
    }

    public synchronized void hold(boolean z10) {
        this.threadChecker.checkIsOnValidThread();
        if (isValidState()) {
            this.isOnHold = z10;
            nativeHold(this.nativeCallDelegate, z10);
        }
    }

    @Override // com.twilio.voice.InternalCall
    public boolean isMuted() {
        return this.isMuted;
    }

    public boolean isOnHold() {
        return this.isOnHold;
    }

    @Override // com.twilio.voice.InternalCall
    public synchronized void mute(boolean z10) {
        this.threadChecker.checkIsOnValidThread();
        if (isValidState()) {
            this.isMuted = z10;
            nativeMute(this.nativeCallDelegate, z10);
        }
    }

    public void networkChange(Voice.NetworkChangeEvent networkChangeEvent) {
        this.threadChecker.checkIsOnValidThread();
        if (isValidState() && isPermittedNetworkChangeEvent(networkChangeEvent)) {
            nativeNetworkChange(this.nativeCallDelegate, networkChangeEvent);
            return;
        }
        logger.d("Ignoring networkChangeEvent: " + networkChangeEvent.name() + " in Call.State: " + this.state);
    }

    @Override // com.twilio.voice.InternalCall, com.twilio.voice.EventPublisher.EventPublisherListener
    public /* bridge */ /* synthetic */ void onError(VoiceException voiceException) {
        super.onError(voiceException);
    }

    public void postFeedback(@NonNull Score score, @NonNull Issue issue) {
        Preconditions.checkNotNull(score, "score must not be null");
        Preconditions.checkNotNull(issue, "issue must not be null");
        publishFeedbackEvent(score, issue);
    }

    public void publishLoggerEventToInsights() {
        InsightsUtils.publishLoggerEvent(this.publisher, createEventPayloadBuilder().build());
    }

    public void reject(AcceptOptions acceptOptions, CallInviteProxy callInviteProxy) {
        logger.d("Call::reject(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        registerConnectivityBroadcastReceiver(this.context);
        Voice.rejects.add(this);
        Iterator<LocalAudioTrack> it = acceptOptions.getAudioTracks().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        CallMessageListener callMessageListener = acceptOptions.getCallMessageListener();
        this.callMessageListener = callMessageListener;
        this.callMessageListenerProxy = new CallMessageListenerProxy(this.publisher, callMessageListener);
        this.eventListenerProxy = new EventListenerProxy((EventListener) null, this.handler, this.publisher, this.callInvite);
        synchronized (this.callListenerProxy) {
            try {
                try {
                    Voice.loadLibrary(this.context);
                    this.nativeCallDelegate = nativeReject(acceptOptions, this.callListenerProxy, this.eventListenerProxy, this.callMessageListenerProxy, this.handler, callInviteProxy.nativeCallInviteProxy);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public synchronized void release() {
        try {
            logger.d("Call::release(): {" + this + "}");
            this.threadChecker.checkIsOnValidThread();
            Iterator<LocalAudioTrack> it = this.localAudioTracks.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            long j10 = this.nativeCallDelegate;
            if (j10 != 0) {
                nativeRelease(j10);
                this.nativeCallDelegate = 0L;
            }
            MediaFactory mediaFactory = this.mediaFactory;
            if (mediaFactory != null) {
                mediaFactory.release(this);
                this.mediaFactory = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.twilio.voice.InternalCall
    public synchronized void sendDigits(@NonNull String str) {
        this.threadChecker.checkIsOnValidThread();
        Preconditions.checkNotNull(str, "digits must not be null");
        if (!str.matches("^[0-9\\*\\#w]+$")) {
            throw new IllegalArgumentException("digits string must not be null and should only contains 0-9, *, #, or w characters");
        }
        if (isValidState()) {
            nativeSendDigits(this.nativeCallDelegate, str);
        }
    }

    public String sendMessage(CallMessage callMessage) {
        logger.d("Call::sendMessage(): {" + this + "}");
        return nativeSendCallMessage(this.nativeCallDelegate, callMessage);
    }

    public Call(Context context, String str, Listener listener) {
        Preconditions.checkApplicationContext(context, "must create Call with application context");
        this.context = context;
        this.listener = listener;
        this.callInvite = null;
        this.state = State.CONNECTING;
        this.direction = Constants.Direction.OUTGOING;
        Handler createHandler = Utils.createHandler();
        this.handler = createHandler;
        this.threadChecker = new ThreadUtils.ThreadChecker(createHandler.getLooper().getThread());
        EventPublisher eventPublisher = new EventPublisher(context, Constants.getClientSdkProductName(), str);
        this.publisher = eventPublisher;
        eventPublisher.addListener(this);
        this.statsListenersQueue = new ConcurrentLinkedQueue();
    }
}
