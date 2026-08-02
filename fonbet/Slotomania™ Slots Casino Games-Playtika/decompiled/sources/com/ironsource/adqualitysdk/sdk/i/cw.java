package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class cw {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1527 = {679857902, 577356931, 473962123, 165503771, 2023347102, 1579755624, -312948113, -1465615372, -663307277, -1891407845, 1016657963, 1100270769, 1064856563, -320254708, 660866195, -1761943135, -1676633008, 1554262506};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1528 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1529;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m7365(List<Object> list, int i, Class<T> cls) {
        int i2 = 2 % 2;
        T t = (T) list.get(i);
        if (t != null) {
            int i3 = f1529 + 7;
            f1528 = i3 % 128;
            int i4 = i3 % 2;
            if (!cls.isAssignableFrom(t.getClass())) {
                throw new ClassCastException(new StringBuilder().append(m7362(new int[]{-911488373, 1132367982, -1006369020, 110809697, 1493263282, 1795933479}, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).append(t.getClass().getName()).append(m7362(new int[]{-1390919090, -667087883}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4).intern()).append(cls.getName()).toString());
            }
        }
        int i5 = f1528 + 47;
        f1529 = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected static <T> boolean m7363(List<Object> list, int i, Class<T> cls) {
        int i2 = 2 % 2;
        int i3 = f1528 + 55;
        f1529 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object obj2 = list.get(i);
            if (obj2 != null && !cls.isAssignableFrom(obj2.getClass())) {
                return false;
            }
            int i4 = f1529 + 107;
            f1528 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        list.get(i);
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    protected static List<Object> m7364(List<Object> list, int i) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list.size() > i) {
            int i3 = f1528 + 111;
            f1529 = i3 % 128;
            int i4 = i3 % 2;
            if (m7363(list, i, List.class)) {
                int i5 = f1529 + 71;
                f1528 = i5 % 128;
                if (i5 % 2 != 0) {
                    return (List) m7365(list, i, List.class);
                }
                List<Object> list2 = (List) m7365(list, i, List.class);
                int i6 = 75 / 0;
                return list2;
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7362(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1527.clone();
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
