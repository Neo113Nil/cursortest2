package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.AndroidCharacter;
import android.view.View;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFf1iSDK extends AFf1hSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 0;
    private static int afRDLog = 1;
    private final AFd1sSDK afInfoLog;
    private final AFg1qSDK afWarnLog;
    private final String force;

    /* renamed from: w, reason: collision with root package name */
    private final AFd1kSDK f57420w;
    private static char[] afDebugLog = {62958, 42166, 22397, 1594, 45256};
    private static long afVerboseLog = -7824471264982817596L;

    public AFf1iSDK(@NonNull String str, @NonNull AFd1mSDK aFd1mSDK) {
        super(new AFg1nSDK(aFd1mSDK.w().valueOf), aFd1mSDK, str);
        this.afInfoLog = aFd1mSDK.AFInAppEventType();
        this.f57420w = aFd1mSDK.w();
        this.force = str;
        this.afWarnLog = aFd1mSDK.unregisterClient();
    }

    private static void a(int i11, char c11, int i12, Object[] objArr) {
        AFj1oSDK aFj1oSDK = new AFj1oSDK();
        long[] jArr = new long[i11];
        aFj1oSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i13 = aFj1oSDK.AFKeystoreWrapper;
            if (i13 >= i11) {
                break;
            }
            $10 = ($11 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            jArr[i13] = (((char) (afDebugLog[i12 + i13] ^ 1056586240800585100L)) ^ (i13 * (1056586240800585100L ^ afVerboseLog))) ^ c11;
            aFj1oSDK.AFKeystoreWrapper = i13 + 1;
        }
        char[] cArr = new char[i11];
        aFj1oSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i14 = aFj1oSDK.AFKeystoreWrapper;
            if (i14 >= i11) {
                objArr[0] = new String(cArr);
                return;
            } else {
                cArr[i14] = (char) jArr[i14];
                aFj1oSDK.AFKeystoreWrapper = i14 + 1;
                $11 = ($10 + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
    }

    private void force() {
        afErrorLog = (afRDLog + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        ((AFf1hSDK) this).f57417i.values("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        afErrorLog = (afRDLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    protected final void AFInAppEventParameterName(AFa1pSDK aFa1pSDK) {
        afRDLog = (afErrorLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    protected final void AFInAppEventType(AFa1pSDK aFa1pSDK) {
        int i11 = afRDLog + 3;
        afErrorLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            super.AFInAppEventType(aFa1pSDK);
            Context context = this.f57420w.valueOf;
            AFb1tSDK.valueOf();
            throw null;
        }
        super.AFInAppEventType(aFa1pSDK);
        Context context2 = this.f57420w.valueOf;
        AFb1tSDK valueOf = AFb1tSDK.valueOf();
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (valueOf.AFInAppEventParameterName()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFa1pSDK.AFInAppEventType("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1pSDK.AFInAppEventType("app_version_name", packageInfo.versionName);
            aFa1pSDK.AFInAppEventType("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1pSDK.AFInAppEventType("installDate", AFb1tSDK.valueOf(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th2);
        }
        this.afWarnLog.AFInAppEventParameterName(aFa1pSDK.valueOf());
        aFa1pSDK.valueOf().remove("ivc");
        String AFInAppEventType = AFb1tSDK.AFInAppEventType();
        if (AFInAppEventType != null) {
            aFa1pSDK.AFInAppEventType("appUserId", AFInAppEventType);
        }
        try {
            aFa1pSDK.AFInAppEventType("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a(5 - Color.alpha(0), (char) ('0' - AndroidCharacter.getMirror('0')), View.combineMeasuredStates(0, 0), objArr);
            aFa1pSDK.AFInAppEventType(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th3) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th3);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFa1pSDK.AFInAppEventType(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFa1bSDK valueOf2 = AFb1rSDK.valueOf(context2.getContentResolver());
        if (valueOf2 != null) {
            afErrorLog = (afRDLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFa1pSDK.AFInAppEventType("amazon_aid", valueOf2.AFInAppEventParameterName);
            aFa1pSDK.AFInAppEventType("amazon_aid_limit", String.valueOf(valueOf2.AFKeystoreWrapper));
        }
        aFa1pSDK.AFInAppEventType("devkey", ((AFf1rSDK) this).registerClient.registerClient);
        aFa1pSDK.AFInAppEventType("uid", AFb1kSDK.AFInAppEventType(this.f57420w, ((AFf1hSDK) this).f57417i));
        aFa1pSDK.AFInAppEventType("af_gcm_token", this.force);
        aFa1pSDK.AFInAppEventType("launch_counter", Integer.toString(((AFf1hSDK) this).f57417i.AFInAppEventParameterName("appsFlyerCount", 0)));
        aFa1pSDK.AFInAppEventType("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String AFLogger = this.afInfoLog.AFLogger();
        if (AFLogger != null) {
            aFa1pSDK.AFInAppEventType(AppsFlyerProperties.CHANNEL, AFLogger);
            afErrorLog = (afRDLog + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        afErrorLog = (afRDLog + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    protected final void AFKeystoreWrapper(AFa1pSDK aFa1pSDK) {
        afRDLog = (afErrorLog + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        int i11 = (afRDLog + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afErrorLog = i11;
        int i12 = i11 + 55;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    protected final void valueOf(AFa1pSDK aFa1pSDK) {
        afRDLog = (afErrorLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    protected final void values(AFa1pSDK aFa1pSDK) {
        String valueOf;
        int i11 = afErrorLog + 91;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            valueOf = this.afInfoLog.valueOf();
            int i12 = 1 / 0;
            if (valueOf == null) {
                return;
            }
        } else {
            valueOf = this.afInfoLog.valueOf();
            if (valueOf == null) {
                return;
            }
        }
        afRDLog = (afErrorLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFa1pSDK.AFInAppEventType("advertiserId", valueOf);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        afRDLog = (afErrorLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        super.AFKeystoreWrapper();
        ResponseNetwork responseNetwork = this.AFLogger;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            force();
        }
        int i11 = afErrorLog + 15;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 11 / 0;
        }
    }
}
