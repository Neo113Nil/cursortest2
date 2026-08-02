package com.ironsource.adapters.mintegral;

/* compiled from: MintegralConstants.kt */
/* loaded from: classes13.dex */
public final class MintegralConstants {
    public static final String ADAPTER_VERSION = "5.16.0";
    public static final String APP_ID_KEY = "appId";
    public static final String APP_KEY = "appKey";
    public static final int BANNER_HEIGHT = 50;
    public static final String BANNER_SIZE_BANNER = "BANNER";
    public static final String BANNER_SIZE_CUSTOM = "CUSTOM";
    public static final String BANNER_SIZE_LARGE = "LARGE";
    public static final String BANNER_SIZE_RECTANGLE = "RECTANGLE";
    public static final String BANNER_SIZE_SMART = "SMART";
    public static final int BANNER_WIDTH = 320;
    public static final String CHANNEL_CODE_METHOD = "b";
    public static final String CHANNEL_CODE_VALUE = "Y+H6DFttYrPQYcIb+F2F+F5/Hv==";
    public static final String CREATIVE_ID_KEY = "creativeId";
    public static final MintegralConstants INSTANCE = new MintegralConstants();
    public static final int LARGE_HEIGHT = 90;
    public static final int LARGE_WIDTH = 320;
    public static final int LEADERBOARD_HEIGHT = 90;
    public static final int LEADERBOARD_WIDTH = 728;
    public static final String META_DATA_MINTEGRAL_COPPA_KEY = "Mintegral_COPPA";
    public static final int MINTEGRAL_NO_FILL_ERROR_CODE = 708;
    public static final String PLACEMENT_ID_KEY = "placementId";
    public static final int RECTANGLE_HEIGHT = 250;
    public static final int RECTANGLE_WIDTH = 300;
    public static final String TOKEN_KEY = "token";
    public static final String UNIT_ID_KEY = "unitId";

    /* compiled from: MintegralConstants.kt */
    public static final class Logs {
        public static final String ADAPTER_UNAVAILABLE = "Adapter is not available";
        public static final String AD_NOT_AVAILABLE = "Ad not available";
        public static final String APP_ID_AND_APP_KEY = "appId = %s, appKey = %s";
        public static final String CHANNEL_CODE_ERROR = "Error setting channel code %s";
        public static final String CONSENT = "consent = %s";
        public static final String CONSENT_STATUS = "setConsentStatus consentStatus = %s";
        public static final String COPPA_VALUE = "set coppa value = %s";
        public static final String CREATIVE_ID = "creativeId = %s";
        public static final String DO_NOT_TRACK_STATUS = "setDoNotTrackStatus with ccpa = %s";
        public static final String DUPLICATE_PLACEMENT_IS = "Interstitial load request skipped. An interstitial ad with the same configuration is currently in use";
        public static final String DUPLICATE_PLACEMENT_RV = "Rewarded video load request skipped. A rewarded video ad with the same configuration is currently in use";
        public static final String ERROR_CODE_MSG = "errorCode = %s, errorMsg = %s";
        public static final String INIT_FAILED = "Mintegral SDK initialization failed - %s";
        public static final String INIT_NOT_COMPLETED = "returning null as token since init isn't completed";
        public static final String INIT_NOT_COMPLETED_TOKEN = "returning null as token since init isn't completed - Mintegral";
        public static final Logs INSTANCE = new Logs();
        public static final String KEY_VALUE = "key = %s, value = %s";
        public static final String LOAD_BANNER = "load banner with size %sX%s placementId=%s unitId=%s serverData=%s";
        public static final String LOAD_INTERSTITIAL = "load interstitial with placementId=%s unitId=%s serverData=%s";
        public static final String LOAD_REWARDED = "load rewarded video with placementId=%s unitId=%s serverData=%s";
        public static final String MISSING_PARAM = "Missing param - %s";
        public static final String PLACEMENT_ID = "placementId = %s";
        public static final String PLACEMENT_ID_AND_UNIT_ID = "placementId = %s, unitId = %s";
        public static final String REWARDED_INFO = "rewarded: %s";
        public static final String SDK_INIT_FAILED = "SDK initialization failed";
        public static final String TOKEN = "token = %s";

        private Logs() {
        }
    }

    private MintegralConstants() {
    }
}
