package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class dp {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1804 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f1805 = 44506;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1806 = 28523;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1807 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f1808 = 63272;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f1809 = 27121;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1810;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1811;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1812;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1813;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1814;

    public dp(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1810 = jSONObject.optString(m7595("銺㝐ㄫគ阴⳹\uded6䯪", 7 - TextUtils.getCapsMode("", 0, 0)).intern());
            this.f1812 = jSONObject.optString(m7595("앏饆\uf6b8燄ꝱ냅", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5).intern());
            this.f1811 = jSONObject.optString(m7595("炐痐碔뀕遏⌺", 5 - Color.alpha(0)).intern());
            this.f1814 = jSONObject.optString(m7595("弈罃첊꾬㋆߈\ue6cfꨢ", Color.green(0) + 7).intern());
            this.f1813 = jSONObject.optBoolean(m7595("뜔\ud97c\uf749\ue7c1嚜锾்杳࣎꛲", 10 - TextUtils.getOffsetAfter("", 0)).intern());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m7597() {
        int i = 2 % 2;
        int i2 = f1807;
        int i3 = i2 + 83;
        f1804 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1810;
        int i5 = i2 + 5;
        f1804 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m7598() {
        int i = 2 % 2;
        int i2 = f1807 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f1804 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1812;
        int i4 = i3 + 19;
        f1807 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m7600() {
        int i = 2 % 2;
        int i2 = f1807;
        int i3 = i2 + 45;
        f1804 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1811;
        int i5 = i2 + 107;
        f1804 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7596() {
        String str;
        int i = 2 % 2;
        int i2 = f1807 + 25;
        int i3 = i2 % 128;
        f1804 = i3;
        if (i2 % 2 == 0) {
            str = this.f1814;
            int i4 = 65 / 0;
        } else {
            str = this.f1814;
        }
        int i5 = i3 + 77;
        f1807 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7599() {
        int i = 2 % 2;
        int i2 = f1804;
        int i3 = i2 + 65;
        f1807 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1813;
        int i5 = i2 + 101;
        f1807 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7595(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1809)) ^ ((c2 >>> 5) + f1805)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1808) ^ ((c3 + i2) ^ ((c3 << 4) + f1806))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
