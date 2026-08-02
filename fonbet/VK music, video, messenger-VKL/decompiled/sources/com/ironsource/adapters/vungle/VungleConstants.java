package com.ironsource.adapters.vungle;

/* compiled from: VungleConstants.kt */
/* loaded from: classes13.dex */
public final class VungleConstants {
    public static final String ADAPTER_FORMAT_BANNER = "ISVungleBanner";
    public static final String ADAPTER_FORMAT_INTERSTITIAL = "ISVungleInterstitial";
    public static final String ADAPTER_FORMAT_REWARDED = "ISVungleRewardedVideo";
    public static final String ADAPTER_VERSION = "5.10.0";
    public static final String APP_ID_KEY = "AppID";
    public static final String BANNER_SIZE_BANNER = "BANNER";
    public static final String BANNER_SIZE_CUSTOM = "CUSTOM";
    public static final String BANNER_SIZE_LARGE = "LARGE";
    public static final String BANNER_SIZE_RECTANGLE = "RECTANGLE";
    public static final String BANNER_SIZE_SMART = "SMART";
    public static final String CREATIVE_ID_KEY = "creativeId";
    public static final VungleConstants INSTANCE = new VungleConstants();
    public static final String MEDIATION_NAME = "ironsource";
    public static final String META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION = "1.0.0";
    public static final String META_DATA_VUNGLE_COPPA_KEY = "Vungle_COPPA";
    public static final String PLACEMENT_ID_KEY = "PlacementId";
    public static final String SDK_VERSION_KEY = "sdkVersion";
    public static final String TOKEN_KEY = "token";

    /* compiled from: VungleConstants.kt */
    public static final class Logs {
        public static final String AD_NOT_AVAILABLE = "Ad is not available";
        public static final String APP_ID = "appId = %s";
        public static final String CCPA = "ccpa = %s";
        public static final String CONSENT = "gdpr = %s";
        public static final String COPPA = "coppa = %s";
        public static final String CREATIVE_ID = "creativeId = %s";
        public static final String CUSTOM_SIZE_MISMATCH = "CustomBannerSizeMismatch:w-%s|h-%s";
        public static final String FAILED_TO_LOAD = "Failed to load, errorCode = %s, errorMessage = %s";
        public static final String FAILED_TO_PLAY = "Failed to play, errorCode = %s, errorMessage = %s";
        public static final String INIT_FAILED = "Failed to initialize SDK, errorCode = %s, errorMessage = %s";
        public static final String INIT_SUCCESS = "Succeeded to initialize SDK";
        public static final Logs INSTANCE = new Logs();
        public static final String META_DATA_SET = "key = %s, value = %s";
        public static final String MISSING_PARAM = "Missing params - %s";
        public static final String NETWORK_ADAPTER_IS_NULL = "Network adapter is null";
        public static final String PLACEMENT_ID = "placementId = %s";
        public static final String SDK_INIT_FAILED = "SDK initialization failed";
        public static final String TOKEN = "sdkVersion = %s, token = %s";
        public static final String TOKEN_FAILURE = "failed to receive token - Vungle , error = %s";
        public static final String UNSUPPORTED_BANNER_SIZE = "Unsupported banner size";

        private Logs() {
        }
    }

    private VungleConstants() {
    }
}
