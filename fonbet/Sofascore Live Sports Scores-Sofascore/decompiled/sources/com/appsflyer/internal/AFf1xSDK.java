package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.network.http.ResponseNetwork;
import com.ironsource.L6;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1xSDK extends AFe1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getLevel = 1;
    private static int[] valueOf = {455827150, -1479391003, -1389971940, 1128455307, -1670168168, -775233846, -72514202, 857484302, -1869117327, -1276952496, 1043865142, -303338863, 568424827, -1221344531, 959782299, -408626464, -571220853, 1194343034};
    private static int values;
    private final AFc1hSDK AFLoggerLogLevel;
    private final AFc1gSDK AppsFlyerLib;
    private final String afDebugLog;
    private final AFf1bSDK afErrorLog;
    private final AFc1cSDK afInfoLog;

    public AFf1xSDK(@NonNull String str, @NonNull AFc1aSDK aFc1aSDK) {
        super(new AFf1gSDK(), aFc1aSDK, str);
        this.AFLoggerLogLevel = aFc1aSDK.AFKeystoreWrapper();
        this.afInfoLog = aFc1aSDK.valueOf();
        this.afDebugLog = str;
        this.afErrorLog = aFc1aSDK.i();
        this.AppsFlyerLib = aFc1aSDK.setImeiData();
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        AFk1ySDK aFk1ySDK = new AFk1ySDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = valueOf;
        if (iArr2 != null) {
            int i2 = ($11 + 55) % 128;
            $10 = i2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            $11 = (i2 + 9) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                iArr3[i3] = (int) (iArr2[i3] ^ 8989136225204602357L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = valueOf;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = (int) (iArr5[i4] ^ 8989136225204602357L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1ySDK.registerClient = 0;
        while (true) {
            int i5 = aFk1ySDK.registerClient;
            if (i5 >= iArr.length) {
                break;
            }
            $11 = ($10 + 79) % 128;
            int i6 = iArr[i5];
            char c = (char) (i6 >> 16);
            cArr[0] = c;
            char c2 = (char) i6;
            cArr[1] = c2;
            char c3 = (char) (iArr[i5 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i5 + 1];
            cArr[3] = c4;
            aFk1ySDK.unregisterClient = (c << 16) + c2;
            aFk1ySDK.AFKeystoreWrapper = (c3 << 16) + c4;
            AFk1ySDK.unregisterClient(iArr4);
            for (int i7 = 0; i7 < 16; i7++) {
                $10 = ($11 + 23) % 128;
                int i8 = aFk1ySDK.unregisterClient ^ iArr4[i7];
                aFk1ySDK.unregisterClient = i8;
                int AFKeystoreWrapper = AFk1ySDK.AFKeystoreWrapper(i8) ^ aFk1ySDK.AFKeystoreWrapper;
                int i9 = aFk1ySDK.unregisterClient;
                aFk1ySDK.unregisterClient = AFKeystoreWrapper;
                aFk1ySDK.AFKeystoreWrapper = i9;
            }
            int i10 = aFk1ySDK.unregisterClient;
            int i11 = aFk1ySDK.AFKeystoreWrapper;
            aFk1ySDK.unregisterClient = i11;
            aFk1ySDK.AFKeystoreWrapper = i10;
            int i12 = i10 ^ iArr4[16];
            aFk1ySDK.AFKeystoreWrapper = i12;
            int i13 = i11 ^ iArr4[17];
            aFk1ySDK.unregisterClient = i13;
            cArr[0] = (char) (i13 >>> 16);
            cArr[1] = (char) i13;
            cArr[2] = (char) (i12 >>> 16);
            cArr[3] = (char) i12;
            AFk1ySDK.unregisterClient(iArr4);
            int i14 = aFk1ySDK.registerClient;
            cArr2[i14 * 2] = cArr[0];
            cArr2[(i14 * 2) + 1] = cArr[1];
            cArr2[(i14 * 2) + 2] = cArr[2];
            cArr2[(i14 * 2) + 3] = cArr[3];
            aFk1ySDK.registerClient = i14 + 2;
        }
        String str = new String(cArr2, 0, i);
        int i15 = $11 + 59;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private void afWarnLog() {
        int i = getLevel + 59;
        values = i % 128;
        ((AFe1fSDK) this).i.unregisterClient("sentRegisterRequestToAF", i % 2 == 0);
        AFLogger.INSTANCE.d(LogTag.UNINSTALL, "[register] Successfully registered for Uninstall Tracking");
        getLevel = (values + 65) % 128;
    }

    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = i4 | i;
        int i6 = ((~(i5 | i2)) * 52) + (i2 * 53) + (i * (-51));
        int i7 = ~i2;
        int i8 = (((~i5) | (~(i7 | i)) | (~(i7 | i4))) * (-52)) + i6;
        int i9 = ~i;
        if ((((~(i9 | i2)) | (~(i4 | i9))) * 52) + i8 == 1) {
            getLevel = (values + 1) % 128;
            return null;
        }
        int i10 = (getLevel + 53) % 128;
        values = i10;
        getLevel = (i10 + 69) % 128;
        return Boolean.FALSE;
    }

    @NonNull
    private String x_(PackageManager packageManager) {
        int i = values + 69;
        getLevel = i % 128;
        int i2 = i % 2;
        AFc1hSDK aFc1hSDK = this.AFLoggerLogLevel;
        if (i2 == 0) {
            ApplicationInfo applicationInfo = aFc1hSDK.r_().applicationInfo;
            throw null;
        }
        ApplicationInfo applicationInfo2 = aFc1hSDK.r_().applicationInfo;
        if (applicationInfo2 != null) {
            return packageManager.getApplicationLabel(applicationInfo2).toString();
        }
        values = (getLevel + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return "";
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void AFKeystoreWrapper(AFh1zSDK aFh1zSDK) {
        unregisterClient(new Object[]{this, aFh1zSDK}, -898308393, 898308394, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        super.AFLogger();
        ResponseNetwork responseNetwork = ((AFe1oSDK) this).w;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            int i = values + 73;
            getLevel = i % 128;
            if (i % 2 == 0) {
                afWarnLog();
                int i2 = 27 / 0;
            } else {
                afWarnLog();
            }
        }
        int i3 = getLevel + 11;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return ((Boolean) unregisterClient(new Object[]{this}, -1811525320, 1811525320, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void d(AFh1zSDK aFh1zSDK) {
        int i = values + 15;
        getLevel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void registerClient(AFh1zSDK aFh1zSDK) {
        super.registerClient(aFh1zSDK);
        Context context = this.afInfoLog.d;
        if (context == null) {
            a70.r("Context is not provided, can't send register request");
            return;
        }
        try {
            aFh1zSDK.registerClient("app_version_code", Integer.toString(this.AFLoggerLogLevel.r_().versionCode));
            aFh1zSDK.registerClient("app_version_name", this.AFLoggerLogLevel.r_().versionName);
            aFh1zSDK.registerClient("app_name", x_(context.getPackageManager()));
            long j = this.AFLoggerLogLevel.r_().firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            aFh1zSDK.registerClient("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.UNINSTALL, "Exception while collecting application version info.", th);
        }
        this.afErrorLog.unregisterClient(aFh1zSDK.AFKeystoreWrapper);
        aFh1zSDK.AFKeystoreWrapper.remove("ivc");
        String str = this.AppsFlyerLib.afDebugLog;
        if (str != null) {
            aFh1zSDK.registerClient("appUserId", str);
        }
        try {
            aFh1zSDK.registerClient(L6.B, Build.MODEL);
            Object[] objArr = new Object[1];
            a(new int[]{-427500129, 1105766299, -502034410, -1572021653}, Color.red(0) + 5, objArr);
            aFh1zSDK.registerClient(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.UNINSTALL, "Exception while collecting device brand and model.", th2);
        }
        if (this.AppsFlyerLib.v) {
            aFh1zSDK.registerClient("deviceTrackingDisabled", "true");
        }
        AFb1kSDK h_ = AFb1jSDK.h_(context.getContentResolver());
        if (h_ != null) {
            aFh1zSDK.registerClient("amazon_aid", h_.registerClient);
            aFh1zSDK.registerClient("amazon_aid_limit", String.valueOf(h_.AFKeystoreWrapper));
        }
        AFf1oSDK aFf1oSDK = this.force;
        aFh1zSDK.registerClient("devkey", (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK)));
        aFh1zSDK.registerClient("uid", AFb1mSDK.unregisterClient(this.AFLoggerLogLevel.AFKeystoreWrapper));
        aFh1zSDK.registerClient("af_gcm_token", this.afDebugLog);
        aFh1zSDK.registerClient("launch_counter", Integer.toString(this.AFLoggerLogLevel.AFKeystoreWrapper.d("appsFlyerCount", 0)));
        aFh1zSDK.registerClient("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String AFLogger = this.AFLoggerLogLevel.AFLogger("CHANNEL");
        if (AFLogger != null) {
            values = (getLevel + 35) % 128;
            if (AFLogger.equals("")) {
                AFLogger = null;
            }
        }
        if (AFLogger != null) {
            aFh1zSDK.registerClient("channel", AFLogger);
        }
        int i = values + 31;
        getLevel = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void v(AFh1zSDK aFh1zSDK) {
        getLevel = (values + 9) % 128;
        String AFKeystoreWrapper = this.AFLoggerLogLevel.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            aFh1zSDK.registerClient("advertiserId", AFKeystoreWrapper);
            getLevel = (values + 35) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void AFLogger(AFh1zSDK aFh1zSDK) {
        int i = getLevel + 93;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final void unregisterClient(AFh1zSDK aFh1zSDK) {
        values = (getLevel + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
    }
}
