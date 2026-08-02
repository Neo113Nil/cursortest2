package com.ironsource.adapters.fyber;

/* compiled from: FyberConstants.kt */
/* loaded from: classes13.dex */
public final class FyberConstants {
    public static final String ADAPTER_VERSION = "5.8.0";
    public static final String APP_ID_KEY = "appId";
    public static final int BANNER_HEIGHT = 50;
    public static final String BANNER_SIZE_BANNER = "BANNER";
    public static final String BANNER_SIZE_RECTANGLE = "RECTANGLE";
    public static final String BANNER_SIZE_SMART = "SMART";
    public static final int BANNER_WIDTH = 320;
    public static final String CCPA_OPT_IN_STRING = "1YY-";
    public static final String CCPA_OPT_OUT_STRING = "1YN-";
    public static final String CREATIVE_ID_KEY = "creativeId";
    public static final FyberConstants INSTANCE = new FyberConstants();
    public static final int LARGE_HEIGHT = 90;
    public static final int LARGE_WIDTH = 728;
    public static final String MEDIATION_NAME = "IronSource";
    public static final String META_DATA_DT_COPPA_KEY = "DT_COPPA";
    public static final String META_DATA_DT_IS_CHILD_KEY = "DT_IsChild";
    public static final String NETWORK_DATA_IS_CHILD_KEY = "AudienceIsChild";
    public static final int RECTANGLE_HEIGHT = 250;
    public static final int RECTANGLE_WIDTH = 300;
    public static final String SPOT_ID_KEY = "adSpotId";
    public static final String TOKEN_KEY = "token";

    /* compiled from: FyberConstants.kt */
    public static final class Logs {
        public static final String AD_NOT_AVAILABLE = "Ad is not available";
        public static final String APP_ID = "appId = %s";
        public static final String CCPA = "ccpa = %s";
        public static final String CONSENT = "consent = %s";
        public static final String COPPA = "calling currentAudienceAppliesToCoppa";
        public static final String CREATIVE_ID = "creativeId = %s";
        public static final String FAILED_TO_LOAD = "Failed to load, errorCode = %s, errorMessage = %s";
        public static final String INIT_FAILED = "Failed to initialize SDK";
        public static final String INIT_SUCCESS = "Succeeded to initialize SDK";
        public static final Logs INSTANCE = new Logs();
        public static final String IS_CHILD = "calling currentAudienceIsAChild";
        public static final String KEY_VALUE = "key = %s, value = %s";
        public static final String MISSING_PARAM = "Missing params - %s";
        public static final String NETWORK_ADAPTER_IS_NULL = "Network adapter is null";
        public static final String SDK_INIT_FAILED = "Fyber SDK init failed";
        public static final String SET_USER_ID = "setUserId to %s";
        public static final String SHOW_FAILED = "Failed to show, errorMessage = %s";
        public static final String SPOT_ID = "spotId = %s";
        public static final String SPOT_NOT_READY = "Spot is not ready";
        public static final String TOKEN = "token = %s";
        public static final String TOKEN_NOT_READY = "returning null as token since init did not finish";
        public static final String UNKNOWN_ERROR = "Unknown error";
        public static final String UNSUPPORTED_BANNER_SIZE = "Unsupported banner size";

        private Logs() {
        }
    }

    private FyberConstants() {
    }
}
