package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static long valueOf;
    private static int values;

    static {
        valueOf();
        MotionEvent.axisFromString("");
        int i11 = AFKeystoreWrapper + 91;
        values = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @NonNull
    private static AFh1cSDK AFInAppEventParameterName(@NonNull AFh1hSDK aFh1hSDK, String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (str == null) {
            return new AFh1cSDK(aFh1hSDK.valueOf == AFh1mSDK.DEFAULT, AFh1bSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("峇ᕐ쿭耂窛㌱\ue549忣ၿ쪂茥疰⿒\ue06b媂ጟ얶뿅灞⫴\ue30a單ฺ쁝뫨獻▖鹝偆\u0adc썳떌渢₵髏卥\u05fe﹦낫櫂⍚閞万è路덎日\ude79邓䤧ι\uf5d6깯悀\ud91c鎴䗋㸪\uf0f0ꤌ掤퐼蹔䂜", (ViewConfiguration.getTouchSlop() >> 8) + 18839, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFh1hSDK.valueOf == AFh1mSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = valueOf(new StringBuilder(str3).reverse().toString(), aFh1hSDK.AFKeystoreWrapper, "android", "v1", str4).equals(str);
        return new AFh1cSDK(equals, equals ? AFh1bSDK.SUCCESS : AFh1bSDK.FAILURE);
    }

    private static void a(String str, int i11, Object[] objArr) {
        int i12 = $11;
        $10 = (i12 + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        char[] cArr = str;
        if (str != null) {
            int i13 = i12 + 51;
            $10 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 != 0) {
                int i14 = 12 / 0;
                cArr = str.toCharArray();
            } else {
                cArr = str.toCharArray();
            }
        }
        char[] cArr2 = cArr;
        AFj1iSDK aFj1iSDK = new AFj1iSDK();
        aFj1iSDK.values = i11;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFj1iSDK.AFInAppEventType = 0;
        while (true) {
            int i15 = aFj1iSDK.AFInAppEventType;
            if (i15 >= cArr2.length) {
                break;
            }
            jArr[i15] = (cArr2[i15] ^ (i15 * aFj1iSDK.values)) ^ (valueOf ^ 3448363977863888702L);
            aFj1iSDK.AFInAppEventType = i15 + 1;
            $11 = ($10 + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        char[] cArr3 = new char[length];
        aFj1iSDK.AFInAppEventType = 0;
        $11 = ($10 + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        while (true) {
            int i16 = aFj1iSDK.AFInAppEventType;
            if (i16 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            } else {
                cArr3[i16] = (char) jArr[i16];
                aFj1iSDK.AFInAppEventType = i16 + 1;
            }
        }
    }

    static void valueOf() {
        valueOf = -3712288596210670646L;
    }

    @NonNull
    public final AFh1cSDK AFInAppEventType(@NonNull AFh1hSDK aFh1hSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (aFh1hSDK != null && str2 != null) {
            int i11 = (values + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFKeystoreWrapper = i11;
            if (str3 != null) {
                int i12 = (i11 + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
                values = i12;
                AFKeystoreWrapper = (i12 + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return AFInAppEventParameterName(aFh1hSDK, str, str2, str3);
            }
        }
        return new AFh1cSDK(false, AFh1bSDK.INTERNAL_ERROR);
    }

    private static String valueOf(String str, String str2, String str3, String str4, String str5) {
        values = (AFKeystoreWrapper + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFInAppEventType = AFb1mSDK.AFInAppEventType(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (AFInAppEventType.length() >= 12) {
            return AFInAppEventType.substring(0, 12);
        }
        values = (AFKeystoreWrapper + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventType;
    }
}
