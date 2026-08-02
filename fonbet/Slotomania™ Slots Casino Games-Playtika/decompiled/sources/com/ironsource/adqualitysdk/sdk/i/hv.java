package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public enum hv {
    f2430(-1),
    f2428(0),
    f2431(1),
    f2429(2),
    f2432(3),
    f2425(4),
    f2424(5),
    f2426(6);


    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int[] f2421 = null;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2422 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2423;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final int f2433;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m7861() {
        f2421 = new int[]{259480859, 2009362049, -2079725518, -1893823068, 1093759147, 275305374, -1269260321, -1551937935, 975009908, -467076193, -301537694, -1108619970, 2142203791, -1884253141, -647428355, -395253281, 2032541041, 787834512};
    }

    public static hv valueOf(String str) {
        int i = 2 % 2;
        int i2 = f2422 + 33;
        f2423 = i2 % 128;
        int i3 = i2 % 2;
        hv hvVar = (hv) Enum.valueOf(hv.class, str);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = f2422 + 43;
        f2423 = i5 % 128;
        int i6 = i5 % 2;
        return hvVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static hv[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f2422 + 53;
        f2423 = i2 % 128;
        int i3 = i2 % 2;
        hv[] valuesCustom = values();
        if (i3 == 0) {
            return (hv[]) valuesCustom.clone();
        }
        throw null;
    }

    static {
        m7861();
        int i = f2422 + 103;
        f2423 = i % 128;
        int i2 = i % 2;
    }

    hv(int i) {
        this.f2433 = i;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static hv m7859(int i) {
        int i2 = 2 % 2;
        int i3 = f2422 + 25;
        int i4 = i3 % 128;
        f2423 = i4;
        int i5 = i3 % 2;
        Object obj = null;
        switch (i) {
            case -1:
                return f2430;
            case 0:
                return f2428;
            case 1:
                hv hvVar = f2431;
                int i6 = i4 + 57;
                f2422 = i6 % 128;
                int i7 = i6 % 2;
                return hvVar;
            case 2:
                hv hvVar2 = f2429;
                int i8 = i4 + 79;
                f2422 = i8 % 128;
                if (i8 % 2 != 0) {
                    return hvVar2;
                }
                super.hashCode();
                throw null;
            case 3:
                return f2432;
            case 4:
                return f2425;
            case 5:
                return f2424;
            case 6:
                return f2426;
            default:
                return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m7862() {
        int i = 2 % 2;
        int i2 = f2422 + 51;
        int i3 = i2 % 128;
        f2423 = i3;
        int i4 = i2 % 2;
        int i5 = this.f2433;
        int i6 = i3 + 45;
        f2422 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7860(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2421.clone();
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
