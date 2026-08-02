package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import jp.maio.sdk.android.MaioAds;

/* loaded from: classes6.dex */
public final class gy extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2278 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2279 = {'j', 'p', '.', GMTDateParser.MINUTES, 'a', 'i', 'o', GMTDateParser.SECONDS, GMTDateParser.DAY_OF_MONTH, 'k', 'n', 'r', GMTDateParser.MONTH, 'A', 'l', 'q'};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2280 = 4;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2281;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int lastIndexOf;
        int i;
        int i2 = 2 % 2;
        int i3 = f2278 + 77;
        f2281 = i3 % 128;
        if (i3 % 2 != 0) {
            lastIndexOf = 5 >>> TextUtils.lastIndexOf("", (char) 21, 1, 1);
            i = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 71;
        } else {
            lastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 28;
            i = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 81;
        }
        return m7822(lastIndexOf, "\u0001\u0002\u0003\u0000\u0005\u0006\n\u0006\u0004\u000b\n\u0001\u0006\b\t\b\u0007\u0006\n\u0000\u0000\b\u0006\u0007\f\tÅ", (byte) i).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2281;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2278 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        f2278 = i5 % 128;
        int i6 = i5 % 2;
        return MaioAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bu buVar = new bu(mo7797());
        int i2 = f2281 + 109;
        f2278 = i2 % 128;
        int i3 = i2 % 2;
        return buVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2281 + 57;
        f2278 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7822(4 - KeyEvent.getDeadChar(0, 0), "\u0000\u0007\u0006\u0007", (byte) (AndroidCharacter.getMirror('0') + 15)).intern();
        int i4 = f2281 + 43;
        f2278 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7822(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2279;
            char c = f2280;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
