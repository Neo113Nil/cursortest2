package com.ironsource.adapters.yandex;

/* compiled from: YandexConstants.kt */
/* loaded from: classes13.dex */
public final class YandexConstants {
    public static final String ADAPTER_NETWORK_NAME_KEY = "adapter_network_name";
    public static final String ADAPTER_NETWORK_SDK_VERSION_KEY = "adapter_network_sdk_version";
    public static final String ADAPTER_VERSION = "5.8.0";
    public static final String ADAPTER_VERSION_KEY = "adapter_version";
    public static final String AD_UNIT_ID_KEY = "adUnitId";
    public static final String APP_ID_KEY = "appId";
    public static final String BANNER_SIZE_BANNER = "BANNER";
    public static final String BANNER_SIZE_CUSTOM = "CUSTOM";
    public static final String BANNER_SIZE_KEY = "bannerSize";
    public static final String BANNER_SIZE_LARGE = "LARGE";
    public static final String BANNER_SIZE_RECTANGLE = "RECTANGLE";
    public static final String BANNER_SIZE_SMART = "SMART";
    public static final String CREATIVE_ID_KEY = "creativeId";
    public static final YandexConstants INSTANCE = new YandexConstants();
    public static final String MEDIATION_NAME = "ironsource";
    public static final String META_DATA_YANDEX_COPPA_KEY = "Yandex_COPPA";
    public static final String TOKEN_KEY = "token";

    /* compiled from: YandexConstants.kt */
    public static final class Logs {
        public static final String ADAPTER_UNAVAILABLE = "adapter is not available";
        public static final String AD_NOT_AVAILABLE = "Ad is not available";
        public static final String AD_UNIT_ID = "adUnitId = %s";
        public static final String AD_UNIT_ID_EMPTY = "Missing params - adUnitId";
        public static final String APP_ID = "appId = %s";
        public static final String BANNER_SIZE_IS_NULL = "banner size is null, banner has been destroyed";
        public static final String BANNER_SIZE_NULL_LOG = "Banner size is null";
        public static final String CONSENT = "consent = %s";
        public static final String COPPA = "isCoppa = %s";
        public static final String CREATIVE_ID = "creativeId = %s";
        public static final String FAILED_TO_LOAD = "Failed to load, errorCode = %s, errorMessage = %s";
        public static final String FAILED_TO_SHOW = "Failed to show, errorMessage = %s";
        public static final Logs INSTANCE = new Logs();
        public static final String META_DATA_SET = "key = %s, value = %s";
        public static final String SERVER_DATA_EMPTY = "serverData is empty";
        public static final String TOKEN = "token = %s";
        public static final String TOKEN_ERROR = "returning null as token since init isn't completed";
        public static final String TOKEN_FAILURE = "failed to receive token - Yandex %s";
        public static final String UNSUPPORTED_BANNER_SIZE = "Unsupported banner size";

        private Logs() {
        }
    }

    private YandexConstants() {
    }
}
