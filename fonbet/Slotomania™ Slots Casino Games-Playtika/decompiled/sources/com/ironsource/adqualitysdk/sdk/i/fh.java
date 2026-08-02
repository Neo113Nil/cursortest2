package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class fh extends ey {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2073 = {173170886, 1890758445, -1231926040, -887452631, 560265058, -251006147, -1095528551, -1918971599, -17106943, -714609468, -389762236, -526262194, 577676689, 481346339, 1151552028, 2129845502, -773768180, 469735921};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2074 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2075 = 1;

    public fh(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ */
    public final Number mo7756(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2075;
        int i3 = i2 + 51;
        f2074 = i3 % 128;
        int i4 = i3 % 2;
        if (!(number instanceof Double)) {
            int i5 = i2 + 41;
            f2074 = i5 % 128;
            int i6 = i5 % 2;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i7 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f2074 = i7 % 128;
                    if (i7 % 2 != 0) {
                        boolean z = number2 instanceof Long;
                        throw null;
                    }
                    if (!(number2 instanceof Long)) {
                        return Integer.valueOf(number.intValue() * number2.intValue());
                    }
                }
                return Long.valueOf(number.longValue() * number2.longValue());
            }
        }
        Double valueOf = Double.valueOf(number.doubleValue() * number2.doubleValue());
        int i8 = f2075 + 97;
        f2074 = i8 % 128;
        int i9 = i8 % 2;
        return valueOf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2074 + 33;
        f2075 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7765(new int[]{-834600546, -698902077}, (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern();
        int i4 = f2074 + 89;
        f2075 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7765(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2073.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
