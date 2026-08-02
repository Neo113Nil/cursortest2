package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class dw {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1850 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1851 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f1852 = 2130;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f1853 = 58563;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f1854 = 3065;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1855 = 64547;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f1856;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f1857;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f1858;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final String f1859;

    public dw(String str, String str2, String str3) {
        this(str, str2, str3, 0);
    }

    public dw(String str, String str2, String str3, int i) {
        this.f1857 = str;
        this.f1859 = str2;
        this.f1856 = str3;
        this.f1858 = i;
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1857).append(m7613("襙矵", -TextUtils.lastIndexOf("", '0', 0)).intern()).append(this.f1859).append(m7613("쩾줉", -ExpandableListView.getPackedPositionChild(0L)).intern()).append(this.f1856).append(m7613("뙲᭫", ExpandableListView.getPackedPositionType(0L) + 1).intern()).append(this.f1858).append(m7613("ựꜮ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern()).toString();
        int i2 = f1850 + 5;
        f1851 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7613(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1853)) ^ ((c2 >>> 5) + f1854)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1852) ^ ((c3 + i2) ^ ((c3 << 4) + f1855))));
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
