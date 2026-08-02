package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class fe extends eu {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2061 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2062 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2063 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2064 = {315, 316};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2065 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2066 = 255;

    public fe(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7754(int i) {
        int i2 = 2 % 2;
        if (i > 0) {
            return false;
        }
        int i3 = f2061;
        int i4 = i3 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2063 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 33;
        f2063 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2061 + 11;
        f2063 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7762(null, 127 - View.MeasureSpec.getMode(0), null, "\u0082\u0081").intern();
        int i4 = f2061 + 35;
        f2063 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7762(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f2064;
            int i2 = f2066;
            if (f2062) {
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
            if (f2065) {
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
