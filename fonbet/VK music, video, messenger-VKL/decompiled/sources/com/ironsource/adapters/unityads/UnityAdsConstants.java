package com.ironsource.adapters.unityads;

/* compiled from: UnityAdsConstants.kt */
/* loaded from: classes13.dex */
public final class UnityAdsConstants {
    public static final String ADAPTER_VERSION = "5.11.0";
    public static final String AD_UNIT_ID_KEY = "adUnitId";
    public static final int BANNER_HEIGHT = 50;
    public static final String BANNER_SIZE_BANNER = "BANNER";
    public static final String BANNER_SIZE_KEY = "bannerSize";
    public static final String BANNER_SIZE_LARGE = "LARGE";
    public static final String BANNER_SIZE_RECTANGLE = "RECTANGLE";
    public static final String BANNER_SIZE_SMART = "SMART";
    public static final int BANNER_WIDTH = 320;
    public static final String CONSENT_CCPA = "privacy.consent";
    public static final String CONSENT_GDPR = "gdpr.consent";
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();
    public static final int LEADERBOARD_HEIGHT = 90;
    public static final int LEADERBOARD_WIDTH = 728;
    public static final String MEDIATION_NAME = "ironSource";
    public static final int RECTANGLE_HEIGHT = 250;
    public static final int RECTANGLE_WIDTH = 300;
    public static final String SOURCE_ID_KEY = "sourceId";
    public static final String TOKEN_KEY = "token";
    public static final String UADS_INIT_BLOB = "uads_init_blob";
    public static final String UADS_TRAITS = "traits";
    public static final String UNITYADS_COPPA = "user.nonBehavioral";
    public static final String UNITYADS_METADATA_COPPA_KEY = "unityads_coppa";
    public static final int UNITYADS_NO_FILL_ERROR_CODE = 52100;
    public static final String ZONE_ID_KEY = "zoneId";

    /* compiled from: UnityAdsConstants.kt */
    public static final class Logs {
        public static final String AD_NOT_AVAILABLE = "Ad is not available";
        public static final String CCPA = "ccpa = %s";
        public static final String CONSENT = "consent = %s";
        public static final String COPPA = "coppa = %s";
        public static final String FAILED_TO_LOAD = "Failed to load, errorCode = %s, errorMessage = %s";
        public static final String FAILED_TO_SHOW = "Failed to show, errorCode = %s, errorMessage = %s";
        public static final String INIT_FAILED = "init failed, errorCode = %s, errorMessage = %s";
        public static final Logs INSTANCE = new Logs();
        public static final String META_DATA_SET = "key = %s, value = %s";
        public static final String MISSING_PARAM = "Missing params - %s";
        public static final String NETWORK_ADAPTER_IS_NULL = "Network adapter is null";
        public static final String SDK_INIT_FAILED = "UnityAds SDK init failed";
        public static final String SOURCE_ID = "sourceId = %s";
        public static final String TOKEN = "token = %s";
        public static final String TOKEN_FAILURE = "failed to receive token - UnityAds";
        public static final String UNSUPPORTED_BANNER_SIZE = "Banner size is not supported";
        public static final String ZONE_ID = "zoneId = %s";

        private Logs() {
        }
    }

    private UnityAdsConstants() {
    }
}
