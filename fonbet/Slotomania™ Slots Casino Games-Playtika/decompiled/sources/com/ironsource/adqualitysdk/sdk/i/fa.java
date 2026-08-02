package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import com.ironsource.B5;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class fa extends eu {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2044 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2045 = 2;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2046;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2047 = {Typography.greater, B5.U, '?', '@'};

    public fa(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7754(int i) {
        int i2 = 2 % 2;
        int i3 = f2046;
        int i4 = i3 + 47;
        int i5 = i4 % 128;
        f2044 = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (i < 0) {
            int i6 = i3 + 77;
            f2044 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 34 / 0;
            }
            return false;
        }
        int i8 = i5 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2046 = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int indexOf;
        byte myTid;
        int i = 2 % 2;
        int i2 = f2046 + 59;
        f2044 = i2 % 128;
        if (i2 % 2 == 0) {
            indexOf = TextUtils.indexOf("", GMTDateParser.YEAR, 1, 0) + 3;
            myTid = (byte) (43 / (Process.myTid() + 126));
        } else {
            indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3;
            myTid = (byte) (64 - (Process.myTid() >> 22));
        }
        return m7758(indexOf, "\u0001\u0000", myTid).intern();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7758(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2047;
            char c = f2045;
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
