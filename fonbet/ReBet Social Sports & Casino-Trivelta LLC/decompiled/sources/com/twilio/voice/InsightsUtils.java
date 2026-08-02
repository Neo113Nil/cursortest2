package com.twilio.voice;

import android.util.Pair;
import com.twilio.voice.Constants;
import com.twilio.voice.EventPayload;
import com.twilio.voice.LogParameters;
import com.twilio.voice.MetricEventConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class InsightsUtils {
    public static RTCStatsSample createRtcSample(Map<String, Pair<String, Class>> map) {
        RTCStatsSample rTCStatsSample = new RTCStatsSample();
        rTCStatsSample.packetsReceived = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.PACKETS_RECEIVED), Long.class);
        rTCStatsSample.totalPacketsLost = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.TOTAL_PACKETS_LOST), Long.class);
        rTCStatsSample.fractionLost = ((Float) fromString(map.get(MetricEventConstants.MetricEventKeys.PACKETS_LOST_FRACTION), Float.class)).floatValue();
        rTCStatsSample.packetsLost = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.PACKETS_LOST), Long.class);
        rTCStatsSample.totalPacketsSent = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.TOTAL_PACKETS_SENT), Long.class);
        rTCStatsSample.totalPacketsReceived = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.TOTAL_PACKETS_RECEIVED), Long.class);
        rTCStatsSample.totalBytesReceived = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.TOTAL_BYTES_RECEIVED), Long.class);
        rTCStatsSample.totalBytesSent = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.TOTAL_BYTES_SENT), Long.class);
        rTCStatsSample.jitter = (Long) fromString(map.get("jitter"), Long.class);
        rTCStatsSample.rtt = (Long) fromString(map.get("rtt"), Long.class);
        rTCStatsSample.audioInputLevel = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.AUDIO_INPUT_LEVEL), Long.class);
        rTCStatsSample.audioOutputLevel = (Long) fromString(map.get(MetricEventConstants.MetricEventKeys.AUDIO_OUTPUT_LEVEL), Long.class);
        rTCStatsSample.mos = ((Float) fromString(map.get("mos"), Float.class)).floatValue();
        rTCStatsSample.codec = (String) fromString(map.get(MetricEventConstants.MetricEventKeys.AUDIO_CODEC), String.class);
        rTCStatsSample.timestampMS = (String) fromString(map.get("timestamp_ms"), String.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        rTCStatsSample.timeStamp = simpleDateFormat.format(new Date(Double.valueOf(rTCStatsSample.timestampMS).longValue()));
        return rTCStatsSample;
    }

    public static EventPayload createWarningEventPayload(Map<String, Pair<String, Class>> map, EventPayload.Builder builder) {
        String str = (String) fromString(map.get(EventKeys.EVENT_GROUP), String.class);
        String str2 = (String) fromString(map.get(EventKeys.VALUES_KEY), String.class);
        Pair<String, Class> pair = map.get("threshold");
        return str.equals(EventGroupType.AUDIO_LEVEL_WARNING_RAISED) ? builder.value(str2).qualityThresholdValuePair(pair).payLoadType("application/json").build() : builder.values(str2).qualityThresholdValuePair(pair).payLoadType("application/json").build();
    }

    public static <T> T fromString(Pair<String, Class> pair, Class<T> cls) {
        Object obj;
        if (((Class) pair.second).equals(Boolean.class)) {
            obj = Boolean.valueOf(Boolean.parseBoolean((String) pair.first));
        } else if (((Class) pair.second).equals(Float.class)) {
            obj = Float.valueOf(Float.parseFloat((String) pair.first));
        } else if (((Class) pair.second).equals(Long.class)) {
            obj = Long.valueOf(Long.parseLong((String) pair.first));
        } else if (((Class) pair.second).equals(JSONObject.class)) {
            try {
                obj = new JSONObject((String) pair.first);
            } catch (JSONException e10) {
                e10.printStackTrace();
                obj = null;
            }
        } else {
            obj = pair.first;
        }
        return cls.cast(obj);
    }

    public static void processEvent(Map<String, Pair<String, Class>> map, EventPayload.Builder builder, EventPublisher eventPublisher, Constants.Direction direction) {
        if (((String) fromString(map.get(EventKeys.EVENT_GROUP), String.class)).equals(EventGroupType.ICE_CANDIDATE_GROUP)) {
            if (((String) fromString(map.get("name"), String.class)).equals(EventGroupType.ICE_CANDIDATE_GROUP)) {
                publishIceCandidateEvent(map, builder, eventPublisher, direction);
                return;
            } else {
                if (((String) fromString(map.get("name"), String.class)).equals("selected-ice-candidate-pair")) {
                    publishSelectedIceCandidateEvent(map, builder, eventPublisher, direction);
                    return;
                }
                return;
            }
        }
        if (!((String) fromString(map.get("name"), String.class)).equals("error") && !((String) fromString(map.get("name"), String.class)).equals("listening-error") && !((String) fromString(map.get("name"), String.class)).equals("unsupported-cancel-message-error")) {
            publishEvent(map, builder, eventPublisher);
        } else if (map.get(EventKeys.ERROR_CODE_KEY) != null) {
            publishConnectionErrorEvent(map, builder, eventPublisher);
        }
    }

    public static void processWarningEvent(Map<String, Pair<String, Class>> map, EventPayload.Builder builder, EventPublisher eventPublisher) {
        String str = (String) fromString(map.get("name"), String.class);
        publish(createWarningEventPayload(map, builder), Constants.SeverityLevel.valueOf((String) fromString(map.get("level"), String.class)), (String) fromString(map.get(EventKeys.EVENT_GROUP), String.class), str, eventPublisher);
    }

    private static void publish(EventPayload eventPayload, Constants.SeverityLevel severityLevel, String str, String str2, EventPublisher eventPublisher) {
        try {
            JSONObject payload = eventPayload.getPayload();
            Voice.getLogger().log(new LogParameters.Builder(LogLevel.INFO, Class.class.toString(), payload.toString()).build());
            if (eventPublisher != null) {
                eventPublisher.publish(severityLevel, str, str2, eventPublisher.createEvent(severityLevel, str, str2, payload));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void publishCallMessageReceivedEvent(EventPublisher eventPublisher, EventPayload eventPayload) {
        publish(eventPayload, Constants.SeverityLevel.INFO, EventGroupType.CALL_MESSAGE_GROUP, "user-defined-message", eventPublisher);
    }

    public static void publishCallMessageSendFailedEvent(EventPublisher eventPublisher, EventPayload eventPayload) {
        publish(eventPayload, Constants.SeverityLevel.ERROR, EventGroupType.CALL_MESSAGE_GROUP, "error", eventPublisher);
    }

    public static void publishCallMessageSentEvent(EventPublisher eventPublisher, EventPayload eventPayload) {
        publish(eventPayload, Constants.SeverityLevel.INFO, EventGroupType.CALL_MESSAGE_GROUP, "user-defined-message", eventPublisher);
    }

    private static void publishConnectionErrorEvent(Map<String, Pair<String, Class>> map, EventPayload.Builder builder, EventPublisher eventPublisher) {
        String str = (String) fromString(map.get("name"), String.class);
        publish(builder.errorCode((Long) fromString(map.get(EventKeys.ERROR_CODE_KEY), Long.class)).errorMessage(((String) fromString(map.get(EventKeys.ERROR_MESSAGE_KEY), String.class)) + " : " + ((String) fromString(map.get(EventKeys.ERROR_EXPLANATION_KEY), String.class))).build(), Constants.SeverityLevel.valueOf((String) fromString(map.get("level"), String.class)), (String) fromString(map.get(EventKeys.EVENT_GROUP), String.class), str, eventPublisher);
    }

    private static void publishEvent(Map<String, Pair<String, Class>> map, EventPayload.Builder builder, EventPublisher eventPublisher) {
        String str = (String) fromString(map.get("name"), String.class);
        publish(builder.build(), Constants.SeverityLevel.valueOf((String) fromString(map.get("level"), String.class)), (String) fromString(map.get(EventKeys.EVENT_GROUP), String.class), str, eventPublisher);
    }

    private static void publishIceCandidateEvent(Map<String, Pair<String, Class>> map, EventPayload.Builder builder, EventPublisher eventPublisher, Constants.Direction direction) {
        String str = (String) fromString(map.get("name"), String.class);
        publish(builder.transportId((String) fromString(map.get(EventKeys.TRANSPORT_ID), String.class)).isRemote((Boolean) fromString(map.get(EventKeys.IS_REMOTE), Boolean.class)).ip((String) fromString(map.get(EventKeys.IP), String.class)).port((Long) fromString(map.get(EventKeys.PORT), Long.class)).protocol((String) fromString(map.get(EventKeys.PROTOCOL), String.class)).candidateType((String) fromString(map.get(EventKeys.CANDIDATE_TYPE), String.class)).priority((Long) fromString(map.get(EventKeys.PRIORITY), Long.class)).url((String) fromString(map.get(EventKeys.URL), String.class)).deleted((Boolean) fromString(map.get(EventKeys.DELETED), Boolean.class)).networkCost((Long) fromString(map.get(EventKeys.NETWORK_COST), Long.class)).networkId((Long) fromString(map.get(EventKeys.NETWORK_ID), Long.class)).relatedPort((Long) fromString(map.get(EventKeys.RELATED_PORT), Long.class)).level((String) fromString(map.get("level"), String.class)).relatedAddress((String) fromString(map.get(EventKeys.RELATED_ADDRESS), String.class)).name((String) fromString(map.get("name"), String.class)).tcpType((String) fromString(map.get(EventKeys.TCP_TYPE), String.class)).networkType((String) fromString(map.get(EventKeys.NETWORK_TYPE), String.class)).direction(direction).build(), Constants.SeverityLevel.valueOf((String) fromString(map.get("level"), String.class)), (String) fromString(map.get(EventKeys.EVENT_GROUP), String.class), str, eventPublisher);
    }

    public static void publishLoggerEvent(EventPublisher eventPublisher, EventPayload eventPayload) {
        publish(eventPayload, Constants.SeverityLevel.INFO, EventGroupType.SETTINGS_GROUP, "logger", eventPublisher);
    }

    public static JSONArray publishMetrics(RTCStatsSample rTCStatsSample, String str, Constants.Direction direction, JSONArray jSONArray, EventPublisher eventPublisher) {
        rTCStatsSample.setCallSid(str);
        rTCStatsSample.setDirection(direction);
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        jSONArray.put(rTCStatsSample.toJson());
        if (jSONArray.length() != 10) {
            return jSONArray;
        }
        if (eventPublisher == null) {
            return new JSONArray();
        }
        try {
            eventPublisher.publishMetrics(eventPublisher.createMetricEvent(EventGroupType.CALL_QUALITY_STATS_GROUP, "metrics-sample", jSONArray));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return new JSONArray();
    }

    private static void publishSelectedIceCandidateEvent(Map<String, Pair<String, Class>> map, EventPayload.Builder builder, EventPublisher eventPublisher, Constants.Direction direction) {
        String str = (String) fromString(map.get("name"), String.class);
        publish(builder.reason((String) fromString(map.get(EventKeys.REASON), String.class)).lastDataReceivedMs((Long) fromString(map.get(EventKeys.LAST_DATA_RECEIVED_MS), Long.class)).level((String) fromString(map.get("level"), String.class)).name((String) fromString(map.get("name"), String.class)).localCandidate((JSONObject) fromString(map.get(EventKeys.LOCAL_CANDIDATE), JSONObject.class)).remoteCandidate((JSONObject) fromString(map.get(EventKeys.REMOTE_CANDIDATE), JSONObject.class)).build(), Constants.SeverityLevel.valueOf((String) fromString(map.get("level"), String.class)), (String) fromString(map.get(EventKeys.EVENT_GROUP), String.class), str, eventPublisher);
    }
}
