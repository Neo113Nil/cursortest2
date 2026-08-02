package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.TextUtils;
import com.yandex.mobile.ads.common.MobileAds;

/* loaded from: classes5.dex */
public final class hk extends gt {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2342 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2343 = 16510;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2344 = 50459;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2345 = 40605;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2346 = 32893;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2347;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2347 + 103;
        f2342 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7836("\uf0ba냜阍\uedd8춪㙏窘എ⒕ﯡ뱨塬\ue05f귳⟕\u07bfু똺ܲ戨逰身\uf0ba냜졇낦ﾾ푓庇⪎\ue05f귳⟕\u07bf\ue5c1髀\udef7밫", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38).intern();
        int i4 = f2347 + 51;
        f2342 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2347;
        int i3 = i2 + 5;
        f2342 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        f2342 = i5 % 128;
        int i6 = i5 % 2;
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        ci ciVar = new ci(mo7797());
        int i2 = f2342 + 37;
        f2347 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return ciVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2342 + 49;
        f2347 = i2 % 128;
        return (i2 % 2 != 0 ? m7836("춪㙏窘എ⒕ﯡ", 76 % TextUtils.getOffsetBefore("", 1)) : m7836("춪㙏窘എ⒕ﯡ", 6 - TextUtils.getOffsetBefore("", 0))).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7836(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2344)) ^ ((c2 >>> 5) + f2346)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2345) ^ ((c3 + i2) ^ ((c3 << 4) + f2343))));
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
