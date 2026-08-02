package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.ironsource.B5;

/* loaded from: classes4.dex */
public final class fb extends ev {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2048 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2049 = {B5.U};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2050 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2051 = 1;

    public fb(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7754(int i) {
        int i2 = 2 % 2;
        int i3 = f2048 + 17;
        int i4 = i3 % 128;
        f2050 = i4;
        int i5 = i3 % 2;
        if (i != 0) {
            return false;
        }
        int i6 = i4 + 23;
        f2048 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7753(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2048 + 17;
        f2050 = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = str.equals(str2);
        int i4 = f2048 + 93;
        f2050 = i4 % 128;
        if (i4 % 2 == 0) {
            return equals;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7752(Object obj, Object obj2) {
        int i = 2 % 2;
        if (obj == obj2) {
            int i2 = f2048 + 97;
            f2050 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f2048 + 93;
        f2050 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2050 + 105;
        f2048 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7759(ExpandableListView.getPackedPositionType(0L) + 2, "¬¬", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 110)).intern();
        int i4 = f2050 + 17;
        f2048 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7759(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2049;
            char c = f2051;
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
