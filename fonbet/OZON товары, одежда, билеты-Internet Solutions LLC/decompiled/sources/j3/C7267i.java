package j3;

import C.o0;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: j3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7267i {

    /* renamed from: h, reason: collision with root package name */
    public static final C7267i f69066h;

    /* renamed from: a, reason: collision with root package name */
    public final int f69067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69069c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f69070d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69071e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69072f;

    /* renamed from: g, reason: collision with root package name */
    private int f69073g;

    static {
        a aVar = new a();
        aVar.d(1);
        aVar.c(2);
        aVar.e(3);
        f69066h = aVar.a();
        a aVar2 = new a();
        aVar2.d(1);
        aVar2.c(1);
        aVar2.e(2);
        aVar2.a();
        m3.N.L(0);
        m3.N.L(1);
        m3.N.L(2);
        m3.N.L(3);
        m3.N.L(4);
        m3.N.L(5);
    }

    C7267i(int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f69067a = i11;
        this.f69068b = i12;
        this.f69069c = i13;
        this.f69070d = bArr;
        this.f69071e = i14;
        this.f69072f = i15;
    }

    private static String b(int i11) {
        return i11 != -1 ? i11 != 1 ? i11 != 2 ? Ej.b.a(i11, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    private static String c(int i11) {
        return i11 != -1 ? i11 != 6 ? i11 != 1 ? i11 != 2 ? Ej.b.a(i11, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String d(int i11) {
        return i11 != -1 ? i11 != 10 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 6 ? i11 != 7 ? Ej.b.a(i11, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean f(C7267i c7267i) {
        if (c7267i == null) {
            return true;
        }
        int i11 = c7267i.f69067a;
        if (i11 != -1 && i11 != 1 && i11 != 2) {
            return false;
        }
        int i12 = c7267i.f69068b;
        if (i12 != -1 && i12 != 2) {
            return false;
        }
        int i13 = c7267i.f69069c;
        if ((i13 != -1 && i13 != 3) || c7267i.f69070d != null) {
            return false;
        }
        int i14 = c7267i.f69072f;
        if (i14 != -1 && i14 != 8) {
            return false;
        }
        int i15 = c7267i.f69071e;
        return i15 == -1 || i15 == 8;
    }

    public static int g(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int h(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 4) {
            return 10;
        }
        if (i11 == 13) {
            return 2;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final a a() {
        return new a(this);
    }

    public final boolean e() {
        return (this.f69067a == -1 || this.f69068b == -1 || this.f69069c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7267i.class == obj.getClass()) {
            C7267i c7267i = (C7267i) obj;
            if (this.f69067a == c7267i.f69067a && this.f69068b == c7267i.f69068b && this.f69069c == c7267i.f69069c && Arrays.equals(this.f69070d, c7267i.f69070d) && this.f69071e == c7267i.f69071e && this.f69072f == c7267i.f69072f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f69073g == 0) {
            this.f69073g = ((((Arrays.hashCode(this.f69070d) + ((((((527 + this.f69067a) * 31) + this.f69068b) * 31) + this.f69069c) * 31)) * 31) + this.f69071e) * 31) + this.f69072f;
        }
        return this.f69073g;
    }

    public final String i() {
        String str;
        String str2;
        int i11;
        if (e()) {
            String c11 = c(this.f69067a);
            String b11 = b(this.f69068b);
            String d11 = d(this.f69069c);
            Locale locale = Locale.US;
            str = c11 + "/" + b11 + "/" + d11;
        } else {
            str = "NA/NA/NA";
        }
        int i12 = this.f69071e;
        if (i12 == -1 || (i11 = this.f69072f) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i12 + "/" + i11;
        }
        return G.g.c(str, "/", str2);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(c(this.f69067a));
        sb2.append(", ");
        sb2.append(b(this.f69068b));
        sb2.append(", ");
        sb2.append(d(this.f69069c));
        sb2.append(", ");
        sb2.append(this.f69070d != null);
        sb2.append(", ");
        String str2 = "NA";
        int i11 = this.f69071e;
        if (i11 != -1) {
            str = i11 + "bit Luma";
        } else {
            str = "NA";
        }
        sb2.append(str);
        sb2.append(", ");
        int i12 = this.f69072f;
        if (i12 != -1) {
            str2 = i12 + "bit Chroma";
        }
        return o0.c(sb2, str2, ")");
    }

    /* renamed from: j3.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f69074a;

        /* renamed from: b, reason: collision with root package name */
        private int f69075b;

        /* renamed from: c, reason: collision with root package name */
        private int f69076c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f69077d;

        /* renamed from: e, reason: collision with root package name */
        private int f69078e;

        /* renamed from: f, reason: collision with root package name */
        private int f69079f;

        public a() {
            this.f69074a = -1;
            this.f69075b = -1;
            this.f69076c = -1;
            this.f69078e = -1;
            this.f69079f = -1;
        }

        public final C7267i a() {
            return new C7267i(this.f69074a, this.f69075b, this.f69076c, this.f69078e, this.f69079f, this.f69077d);
        }

        public final void b(int i11) {
            this.f69079f = i11;
        }

        public final void c(int i11) {
            this.f69075b = i11;
        }

        public final void d(int i11) {
            this.f69074a = i11;
        }

        public final void e(int i11) {
            this.f69076c = i11;
        }

        public final void f(byte[] bArr) {
            this.f69077d = bArr;
        }

        public final void g(int i11) {
            this.f69078e = i11;
        }

        a(C7267i c7267i) {
            this.f69074a = c7267i.f69067a;
            this.f69075b = c7267i.f69068b;
            this.f69076c = c7267i.f69069c;
            this.f69077d = c7267i.f69070d;
            this.f69078e = c7267i.f69071e;
            this.f69079f = c7267i.f69072f;
        }
    }
}
