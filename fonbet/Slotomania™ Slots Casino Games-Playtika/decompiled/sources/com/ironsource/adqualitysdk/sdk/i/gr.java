package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import com.google.android.exoplayer2.C;
import io.ktor.util.date.GMTDateParser;

/* loaded from: classes6.dex */
public final class gr extends gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2249 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2250;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2251 = {'1', 'i', 'n', GMTDateParser.MONTH, 'H', 'e', GMTDateParser.DAY_OF_MONTH, 'i', GMTDateParser.SECONDS, 'k', GMTDateParser.HOURS, 'o', 'q', GMTDateParser.SECONDS, 'Q', 'P', 'k', 'g', 'L', '8', 'U', GMTDateParser.DAY_OF_MONTH, 'i', GMTDateParser.SECONDS, 'k', GMTDateParser.HOURS, 'o', 'q', GMTDateParser.SECONDS, '7', 'o', 'q', GMTDateParser.SECONDS, 'k', 'e', GMTDateParser.DAY_OF_MONTH, 'i', GMTDateParser.SECONDS, 'k'};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2249 + 23;
        f2250 = i2 % 128;
        String intern = (i2 % 2 != 0 ? m7814("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{0, 29, 0, 0}, true) : m7814("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{0, 29, 0, 0}, false)).intern();
        int i3 = f2249 + 109;
        f2250 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2249 + 95;
        int i3 = i2 % 128;
        f2250 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        f2249 = i5 % 128;
        int i6 = i5 % 2;
        return Chartboost.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bk bkVar = new bk(mo7797());
        int i2 = f2249 + 71;
        f2250 = i2 % 128;
        int i3 = i2 % 2;
        return bkVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2249 + 101;
        f2250 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7814("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{29, 10, 0, 4}, false).intern();
        int i4 = f2249 + 105;
        f2250 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7814(String str, int[] iArr, boolean z) {
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
            System.arraycopy(f2251, i, cArr, 0, i2);
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
