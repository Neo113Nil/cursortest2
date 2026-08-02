package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.google.android.exoplayer2.C;

/* loaded from: classes6.dex */
public final class gp extends gt {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2240 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2241 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2242 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2243 = 133;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2244 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2245 = {232, 244, 242, 179, 235, 254, 231, 234, 247, 203, 230, 238, 199, 233};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2241 + 67;
        f2240 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7812(null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u008e\u008c\u008d\u0089\u008c\u008b\u008a\u0084\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i4 = f2241 + 95;
        f2240 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2240 + 1;
        f2241 = i2 % 128;
        if (i2 % 2 == 0) {
            return FairBid.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bq bqVar = new bq(mo7797());
        int i2 = f2240 + 49;
        f2241 = i2 % 128;
        int i3 = i2 % 2;
        return bqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2241 + 93;
        f2240 = i2 % 128;
        String intern = (i2 % 2 == 0 ? m7812(null, 73 % (PointF.length(0.0f, 2.0f) > 0.0f ? 1 : (PointF.length(0.0f, 2.0f) == 0.0f ? 0 : -1)), null, "\u008e\u008c\u0087\u0089\u008c\u008b\u0085") : m7812(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u008e\u008c\u0087\u0089\u008c\u008b\u0085")).intern();
        int i3 = f2241 + 97;
        f2240 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7812(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f2245;
            int i2 = f2243;
            if (f2242) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f2244) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }
}
