package com.twilio.voice;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.twilio.voice.Call;
import com.twilio.voice.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class EventPayload {
    private static final String INSIGHTS_SDK_VERSION = "com.twilio.voice.env.sdk.version";
    private String callSid;
    private String candidateType;
    private String clientName;
    private String codecParams;
    private Boolean deleted;
    private Constants.Direction direction;
    private Long errorCode;
    private String errorMessage;
    private Constants.CallMessageEventType eventType;
    private String gateway;
    private String ip;
    boolean isPrivate;
    private Boolean isRemote;
    private String issueName;
    private Long lastDataReceivedMs;
    private String level;
    private JSONObject localCandidate;
    private Constants.LoggerType loggerType;
    private String messageSid;
    private String name;
    private Long networkCost;
    private Long networkId;
    private String networkType;
    private JSONObject payload;
    private String payloadType;
    private Long port;
    private Boolean preflight;
    private Long priority;
    private String productName;
    private String protocol;
    private int qualityScore;
    private Pair<String, Class> qualityThresholdValuePair;
    private String reason;
    private String region;
    private String relatedAddress;
    private Long relatedPort;
    private JSONObject remoteCandidate;
    private String requestId;
    private String selectedCodec;
    private String selectedRegion;
    private String tcpType;
    private String tempCallSid;
    private String timeStamp;
    private long timestampMS;
    private String transportId;
    private String url;
    private String value;
    private String values;
    private String voiceEventSid;

    public static class Builder {
        private String callSid;
        private String candidateType;
        private String clientName;
        private String codecParams;
        private Boolean deleted;
        private Constants.Direction direction;
        private Long errorCode;
        private String errorMessage;
        private Constants.CallMessageEventType eventType;
        private String gateway;
        private String ip;
        private Boolean isRemote;
        private String issue;
        private Long lastDataReceivedMs;
        private String level;
        private JSONObject localCandidate;
        private Constants.LoggerType loggerType;
        private String messageSid;
        private String name;
        private Long networkCost;
        private Long networkId;
        private String networkType;
        private JSONObject payload;
        private String payloadType;
        private Long port;
        private Boolean preflight;
        private Long priority;
        private String productName;
        private String protocol;
        private String qualityParam;
        private int qualityScore;
        private Pair<String, Class> qualityThresholdValuePair;
        private String reason;
        private String region;
        private String relatedAddress;
        private Long relatedPort;
        private JSONObject remoteCandidate;
        private String requestId;
        private String selectedCodec;
        private String selectedRegion;
        private String tcpType;
        private String tempCallSid;
        private String timeStamp;
        private long timestampMS;
        private String transportId;
        private String url;
        private String value;
        private String values;
        private String voiceEventSid;

        @SuppressLint({"SimpleDateFormat"})
        public Builder() {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            Date date = new Date();
            this.timeStamp = simpleDateFormat.format(date);
            this.timestampMS = date.getTime();
            this.loggerType = Voice.loggerType;
        }

        public EventPayload build() {
            if (this.productName == null) {
                throw new NullPointerException("productName must not be null");
            }
            if (this.payloadType != null) {
                return new EventPayload(this);
            }
            throw new NullPointerException("payloadType must not be null");
        }

        public Builder callMessageEventType(Constants.CallMessageEventType callMessageEventType) {
            this.eventType = callMessageEventType;
            return this;
        }

        public Builder callSid(String str) {
            this.callSid = str;
            return this;
        }

        public Builder candidateType(String str) {
            this.candidateType = str;
            return this;
        }

        public Builder clientName(String str) {
            this.clientName = str;
            return this;
        }

        public Builder codecParams(String str) {
            this.codecParams = str;
            return this;
        }

        public Builder deleted(Boolean bool) {
            this.deleted = bool;
            return this;
        }

        public Builder direction(Constants.Direction direction) {
            this.direction = direction;
            return this;
        }

        public Builder errorCode(Long l10) {
            this.errorCode = l10;
            return this;
        }

        public Builder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        public Builder gateway(String str) {
            this.gateway = str;
            return this;
        }

        public Builder ip(String str) {
            this.ip = str;
            return this;
        }

        public Builder isRemote(Boolean bool) {
            this.isRemote = bool;
            return this;
        }

        public Builder issue(Call.Issue issue) {
            if (issue != null) {
                this.issue = issue.toString();
            }
            return this;
        }

        public Builder lastDataReceivedMs(Long l10) {
            this.lastDataReceivedMs = l10;
            return this;
        }

        public Builder level(String str) {
            this.level = str;
            return this;
        }

        public Builder localCandidate(JSONObject jSONObject) {
            this.localCandidate = jSONObject;
            return this;
        }

        public Builder loggerType(Constants.LoggerType loggerType) {
            this.loggerType = loggerType;
            return this;
        }

        public Builder messageSid(String str) {
            this.messageSid = str;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder networkCost(Long l10) {
            this.networkCost = l10;
            return this;
        }

        public Builder networkId(Long l10) {
            this.networkId = l10;
            return this;
        }

        public Builder networkType(String str) {
            this.networkType = str;
            return this;
        }

        public Builder payLoadType(String str) {
            this.payloadType = str;
            return this;
        }

        public Builder port(Long l10) {
            this.port = l10;
            return this;
        }

        public Builder preflight(Boolean bool) {
            this.preflight = bool;
            return this;
        }

        public Builder priority(Long l10) {
            this.priority = l10;
            return this;
        }

        public Builder productName(String str) {
            this.productName = str;
            return this;
        }

        public Builder protocol(String str) {
            this.protocol = str;
            return this;
        }

        public Builder qualityThresholdValuePair(Pair<String, Class> pair) {
            this.qualityThresholdValuePair = pair;
            return this;
        }

        public Builder reason(String str) {
            this.reason = str;
            return this;
        }

        public Builder region(String str) {
            this.region = str;
            return this;
        }

        public Builder relatedAddress(String str) {
            this.relatedAddress = str;
            return this;
        }

        public Builder relatedPort(Long l10) {
            this.relatedPort = l10;
            return this;
        }

        public Builder remoteCandidate(JSONObject jSONObject) {
            this.remoteCandidate = jSONObject;
            return this;
        }

        public Builder requestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder score(Call.Score score) {
            if (score != null) {
                this.qualityScore = score.getValue();
            }
            return this;
        }

        public Builder selectedCodec(String str) {
            this.selectedCodec = str;
            return this;
        }

        public Builder selectedRegion(String str) {
            this.selectedRegion = str;
            return this;
        }

        public Builder tcpType(String str) {
            this.tcpType = str;
            return this;
        }

        public Builder tempCallSid(String str) {
            this.tempCallSid = str;
            return this;
        }

        public Builder transportId(String str) {
            this.transportId = str;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }

        public Builder values(String str) {
            this.values = str;
            return this;
        }

        public Builder voiceEventSid(String str) {
            this.voiceEventSid = str;
            return this;
        }
    }

    public static Object fromStringThreshold(Pair<String, Class> pair) {
        return ((Class) pair.second).equals(Float.class) ? Float.class.cast(Float.valueOf(Float.parseFloat((String) pair.first))) : ((Class) pair.second).equals(Long.class) ? Long.class.cast(Long.valueOf(Long.parseLong((String) pair.first))) : String.class.cast(pair.first);
    }

    private static String getSdkVersion() {
        return System.getProperty(INSIGHTS_SDK_VERSION, Voice.getVersion());
    }

    public String getCallSid() {
        return this.callSid;
    }

    public String getClientName() {
        return this.clientName;
    }

    public Constants.Direction getDirection() {
        return this.direction;
    }

    public Constants.CallMessageEventType getEventType() {
        return this.eventType;
    }

    public String getIssueName() {
        return this.issueName;
    }

    public Constants.LoggerType getLogger() {
        return this.loggerType;
    }

    public JSONObject getPayload() {
        jsonPayloadPreparation();
        return this.payload;
    }

    public Object getPayloadType() {
        return this.payloadType;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getQualityScore() {
        return this.qualityScore;
    }

    public String getTempCallSid() {
        return this.tempCallSid;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public long getTimestampMillis() {
        return this.timestampMS;
    }

    public String getVoiceEventSid() {
        return this.voiceEventSid;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public JSONObject jsonPayloadPreparation() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp_ms", this.timestampMS);
        jSONObject.put(EventKeys.CLIENT_NAME, this.clientName);
        jSONObject.put(EventKeys.TEMP_CALL_SID, this.tempCallSid);
        jSONObject.put(EventKeys.CALL_SID, this.callSid);
        jSONObject.put(EventKeys.MESSAGE_SID, this.messageSid);
        jSONObject.put(EventKeys.SDK_VERSION_KEY, getSdkVersion());
        jSONObject.put(EventKeys.PLATFORM, Constants.PLATFORM_ANDROID);
        jSONObject.put(EventKeys.DIRECTION_KEY, this.direction);
        jSONObject.put(EventKeys.SELECTED_REGION_KEY, this.selectedRegion);
        jSONObject.put(EventKeys.GATEWAY, this.gateway);
        jSONObject.put(EventKeys.REGION, this.region);
        jSONObject.put(EventKeys.CODEC_PARAMS, this.codecParams);
        jSONObject.put(EventKeys.SELECTED_CODEC, this.selectedCodec);
        jSONObject.put(EventKeys.TRANSPORT_ID, this.transportId);
        jSONObject.put(EventKeys.IS_REMOTE, this.isRemote);
        jSONObject.put(EventKeys.IP, this.ip);
        jSONObject.put(EventKeys.PORT, this.port);
        jSONObject.put(EventKeys.PROTOCOL, this.protocol);
        jSONObject.put(EventKeys.CANDIDATE_TYPE, this.candidateType);
        jSONObject.put(EventKeys.PRIORITY, this.priority);
        jSONObject.put(EventKeys.URL, this.url);
        jSONObject.put(EventKeys.DELETED, this.deleted);
        jSONObject.put(EventKeys.NETWORK_COST, this.networkCost);
        jSONObject.put(EventKeys.NETWORK_ID, this.networkId);
        jSONObject.put(EventKeys.RELATED_PORT, this.relatedPort);
        jSONObject.put("level", this.level);
        jSONObject.put(EventKeys.RELATED_ADDRESS, this.relatedAddress);
        jSONObject.put(EventKeys.NETWORK_TYPE, this.networkType);
        jSONObject.put("name", this.name);
        jSONObject.put(EventKeys.TCP_TYPE, this.tcpType);
        jSONObject.put(EventKeys.LOCAL_CANDIDATE, this.localCandidate);
        jSONObject.put(EventKeys.REMOTE_CANDIDATE, this.remoteCandidate);
        jSONObject.put(EventKeys.REASON, this.reason);
        jSONObject.put(EventKeys.LAST_DATA_RECEIVED_MS, this.lastDataReceivedMs);
        String name = this.loggerType.name();
        Locale locale = Locale.US;
        jSONObject.put(EventKeys.LOGGER_TYPE, name.toLowerCase(locale));
        jSONObject.put(EventKeys.VOICE_EVENT_SID, this.voiceEventSid);
        jSONObject.put(EventKeys.PREFLIGHT, this.preflight);
        Long l10 = this.errorCode;
        if (l10 != null && l10.compareTo((Long) 0L) > 0) {
            jSONObject.put(EventKeys.ERROR_CODE, this.errorCode);
            jSONObject.put("message", this.errorMessage);
        }
        String str = this.requestId;
        if (str != null) {
            jSONObject.put(EventKeys.REQUEST_ID_KEY, str);
        }
        Constants.CallMessageEventType callMessageEventType = this.eventType;
        if (callMessageEventType != null) {
            jSONObject.put(EventKeys.CALL_MESSAGE_EVENT_TYPE, callMessageEventType.name().toLowerCase(locale));
        }
        JSONObject jSONObject2 = new JSONObject();
        if (this.values != null) {
            jSONObject2.put("threshold", fromStringThreshold(this.qualityThresholdValuePair));
            jSONObject2.put(EventKeys.VALUES_KEY, this.values);
        } else if (this.value != null) {
            jSONObject2.put("threshold", fromStringThreshold(this.qualityThresholdValuePair));
            jSONObject2.put(EventKeys.VALUE_KEY, this.value);
        } else {
            int i10 = this.qualityScore;
            if (i10 > 0) {
                jSONObject.put(EventKeys.QUALITY_SCORE, i10);
            }
            String str2 = this.issueName;
            if (str2 != null && !str2.equals(Call.Issue.NOT_REPORTED.toString())) {
                jSONObject.put(EventKeys.ISSUE_NAME, this.issueName);
            }
            jSONObject2 = null;
        }
        jSONObject.put(EventKeys.DATA, jSONObject2);
        this.payload = jSONObject;
        return jSONObject;
    }

    private EventPayload(Builder builder) {
        this.isPrivate = false;
        this.productName = builder.productName;
        this.payload = builder.payload;
        this.payloadType = builder.payloadType;
        this.timeStamp = builder.timeStamp;
        this.timestampMS = builder.timestampMS;
        this.clientName = builder.clientName;
        this.direction = builder.direction;
        this.callSid = builder.callSid;
        this.messageSid = builder.messageSid;
        this.tempCallSid = builder.tempCallSid;
        this.qualityScore = builder.qualityScore;
        this.issueName = builder.issue;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.selectedRegion = builder.selectedRegion;
        this.gateway = builder.gateway;
        this.region = builder.region;
        this.codecParams = builder.codecParams;
        this.selectedCodec = builder.selectedCodec;
        this.transportId = builder.transportId;
        this.isRemote = builder.isRemote;
        this.ip = builder.ip;
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.candidateType = builder.candidateType;
        this.priority = builder.priority;
        this.url = builder.url;
        this.deleted = builder.deleted;
        this.networkCost = builder.networkCost;
        this.values = builder.values;
        this.value = builder.value;
        this.qualityThresholdValuePair = builder.qualityThresholdValuePair;
        this.networkId = builder.networkId;
        this.relatedPort = builder.relatedPort;
        this.level = builder.level;
        this.relatedAddress = builder.relatedAddress;
        this.networkType = builder.networkType;
        this.name = builder.name;
        this.tcpType = builder.tcpType;
        this.localCandidate = builder.localCandidate;
        this.remoteCandidate = builder.remoteCandidate;
        this.reason = builder.reason;
        this.lastDataReceivedMs = builder.lastDataReceivedMs;
        this.loggerType = builder.loggerType;
        this.eventType = builder.eventType;
        this.voiceEventSid = builder.voiceEventSid;
        this.preflight = builder.preflight;
    }
}
