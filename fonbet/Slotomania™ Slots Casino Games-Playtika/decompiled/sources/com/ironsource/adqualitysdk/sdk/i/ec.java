package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class ec {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1918 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1920;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1922;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private d f1923;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1919 = {AbstractJsonLexerKt.COLON};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1921 = -7605205605632478800L;

    public enum d {
        f1932,
        f1935,
        f1931,
        f1934,
        f1933,
        f1930,
        f1927,
        f1929;


        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f1924 = 1;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static int f1925;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int[] f1928;

        /* renamed from: ﻛ, reason: contains not printable characters */
        static void m7699() {
            f1928 = new int[]{1717058614, 1031984232, -943601397, -152405379, -1486019363, -1934155298, 1932065484, -1778533344, -1705003521, 1252470615, 1009345864, 1343019728, -1922918527, -1784794012, -1293588187, 1849672706, 1438100390, -1658116809};
        }

        public static d valueOf(String str) {
            int i = 2 % 2;
            int i2 = f1924 + 63;
            f1925 = i2 % 128;
            int i3 = i2 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            if (i3 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i4 = f1925 + 107;
            f1924 = i4 % 128;
            int i5 = i4 % 2;
            return dVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f1924 + 89;
            f1925 = i2 % 128;
            int i3 = i2 % 2;
            d[] dVarArr = (d[]) values().clone();
            int i4 = f1924 + 7;
            f1925 = i4 % 128;
            int i5 = i4 % 2;
            return dVarArr;
        }

        static {
            m7699();
            int i = f1924 + 55;
            f1925 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m7700(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1928.clone();
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

    public ec(d dVar, String str) {
        this.f1923 = dVar;
        this.f1922 = str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final d m7696() {
        int i = 2 % 2;
        int i2 = f1918 + 105;
        int i3 = i2 % 128;
        f1920 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        d dVar = this.f1923;
        int i4 = i3 + 19;
        f1918 = i4 % 128;
        int i5 = i4 % 2;
        return dVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7693() {
        int i = 2 % 2;
        int i2 = f1920 + 13;
        int i3 = i2 % 128;
        f1918 = i3;
        int i4 = i2 % 2;
        String str = this.f1922;
        int i5 = i3 + 69;
        f1920 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7695(String str) {
        int i = 2 % 2;
        int i2 = f1918 + 37;
        f1920 = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = this.f1922.equals(str);
        int i4 = f1920 + 21;
        f1918 = i4 % 128;
        int i5 = i4 % 2;
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (m7689() == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (m7691() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (m7691() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ec.f1918 + 65;
        com.ironsource.adqualitysdk.sdk.i.ec.f1920 = r1 % 128;
        r1 = r1 % 2;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7694() {
        int i = 2 % 2;
        if (!m7698() && !m7697()) {
            int i2 = f1920 + 35;
            f1918 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 46 / 0;
            }
        }
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m7698() {
        int i = 2 % 2;
        if (m7696() == d.f1934) {
            int i2 = f1920 + 63;
            f1918 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = f1918 + 25;
        f1920 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7697() {
        int i = 2 % 2;
        int i2 = f1918 + 71;
        f1920 = i2 % 128;
        int i3 = i2 % 2;
        if (m7696() != d.f1933) {
            return false;
        }
        int i4 = f1920 + 111;
        f1918 = i4 % 128;
        return i4 % 2 != 0;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m7691() {
        int i = 2 % 2;
        int i2 = f1920 + 59;
        f1918 = i2 % 128;
        if (i2 % 2 == 0) {
            m7696();
            d dVar = d.f1930;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (m7696() == d.f1930) {
            return true;
        }
        int i3 = f1920 + 25;
        f1918 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m7689() {
        int i = 2 % 2;
        int i2 = f1920 + 45;
        f1918 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
            if (m7696() == d.f1927) {
                return true;
            }
        } else if (m7696() == d.f1927) {
            return true;
        }
        int i4 = f1918 + 41;
        f1920 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m7688() {
        int i = 2 % 2;
        if (m7696() == d.f1931) {
            int i2 = f1918 + 59;
            f1920 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = f1920 + 87;
        f1918 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m7692() {
        int i = 2 % 2;
        int i2 = f1918 + 85;
        f1920 = i2 % 128;
        int i3 = i2 % 2;
        if (m7696() != d.f1929) {
            return false;
        }
        int i4 = f1918 + 87;
        f1920 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return true;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m7690() {
        int i = 2 % 2;
        if (m7696() == d.f1935) {
            int i2 = f1918 + 115;
            f1920 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f1918 + 95;
        f1920 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final boolean m7687() {
        int i = 2 % 2;
        int i2 = f1918 + 89;
        f1920 = i2 % 128;
        if (i2 % 2 != 0) {
            m7696();
            d dVar = d.f1932;
            throw null;
        }
        if (m7696() == d.f1932) {
            return true;
        }
        int i3 = f1918 + 93;
        f1920 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1923).append(m7686((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (-1) - ExpandableListView.getPackedPositionChild(0L), -((byte) KeyEvent.getModifierMetaStateMask())).intern()).append(this.f1922).toString();
        int i2 = f1920 + 67;
        f1918 = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7686(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1919[c.f1198 + i] ^ (c.f1198 * f1921)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
