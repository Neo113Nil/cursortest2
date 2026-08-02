package com.twilio.voice;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import com.twilio.voice.CallInviteProxy;
import com.twilio.voice.Constants;
import com.twilio.voice.EventPayload;
import com.twilio.voice.EventPublisher;
import com.twilio.voice.ThreadUtils;
import com.twilio.voice.Voice;
import java.util.Map;

/* loaded from: classes4.dex */
class CallInviteProxy implements MessageListener {
    private static final Logger logger = Logger.getLogger(CallInviteProxy.class);
    private Call call;
    private CallInvite callInvite;
    String codecParams;
    private final Context context;
    private Call.EventListener eventListener;
    private String gateway;
    private final Handler handler;
    private final MediaFactory mediaFactory;
    private final MessageListener messageListener;
    long nativeCallInviteProxy;
    private EventPublisher publisher;
    private String region;
    String selectedCodec;
    private String tempCallSid;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean released = false;
    private ConnectivityReceiver connectivityReceiver = null;
    private String selectedRegion = Voice.region;
    private final Call.EventListener eventListenerProxy = new AnonymousClass1();

    /* renamed from: com.twilio.voice.CallInviteProxy$1, reason: invalid class name */
    public class AnonymousClass1 implements Call.EventListener {
        public AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, Map map) {
            CallInviteProxy.this.threadChecker.checkIsOnValidThread();
            CallInviteProxy.logger.d("onMetric");
            if (CallInviteProxy.this.eventListener != null) {
                CallInviteProxy.this.eventListener.onMetric(map);
            }
            if (((String) ((Pair) map.get(EventKeys.EVENT_GROUP)).first).equals(EventGroupType.CALL_QUALITY_STATS_GROUP)) {
                CallInviteProxy.this.call.onSample(InsightsUtils.createRtcSample(map));
            }
        }

        public static /* synthetic */ void b(AnonymousClass1 anonymousClass1, Map map) {
            CallInviteProxy.this.threadChecker.checkIsOnValidThread();
            CallInviteProxy.logger.d("CallInviteProxy::eventListenerProxy::onEvent(...)");
            if (((String) ((Pair) map.get(EventKeys.EVENT_GROUP)).first).equals(EventGroupType.REGISTRATION_EVENT_GROUP) && ((String) ((Pair) map.get("name")).first).equals("unsupported-cancel-message-error")) {
                CallInviteProxy.this.release((String) ((Pair) map.get(EventKeys.CALL_SID_KEY)).first);
            }
            if (CallInviteProxy.this.eventListener != null) {
                CallInviteProxy.this.eventListener.onEvent(map);
            }
            CallInviteProxy.this.publishEvent(map);
        }

        @Override // com.twilio.voice.Call.EventListener
        public void onEvent(final Map<String, Pair<String, Class>> map) {
            CallInviteProxy.this.handler.post(new Runnable() { // from class: com.twilio.voice.r
                @Override // java.lang.Runnable
                public final void run() {
                    CallInviteProxy.AnonymousClass1.b(CallInviteProxy.AnonymousClass1.this, map);
                }
            });
        }

        @Override // com.twilio.voice.Call.EventListener
        public void onMetric(final Map<String, Pair<String, Class>> map) {
            CallInviteProxy.this.handler.post(new Runnable() { // from class: com.twilio.voice.s
                @Override // java.lang.Runnable
                public final void run() {
                    CallInviteProxy.AnonymousClass1.a(CallInviteProxy.AnonymousClass1.this, map);
                }
            });
        }
    }

    public CallInviteProxy(Context context, Handler handler, MessageListener messageListener, Call.EventListener eventListener, CallInvite callInvite) {
        String str = null;
        Preconditions.checkApplicationContext(context, "must create Call with application context");
        this.context = context;
        this.handler = handler;
        this.threadChecker = new ThreadUtils.ThreadChecker(handler.getLooper().getThread());
        this.messageListener = messageListener;
        this.eventListener = eventListener;
        this.mediaFactory = MediaFactory.instance(this, context);
        this.callInvite = callInvite;
        Pair<String, String> pair = Voice.callSidBridgeTokenPair;
        if (pair != null && ((String) pair.first).equals(callInvite.getCallSid())) {
            str = (String) Voice.callSidBridgeTokenPair.second;
        }
        if (str != null) {
            EventPublisher eventPublisher = new EventPublisher(context, Constants.getClientSdkProductName(), str);
            this.publisher = eventPublisher;
            eventPublisher.addListener(new EventPublisher.EventPublisherListener() { // from class: com.twilio.voice.p
                @Override // com.twilio.voice.EventPublisher.EventPublisherListener
                public final void onError(VoiceException voiceException) {
                    CallInviteProxy.logger.e("Error publishing data : " + voiceException.getMessage() + ":" + voiceException.getErrorCode());
                }
            });
        }
    }

    public static /* synthetic */ void b(CallInviteProxy callInviteProxy, CallInvite callInvite) {
        callInviteProxy.threadChecker.checkIsOnValidThread();
        callInviteProxy.threadChecker.checkIsOnValidThread();
        logger.d("onCallInvite");
        Voice.callInviteProxyMap.put(callInvite.getCallSid(), callInviteProxy);
        callInviteProxy.registerConnectivityBroadcastReceiver();
        callInviteProxy.messageListener.onCallInvite(callInvite);
    }

    public static /* synthetic */ void c(CallInviteProxy callInviteProxy, CallException callException, CancelledCallInvite cancelledCallInvite) {
        callInviteProxy.threadChecker.checkIsOnValidThread();
        Logger logger2 = logger;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCancelledCallInvite: CallException code: ");
        sb2.append(callException == null ? "null" : Integer.valueOf(callException.getErrorCode()));
        logger2.d(sb2.toString());
        boolean z10 = callInviteProxy.released;
        callInviteProxy.release(cancelledCallInvite.getCallSid());
        if (z10) {
            return;
        }
        callInviteProxy.messageListener.onCancelledCallInvite(cancelledCallInvite, callException);
    }

    private EventPayload.Builder createEventPayloadBuilder() {
        return new EventPayload.Builder().callSid(this.callInvite.getCallSid()).tempCallSid(this.tempCallSid).messageSid(this.callInvite.getMessageSid()).direction(Constants.Direction.INCOMING).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName(Constants.getClientSdkProductName()).clientName(Utils.parseClientIdentity(this.callInvite.getTo())).payLoadType("application/json").preflight(Boolean.FALSE);
    }

    private native void nativeNetworkChange(long j10, Voice.NetworkChangeEvent networkChangeEvent);

    private native void nativeRelease(long j10);

    private native String nativeSendMessage(long j10, CallMessage callMessage);

    /* JADX INFO: Access modifiers changed from: private */
    public void publishEvent(Map<String, Pair<String, Class>> map) {
        if (!((String) map.get(EventKeys.EVENT_GROUP).first).equals(EventGroupType.SETTINGS_GROUP)) {
            InsightsUtils.processEvent(map, createEventPayloadBuilder(), this.publisher, Constants.Direction.INCOMING);
            return;
        }
        if (((String) map.get("name").first).equals("codec")) {
            this.codecParams = (String) map.get(EventKeys.CODEC_PARAMS).first;
            this.selectedCodec = (String) map.get(EventKeys.SELECTED_CODEC).first;
        } else if (((String) map.get("name").first).equals(EventKeys.EDGE_HOST_REGION)) {
            this.gateway = (String) map.get(EventKeys.EDGE_HOST_NAME).first;
            this.region = (String) map.get(EventKeys.EDGE_HOST_REGION).first;
        }
        InsightsUtils.processEvent(map, createEventPayloadBuilderForSettingsEvent(), this.publisher, Constants.Direction.INCOMING);
    }

    private void registerConnectivityBroadcastReceiver() {
        ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
        this.connectivityReceiver = connectivityReceiver;
        this.context.registerReceiver(connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void unregisterConnectivityBroadcastReceiver() {
        ConnectivityReceiver connectivityReceiver = this.connectivityReceiver;
        if (connectivityReceiver != null) {
            this.context.unregisterReceiver(connectivityReceiver);
        }
    }

    public EventPayload.Builder createEventPayloadBuilderForSettingsEvent() {
        return createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    public synchronized EventPublisher getPublisher() {
        this.threadChecker.checkIsOnValidThread();
        return this.publisher;
    }

    public void networkChange(Voice.NetworkChangeEvent networkChangeEvent) {
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            long j10 = this.nativeCallInviteProxy;
            if (j10 != 0) {
                nativeNetworkChange(j10, networkChangeEvent);
                return;
            }
        }
        logger.d("Ignoring networkChangeEvent: " + networkChangeEvent.name() + " because CallInviteProxy is either released or is not set.");
    }

    @Override // com.twilio.voice.MessageListener
    public void onCallInvite(@NonNull final CallInvite callInvite) {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.q
            @Override // java.lang.Runnable
            public final void run() {
                CallInviteProxy.b(CallInviteProxy.this, callInvite);
            }
        });
    }

    @Override // com.twilio.voice.MessageListener
    public void onCancelledCallInvite(@NonNull final CancelledCallInvite cancelledCallInvite, final CallException callException) {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.o
            @Override // java.lang.Runnable
            public final void run() {
                CallInviteProxy.c(CallInviteProxy.this, callException, cancelledCallInvite);
            }
        });
    }

    public synchronized void release(String str) {
        try {
            logger.d("CallInviteProxy::release");
            this.threadChecker.checkIsOnValidThread();
            if (!this.released) {
                unregisterConnectivityBroadcastReceiver();
                Voice.callInviteProxyMap.remove(str);
                long j10 = this.nativeCallInviteProxy;
                if (j10 != 0) {
                    nativeRelease(j10);
                    this.nativeCallInviteProxy = 0L;
                }
                this.mediaFactory.release(this);
                this.released = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String sendMessage(CallMessage callMessage) {
        if (!this.released) {
            long j10 = this.nativeCallInviteProxy;
            if (j10 != 0) {
                return nativeSendMessage(j10, callMessage);
            }
        }
        logger.d("Ignoring sendMessage:" + callMessage.getContent() + " because CallInviteProxy is either released or is not set.");
        return "";
    }

    public synchronized void setCall(Call call) {
        this.threadChecker.checkIsOnValidThread();
        this.call = call;
    }

    public synchronized void setEventListener(Call.EventListener eventListener) {
        this.threadChecker.checkIsOnValidThread();
        this.eventListener = eventListener;
    }

    public synchronized void setTempCallSid(String str) {
        this.threadChecker.checkIsOnValidThread();
        this.tempCallSid = str;
    }
}
