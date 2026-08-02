package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* compiled from: UnityServices.kt */
/* loaded from: classes14.dex */
public final class UnityServices {
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityServices.kt */
    public static final class UnityServicesError {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnityServicesError[] $VALUES;
        public static final UnityServicesError INVALID_ARGUMENT = new UnityServicesError("INVALID_ARGUMENT", 0);
        public static final UnityServicesError INIT_SANITY_CHECK_FAIL = new UnityServicesError("INIT_SANITY_CHECK_FAIL", 1);

        private static final /* synthetic */ UnityServicesError[] $values() {
            return new UnityServicesError[]{INVALID_ARGUMENT, INIT_SANITY_CHECK_FAIL};
        }

        static {
            UnityServicesError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private UnityServicesError(String str, int i) {
        }

        public static zrp<UnityServicesError> getEntries() {
            return $ENTRIES;
        }

        public static UnityServicesError valueOf(String str) {
            return (UnityServicesError) Enum.valueOf(UnityServicesError.class, str);
        }

        public static UnityServicesError[] values() {
            return (UnityServicesError[]) $VALUES.clone();
        }
    }

    private UnityServices() {
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static final String getVersion() {
        return SdkProperties.getVersionName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void initialize(Context context, String str, boolean z, InitializationConfiguration initializationConfiguration, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(iUnityAdsInitializationListener);
            SdkProperties.setTestMode(z);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), str, null, initializationConfiguration, 2, null);
        }
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final void setDebugMode(boolean z) {
        SdkProperties.setDebugMode(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void initialize(Context context, String str, boolean z, InitializationConfiguration initializationConfiguration, InitializationListener initializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(initializationListener);
            SdkProperties.setTestMode(z);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), str, null, initializationConfiguration, 2, null);
        }
    }

    @ozl
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    @ozl
    public static /* synthetic */ void isSupported$annotations() {
    }
}
