package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class dh {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1712 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1713 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1714 = 4;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1715 = {GMTDateParser.MINUTES, 'a', 'i', 'n', 'T', GMTDateParser.HOURS, 'r', 'e', GMTDateParser.DAY_OF_MONTH, 'f', 't', GMTDateParser.MONTH, 'o', 'p', 'q', GMTDateParser.SECONDS};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1716;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1717;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f1718;

    public dh(JSONObject jSONObject) {
        this.f1716 = jSONObject.optBoolean(m7487((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u0000\t", (byte) (Drawable.resolveOpacity(0, 0) + 18)).intern());
        this.f1718 = jSONObject.optBoolean(m7487(10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0005\r\u000b\u0006\u0007\n\u0002\u0003\u009d", (byte) (TextUtils.indexOf("", "", 0, 0) + 47)).intern());
        this.f1717 = eb.m7685(jSONObject.optString(m7487(7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0003\u0004\t\u0006\u0000\f", (byte) (39 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7489() {
        int i = 2 % 2;
        int i2 = f1713;
        int i3 = i2 + 67;
        f1712 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1716;
        int i5 = i2 + 71;
        f1712 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m7488() {
        int i = 2 % 2;
        int i2 = f1713;
        int i3 = i2 + 75;
        f1712 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1718;
        int i5 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1712 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m7490() {
        int i = 2 % 2;
        int i2 = f1713 + 93;
        f1712 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1717;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7487(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1715;
            char c = f1714;
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
