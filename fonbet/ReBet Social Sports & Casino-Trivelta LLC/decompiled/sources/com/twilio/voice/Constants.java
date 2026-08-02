package com.twilio.voice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class Constants {
    public static final String APP_JSON_PAYLOAD_TYPE = "application/json";
    public static int CALL_SID_LENGTH = 34;
    public static final String CLIENT_SDK_PRODUCT_NAME_DEFAULT = "twilio-voice-android";
    private static final String DEFAULT_NOTIFICATION_SERVICE_HOST_URL = "https://ers.twilio.com";
    public static String EDGE_ROAMING = "roaming";
    public static String GLOBAL_ENV = "com.twilio.voice.env";
    public static String GLOBAL_ENV_SDK = "com.twilio.voice.env.sdk";
    public static String GLOBAL_ENV_SDK_EXPO_VERSION = "com.twilio.voice.env.sdk.expo_version";
    public static String GLOBAL_LOW_LATENCY_REGION = "gll";
    private static final String KEY_KIBANA_EVENT_GATEWAY_HOST_URL = "kibana-event-gateway-host";
    private static final String KEY_KIBANA_METRICS_HOST_URL = "kibana-metrics-host";
    private static final String KEY_NOTIFICATION_SERVICE_HOST = "notification-service";
    public static final String PLATFORM_ANDROID = "android";
    private static final String TWILIO_DEFAULT_KIBANA_EVENT_GATEWAY_HOST_URL = "https://eventgw.twilio.com/v4/EndpointEvents";
    private static final String TWILIO_DEFAULT_KIBANA_METRICS_HOST_URL = "https://eventgw.twilio.com/v4/EndpointMetrics";
    static final String TWILIO_REQUEST_HEADER = "X-Twilio-Request-Id";
    static final String TWILIO_REQUEST_SID_PREFIX = "RQ";
    public static final boolean dev = true;
    private static Map<String, String> params = new HashMap();
    public static final Set<Class> SUPPORTED_CODECS = new HashSet(Arrays.asList(OpusCodec.class, PcmuCodec.class));

    public enum CallMessageEventType {
        SENT,
        RECEIVED
    }

    public enum Direction {
        INCOMING,
        OUTGOING
    }

    public enum LoggerType {
        DEFAULT,
        CUSTOM
    }

    public enum SeverityLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    public static String getClientSdkProductName() {
        String property = System.getProperty(GLOBAL_ENV);
        return property != null ? String.format("%s-%s", CLIENT_SDK_PRODUCT_NAME_DEFAULT, property) : CLIENT_SDK_PRODUCT_NAME_DEFAULT;
    }

    public static final String getKeyKibanaEventGatewayHostUrl() {
        return params.containsKey(KEY_KIBANA_EVENT_GATEWAY_HOST_URL) ? params.get(KEY_KIBANA_EVENT_GATEWAY_HOST_URL) : TWILIO_DEFAULT_KIBANA_EVENT_GATEWAY_HOST_URL;
    }

    public static final String getKeyKibanaMetricsHostUrl() {
        return params.containsKey(KEY_KIBANA_METRICS_HOST_URL) ? params.get(KEY_KIBANA_METRICS_HOST_URL) : TWILIO_DEFAULT_KIBANA_METRICS_HOST_URL;
    }

    public static final String getNotificationServiceUrl() {
        return params.containsKey(KEY_NOTIFICATION_SERVICE_HOST) ? params.get(KEY_NOTIFICATION_SERVICE_HOST) : DEFAULT_NOTIFICATION_SERVICE_HOST_URL;
    }

    private static final void setDevParams(Map<String, String> map) {
        params = Collections.unmodifiableMap(map);
    }
}
