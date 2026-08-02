package org.chromium.net.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes10.dex */
public final class CronetManifest {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String ENABLE_TELEMETRY_META_DATA_KEY = "android.net.http.EnableTelemetry";
    static final String META_DATA_HOLDER_SERVICE_NAME = "android.net.http.MetaDataHolder";
    public static final String READ_HTTP_FLAGS_META_DATA_KEY = "android.net.http.ReadHttpFlags";
    public static final String USE_PERFETTO_META_DATA_KEY = "android.net.http.UsePerfetto";
    private static Context sLastContext;
    private static final Object sLock = new Object();
    private static Bundle sMetaData;

    private CronetManifest() {
    }

    public static boolean isAppOptedInForTelemetry(Context context, CronetLogger.CronetSource source) {
        return getMetaData(context).getBoolean(ENABLE_TELEMETRY_META_DATA_KEY, source == CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM || source == CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES);
    }

    public static boolean isAppOptedInForTelemetry(Context context) {
        boolean z = false;
        try {
            Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, CronetManifest.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        return getMetaData(context).getBoolean(ENABLE_TELEMETRY_META_DATA_KEY, !z);
    }

    public static boolean shouldReadHttpFlags(Context context) {
        return getMetaData(context).getBoolean(READ_HTTP_FLAGS_META_DATA_KEY, true);
    }

    public static boolean shouldUsePerfetto(Context context) {
        return getMetaData(context).getBoolean(USE_PERFETTO_META_DATA_KEY, true);
    }

    private static Bundle getMetaData(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (sLock) {
            if (applicationContext != sLastContext) {
                ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, META_DATA_HOLDER_SERVICE_NAME), 787072);
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo != null && serviceInfo.metaData != null) {
                    bundle2 = serviceInfo.metaData;
                } else {
                    bundle2 = new Bundle();
                }
                sMetaData = bundle2;
                sLastContext = applicationContext;
                if (scoped != null) {
                    scoped.close();
                }
            }
            bundle = sMetaData;
        }
        return bundle;
    }

    public static void resetCache() {
        sMetaData = null;
        sLastContext = null;
    }
}
