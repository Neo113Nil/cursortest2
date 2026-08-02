package com.ironsource.adapters.bigo;

/* compiled from: BigoConstants.kt */
/* loaded from: classes13.dex */
public final class BigoConstants {
    public static final String ADAPTER_VERSION = "5.8.0";
    public static final String APP_ID_KEY = "appId";
    public static final BigoConstants INSTANCE = new BigoConstants();
    public static final String MEDIATION_INFO_ADAPTER_VERSION = "adapterVersion";
    public static final String MEDIATION_INFO_MEDIATION_NAME = "mediationName";
    public static final String MEDIATION_INFO_MEDIATION_VERSION = "mediationVersion";
    public static final String MEDIATION_NAME = "LevelPlay";
    public static final String META_DATA_BIGO_COPPA_KEY = "LevelPlay_ChildDirected";
    public static final String SLOT_ID_KEY = "slotId";
    public static final String TOKEN_KEY = "token";

    /* compiled from: BigoConstants.kt */
    public static final class Logs {
        public static final String ADAPTER_UNAVAILABLE = "Network adapter is null";
        public static final String AD_NOT_AVAILABLE = "Ad is not available";
        public static final String APP_ID = "appId = %s";
        public static final String CCPA = "ccpa = %s";
        public static final String CONSENT = "consent = %s";
        public static final String COPPA = "isCoppa = %s";
        public static final String FAILED_TO_LOAD = "Failed to load, errorCode = %s, errorMessage = %s";
        public static final String FAILED_TO_SHOW = "Failed to show, errorCode = %s, errorMessage = %s";
        public static final Logs INSTANCE = new Logs();
        public static final String META_DATA_SET = "key = %s, value = %s";
        public static final String MISSING_PARAM = "Missing params - %s";
        public static final String SDK_INITIALIZED = "BIGO SDK Initialized";
        public static final String SERVER_DATA_EMPTY = "serverData is empty";
        public static final String SLOT_ID = "slotId = %s";
        public static final String TOKEN = "token = %s";
        public static final String TOKEN_ERROR = "returning null as token since init isn't completed";
        public static final String UNSUPPORTED_BANNER_SIZE = "Unsupported banner size";

        private Logs() {
        }
    }

    private BigoConstants() {
    }
}
