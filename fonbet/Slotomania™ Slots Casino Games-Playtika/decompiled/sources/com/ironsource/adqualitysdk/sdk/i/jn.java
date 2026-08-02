package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class jn {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2836 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2837 = 51827;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2838 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2839 = 'N';

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2840 = 9498;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2841 = 16034;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f2842;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject f2843;

    jn(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    jn(JSONObject jSONObject, String str) {
        this.f2843 = jSONObject;
        this.f2842 = str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m8242() throws JSONException {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(m8239("齙\u0a58\ud84b璶ꑾ綐춷䓏", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8).intern(), this.f2843);
        jsonObjectInit.put(m8239("㥴『妠꺔", 4 - Color.argb(0, 0, 0, 0)).intern(), this.f2842);
        int i2 = f2838 + 37;
        f2836 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return jsonObjectInit;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m8241() {
        int i = 2 % 2;
        int i2 = f2838 + 101;
        f2836 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2843;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m8240() {
        int i = 2 % 2;
        int i2 = f2836;
        int i3 = i2 + 63;
        f2838 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2842;
        int i5 = i2 + 63;
        f2838 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8239(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2841)) ^ ((c2 >>> 5) + f2837)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2840) ^ ((c3 + i2) ^ ((c3 << 4) + f2839))));
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
