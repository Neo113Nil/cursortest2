package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class dr extends dn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1819 = {AbstractJsonLexerKt.BEGIN_OBJ, 237, 245, 259, 259, 256, 253, 251, 231, 240, 255, 246, 252, 260, 256, 254, 256, 258, 260, 257, 223, 223, 248, 249, 252, 220, 210, 237, 251, 256, 259};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1820 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1821;

    public dr(cl clVar, ee eeVar, String str) {
        this(clVar, eeVar, str, null);
    }

    public dr(cl clVar, ee eeVar, String str, Throwable th) {
        super(str, new du(clVar.m7208().m7302(), clVar.m7210().m7928(), eeVar), th);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public String mo7592() {
        int i = 2 % 2;
        int i2 = f1820 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1821 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7602("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{0, 31, 146, 17}, false).intern();
        int i4 = f1820 + 95;
        f1821 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7602(String str, int[] iArr, boolean z) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (h.f2286) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f1819, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                    }
                    c = cArr2[h.f2287];
                    h.f2287++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                    h.f2287++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                    h.f2287++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
