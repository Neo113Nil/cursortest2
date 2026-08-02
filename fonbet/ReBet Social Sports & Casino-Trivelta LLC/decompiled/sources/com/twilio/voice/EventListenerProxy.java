package com.twilio.voice;

import android.os.Handler;
import android.util.Pair;
import com.twilio.voice.Call;
import com.twilio.voice.Constants;
import com.twilio.voice.EventPayload;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes4.dex */
class EventListenerProxy implements Call.EventListener {
    static final String TEMP_CALL_SID_PREFIX = "TSID";
    private Constants.Direction callDirection;
    private String callSid;
    private String calleeName;
    private String codecParams;
    private final EventPublisher eventPublisher;
    private String gateway;
    private final Handler handler;
    private final boolean isPreflight;
    private final Call.EventListener listener;
    private JSONArray metricEventPayload;
    private String region;
    private String selectedCodec;
    private final String selectedRegion;
    private final String tempCallSid;

    public EventListenerProxy(boolean z10, Call.EventListener eventListener, Handler handler, EventPublisher eventPublisher) {
        this(TEMP_CALL_SID_PREFIX + UUID.randomUUID(), z10, eventListener, handler, eventPublisher);
    }

    private EventPayload.Builder createEventPayloadBuilder() {
        return new EventPayload.Builder().callSid(this.callSid).tempCallSid(this.tempCallSid).direction(this.callDirection).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName(Constants.getClientSdkProductName()).clientName(Utils.parseClientIdentity(this.calleeName)).payLoadType("application/json").preflight(Boolean.valueOf(this.isPreflight));
    }

    private EventPayload.Builder createEventPayloadBuilderForSettingsEvent() {
        return createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    @Override // com.twilio.voice.Call.EventListener
    public void onEvent(final Map<String, Pair<String, Class>> map) {
        if (this.listener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.B
                @Override // java.lang.Runnable
                public final void run() {
                    EventListenerProxy.this.listener.onEvent(map);
                }
            });
        }
        Pair<String, Class> pair = map.get(EventKeys.EVENT_GROUP);
        Objects.requireNonNull(pair);
        String str = (String) pair.first;
        str.getClass();
        switch (str) {
            case "connection":
                Pair<String, Class> pair2 = map.get("name");
                Objects.requireNonNull(pair2);
                String str2 = (String) pair2.first;
                if ("outgoing".equals(str2)) {
                    this.callDirection = Constants.Direction.OUTGOING;
                } else if ("incoming".equals(str2)) {
                    this.callDirection = Constants.Direction.INCOMING;
                } else if ("ringing".equals(str2)) {
                    Pair<String, Class> pair3 = map.get(EventKeys.CALL_SID_KEY);
                    Objects.requireNonNull(pair3);
                    this.callSid = (String) pair3.first;
                }
                this.handler.post(new Runnable() { // from class: com.twilio.voice.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        InsightsUtils.processEvent(map, r0.createEventPayloadBuilder(), r0.eventPublisher, EventListenerProxy.this.callDirection);
                    }
                });
                break;
            case "network-quality-warning-raised":
            case "audio-level-warning-raised":
                this.handler.post(new Runnable() { // from class: com.twilio.voice.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        InsightsUtils.processWarningEvent(map, r0.createEventPayloadBuilder(), EventListenerProxy.this.eventPublisher);
                    }
                });
                break;
            case "settings":
                Pair<String, Class> pair4 = map.get("name");
                Objects.requireNonNull(pair4);
                String str3 = (String) pair4.first;
                if ("codec".equals(str3)) {
                    Pair<String, Class> pair5 = map.get(EventKeys.CODEC_PARAMS);
                    Objects.requireNonNull(pair5);
                    this.codecParams = (String) pair5.first;
                    Pair<String, Class> pair6 = map.get(EventKeys.SELECTED_CODEC);
                    Objects.requireNonNull(pair6);
                    this.selectedCodec = (String) pair6.first;
                } else if (EventKeys.EDGE_HOST_REGION.equals(str3)) {
                    Pair<String, Class> pair7 = map.get(EventKeys.EDGE_HOST_NAME);
                    Objects.requireNonNull(pair7);
                    this.gateway = (String) pair7.first;
                    Pair<String, Class> pair8 = map.get(EventKeys.EDGE_HOST_REGION);
                    Objects.requireNonNull(pair8);
                    this.region = (String) pair8.first;
                }
                this.handler.post(new Runnable() { // from class: com.twilio.voice.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        InsightsUtils.processEvent(map, r0.createEventPayloadBuilder(), r0.eventPublisher, EventListenerProxy.this.callDirection);
                    }
                });
                break;
            default:
                this.handler.post(new Runnable() { // from class: com.twilio.voice.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        InsightsUtils.processEvent(map, r0.createEventPayloadBuilder(), r0.eventPublisher, EventListenerProxy.this.callDirection);
                    }
                });
                break;
        }
    }

    @Override // com.twilio.voice.Call.EventListener
    public void onMetric(final Map<String, Pair<String, Class>> map) {
        if (this.listener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.A
                @Override // java.lang.Runnable
                public final void run() {
                    EventListenerProxy.this.listener.onMetric(map);
                }
            });
        }
        Pair<String, Class> pair = map.get(EventKeys.EVENT_GROUP);
        Objects.requireNonNull(pair);
        if (EventGroupType.CALL_QUALITY_STATS_GROUP.equals((String) pair.first)) {
            this.metricEventPayload = InsightsUtils.publishMetrics(InsightsUtils.createRtcSample(map), this.callSid, this.callDirection, this.metricEventPayload, this.eventPublisher);
        }
    }

    public void publishLoggerEvent() {
        InsightsUtils.publishLoggerEvent(this.eventPublisher, createEventPayloadBuilder().build());
    }

    public EventListenerProxy(Call.EventListener eventListener, Handler handler, EventPublisher eventPublisher, CallInvite callInvite) {
        this(false, eventListener, handler, eventPublisher);
        this.calleeName = Utils.parseClientIdentity(callInvite.getTo());
        this.callSid = callInvite.getCallSid();
    }

    public EventListenerProxy(String str, boolean z10, Call.EventListener eventListener, Handler handler, EventPublisher eventPublisher) {
        this.listener = eventListener;
        this.handler = handler;
        this.eventPublisher = eventPublisher;
        this.tempCallSid = str;
        this.selectedRegion = Voice.region;
        this.calleeName = null;
        this.isPreflight = z10;
    }
}
