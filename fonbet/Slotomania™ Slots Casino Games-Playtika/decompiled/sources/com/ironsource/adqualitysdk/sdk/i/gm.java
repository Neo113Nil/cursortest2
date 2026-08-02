package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.amazon.device.ads.DTBAdRequest;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class gm extends gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2207 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2208 = 50675;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2209 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2210 = 15581;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2211 = 38828;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2212 = 53056;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2207 + 91;
        f2209 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7807("碘ﴦ써᭽\ue925꒦혨㽆ꕧẹ醾黵䇇쓢ﶱ㼎掦찣唄媏ﬄ뽐ꑅ扡ဃ槮⿕羪ꯓ\ud96a\u05fd鄳쪩ద", 34 - Drawable.resolveOpacity(0, 0)).intern();
        int i4 = f2207 + 7;
        f2209 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2207;
        int i3 = i2 + 47;
        f2209 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2209 = i4 % 128;
        int i5 = i4 % 2;
        return DTBAdRequest.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bi biVar = new bi(mo7797());
        int i2 = f2207 + 83;
        f2209 = i2 % 128;
        int i3 = i2 % 2;
        return biVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2207 + 93;
        f2209 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7807("\ue925꒦혨㽆ꕧẹ㳨⨅꾁䍞", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10).intern();
        int i4 = f2209 + 41;
        f2207 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7807(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2208)) ^ ((c2 >>> 5) + f2211)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2210) ^ ((c3 + i2) ^ ((c3 << 4) + f2212))));
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
