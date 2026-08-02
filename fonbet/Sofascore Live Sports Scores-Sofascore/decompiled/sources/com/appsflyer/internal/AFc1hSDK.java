package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1hSDK {
    private static String AFLogger = "384";
    public final AFc1pSDK AFKeystoreWrapper;
    private PackageInfo force;
    public final AFc1cSDK registerClient;
    public final AFc1gSDK unregisterClient;
    private final Executor v;
    private Bundle w = null;
    public String d = "";

    public AFc1hSDK(AFc1cSDK aFc1cSDK, AFc1pSDK aFc1pSDK, AFc1gSDK aFc1gSDK, Executor executor) {
        this.registerClient = aFc1cSDK;
        this.AFKeystoreWrapper = aFc1pSDK;
        this.unregisterClient = aFc1gSDK;
        this.v = executor;
    }

    @NonNull
    public static String d() {
        return "7.0.0";
    }

    @Nullable
    public final String AFKeystoreWrapper(String str) {
        try {
            int identifier = this.registerClient.d.getResources().getIdentifier(str, "string", this.registerClient.d.getPackageName());
            if (identifier != 0) {
                return this.registerClient.d.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GENERAL;
            StringBuilder sb = new StringBuilder("Could not load string resource: ");
            sb.append(e.getMessage() != null ? e.getMessage() : "resource not found");
            aFLogger.e(logTag, sb.toString(), e);
            return null;
        }
    }

    @Nullable
    public final String AFLogger(String str) {
        Object obj;
        try {
            Bundle bundle = this.w;
            if (bundle == null) {
                bundle = ((PackageItemInfo) this.registerClient.d.getPackageManager().getApplicationInfo(this.registerClient.d.getPackageName(), 128)).metaData;
                this.w = bundle;
            }
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GENERAL;
            StringBuilder sb = new StringBuilder("Could not load manifest metadata: ");
            sb.append(th.getMessage() != null ? th.getMessage() : "unknown error");
            aFLogger.e(logTag, sb.toString(), th);
            return null;
        }
    }

    @NonNull
    public final PackageInfo r_() {
        if (this.force == null) {
            try {
                int i = Build.VERSION.SDK_INT;
                AFc1cSDK aFc1cSDK = this.registerClient;
                if (i >= 33) {
                    this.force = aFc1cSDK.d.getPackageManager().getPackageInfo(this.registerClient.d.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } else {
                    this.force = aFc1cSDK.d.getPackageManager().getPackageInfo(this.registerClient.d.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException e) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Exception while trying fo get PackageInfo", e, false, false, true, false);
            }
        }
        return this.force;
    }

    public final boolean registerClient(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.PUBLIC_API, "Could not check if app is pre installed", e);
        }
        return (this.registerClient.d.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    public final String unregisterClient(Context context) {
        try {
            return new AFb1iSDK(context, this.v).registerClient();
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
            return null;
        }
    }

    public final long registerClient(String str, long j) {
        String AFLogger2 = AFLogger(str);
        if (AFLogger2 != null) {
            try {
                return Long.parseLong(AFLogger2);
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    @Nullable
    public final String AFKeystoreWrapper() {
        AFg1cSDK aFg1cSDK = this.unregisterClient.getInstance;
        AFb1kSDK aFb1kSDK = aFg1cSDK != null ? new AFb1kSDK(aFg1cSDK.d, aFg1cSDK.unregisterClient) : null;
        if (aFb1kSDK != null) {
            return aFb1kSDK.registerClient;
        }
        return null;
    }

    public static String AFLogger() {
        StringBuilder sb = new StringBuilder("version: 7.0.0 (build ");
        sb.append(AFLogger);
        sb.append(")");
        return sb.toString();
    }
}
