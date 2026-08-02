package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class gi extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2192 = 49645;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2193 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2194 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2195 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2196;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        char longPressTimeout;
        int scrollBarFadeDuration;
        int i = 2 % 2;
        int i2 = f2195 + 61;
        f2194 = i2 % 128;
        if (i2 % 2 != 0) {
            longPressTimeout = (char) (49808 >>> (ViewConfiguration.getLongPressTimeout() >> 93));
            scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() % 2;
        } else {
            longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49808);
            scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
        }
        String intern = m7803(longPressTimeout, "\u0000\u0000\u0000\u0000", "ഓ鵡郓迂", "ꆍ飧✰ﰨ뺸唧爹ᬅ鵗䊳젔⟮턀镠\uf2b3蚈숟\ue131겶鬕钶ꞅ佱菹㍀䦞ᘿ៳", scrollBarFadeDuration).intern();
        int i3 = f2195 + 15;
        f2194 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2195 + 17;
        f2194 = i2 % 128;
        if (i2 % 2 == 0) {
            return AppLovinSdk.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bj bjVar = new bj(mo7797());
        int i2 = f2194 + 45;
        f2195 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return bjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2195 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2194 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7803((char) KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", "㘂ӱ軫┫", "伞屮㧴낡ﴼ缴꺑粸", Color.red(0)).intern();
        int i4 = f2194 + 49;
        f2195 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7803(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2196) ^ f2193) ^ f2192);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
