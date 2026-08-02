package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.google.android.exoplayer2.C;

/* loaded from: classes4.dex */
public final class fl extends em {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2089 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2090 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2091 = {344};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2092 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2093 = 220;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2094;

    public fl(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2094 + 75;
        f2089 = i2 % 128;
        if (i2 % 2 != 0) {
            ea m7721 = m7735().m7721(eeVar, clVar);
            if (m7721.m7682()) {
                return m7721;
            }
            ea m77212 = m7736().m7721(eeVar, clVar);
            int i3 = f2094 + 35;
            f2089 = i3 % 128;
            int i4 = i3 % 2;
            return m77212;
        }
        m7735().m7721(eeVar, clVar).m7682();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2089 + 35;
        f2094 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        String intern = m7768(null, TextUtils.lastIndexOf("", '0', 0) + 128, null, "\u0081\u0081").intern();
        int i4 = f2089 + 7;
        f2094 = i4 % 128;
        if (i4 % 2 == 0) {
            return intern;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7768(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f2091;
            int i2 = f2093;
            if (f2090) {
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
            if (f2092) {
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
