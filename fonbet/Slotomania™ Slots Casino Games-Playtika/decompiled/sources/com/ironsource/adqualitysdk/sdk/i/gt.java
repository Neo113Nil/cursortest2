package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.jl;

/* loaded from: classes6.dex */
public abstract class gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2255 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2256 = 3787;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2257 = 55034;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2258 = 40131;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2259 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2260 = 41954;

    /* renamed from: ﻐ */
    public abstract Class mo7796();

    /* renamed from: ﻛ */
    public abstract String mo7797();

    /* renamed from: ｋ */
    public abstract String mo7798();

    /* renamed from: ﾇ */
    public abstract be mo7799();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final jl.e m7817() {
        int i = 2 % 2;
        if (ar.m6041().mo6052().m6040()) {
            int i2 = f2255 + 9;
            f2259 = i2 % 128;
            int i3 = i2 % 2;
            String m6039 = ar.m6041().mo6052().m6039(mo7797());
            if (!(!TextUtils.isEmpty(m6039))) {
                return null;
            }
            return new jl.a(new StringBuilder().append(m7816("豟㧔濻ⲵ@哿\u243bἃ\uf3db翘\uf797Ｙ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern()).append(mo7797()).toString(), m7816("籎\uf57e࿃澚", TextUtils.lastIndexOf("", '0', 0, 0) + 4).intern(), m6039);
        }
        jl.e eVar = new jl.e(new StringBuilder().append(m7816("豟㧔濻ⲵ@哿\u243bἃ\uf3db翘\uf797Ｙ", 11 - Color.green(0)).intern()).append(mo7797()).toString(), m7816("籎\uf57e࿃澚", 3 - Color.green(0)).intern());
        int i4 = f2255 + 113;
        f2259 = i4 % 128;
        int i5 = i4 % 2;
        return eVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7816(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2260)) ^ ((c2 >>> 5) + f2256)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2258) ^ ((c3 + i2) ^ ((c3 << 4) + f2257))));
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
