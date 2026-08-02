package b1;

import e1.Z;
import java.util.Arrays;

/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2357k {

    /* renamed from: g, reason: collision with root package name */
    public static final C2357k f24596g = new b().d(1).c(2).e(3).a();

    /* renamed from: h, reason: collision with root package name */
    public static final C2357k f24597h = new b().d(1).c(1).e(2).a();

    /* renamed from: i, reason: collision with root package name */
    public static final String f24598i = Z.K0(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24599j = Z.K0(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24600k = Z.K0(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24601l = Z.K0(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24602m = Z.K0(4);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24603n = Z.K0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f24604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24606c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24607d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24608e;

    /* renamed from: f, reason: collision with root package name */
    public int f24609f;
    public final byte[] hdrStaticInfo;

    /* renamed from: b1.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f24610a;

        /* renamed from: b, reason: collision with root package name */
        public int f24611b;

        /* renamed from: c, reason: collision with root package name */
        public int f24612c;

        /* renamed from: d, reason: collision with root package name */
        public int f24613d;

        /* renamed from: e, reason: collision with root package name */
        public int f24614e;
        private byte[] hdrStaticInfo;

        public C2357k a() {
            return new C2357k(this.f24610a, this.f24611b, this.f24612c, this.hdrStaticInfo, this.f24613d, this.f24614e);
        }

        public b b(int i10) {
            this.f24614e = i10;
            return this;
        }

        public b c(int i10) {
            this.f24611b = i10;
            return this;
        }

        public b d(int i10) {
            this.f24610a = i10;
            return this;
        }

        public b e(int i10) {
            this.f24612c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        public b g(int i10) {
            this.f24613d = i10;
            return this;
        }

        public b() {
            this.f24610a = -1;
            this.f24611b = -1;
            this.f24612c = -1;
            this.f24613d = -1;
            this.f24614e = -1;
        }

        public b(C2357k c2357k) {
            this.f24610a = c2357k.f24604a;
            this.f24611b = c2357k.f24605b;
            this.f24612c = c2357k.f24606c;
            this.hdrStaticInfo = c2357k.hdrStaticInfo;
            this.f24613d = c2357k.f24607d;
            this.f24614e = c2357k.f24608e;
        }
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    public static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    public static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(C2357k c2357k) {
        if (c2357k == null) {
            return true;
        }
        int i10 = c2357k.f24604a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c2357k.f24605b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c2357k.f24606c;
        if ((i12 != -1 && i12 != 3) || c2357k.hdrStaticInfo != null) {
            return false;
        }
        int i13 = c2357k.f24608e;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c2357k.f24607d;
        return i14 == -1 || i14 == 8;
    }

    public static boolean i(C2357k c2357k) {
        if (c2357k == null) {
            return false;
        }
        int i10 = c2357k.f24606c;
        return i10 == 7 || i10 == 6;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2357k.class == obj.getClass()) {
            C2357k c2357k = (C2357k) obj;
            if (this.f24604a == c2357k.f24604a && this.f24605b == c2357k.f24605b && this.f24606c == c2357k.f24606c && Arrays.equals(this.hdrStaticInfo, c2357k.hdrStaticInfo) && this.f24607d == c2357k.f24607d && this.f24608e == c2357k.f24608e) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f24607d == -1 || this.f24608e == -1) ? false : true;
    }

    public boolean g() {
        return (this.f24604a == -1 || this.f24605b == -1 || this.f24606c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f24609f == 0) {
            this.f24609f = ((((((((((527 + this.f24604a) * 31) + this.f24605b) * 31) + this.f24606c) * 31) + Arrays.hashCode(this.hdrStaticInfo)) * 31) + this.f24607d) * 31) + this.f24608e;
        }
        return this.f24609f;
    }

    public boolean isValid() {
        return f() || g();
    }

    public String m() {
        String str;
        String G10 = g() ? Z.G("%s/%s/%s", d(this.f24604a), c(this.f24605b), e(this.f24606c)) : "NA/NA/NA";
        if (f()) {
            str = this.f24607d + "/" + this.f24608e;
        } else {
            str = "NA/NA";
        }
        return G10 + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f24604a));
        sb2.append(", ");
        sb2.append(c(this.f24605b));
        sb2.append(", ");
        sb2.append(e(this.f24606c));
        sb2.append(", ");
        sb2.append(this.hdrStaticInfo != null);
        sb2.append(", ");
        sb2.append(l(this.f24607d));
        sb2.append(", ");
        sb2.append(b(this.f24608e));
        sb2.append(")");
        return sb2.toString();
    }

    public C2357k(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f24604a = i10;
        this.f24605b = i11;
        this.f24606c = i12;
        this.hdrStaticInfo = bArr;
        this.f24607d = i13;
        this.f24608e = i14;
    }
}
