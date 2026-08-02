package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public final class ff extends ey {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2067 = 46;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2068 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2069 = 1;

    public ff(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ */
    public final Number mo7756(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2069 + 109;
        f2068 = i2 % 128;
        int i3 = i2 % 2;
        if ((number instanceof Double) || (number2 instanceof Double)) {
            Double valueOf = Double.valueOf(number.doubleValue() - number2.doubleValue());
            int i4 = f2068 + 99;
            f2069 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return valueOf;
        }
        if (!(number instanceof Long) && !(number2 instanceof Long)) {
            return Integer.valueOf(number.intValue() - number2.intValue());
        }
        Long valueOf2 = Long.valueOf(number.longValue() - number2.longValue());
        int i6 = f2069 + 87;
        f2068 = i6 % 128;
        int i7 = i6 % 2;
        return valueOf2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2069 + 71;
        f2068 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7763(-TextUtils.lastIndexOf("", '0', 0), true, 92 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern();
        int i4 = f2069 + 115;
        f2068 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7763(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f2067);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
