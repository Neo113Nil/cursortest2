package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class cs extends cw {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1515 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1516;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1517 = {19162736, -398683865, 1417979791, 1411542675, 1249477380, 2120613847, -1816099421, 272801372, -417689036, 33892345, 1213341077, 1918875064, -1120952721, -2094119905, 361636502, 170442661, 1692679066, 1320543342};

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m7319(cl clVar, List<Object> list) {
        List list2;
        String str;
        int i = 2 % 2;
        Class cls = (Class) m7365(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            arrayList = (List) m7365(list, 1, List.class);
        }
        if (list.size() > 2) {
            int i2 = f1515 + 87;
            f1516 = i2 % 128;
            int i3 = i2 % 2;
            list2 = (List) m7365(list, 2, List.class);
            int i4 = f1516 + 87;
            f1515 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            list2 = null;
        }
        try {
            if (list2 == null) {
                return kk.m8437(cls, (List<Object>) arrayList);
            }
            Class[] clsArr = new Class[list2.size()];
            list2.toArray(clsArr);
            return kk.m8434(cls, (List<Object>) arrayList, clsArr);
        } catch (Exception e) {
            String m7302 = clVar.m7208().m7302();
            StringBuilder append = new StringBuilder().append(m7317(new int[]{-648942494, 517050492, 645298800, 726756224, 321196532, 69693753, -773314648, 2093283333, 410495892, -1310066735}, 19 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()).append(cls.getName()).append(m7317(new int[]{-1153318335, -79935885, -690300098, 834177949, 189391420, -1202993097}, 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()).append(arrayList);
            if (list2 != null) {
                str = new StringBuilder().append(m7317(new int[]{1115323421, -1469423853, -1042293973, -1987409538, 1522265525, 700249561, 1630840307, 24452277}, 13 - Color.blue(0)).intern()).append(list2).toString();
            } else {
                int i6 = f1515 + 73;
                f1516 = i6 % 128;
                int i7 = i6 % 2;
                str = "";
            }
            cn.m7268(m7302, append.append(str).toString(), e);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static char m7316(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1515 + 33;
        f1516 = i2 % 128;
        int i3 = i2 % 2;
        char intValue = (char) ((Number) m7365(list, 0, Number.class)).intValue();
        int i4 = f1516 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1515 = i4 % 128;
        if (i4 % 2 != 0) {
            return intValue;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Class m7318(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1516 + 103;
        f1515 = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Array.newInstance((Class<?>) m7365(list, 0, Class.class), 0).getClass();
        int i4 = f1515 + 39;
        f1516 = i4 % 128;
        if (i4 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m7320(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1516 + 7;
        f1515 = i2 % 128;
        int i3 = i2 % 2;
        if (kk.m8442(m7365(list, 0, Object.class), (String) m7365(list, 1, String.class), (List) m7365(list, 2, List.class)) == null) {
            return false;
        }
        int i4 = f1516 + 17;
        f1515 = i4 % 128;
        return !(i4 % 2 == 0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7317(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1517.clone();
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
