package org.chromium.base;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes6.dex */
public final class AndroidInfo {
    private AndroidInfo() {
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        IAndroidInfo iAndroidInfo = new IAndroidInfo();
        iAndroidInfo.f78471a = TextUtils.join(", ", Build.SUPPORTED_ABIS);
        String str = Build.FINGERPRINT;
        iAndroidInfo.f78472b = str.substring(0, Math.min(str.length(), UserVerificationMethods.USER_VERIFY_PATTERN));
        iAndroidInfo.f78473c = Build.ID;
        iAndroidInfo.f78474d = Build.BOARD;
        iAndroidInfo.f78475e = Build.BRAND;
        String str2 = Build.TYPE;
        iAndroidInfo.f78476f = str2;
        iAndroidInfo.f78477g = Build.VERSION.CODENAME;
        iAndroidInfo.f78478h = Build.DEVICE;
        iAndroidInfo.f78479i = Build.HARDWARE;
        iAndroidInfo.f78480j = "eng".equals(str2) || "userdebug".equals(str2);
        iAndroidInfo.f78481k = Build.MANUFACTURER;
        iAndroidInfo.f78482l = Build.MODEL;
        int i11 = Build.VERSION.SDK_INT;
        iAndroidInfo.f78483m = i11;
        iAndroidInfo.f78484n = Build.VERSION.SECURITY_PATCH;
        iAndroidInfo.f78485o = i11 >= 31 ? Build.SOC_MANUFACTURER : "";
        iAndroidInfo.f78486p = Build.VERSION.INCREMENTAL;
        N.MYc8mtnY(iAndroidInfo.f78475e, iAndroidInfo.f78478h, iAndroidInfo.f78473c, iAndroidInfo.f78481k, iAndroidInfo.f78482l, iAndroidInfo.f78476f, iAndroidInfo.f78474d, iAndroidInfo.f78472b, iAndroidInfo.f78486p, iAndroidInfo.f78479i, iAndroidInfo.f78477g, iAndroidInfo.f78485o, iAndroidInfo.f78471a, iAndroidInfo.f78483m, iAndroidInfo.f78480j, iAndroidInfo.f78484n);
    }
}
