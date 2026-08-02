package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.mediationsdk.IronSource;

/* loaded from: classes6.dex */
public final class gw extends gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2269 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2270 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2271 = 33334;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2272 = 17337;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2273 = 64935;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2274 = 37247;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2269 + 87;
        f2270 = i2 % 128;
        String intern = m7820("\uee4d뺎ꩵｺ嶥쯸톎퓕\uf42bֆ팋᧺㼢쫄㈤഻缻ේ澥忿菁ⱅ톎퓕롛滈풔⧡᷾％톎퓕捳៹팋᧺㼢쫄", i2 % 2 != 0 ? ViewConfiguration.getKeyRepeatTimeout() + 161 : 38 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        int i3 = f2270 + 3;
        f2269 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2269 + 9;
        int i3 = i2 % 128;
        f2270 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        f2269 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return IronSource.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bs bsVar = new bs(mo7797());
        int i2 = f2270 + 59;
        f2269 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return bsVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2270 + 17;
        f2269 = i2 % 128;
        String intern = m7820("嶥쯸톎퓕\uf42bֆ팋᧺㼢쫄", i2 % 2 == 0 ? 60 << TextUtils.indexOf("", "") : 10 - TextUtils.indexOf("", "")).intern();
        int i3 = f2270 + 51;
        f2269 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7820(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2273)) ^ ((c2 >>> 5) + f2272)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2274) ^ ((c3 + i2) ^ ((c3 << 4) + f2271))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
