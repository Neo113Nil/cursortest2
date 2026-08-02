package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cr extends cw {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1510 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1511 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1512 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1513 = 53172;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1514;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m7314(cl clVar, List<Object> list) {
        boolean booleanValue;
        JSONObject jSONObject;
        int i = 2 % 2;
        String str = (String) m7365(list, 0, String.class);
        String obj = new StringBuilder().append(clVar.m7203()).append(m7315((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19350), "\u0000\u0000\u0000\u0000", "㿢씑阤퉋", "䌴", 616894783 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()).append(Integer.toHexString(str.hashCode())).toString();
        Throwable th = (Throwable) m7365(list, 1, Throwable.class);
        if (list.size() > 2) {
            if (m7363(list, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) m7365(list, 2, JSONObject.class);
                if (list.size() > 3) {
                    int i2 = f1511 + 75;
                    f1510 = i2 % 128;
                    if (i2 % 2 != 0 ? m7363(list, 3, Boolean.class) : m7363(list, 2, Boolean.class)) {
                        r2 = ((Boolean) m7365(list, 3, Boolean.class)).booleanValue();
                        int i3 = f1510 + 101;
                        f1511 = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
                jSONObject = jSONObject2;
                booleanValue = r2;
            } else {
                booleanValue = m7363(list, 2, Boolean.class) ? ((Boolean) m7365(list, 2, Boolean.class)).booleanValue() : false;
                jSONObject = null;
            }
            kl.m8457(clVar.m7203(), str, obj, th, jSONObject, booleanValue);
            int i5 = f1511 + 33;
            f1510 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 5;
            }
        } else {
            kl.m8457(clVar.m7203(), str, obj, th, (JSONObject) null, false);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7315(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1514) ^ f1512) ^ f1513);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
