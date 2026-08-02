package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.ar;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ao extends ar.AnonymousClass5 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f356 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f357 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f358 = 7195623589099981187L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m6021() {
        int i = 2 % 2;
        int i2 = f356 + 65;
        f357 = i2 % 128;
        int i3 = i2 % 2;
        String optString = m6075().optString(m6018("牷좑爒Ŧ콲尀䫜", (KeyEvent.getMaxKeyCode() >> 16) + 1).intern());
        int i4 = f356 + 11;
        f357 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return optString;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m6019(String str) {
        int i = 2 % 2;
        JSONObject m6020 = m6020();
        if (m6020 == null) {
            int i2 = f357 + 73;
            f356 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        Object opt = m6020.opt(str);
        int i3 = f357 + 55;
        f356 = i3 % 128;
        int i4 = i3 % 2;
        return opt;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m6020() {
        JSONObject m6075;
        int maximumFlingVelocity;
        int i = 2 % 2;
        int i2 = f356 + 57;
        f357 = i2 % 128;
        if (i2 % 2 != 0) {
            m6075 = m6075();
            maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() / 109) + 1;
        } else {
            m6075 = m6075();
            maximumFlingVelocity = 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
        }
        return m6075.optJSONObject(m6018("た㟦〫︗H譣ᘧ錯힃\ud81a", maximumFlingVelocity).intern());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6018(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f358, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f358));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
