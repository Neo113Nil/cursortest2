package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFd1sSDK {
    private static String AFInAppEventType = "286";
    public final AFd1kSDK AFInAppEventParameterName;
    public final AFd1tSDK AFKeystoreWrapper;
    public final AFd1qSDK valueOf;
    private Bundle values = null;

    public AFd1sSDK(AFd1kSDK aFd1kSDK, AFd1tSDK aFd1tSDK, AFd1qSDK aFd1qSDK) {
        this.AFInAppEventParameterName = aFd1kSDK;
        this.AFKeystoreWrapper = aFd1tSDK;
        this.valueOf = aFd1qSDK;
    }

    @NonNull
    public static String AFInAppEventParameterName() {
        return "6.13.1";
    }

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String AFKeystoreWrapper() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String e() {
        StringBuilder sb2 = new StringBuilder("version: 6.13.1 (build ");
        sb2.append(AFInAppEventType);
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    public static String values() {
        return UUID.randomUUID().toString();
    }

    public final String AFLogger() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventParameterName("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean unregisterClient() {
        return !this.valueOf.AFInAppEventType();
    }

    public final String valueOf() {
        AFh1xSDK aFh1xSDK = this.valueOf.f57393e;
        AFa1bSDK aFa1bSDK = aFh1xSDK != null ? new AFa1bSDK(aFh1xSDK.AFInAppEventType, aFh1xSDK.unregisterClient) : null;
        if (aFa1bSDK != null) {
            return aFa1bSDK.AFInAppEventParameterName;
        }
        return null;
    }

    public final String AFInAppEventParameterName(String str) {
        Object obj;
        try {
            if (this.values == null) {
                this.values = ((PackageItemInfo) this.AFInAppEventParameterName.valueOf.getPackageManager().getApplicationInfo(this.AFInAppEventParameterName.valueOf.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)).metaData;
            }
            Bundle bundle = this.values;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public final String AFInAppEventType(String str) {
        try {
            int identifier = this.AFInAppEventParameterName.valueOf.getResources().getIdentifier(str, "string", this.AFInAppEventParameterName.valueOf.getPackageName());
            if (identifier != 0) {
                return this.AFInAppEventParameterName.valueOf.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e11) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e11.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e11);
            return null;
        }
    }

    public final boolean values(String str) {
        String AFInAppEventParameterName = AFInAppEventParameterName(str);
        if (AFInAppEventParameterName != null) {
            return Boolean.parseBoolean(AFInAppEventParameterName);
        }
        return false;
    }
}
