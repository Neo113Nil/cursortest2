package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public abstract class dy {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1883 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1884 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1885 = {'a', 'n', GMTDateParser.DAY_OF_MONTH, 'r', 'o', 'i', '-', '.', GMTDateParser.SECONDS, 'l', ' ', 't', AbstractJsonLexerKt.COMMA, '\n', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1886 = 4;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f1887;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f1888;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final List<dw> f1889 = new ArrayList();

    public dy(String str, String str2) {
        this.f1887 = str;
        this.f1888 = str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m7665() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7663(7 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0001\u0002\u0003\u0000\u0005\u0006\u0006\n", (byte) ((Process.myTid() >> 22) + 12)).intern()).append(this.f1887.toLowerCase()).append(m7663(1 - Color.blue(0), "\u0081", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 85)).intern()).append(this.f1888).append(m7663((ViewConfiguration.getTouchSlop() >> 8) + 4, "\u0004\u000b\u0001\u000b", (byte) (70 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern()).toString();
        int i2 = f1883 + 57;
        f1884 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected final void m7664(dw dwVar) {
        int i = 2 % 2;
        int i2 = f1884 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1883 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1889.add(dwVar);
            int i3 = 50 / 0;
        } else {
            this.f1889.add(dwVar);
        }
        int i4 = f1883 + 83;
        f1884 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7663(Color.green(0) + 5, "\u0080\u0080\u0003\b\u0080", (byte) (96 - ((Process.getThreadPriority(0) + 20) >> 6))).intern()).append(this.f1889.toString().replace(m7663(2 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u000e\b", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 66)).intern(), m7663(TextUtils.getCapsMode("", 0, 0) + 6, "\u000e\t\b\u0002\b\u000b", (byte) (32 - (ViewConfiguration.getTouchSlop() >> 8))).intern()).replace(m7663(-TextUtils.lastIndexOf("", '0', 0, 0), "\u0094", (byte) (56 - Process.getGidForName(""))).intern(), "").replace(m7663((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "Å", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 104)).intern(), "")).toString();
        int i2 = f1884 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1883 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7663(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1885;
            char c = f1886;
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
