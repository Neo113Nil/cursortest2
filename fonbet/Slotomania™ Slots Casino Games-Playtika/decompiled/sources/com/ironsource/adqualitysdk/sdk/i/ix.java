package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ix {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2667 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2668 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2669;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, Integer> f2670;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2671;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Object> f2672;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Integer> f2673;

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m8125() {
        f2671 = (char) 1;
        f2669 = new char[]{AbstractJsonLexerKt.COLON};
    }

    static {
        m8125();
        f2672 = new HashMap();
        f2673 = new HashMap();
        f2670 = new HashMap();
        int i = f2668 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2667 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8126(Context context, String str, JSONObject jSONObject, Object... objArr) {
        int i = 2 % 2;
        iu.m8114(context).m8120(new Intent(str).putExtra(is.f2591, jSONObject.toString()));
        int i2 = f2668 + 19;
        f2667 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8124(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2669;
            char c = f2671;
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
