package h4;

import Am.C2438a;
import Ij.C3261b;
import N3.B;
import N3.C;
import N3.C3650a;
import N3.C3651b;
import N3.C3652c;
import N3.C3653d;
import N3.P;
import Ve.C4598rp;
import android.util.Pair;
import b4.AbstractC5532h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import h4.C6797c;
import j3.C7267i;
import j3.C7270l;
import j3.C7272n;
import j3.t;
import j3.u;
import j3.v;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import m3.C8049B;
import m3.C8050C;
import m3.C8065g;
import m3.N;
import n3.AbstractC8431d;
import n3.C8428a;
import n3.C8429b;
import n3.C8430c;
import n3.C8432e;
import n3.C8433f;
import n3.C8434g;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6795a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f64747a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f64748b = 0;

    /* renamed from: h4.a$a, reason: collision with other inner class name */
    private static final class C1052a {

        /* renamed from: a, reason: collision with root package name */
        private final long f64749a;

        /* renamed from: b, reason: collision with root package name */
        private final long f64750b;

        public C1052a(long j11, long j12) {
            this.f64749a = j11;
            this.f64750b = j12;
        }
    }

    /* renamed from: h4.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f64751a;

        /* renamed from: b, reason: collision with root package name */
        public int f64752b;

        /* renamed from: c, reason: collision with root package name */
        public int f64753c;

        /* renamed from: d, reason: collision with root package name */
        public long f64754d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f64755e;

        /* renamed from: f, reason: collision with root package name */
        private final C8050C f64756f;

        /* renamed from: g, reason: collision with root package name */
        private final C8050C f64757g;

        /* renamed from: h, reason: collision with root package name */
        private int f64758h;

        /* renamed from: i, reason: collision with root package name */
        private int f64759i;

        public b(C8050C c8050c, C8050C c8050c2, boolean z11) throws v {
            this.f64757g = c8050c;
            this.f64756f = c8050c2;
            this.f64755e = z11;
            c8050c2.R(12);
            this.f64751a = c8050c2.I();
            c8050c.R(12);
            this.f64759i = c8050c.I();
            N3.s.a("first_chunk must be 1", c8050c.p() == 1);
            this.f64752b = -1;
        }

        public final boolean a() {
            int i11 = this.f64752b + 1;
            this.f64752b = i11;
            if (i11 == this.f64751a) {
                return false;
            }
            boolean z11 = this.f64755e;
            C8050C c8050c = this.f64756f;
            this.f64754d = z11 ? c8050c.K() : c8050c.G();
            if (this.f64752b == this.f64758h) {
                C8050C c8050c2 = this.f64757g;
                this.f64753c = c8050c2.I();
                c8050c2.S(4);
                int i12 = this.f64759i - 1;
                this.f64759i = i12;
                this.f64758h = i12 > 0 ? c8050c2.I() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: h4.a$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f64760a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f64761b;

        /* renamed from: c, reason: collision with root package name */
        private final long f64762c;

        /* renamed from: d, reason: collision with root package name */
        private final long f64763d;

        public c(String str, byte[] bArr, long j11, long j12) {
            this.f64760a = str;
            this.f64761b = bArr;
            this.f64762c = j11;
            this.f64763d = j12;
        }
    }

    /* renamed from: h4.a$d */
    /* loaded from: classes8.dex */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final g f64764a;

        public d(g gVar) {
            this.f64764a = gVar;
        }
    }

    /* renamed from: h4.a$e */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final long f64765a;

        /* renamed from: b, reason: collision with root package name */
        private final long f64766b;

        /* renamed from: c, reason: collision with root package name */
        private final String f64767c;

        public e(String str, long j11, long j12) {
            this.f64765a = j11;
            this.f64766b = j12;
            this.f64767c = str;
        }
    }

    /* renamed from: h4.a$f */
    private interface f {
        int a();

        int b();

        int c();
    }

    /* renamed from: h4.a$g */
    /* loaded from: classes8.dex */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f64768a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f64769b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f64770c;

        public g(boolean z11, boolean z12, boolean z13) {
            this.f64768a = z11;
            this.f64769b = z12;
            this.f64770c = z13;
        }
    }

    /* renamed from: h4.a$h */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final p[] f64771a;

        /* renamed from: b, reason: collision with root package name */
        public C7272n f64772b;

        /* renamed from: c, reason: collision with root package name */
        public int f64773c;

        /* renamed from: d, reason: collision with root package name */
        public int f64774d = 0;

        public h(int i11) {
            this.f64771a = new p[i11];
        }
    }

    /* renamed from: h4.a$i */
    static final class i implements f {

        /* renamed from: a, reason: collision with root package name */
        private final int f64775a;

        /* renamed from: b, reason: collision with root package name */
        private final int f64776b;

        /* renamed from: c, reason: collision with root package name */
        private final C8050C f64777c;

        public i(AbstractC8431d.b bVar, C7272n c7272n) {
            C8050C c8050c = bVar.f76379b;
            this.f64777c = c8050c;
            c8050c.R(12);
            int I11 = c8050c.I();
            if ("audio/raw".equals(c7272n.f69127o)) {
                int u11 = N.u(c7272n.f69104I) * c7272n.f69102G;
                if (I11 == 0 || I11 % u11 != 0) {
                    m3.s.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u11 + ", stsz sample size: " + I11);
                    I11 = u11;
                }
            }
            this.f64775a = I11 == 0 ? -1 : I11;
            this.f64776b = c8050c.I();
        }

        @Override // h4.C6795a.f
        public final int a() {
            int i11 = this.f64775a;
            return i11 == -1 ? this.f64777c.I() : i11;
        }

        @Override // h4.C6795a.f
        public final int b() {
            return this.f64776b;
        }

        @Override // h4.C6795a.f
        public final int c() {
            return this.f64775a;
        }
    }

    /* renamed from: h4.a$j */
    /* loaded from: classes8.dex */
    static final class j implements f {

        /* renamed from: a, reason: collision with root package name */
        private final C8050C f64778a;

        /* renamed from: b, reason: collision with root package name */
        private final int f64779b;

        /* renamed from: c, reason: collision with root package name */
        private final int f64780c;

        /* renamed from: d, reason: collision with root package name */
        private int f64781d;

        /* renamed from: e, reason: collision with root package name */
        private int f64782e;

        public j(AbstractC8431d.b bVar) {
            C8050C c8050c = bVar.f76379b;
            this.f64778a = c8050c;
            c8050c.R(12);
            this.f64780c = c8050c.I() & 255;
            this.f64779b = c8050c.I();
        }

        @Override // h4.C6795a.f
        public final int a() {
            C8050C c8050c = this.f64778a;
            int i11 = this.f64780c;
            if (i11 == 8) {
                return c8050c.E();
            }
            if (i11 == 16) {
                return c8050c.L();
            }
            int i12 = this.f64781d;
            this.f64781d = i12 + 1;
            if (i12 % 2 != 0) {
                return this.f64782e & 15;
            }
            int E11 = c8050c.E();
            this.f64782e = E11;
            return (E11 & 240) >> 4;
        }

        @Override // h4.C6795a.f
        public final int b() {
            return this.f64779b;
        }

        @Override // h4.C6795a.f
        public final int c() {
            return -1;
        }
    }

    /* renamed from: h4.a$k */
    private static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final int f64783a;

        /* renamed from: b, reason: collision with root package name */
        private final long f64784b;

        /* renamed from: c, reason: collision with root package name */
        private final int f64785c;

        /* renamed from: d, reason: collision with root package name */
        private final int f64786d;

        /* renamed from: e, reason: collision with root package name */
        private final int f64787e;

        /* renamed from: f, reason: collision with root package name */
        private final int f64788f;

        public k(int i11, int i12, int i13, int i14, int i15, long j11) {
            this.f64783a = i11;
            this.f64784b = j11;
            this.f64785c = i12;
            this.f64786d = i13;
            this.f64787e = i14;
            this.f64788f = i15;
        }
    }

    /* renamed from: h4.a$l */
    /* loaded from: classes8.dex */
    static final class l {

        /* renamed from: a, reason: collision with root package name */
        private final d f64789a;

        public l(d dVar) {
            this.f64789a = dVar;
        }

        public final boolean b() {
            d dVar = this.f64789a;
            return dVar.f64764a.f64768a && dVar.f64764a.f64769b;
        }
    }

    static {
        int i11 = N.f74289a;
        f64747a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(C8050C c8050c) {
        int f7 = c8050c.f();
        c8050c.S(4);
        if (c8050c.p() != 1751411826) {
            f7 += 4;
        }
        c8050c.R(f7);
    }

    private static c b(int i11, C8050C c8050c) {
        c8050c.R(i11 + 12);
        c8050c.S(1);
        c(c8050c);
        c8050c.S(2);
        int E11 = c8050c.E();
        if ((E11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            c8050c.S(2);
        }
        if ((E11 & 64) != 0) {
            c8050c.S(c8050c.E());
        }
        if ((E11 & 32) != 0) {
            c8050c.S(2);
        }
        c8050c.S(1);
        c(c8050c);
        String e11 = u.e(c8050c.E());
        if ("audio/mpeg".equals(e11) || "audio/vnd.dts".equals(e11) || "audio/vnd.dts.hd".equals(e11)) {
            return new c(e11, null, -1L, -1L);
        }
        c8050c.S(4);
        long G11 = c8050c.G();
        long G12 = c8050c.G();
        c8050c.S(1);
        int c11 = c(c8050c);
        long j11 = G12;
        byte[] bArr = new byte[c11];
        c8050c.n(0, c11, bArr);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new c(e11, bArr, j11, G11 > 0 ? G11 : -1L);
    }

    private static int c(C8050C c8050c) {
        int E11 = c8050c.E();
        int i11 = E11 & 127;
        while ((E11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 128) {
            E11 = c8050c.E();
            i11 = (i11 << 7) | (E11 & 127);
        }
        return i11;
    }

    public static int d(int i11) {
        return (i11 >> 24) & 255;
    }

    public static t e(AbstractC8431d.a aVar) {
        C8429b c8429b;
        AbstractC8431d.b c11 = aVar.c(1751411826);
        AbstractC8431d.b c12 = aVar.c(1801812339);
        AbstractC8431d.b c13 = aVar.c(1768715124);
        if (c11 != null && c12 != null && c13 != null) {
            C8050C c8050c = c11.f76379b;
            c8050c.R(16);
            if (c8050c.p() == 1835299937) {
                C8050C c8050c2 = c12.f76379b;
                c8050c2.R(12);
                int p11 = c8050c2.p();
                String[] strArr = new String[p11];
                for (int i11 = 0; i11 < p11; i11++) {
                    int p12 = c8050c2.p();
                    c8050c2.S(4);
                    strArr[i11] = c8050c2.C(p12 - 8, StandardCharsets.UTF_8);
                }
                C8050C c8050c3 = c13.f76379b;
                c8050c3.R(8);
                ArrayList arrayList = new ArrayList();
                while (c8050c3.a() > 8) {
                    int f7 = c8050c3.f();
                    int p13 = c8050c3.p();
                    int p14 = c8050c3.p() - 1;
                    if (p14 < 0 || p14 >= p11) {
                        C3261b.f(p14, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[p14];
                        int i12 = f7 + p13;
                        while (true) {
                            int f11 = c8050c3.f();
                            if (f11 >= i12) {
                                c8429b = null;
                                break;
                            }
                            int p15 = c8050c3.p();
                            if (c8050c3.p() == 1684108385) {
                                int p16 = c8050c3.p();
                                int p17 = c8050c3.p();
                                int i13 = p15 - 16;
                                byte[] bArr = new byte[i13];
                                c8050c3.n(0, i13, bArr);
                                c8429b = new C8429b(str, bArr, p17, p16);
                                break;
                            }
                            c8050c3.R(f11 + p15);
                        }
                        if (c8429b != null) {
                            arrayList.add(c8429b);
                        }
                    }
                    c8050c3.R(f7 + p13);
                }
                if (!arrayList.isEmpty()) {
                    return new t(arrayList);
                }
            }
        }
        return null;
    }

    public static C8433f f(C8050C c8050c) {
        long y11;
        long y12;
        c8050c.R(8);
        if (d(c8050c.p()) == 0) {
            y11 = c8050c.G();
            y12 = c8050c.G();
        } else {
            y11 = c8050c.y();
            y12 = c8050c.y();
        }
        return new C8433f(y11, y12, c8050c.G());
    }

    private static Pair<Integer, p> g(C8050C c8050c, int i11, int i12) throws v {
        Integer num;
        p pVar;
        Pair<Integer, p> create;
        int i13;
        int i14;
        Integer num2;
        boolean z11;
        int f7 = c8050c.f();
        while (f7 - i11 < i12) {
            c8050c.R(f7);
            int p11 = c8050c.p();
            N3.s.a("childAtomSize must be positive", p11 > 0);
            if (c8050c.p() == 1936289382) {
                int i15 = f7 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer num3 = null;
                String str = null;
                while (i15 - f7 < p11) {
                    c8050c.R(i15);
                    int p12 = c8050c.p();
                    int p13 = c8050c.p();
                    if (p13 == 1718775137) {
                        num3 = Integer.valueOf(c8050c.p());
                    } else if (p13 == 1935894637) {
                        c8050c.S(4);
                        str = c8050c.C(4, StandardCharsets.UTF_8);
                    } else if (p13 == 1935894633) {
                        i17 = i15;
                        i16 = p12;
                    }
                    i15 += p12;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    N3.s.a("frma atom is mandatory", num3 != null);
                    N3.s.a("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = num3;
                            pVar = null;
                            break;
                        }
                        c8050c.R(i18);
                        int p14 = c8050c.p();
                        if (c8050c.p() == 1952804451) {
                            int d11 = d(c8050c.p());
                            c8050c.S(1);
                            if (d11 == 0) {
                                c8050c.S(1);
                                i14 = 0;
                                i13 = 0;
                            } else {
                                int E11 = c8050c.E();
                                i13 = E11 & 15;
                                i14 = (E11 & 240) >> 4;
                            }
                            if (c8050c.E() == 1) {
                                num2 = num3;
                                z11 = true;
                            } else {
                                num2 = num3;
                                z11 = false;
                            }
                            int E12 = c8050c.E();
                            byte[] bArr2 = new byte[16];
                            c8050c.n(0, 16, bArr2);
                            if (z11 && E12 == 0) {
                                int E13 = c8050c.E();
                                byte[] bArr3 = new byte[E13];
                                c8050c.n(0, E13, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z11, str, E12, bArr2, i14, i13, bArr);
                        } else {
                            i18 += p14;
                        }
                    }
                    N3.s.a("tenc atom is mandatory", pVar != null);
                    int i19 = N.f74289a;
                    create = Pair.create(num, pVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            f7 += p11;
        }
        return null;
    }

    public static r h(o oVar, AbstractC8431d.a aVar, B b11) throws v {
        f jVar;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        C7272n c7272n;
        int i15;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        int i19;
        long j11;
        long j12;
        int i21;
        int[] iArr3;
        int[] iArr4;
        long[] jArr3;
        long[] jArr4;
        C7272n c7272n2;
        long[] jArr5;
        int[] iArr5;
        int[] iArr6;
        int i22;
        int i23;
        boolean z12;
        o oVar2 = oVar;
        AbstractC8431d.b c11 = aVar.c(1937011578);
        C7272n c7272n3 = oVar2.f64916g;
        if (c11 != null) {
            jVar = new i(c11, c7272n3);
        } else {
            AbstractC8431d.b c12 = aVar.c(1937013298);
            if (c12 == null) {
                throw v.a(null, "Track has no sample table size information");
            }
            jVar = new j(c12);
        }
        int b12 = jVar.b();
        if (b12 == 0) {
            return new r(oVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (oVar2.f64911b == 2) {
            long j13 = oVar2.f64915f;
            if (j13 > 0) {
                C7272n.a a11 = c7272n3.a();
                a11.f0(b12 / (j13 / 1000000.0f));
                oVar2 = oVar2.a(a11.P());
            }
        }
        AbstractC8431d.b c13 = aVar.c(1937007471);
        if (c13 == null) {
            c13 = aVar.c(1668232756);
            c13.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC8431d.b c14 = aVar.c(1937011555);
        c14.getClass();
        AbstractC8431d.b c15 = aVar.c(1937011827);
        c15.getClass();
        AbstractC8431d.b c16 = aVar.c(1937011571);
        C8050C c8050c = c16 != null ? c16.f76379b : null;
        AbstractC8431d.b c17 = aVar.c(1668576371);
        C8050C c8050c2 = c17 != null ? c17.f76379b : null;
        b bVar = new b(c14.f76379b, c13.f76379b, z11);
        C8050C c8050c3 = c15.f76379b;
        c8050c3.R(12);
        int I11 = c8050c3.I() - 1;
        int I12 = c8050c3.I();
        int I13 = c8050c3.I();
        if (c8050c2 != null) {
            c8050c2.R(12);
            i11 = c8050c2.I();
        } else {
            i11 = 0;
        }
        if (c8050c != null) {
            c8050c.R(12);
            i13 = c8050c.I();
            if (i13 > 0) {
                i12 = c8050c.I() - 1;
                i14 = 0;
            } else {
                i12 = -1;
                i14 = 0;
                c8050c = null;
            }
        } else {
            i12 = -1;
            i13 = 0;
            i14 = 0;
        }
        int c18 = jVar.c();
        C7272n c7272n4 = oVar2.f64916g;
        String str = c7272n4.f69127o;
        if (c18 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && I11 == 0 && i11 == 0 && i13 == 0)) {
            long[] jArr6 = new long[b12];
            int[] iArr7 = new int[b12];
            long[] jArr7 = new long[b12];
            C8050C c8050c4 = c8050c2;
            int[] iArr8 = new int[b12];
            f fVar = jVar;
            c7272n = c7272n4;
            int i24 = I13;
            C8050C c8050c5 = c8050c;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            int i25 = i12;
            int i26 = i14;
            int i27 = i26;
            int i28 = i27;
            int i29 = i28;
            int i31 = i11;
            int i32 = I12;
            int i33 = i29;
            while (true) {
                if (i33 >= b12) {
                    i15 = i32;
                    long[] jArr8 = jArr6;
                    iArr = iArr7;
                    jArr = jArr7;
                    jArr2 = jArr8;
                    iArr2 = iArr8;
                    i16 = i28;
                    break;
                }
                long j17 = j16;
                int i34 = i28;
                boolean z13 = true;
                while (i34 == 0) {
                    z13 = bVar.a();
                    if (!z13) {
                        break;
                    }
                    j17 = bVar.f64754d;
                    i34 = bVar.f64753c;
                    b12 = b12;
                    i32 = i32;
                }
                int i35 = b12;
                i15 = i32;
                if (!z13) {
                    m3.s.f("BoxParsers", "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr6, i33);
                    int[] copyOf2 = Arrays.copyOf(iArr7, i33);
                    long[] copyOf3 = Arrays.copyOf(jArr7, i33);
                    iArr2 = Arrays.copyOf(iArr8, i33);
                    jArr = copyOf3;
                    i16 = i34;
                    iArr = copyOf2;
                    jArr2 = copyOf;
                    b12 = i33;
                    break;
                }
                if (c8050c4 != null) {
                    int i36 = i29;
                    while (i36 == 0 && i31 > 0) {
                        i36 = c8050c4.I();
                        i27 = c8050c4.p();
                        i31--;
                    }
                    i29 = i36 - 1;
                }
                jArr6[i33] = j17;
                int a12 = fVar.a();
                iArr7[i33] = a12;
                long[] jArr9 = jArr6;
                j14 += a12;
                if (a12 > i26) {
                    i26 = a12;
                }
                jArr7[i33] = j15 + i27;
                iArr8[i33] = c8050c5 == null ? 1 : i14;
                if (i33 == i25) {
                    iArr8[i33] = 1;
                    i13--;
                    if (i13 > 0) {
                        c8050c5.getClass();
                        i25 = c8050c5.I() - 1;
                    }
                }
                j15 += i24;
                i32 = i15 - 1;
                if (i32 == 0 && I11 > 0) {
                    int I14 = c8050c3.I();
                    I11--;
                    i24 = c8050c3.p();
                    i32 = I14;
                }
                int i37 = i26;
                long j18 = j17 + iArr7[i33];
                i28 = i34 - 1;
                i33++;
                b12 = i35;
                j16 = j18;
                i26 = i37;
                jArr6 = jArr9;
            }
            long j19 = j15 + i27;
            if (c8050c4 != null) {
                while (i31 > 0) {
                    if (c8050c4.I() != 0) {
                        i17 = i14;
                        break;
                    }
                    c8050c4.p();
                    i31--;
                }
            }
            i17 = 1;
            if (i13 == 0 && i15 == 0 && i16 == 0 && I11 == 0 && i29 == 0 && i17 != 0) {
                i18 = i26;
                i19 = b12;
            } else {
                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                i18 = i26;
                i19 = b12;
                Ek.a.f(oVar2.f64910a, i13, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                Ek.a.f(i15, i16, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                sb2.append(I11);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i29);
                sb2.append(i17 == 0 ? ", ctts invalid" : "");
                m3.s.f("BoxParsers", sb2.toString());
            }
            b12 = i19;
            j11 = j14;
            j12 = j19;
            i21 = i18;
            iArr3 = iArr2;
            iArr4 = iArr;
            jArr3 = jArr;
            jArr4 = jArr2;
        } else {
            int i38 = bVar.f64751a;
            long[] jArr10 = new long[i38];
            int[] iArr9 = new int[i38];
            while (bVar.a()) {
                int i39 = bVar.f64752b;
                jArr10[i39] = bVar.f64754d;
                iArr9[i39] = bVar.f64753c;
            }
            C6797c.a a13 = C6797c.a(c18, jArr10, iArr9, I13);
            long[] jArr11 = a13.f64794a;
            int[] iArr10 = a13.f64795b;
            long[] jArr12 = a13.f64797d;
            int[] iArr11 = a13.f64798e;
            i21 = a13.f64796c;
            long j21 = a13.f64799f;
            j11 = a13.f64800g;
            c7272n = c7272n4;
            j12 = j21;
            jArr3 = jArr12;
            iArr3 = iArr11;
            jArr4 = jArr11;
            iArr4 = iArr10;
        }
        long j22 = oVar2.f64915f;
        if (j22 > 0) {
            long Z11 = N.Z(j11 * 8, 1000000L, j22, RoundingMode.HALF_DOWN);
            if (Z11 > 0 && Z11 < 2147483647L) {
                C7272n.a a14 = c7272n.a();
                a14.S((int) Z11);
                oVar2 = oVar2.a(a14.P());
            }
        }
        o oVar3 = oVar2;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long Z12 = N.Z(j12, 1000000L, oVar3.f64912c, roundingMode);
        long j23 = oVar3.f64912c;
        long[] jArr13 = oVar3.f64918i;
        if (jArr13 == null) {
            N.Y(jArr3, j23);
            return new r(oVar3, jArr4, iArr4, i21, jArr3, iArr3, Z12);
        }
        int length = jArr13.length;
        C7272n c7272n5 = oVar3.f64916g;
        int i41 = oVar3.f64911b;
        long[] jArr14 = oVar3.f64919j;
        if (length == 1 && i41 == 1 && jArr3.length >= 2) {
            jArr14.getClass();
            long j24 = jArr14[i14];
            long[] jArr15 = jArr4;
            int[] iArr12 = iArr4;
            long Z13 = N.Z(jArr13[i14], oVar3.f64912c, oVar3.f64913d, roundingMode) + j24;
            int length2 = jArr3.length - 1;
            int i42 = i14;
            int i43 = N.i(4, i42, length2);
            int i44 = N.i(jArr3.length - 4, i42, length2);
            long j25 = jArr3[i42];
            if (j25 <= j24 && j24 < jArr3[i43] && jArr3[i44] < Z13 && Z13 <= j12) {
                long j26 = j12 - Z13;
                long Z14 = N.Z(j24 - j25, c7272n5.f69103H, oVar3.f64912c, roundingMode);
                int[] iArr13 = iArr3;
                c7272n2 = c7272n5;
                long Z15 = N.Z(j26, c7272n5.f69103H, oVar3.f64912c, roundingMode);
                if (!(Z14 == 0 && Z15 == 0) && Z14 <= 2147483647L && Z15 <= 2147483647L) {
                    b11.f18466a = (int) Z14;
                    b11.f18467b = (int) Z15;
                    N.Y(jArr3, j23);
                    return new r(oVar3, jArr15, iArr12, i21, jArr3, iArr13, N.Z(jArr13[0], 1000000L, oVar3.f64913d, roundingMode));
                }
                jArr4 = jArr15;
                iArr3 = iArr13;
            } else {
                jArr4 = jArr15;
                c7272n2 = c7272n5;
            }
            iArr4 = iArr12;
        } else {
            c7272n2 = c7272n5;
        }
        int i45 = 1;
        boolean z14 = false;
        if (jArr13.length == 1) {
            if (jArr13[0] == 0) {
                jArr14.getClass();
                long j27 = jArr14[0];
                for (int i46 = 0; i46 < jArr3.length; i46++) {
                    jArr3[i46] = N.Z(jArr3[i46] - j27, 1000000L, oVar3.f64912c, RoundingMode.DOWN);
                }
                return new r(oVar3, jArr4, iArr4, i21, jArr3, iArr3, N.Z(j12 - j27, 1000000L, oVar3.f64912c, RoundingMode.DOWN));
            }
            i45 = 1;
        }
        boolean z15 = i41 == i45;
        int[] iArr14 = new int[jArr13.length];
        int[] iArr15 = new int[jArr13.length];
        jArr14.getClass();
        int i47 = 0;
        int i48 = 0;
        boolean z16 = false;
        int i49 = 0;
        while (i48 < jArr13.length) {
            int[] iArr16 = iArr3;
            boolean z17 = z16;
            long j28 = jArr14[i48];
            if (j28 != -1) {
                iArr6 = iArr4;
                long Z16 = N.Z(jArr13[i48], oVar3.f64912c, oVar3.f64913d, RoundingMode.DOWN);
                i22 = i21;
                iArr14[i48] = N.e(jArr3, j28, true);
                long j29 = j28 + Z16;
                iArr15[i48] = N.a(jArr3, j29, z15);
                int i51 = iArr14[i48];
                while (true) {
                    i23 = iArr14[i48];
                    if (i23 < 0 || (iArr16[i23] & 1) != 0) {
                        break;
                    }
                    iArr14[i48] = i23 - 1;
                }
                if (i23 < 0) {
                    iArr14[i48] = i51;
                    while (true) {
                        int i52 = iArr14[i48];
                        if (i52 >= iArr15[i48] || (iArr16[i52] & 1) != 0) {
                            break;
                        }
                        iArr14[i48] = i52 + 1;
                    }
                }
                if (i41 == 2 && iArr14[i48] != iArr15[i48]) {
                    while (true) {
                        int i53 = iArr15[i48];
                        z12 = true;
                        if (i53 >= jArr3.length - 1) {
                            break;
                        }
                        int i54 = i53 + 1;
                        if (jArr3[i54] > j29) {
                            break;
                        }
                        iArr15[i48] = i54;
                    }
                } else {
                    z12 = true;
                }
                int i55 = iArr15[i48];
                int i56 = iArr14[i48];
                int i57 = (i55 - i56) + i49;
                z16 = z17 | (i47 != i56 ? z12 : false);
                i47 = i55;
                i49 = i57;
            } else {
                iArr6 = iArr4;
                i22 = i21;
                z16 = z17;
            }
            i48++;
            iArr3 = iArr16;
            iArr4 = iArr6;
            i21 = i22;
        }
        int[] iArr17 = iArr4;
        int i58 = i21;
        int[] iArr18 = iArr3;
        boolean z18 = z16 | (i49 != b12);
        long[] jArr16 = z18 ? new long[i49] : jArr4;
        int[] iArr19 = z18 ? new int[i49] : iArr17;
        int i59 = z18 ? 0 : i58;
        int[] iArr20 = z18 ? new int[i49] : iArr18;
        long[] jArr17 = new long[i49];
        int i61 = i59;
        long j31 = 0;
        int i62 = 0;
        int i63 = 0;
        while (i62 < jArr13.length) {
            long j32 = jArr14[i62];
            int i64 = iArr14[i62];
            int i65 = iArr15[i62];
            boolean z19 = z18;
            if (z18) {
                int i66 = i65 - i64;
                System.arraycopy(jArr4, i64, jArr16, i63, i66);
                jArr5 = jArr16;
                System.arraycopy(iArr17, i64, iArr19, i63, i66);
                iArr5 = iArr18;
                System.arraycopy(iArr5, i64, iArr20, i63, i66);
            } else {
                jArr5 = jArr16;
                iArr5 = iArr18;
            }
            int i67 = i61;
            while (i64 < i65) {
                RoundingMode roundingMode2 = RoundingMode.DOWN;
                int[] iArr21 = iArr5;
                long[] jArr18 = jArr13;
                long Z17 = N.Z(j31, 1000000L, oVar3.f64913d, roundingMode2);
                long Z18 = N.Z(jArr3[i64] - j32, 1000000L, oVar3.f64912c, roundingMode2);
                if (Z18 < 0) {
                    z14 = true;
                }
                jArr17[i63] = Z17 + Z18;
                if (z19 && iArr19[i63] > i67) {
                    i67 = iArr17[i64];
                }
                i63++;
                i64++;
                iArr5 = iArr21;
                jArr13 = jArr18;
            }
            iArr18 = iArr5;
            long[] jArr19 = jArr13;
            j31 += jArr19[i62];
            i62++;
            i61 = i67;
            jArr13 = jArr19;
            jArr16 = jArr5;
            z18 = z19;
        }
        long[] jArr20 = jArr16;
        long Z19 = N.Z(j31, 1000000L, oVar3.f64913d, RoundingMode.DOWN);
        if (z14) {
            C7272n.a a15 = c7272n2.a();
            a15.g0();
            oVar3 = oVar3.a(a15.P());
        }
        return new r(oVar3, jArr20, iArr19, i61, jArr17, iArr20, Z19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0e2c  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0ecc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList i(AbstractC8431d.a aVar, B b11, long j11, C7270l c7270l, boolean z11, boolean z12, O7.e eVar) throws v {
        long j12;
        long j13;
        int i11;
        int i12;
        int i13;
        long j14;
        long j15;
        long j16;
        int i14;
        int i15;
        long j17;
        int i16;
        int i17;
        byte b12;
        String str;
        AbstractC8431d.b c11;
        ArrayList arrayList;
        int i18;
        int i19;
        int i21;
        AbstractC8431d.a aVar2;
        long[] jArr;
        long[] jArr2;
        C7272n c7272n;
        O7.e eVar2;
        o oVar;
        t tVar;
        Pair create;
        int i22;
        int i23;
        int i24;
        int i25;
        AbstractC8431d.a aVar3;
        C8050C c8050c;
        int i26;
        ArrayList arrayList2;
        char c12;
        int i27;
        char c13;
        int i28;
        int L11;
        int F11;
        int p11;
        int i29;
        int i31;
        int i32;
        char c14;
        int i33;
        int i34;
        int i35;
        C7270l c7270l2;
        String str2;
        String str3;
        int i36;
        List list;
        boolean z13;
        int i37;
        int f7;
        int i38;
        int i39;
        int i41;
        byte[] bArr;
        int i42;
        int i43;
        int i44;
        int i45;
        AbstractC5880y abstractC5880y;
        String str4;
        long j18;
        AbstractC8431d.a aVar4 = aVar;
        C7270l c7270l3 = c7270l;
        int i46 = 10;
        int i47 = 4;
        int i48 = 16;
        int i49 = 8;
        ArrayList arrayList3 = new ArrayList();
        int i51 = 0;
        while (true) {
            ArrayList arrayList4 = aVar4.f76378d;
            int i52 = 5;
            if (i51 >= arrayList4.size()) {
                return arrayList3;
            }
            AbstractC8431d.a aVar5 = (AbstractC8431d.a) arrayList4.get(i51);
            if (aVar5.f76375a != 1953653099) {
                i21 = i48;
                i19 = i49;
                arrayList = arrayList3;
                i18 = i51;
                i11 = i46;
            } else {
                AbstractC8431d.b c15 = aVar4.c(1836476516);
                c15.getClass();
                int i53 = 1;
                AbstractC8431d.a b13 = aVar5.b(1835297121);
                b13.getClass();
                AbstractC8431d.b c16 = b13.c(1751411826);
                c16.getClass();
                C8050C c8050c2 = c16.f76379b;
                c8050c2.R(i48);
                int p12 = c8050c2.p();
                int i54 = 0;
                int i55 = p12 == 1936684398 ? 1 : p12 == 1986618469 ? 2 : (p12 == 1952807028 || p12 == 1935832172 || p12 == 1937072756 || p12 == 1668047728 || p12 == 1937072752) ? 3 : p12 == 1835365473 ? 5 : -1;
                if (i55 == -1) {
                    eVar2 = eVar;
                    i21 = i48;
                    arrayList = arrayList3;
                    i18 = i51;
                    i11 = i46;
                    aVar2 = aVar5;
                    oVar = null;
                    i19 = i49;
                } else {
                    AbstractC8431d.b c17 = aVar5.c(1953196132);
                    c17.getClass();
                    C8050C c8050c3 = c17.f76379b;
                    c8050c3.R(i49);
                    int d11 = d(c8050c3.p());
                    if (d11 != 0) {
                        i49 = i48;
                    }
                    c8050c3.S(i49);
                    int p13 = c8050c3.p();
                    c8050c3.S(i47);
                    int f11 = c8050c3.f();
                    int i56 = d11 == 0 ? i47 : 8;
                    int i57 = 0;
                    while (true) {
                        j12 = -9223372036854775807L;
                        if (i57 >= i56) {
                            c8050c3.S(i56);
                            break;
                        }
                        if (c8050c3.e()[f11 + i57] != -1) {
                            long G11 = d11 == 0 ? c8050c3.G() : c8050c3.K();
                            if (G11 != 0) {
                                j13 = G11;
                            }
                        } else {
                            i57++;
                        }
                    }
                    j13 = -9223372036854775807L;
                    c8050c3.S(i46);
                    int L12 = c8050c3.L();
                    c8050c3.S(i47);
                    int p14 = c8050c3.p();
                    int p15 = c8050c3.p();
                    c8050c3.S(i47);
                    int p16 = c8050c3.p();
                    int p17 = c8050c3.p();
                    i11 = i46;
                    if (p14 == 0 && p15 == 65536 && ((p16 == -65536 || p16 == 65536) && p17 == 0)) {
                        i12 = 90;
                    } else if (p14 == 0 && p15 == -65536 && ((p16 == 65536 || p16 == -65536) && p17 == 0)) {
                        i12 = 270;
                    } else if ((p14 == -65536 || p14 == 65536) && p15 == 0 && p16 == 0 && p17 == -65536) {
                        i12 = 180;
                    } else {
                        i13 = 0;
                        c8050c3.S(16);
                        short B11 = c8050c3.B();
                        c8050c3.S(2);
                        k kVar = new k(p13, L12, i13, B11, c8050c3.B(), j13);
                        j14 = j11 != -9223372036854775807L ? kVar.f64784b : j11;
                        long j19 = f(c15.f76379b).f76384c;
                        if (j14 != -9223372036854775807L) {
                            j15 = j19;
                            j16 = -9223372036854775807L;
                        } else {
                            int i58 = N.f74289a;
                            long Z11 = N.Z(j14, 1000000L, j19, RoundingMode.DOWN);
                            j15 = j19;
                            j16 = Z11;
                        }
                        AbstractC8431d.a b14 = b13.b(1835626086);
                        b14.getClass();
                        char c18 = 25196;
                        AbstractC8431d.a b15 = b14.b(1937007212);
                        b15.getClass();
                        AbstractC8431d.b c19 = b13.c(1835296868);
                        c19.getClass();
                        C8050C c8050c4 = c19.f76379b;
                        c8050c4.R(8);
                        int d12 = d(c8050c4.p());
                        c8050c4.S(d12 != 0 ? 8 : 16);
                        long G12 = c8050c4.G();
                        int f12 = c8050c4.f();
                        i14 = d12 != 0 ? 4 : 8;
                        i15 = 0;
                        while (true) {
                            if (i15 < i14) {
                                j17 = G12;
                                c8050c4.S(i14);
                                break;
                            }
                            if (c8050c4.e()[f12 + i15] != -1) {
                                long G13 = d12 == 0 ? c8050c4.G() : c8050c4.K();
                                if (G13 == 0) {
                                    j17 = G12;
                                } else {
                                    int i59 = N.f74289a;
                                    j17 = G12;
                                    j12 = N.Z(G13, 1000000L, j17, RoundingMode.DOWN);
                                }
                            } else {
                                i15++;
                            }
                        }
                        int L13 = c8050c4.L();
                        i16 = 3;
                        char[] cArr = {(char) (((L13 >> 10) & 31) + 96), (char) (((L13 >> 5) & 31) + 96), (char) ((L13 & 31) + 96)};
                        i17 = 0;
                        while (true) {
                            b12 = 97;
                            if (i17 < i16) {
                                str = new String(cArr);
                                break;
                            }
                            char c21 = cArr[i17];
                            if (c21 < 'a' || c21 > 'z') {
                                break;
                            }
                            i17++;
                            i16 = 3;
                        }
                        str = null;
                        e eVar3 = new e(str, j17, j12);
                        c11 = b15.c(1937011556);
                        if (c11 != null) {
                            throw v.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        ArrayList arrayList5 = arrayList3;
                        String str5 = eVar3.f64767c;
                        C8050C c8050c5 = c11.f76379b;
                        c8050c5.R(12);
                        int p18 = c8050c5.p();
                        int i61 = i51;
                        h hVar = new h(p18);
                        int i62 = 0;
                        while (true) {
                            p[] pVarArr = hVar.f64771a;
                            if (i62 < p18) {
                                int f13 = c8050c5.f();
                                ArrayList arrayList6 = arrayList5;
                                int p19 = c8050c5.p();
                                byte b16 = b12;
                                String str6 = "childAtomSize must be positive";
                                N3.s.a("childAtomSize must be positive", p19 > 0 ? i53 : i54);
                                int p21 = c8050c5.p();
                                if (p21 == 1635148593 || p21 == 1635148595 || p21 == 1701733238 || p21 == 1831958048 || p21 == 1836070006 || p21 == 1752589105 || p21 == 1751479857 || p21 == 1932670515 || p21 == 1211250227 || p21 == 1748121139 || p21 == 1987063864 || p21 == 1987063865 || p21 == 1635135537 || p21 == 1685479798 || p21 == 1685479729 || p21 == 1685481573 || p21 == 1685481521 || p21 == 1634760241) {
                                    i22 = f13;
                                    i23 = i61;
                                    i24 = i55;
                                    i25 = p18;
                                    aVar3 = aVar5;
                                    c8050c = c8050c5;
                                    i54 = i54;
                                    i26 = i53;
                                    arrayList2 = arrayList6;
                                    p19 = p19;
                                    i62 = i62;
                                    c12 = 25196;
                                    i27 = 5;
                                    c13 = 65535;
                                    k(c8050c, p21, i22, p19, kVar.f64783a, str5, kVar.f64786d, c7270l, hVar, i62);
                                } else if (p21 == 1836069985 || p21 == 1701733217 || p21 == 1633889587 || p21 == 1700998451 || p21 == 1633889588 || p21 == 1835823201 || p21 == 1685353315 || p21 == 1685353317 || p21 == 1685353320 || p21 == 1685353324 || p21 == 1685353336 || p21 == 1935764850 || p21 == 1935767394 || p21 == 1819304813 || p21 == 1936684916 || p21 == 1953984371 || p21 == 778924082 || p21 == 778924083 || p21 == 1835557169 || p21 == 1835560241 || p21 == 1634492771 || p21 == 1634492791 || p21 == 1970037111 || p21 == 1332770163 || p21 == 1716281667 || p21 == 1767992678 || p21 == 1768973165 || p21 == 1718641517) {
                                    i23 = i61;
                                    int i63 = i62;
                                    i24 = i55;
                                    i25 = p18;
                                    int i64 = kVar.f64783a;
                                    c8050c5.R(f13 + 16);
                                    if (z12) {
                                        i28 = c8050c5.L();
                                        c8050c5.S(6);
                                    } else {
                                        c8050c5.S(8);
                                        i28 = 0;
                                    }
                                    if (i28 == 0 || i28 == 1) {
                                        L11 = c8050c5.L();
                                        c8050c5.S(6);
                                        F11 = c8050c5.F();
                                        c8050c5.R(c8050c5.f() - 4);
                                        p11 = c8050c5.p();
                                        i29 = 32;
                                        if (i28 == 1) {
                                            c8050c5.S(16);
                                        }
                                        i31 = -1;
                                    } else if (i28 == 2) {
                                        c8050c5.S(16);
                                        int round = (int) Math.round(Double.longBitsToDouble(c8050c5.y()));
                                        int I11 = c8050c5.I();
                                        c8050c5.S(4);
                                        int I12 = c8050c5.I();
                                        int I13 = c8050c5.I();
                                        boolean z14 = (I13 & 1) != 0;
                                        boolean z15 = (I13 & 2) != 0;
                                        if (z14) {
                                            if (I12 == 32) {
                                                i43 = 4;
                                                i44 = 8;
                                                c8050c5.S(i44);
                                                F11 = round;
                                                i29 = 32;
                                                i31 = i43;
                                                L11 = I11;
                                                p11 = 0;
                                            }
                                            i43 = -1;
                                            i44 = 8;
                                            c8050c5.S(i44);
                                            F11 = round;
                                            i29 = 32;
                                            i31 = i43;
                                            L11 = I11;
                                            p11 = 0;
                                        } else {
                                            i44 = 8;
                                            if (I12 == 8) {
                                                i43 = 3;
                                                c8050c5.S(i44);
                                                F11 = round;
                                                i29 = 32;
                                                i31 = i43;
                                                L11 = I11;
                                                p11 = 0;
                                            } else {
                                                if (I12 == 16) {
                                                    i43 = z15 ? 268435456 : 2;
                                                } else if (I12 == 24) {
                                                    i43 = z15 ? 1342177280 : 21;
                                                } else {
                                                    if (I12 == 32) {
                                                        i43 = z15 ? 1610612736 : 22;
                                                    }
                                                    i43 = -1;
                                                }
                                                i44 = 8;
                                                c8050c5.S(i44);
                                                F11 = round;
                                                i29 = 32;
                                                i31 = i43;
                                                L11 = I11;
                                                p11 = 0;
                                            }
                                        }
                                        c8050c = c8050c5;
                                        i54 = i34;
                                        i26 = i33;
                                        arrayList2 = arrayList6;
                                        p19 = i32;
                                        i62 = i63;
                                        c12 = 25196;
                                        i27 = 5;
                                        c13 = 65535;
                                    } else {
                                        i22 = f13;
                                        i32 = p19;
                                        aVar3 = aVar5;
                                        i34 = 0;
                                        i33 = 1;
                                        c14 = '\b';
                                        c8050c = c8050c5;
                                        i54 = i34;
                                        i26 = i33;
                                        arrayList2 = arrayList6;
                                        p19 = i32;
                                        i62 = i63;
                                        c12 = 25196;
                                        i27 = 5;
                                        c13 = 65535;
                                    }
                                    if (p21 == 1767992678) {
                                        L11 = -1;
                                        F11 = -1;
                                    } else {
                                        if (p21 != 1935764850) {
                                            i35 = p21 == 1935767394 ? 16000 : 8000;
                                        }
                                        F11 = i35;
                                        L11 = 1;
                                    }
                                    int f14 = c8050c5.f();
                                    int i65 = L11;
                                    if (p21 == 1701733217) {
                                        Pair<Integer, p> g10 = g(c8050c5, f13, p19);
                                        if (g10 != null) {
                                            p21 = ((Integer) g10.first).intValue();
                                            if (c7270l3 == null) {
                                                i22 = f13;
                                                c7270l2 = null;
                                            } else {
                                                i22 = f13;
                                                c7270l2 = c7270l3.a(((p) g10.second).f64923b);
                                            }
                                            pVarArr[i63] = (p) g10.second;
                                        } else {
                                            i22 = f13;
                                            c7270l2 = c7270l3;
                                        }
                                        c8050c5.R(f14);
                                    } else {
                                        i22 = f13;
                                        c7270l2 = c7270l3;
                                    }
                                    String str7 = "audio/mhm1";
                                    if (p21 == 1633889587) {
                                        str2 = "audio/ac3";
                                    } else if (p21 == 1700998451) {
                                        str2 = "audio/eac3";
                                    } else if (p21 == 1633889588) {
                                        str2 = "audio/ac4";
                                    } else if (p21 == 1685353315) {
                                        str2 = "audio/vnd.dts";
                                    } else if (p21 == 1685353320 || p21 == 1685353324) {
                                        str2 = "audio/vnd.dts.hd";
                                    } else if (p21 == 1685353317) {
                                        str2 = "audio/vnd.dts.hd;profile=lbr";
                                    } else if (p21 == 1685353336) {
                                        str2 = "audio/vnd.dts.uhd;profile=p2";
                                    } else if (p21 == 1935764850) {
                                        str2 = "audio/3gpp";
                                    } else if (p21 == 1935767394) {
                                        str2 = "audio/amr-wb";
                                    } else {
                                        if (p21 != 1936684916) {
                                            if (p21 == 1953984371) {
                                                str2 = "audio/raw";
                                                i31 = 268435456;
                                            } else if (p21 != 1819304813) {
                                                str2 = (p21 == 778924082 || p21 == 778924083) ? "audio/mpeg" : p21 == 1835557169 ? "audio/mha1" : p21 == 1835560241 ? "audio/mhm1" : p21 == 1634492771 ? "audio/alac" : p21 == 1634492791 ? "audio/g711-alaw" : p21 == 1970037111 ? "audio/g711-mlaw" : p21 == 1332770163 ? "audio/opus" : p21 == 1716281667 ? "audio/flac" : p21 == 1835823201 ? "audio/true-hd" : p21 == 1767992678 ? "audio/iamf" : null;
                                            } else if (i31 != -1) {
                                                str2 = "audio/raw";
                                            }
                                        }
                                        str2 = "audio/raw";
                                        i31 = 2;
                                    }
                                    int i66 = f14;
                                    int i67 = i31;
                                    aVar3 = aVar5;
                                    List list2 = null;
                                    c cVar = null;
                                    C1052a c1052a = null;
                                    String str8 = null;
                                    int i68 = F11;
                                    String str9 = str2;
                                    int i69 = i65;
                                    while (i66 - i22 < p19) {
                                        c8050c5.R(i66);
                                        int p22 = c8050c5.p();
                                        int i71 = p19;
                                        N3.s.a(str6, p22 > 0);
                                        int p23 = c8050c5.p();
                                        String str10 = str6;
                                        if (p23 == 1835557187) {
                                            c8050c5.R(i66 + 8);
                                            c8050c5.S(1);
                                            int E11 = c8050c5.E();
                                            c8050c5.S(1);
                                            String format = Objects.equals(str9, str7) ? String.format("mhm1.%02X", Integer.valueOf(E11)) : String.format("mha1.%02X", Integer.valueOf(E11));
                                            int L14 = c8050c5.L();
                                            str3 = str7;
                                            byte[] bArr2 = new byte[L14];
                                            str8 = format;
                                            c8050c5.n(0, L14, bArr2);
                                            list2 = list2 == null ? AbstractC5880y.B(bArr2) : AbstractC5880y.C(bArr2, (byte[]) list2.get(0));
                                        } else {
                                            str3 = str7;
                                            if (p23 == 1835557200) {
                                                c8050c5.R(i66 + 8);
                                                int E12 = c8050c5.E();
                                                if (E12 > 0) {
                                                    byte[] bArr3 = new byte[E12];
                                                    c8050c5.n(0, E12, bArr3);
                                                    list2 = list2 == null ? AbstractC5880y.B(bArr3) : AbstractC5880y.C((byte[]) list2.get(0), bArr3);
                                                }
                                            } else {
                                                if (p23 == 1702061171) {
                                                    i36 = p11;
                                                    list = list2;
                                                    z13 = true;
                                                    i37 = 1702061171;
                                                } else if (z12 && p23 == 2002876005) {
                                                    i36 = p11;
                                                    list = list2;
                                                    i37 = 1702061171;
                                                    z13 = true;
                                                } else {
                                                    if (p23 == 1651798644) {
                                                        c8050c5.R(i66 + 8);
                                                        c8050c5.S(4);
                                                        i38 = i69;
                                                        list = list2;
                                                        c1052a = new C1052a(c8050c5.G(), c8050c5.G());
                                                        i36 = p11;
                                                    } else {
                                                        i38 = i69;
                                                        list = list2;
                                                        if (p23 == 1684103987) {
                                                            c8050c5.R(i66 + 8);
                                                            hVar.f64772b = C3651b.b(c8050c5, Integer.toString(i64), str5, c7270l2);
                                                        } else if (p23 == 1684366131) {
                                                            c8050c5.R(i66 + 8);
                                                            hVar.f64772b = C3651b.f(c8050c5, Integer.toString(i64), str5, c7270l2);
                                                        } else if (p23 == 1684103988) {
                                                            c8050c5.R(i66 + 8);
                                                            hVar.f64772b = C3652c.b(c8050c5, Integer.toString(i64), str5, c7270l2);
                                                            i36 = p11;
                                                            i69 = i38;
                                                            str6 = str10;
                                                            i66 += p22;
                                                            p19 = i71;
                                                            str7 = str3;
                                                            list2 = list;
                                                            p11 = i36;
                                                            i52 = 5;
                                                            i29 = 32;
                                                        } else if (p23 != 1684892784) {
                                                            if (p23 == 1684305011 || p23 == 1969517683) {
                                                                i36 = p11;
                                                                C7272n.a aVar6 = new C7272n.a();
                                                                aVar6.i0(i64);
                                                                aVar6.y0(str9);
                                                                i69 = i38;
                                                                aVar6.T(i69);
                                                                aVar6.z0(i68);
                                                                aVar6.c0(c7270l2);
                                                                aVar6.n0(str5);
                                                                hVar.f64772b = aVar6.P();
                                                            } else if (p23 == 1682927731) {
                                                                int i72 = p22 - 8;
                                                                byte[] bArr4 = f64747a;
                                                                byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i72);
                                                                c8050c5.R(i66 + 8);
                                                                c8050c5.n(bArr4.length, i72, copyOf);
                                                                i36 = p11;
                                                                list = Jb.b.a(copyOf);
                                                            } else {
                                                                if (p23 == 1684425825) {
                                                                    byte[] bArr5 = new byte[p22 - 8];
                                                                    bArr5[0] = 102;
                                                                    bArr5[1] = 76;
                                                                    bArr5[2] = b16;
                                                                    bArr5[3] = 67;
                                                                    c8050c5.R(i66 + 12);
                                                                    c8050c5.n(4, p22 - 12, bArr5);
                                                                    i36 = p11;
                                                                    list = AbstractC5880y.B(bArr5);
                                                                    str6 = str10;
                                                                    i69 = i38;
                                                                } else if (p23 == 1634492771) {
                                                                    int i73 = p22 - 12;
                                                                    byte[] bArr6 = new byte[i73];
                                                                    c8050c5.R(i66 + 12);
                                                                    c8050c5.n(0, i73, bArr6);
                                                                    int i74 = C8065g.f74319d;
                                                                    C8050C c8050c6 = new C8050C(bArr6);
                                                                    c8050c6.R(9);
                                                                    int E13 = c8050c6.E();
                                                                    c8050c6.R(20);
                                                                    Pair create2 = Pair.create(Integer.valueOf(c8050c6.I()), Integer.valueOf(E13));
                                                                    i68 = ((Integer) create2.first).intValue();
                                                                    i69 = ((Integer) create2.second).intValue();
                                                                    i36 = p11;
                                                                    list = AbstractC5880y.B(bArr6);
                                                                    str6 = str10;
                                                                } else if (p23 == 1767990114) {
                                                                    c8050c5.R(i66 + 9);
                                                                    int J11 = c8050c5.J();
                                                                    byte[] bArr7 = new byte[J11];
                                                                    c8050c5.n(0, J11, bArr7);
                                                                    int i75 = C8065g.f74319d;
                                                                    C8050C c8050c7 = new C8050C(bArr7);
                                                                    while ((c8050c7.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                                    }
                                                                    c8050c7.S(4);
                                                                    int E14 = c8050c7.E();
                                                                    int E15 = c8050c7.E();
                                                                    c8050c7.S(1);
                                                                    while ((c8050c7.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                                    }
                                                                    while ((c8050c7.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                                    }
                                                                    i36 = p11;
                                                                    String C11 = c8050c7.C(4, StandardCharsets.UTF_8);
                                                                    if (C11.equals("mp4a")) {
                                                                        while ((c8050c7.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                                        }
                                                                        c8050c7.S(2);
                                                                        C8049B c8049b = new C8049B();
                                                                        c8049b.m(c8050c7);
                                                                        int i76 = i52;
                                                                        bArr = bArr7;
                                                                        int h11 = c8049b.h(i76);
                                                                        i42 = E14;
                                                                        if (h11 == 31) {
                                                                            h11 = c8049b.h(6) + 32;
                                                                        }
                                                                        C11 = C4598rp.c(h11, C11, ".40.");
                                                                    } else {
                                                                        bArr = bArr7;
                                                                        i42 = E14;
                                                                    }
                                                                    Object[] objArr = {Integer.valueOf(i42), Integer.valueOf(E15), C11};
                                                                    int i77 = N.f74289a;
                                                                    str8 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
                                                                    list = AbstractC5880y.B(bArr);
                                                                    str6 = str10;
                                                                    i69 = i38;
                                                                } else {
                                                                    i36 = p11;
                                                                    if (p23 == 1885564227) {
                                                                        c8050c5.R(i66 + 12);
                                                                        ByteOrder byteOrder = (c8050c5.E() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                                        int E16 = c8050c5.E();
                                                                        if (p21 == 1768973165) {
                                                                            i39 = N.C(E16, byteOrder);
                                                                            i41 = -1;
                                                                        } else {
                                                                            i39 = (p21 == 1718641517 && E16 == i29 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i67;
                                                                            i41 = -1;
                                                                        }
                                                                        i67 = i39;
                                                                        str6 = str10;
                                                                        if (i39 != i41) {
                                                                            i69 = i38;
                                                                            str9 = "audio/raw";
                                                                        } else {
                                                                            i69 = i38;
                                                                        }
                                                                    } else {
                                                                        i69 = i38;
                                                                    }
                                                                }
                                                                i66 += p22;
                                                                p19 = i71;
                                                                str7 = str3;
                                                                list2 = list;
                                                                p11 = i36;
                                                                i52 = 5;
                                                                i29 = 32;
                                                            }
                                                            str6 = str10;
                                                            i66 += p22;
                                                            p19 = i71;
                                                            str7 = str3;
                                                            list2 = list;
                                                            p11 = i36;
                                                            i52 = 5;
                                                            i29 = 32;
                                                        } else {
                                                            if (p11 <= 0) {
                                                                throw v.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + p11);
                                                            }
                                                            i68 = p11;
                                                            i36 = i68;
                                                            str6 = str10;
                                                            i69 = 2;
                                                            i66 += p22;
                                                            p19 = i71;
                                                            str7 = str3;
                                                            list2 = list;
                                                            p11 = i36;
                                                            i52 = 5;
                                                            i29 = 32;
                                                        }
                                                        i36 = p11;
                                                        i69 = i38;
                                                        str6 = str10;
                                                        i66 += p22;
                                                        p19 = i71;
                                                        str7 = str3;
                                                        list2 = list;
                                                        p11 = i36;
                                                        i52 = 5;
                                                        i29 = 32;
                                                    }
                                                    str6 = str10;
                                                    i69 = i38;
                                                    i66 += p22;
                                                    p19 = i71;
                                                    str7 = str3;
                                                    list2 = list;
                                                    p11 = i36;
                                                    i52 = 5;
                                                    i29 = 32;
                                                }
                                                if (p23 != i37) {
                                                    f7 = c8050c5.f();
                                                    N3.s.a(null, f7 >= i66 ? z13 : false);
                                                    while (true) {
                                                        if (f7 - i66 >= p22) {
                                                            str6 = str10;
                                                            f7 = -1;
                                                            break;
                                                        }
                                                        c8050c5.R(f7);
                                                        int p24 = c8050c5.p();
                                                        str6 = str10;
                                                        N3.s.a(str6, p24 > 0 ? z13 : false);
                                                        if (c8050c5.p() == 1702061171) {
                                                            break;
                                                        }
                                                        f7 += p24;
                                                        str10 = str6;
                                                    }
                                                } else {
                                                    f7 = i66;
                                                    str6 = str10;
                                                }
                                                if (f7 != -1) {
                                                    cVar = b(f7, c8050c5);
                                                    str9 = cVar.f64760a;
                                                    byte[] bArr8 = cVar.f64761b;
                                                    if (bArr8 != null) {
                                                        if ("audio/vorbis".equals(str9)) {
                                                            list = P.d(bArr8);
                                                        } else {
                                                            if ("audio/mp4a-latm".equals(str9)) {
                                                                C3650a.C0354a b17 = C3650a.b(new C8049B(bArr8.length, bArr8), false);
                                                                i68 = b17.f18542a;
                                                                int i78 = b17.f18543b;
                                                                str8 = b17.f18544c;
                                                                i69 = i78;
                                                            }
                                                            list = AbstractC5880y.B(bArr8);
                                                            i66 += p22;
                                                            p19 = i71;
                                                            str7 = str3;
                                                            list2 = list;
                                                            p11 = i36;
                                                            i52 = 5;
                                                            i29 = 32;
                                                        }
                                                    }
                                                }
                                                i66 += p22;
                                                p19 = i71;
                                                str7 = str3;
                                                list2 = list;
                                                p11 = i36;
                                                i52 = 5;
                                                i29 = 32;
                                            }
                                        }
                                        i36 = p11;
                                        list = list2;
                                        str6 = str10;
                                        i66 += p22;
                                        p19 = i71;
                                        str7 = str3;
                                        list2 = list;
                                        p11 = i36;
                                        i52 = 5;
                                        i29 = 32;
                                    }
                                    i32 = p19;
                                    List list3 = list2;
                                    i34 = 0;
                                    i33 = 1;
                                    c14 = '\b';
                                    if (hVar.f64772b == null && str9 != null) {
                                        C7272n.a aVar7 = new C7272n.a();
                                        aVar7.i0(i64);
                                        aVar7.y0(str9);
                                        aVar7.U(str8);
                                        aVar7.T(i69);
                                        aVar7.z0(i68);
                                        aVar7.s0(i67);
                                        aVar7.k0(list3);
                                        aVar7.c0(c7270l2);
                                        aVar7.n0(str5);
                                        if (cVar != null) {
                                            aVar7.S(com.google.common.primitives.b.e(cVar.f64762c));
                                            aVar7.t0(com.google.common.primitives.b.e(cVar.f64763d));
                                        } else if (c1052a != null) {
                                            aVar7.S(com.google.common.primitives.b.e(c1052a.f64749a));
                                            aVar7.t0(com.google.common.primitives.b.e(c1052a.f64750b));
                                        }
                                        hVar.f64772b = aVar7.P();
                                    }
                                    c8050c = c8050c5;
                                    i54 = i34;
                                    i26 = i33;
                                    arrayList2 = arrayList6;
                                    p19 = i32;
                                    i62 = i63;
                                    c12 = 25196;
                                    i27 = 5;
                                    c13 = 65535;
                                } else if (p21 == 1414810956 || p21 == 1954034535 || p21 == 2004251764 || p21 == 1937010800 || p21 == 1664495672 || p21 == 1836070003) {
                                    c8050c5.R(f13 + 16);
                                    String str11 = "application/ttml+xml";
                                    if (p21 != 1414810956) {
                                        if (p21 == 1954034535) {
                                            int i79 = p19 - 16;
                                            byte[] bArr9 = new byte[i79];
                                            c8050c5.n(i54, i79, bArr9);
                                            abstractC5880y = AbstractC5880y.B(bArr9);
                                            str11 = "application/x-quicktime-tx3g";
                                            i23 = i61;
                                            i45 = i62;
                                            i24 = i55;
                                            i25 = p18;
                                        } else if (p21 == 2004251764) {
                                            str11 = "application/x-mp4-vtt";
                                        } else if (p21 == 1937010800) {
                                            i23 = i61;
                                            i45 = i62;
                                            i24 = i55;
                                            i25 = p18;
                                            j18 = 0;
                                            abstractC5880y = null;
                                            if (str11 != null) {
                                                C7272n.a aVar8 = new C7272n.a();
                                                aVar8.i0(kVar.f64783a);
                                                aVar8.y0(str11);
                                                aVar8.n0(str5);
                                                aVar8.C0(j18);
                                                aVar8.k0(abstractC5880y);
                                                hVar.f64772b = aVar8.P();
                                            }
                                            i22 = f13;
                                            c8050c = c8050c5;
                                            aVar3 = aVar5;
                                            i27 = i52;
                                            arrayList2 = arrayList6;
                                            i62 = i45;
                                            c12 = 25196;
                                            i26 = 1;
                                            i54 = 0;
                                            c13 = 65535;
                                        } else if (p21 == 1664495672) {
                                            hVar.f64774d = i53;
                                            str11 = "application/x-mp4-cea-608";
                                        } else {
                                            if (p21 != 1836070003) {
                                                throw new IllegalStateException();
                                            }
                                            int f15 = c8050c5.f();
                                            c8050c5.S(4);
                                            if (c8050c5.p() == 1702061171) {
                                                c b18 = b(f15, c8050c5);
                                                if (b18.f64761b == null || b18.f64761b.length != 64) {
                                                    i23 = i61;
                                                    i45 = i62;
                                                    i24 = i55;
                                                    i25 = p18;
                                                    i22 = f13;
                                                    c8050c = c8050c5;
                                                    aVar3 = aVar5;
                                                    i27 = i52;
                                                    arrayList2 = arrayList6;
                                                    i62 = i45;
                                                    c12 = 25196;
                                                    i26 = 1;
                                                    i54 = 0;
                                                    c13 = 65535;
                                                } else {
                                                    byte[] bArr10 = b18.f64761b;
                                                    int i81 = kVar.f64787e;
                                                    int i82 = kVar.f64788f;
                                                    G10.a.h(bArr10.length == 64);
                                                    ArrayList arrayList7 = new ArrayList(16);
                                                    i23 = i61;
                                                    int i83 = 0;
                                                    while (i83 < bArr10.length - 3) {
                                                        byte[] bArr11 = bArr10;
                                                        int i84 = i55;
                                                        int d13 = com.google.common.primitives.b.d(bArr10[i83], bArr11[i83 + 1], bArr11[i83 + 2], bArr11[i83 + 3]);
                                                        int i85 = (d13 >> 16) & 255;
                                                        int i86 = ((d13 >> 8) & 255) - 128;
                                                        int i87 = (d13 & 255) - 128;
                                                        arrayList7.add(String.format("%06x", Integer.valueOf(N.i(U7.i.a(i87, 17790, 10000, i85), 0, 255) | (N.i(U7.i.a(i86, 14075, 10000, i85), 0, 255) << 16) | (N.i((i85 - ((i87 * 3455) / 10000)) - ((i86 * 7169) / 10000), 0, 255) << 8))));
                                                        i83 += 4;
                                                        bArr10 = bArr11;
                                                        i62 = i62;
                                                        i55 = i84;
                                                        p18 = p18;
                                                    }
                                                    i45 = i62;
                                                    i24 = i55;
                                                    i25 = p18;
                                                    StringBuilder a11 = C2438a.a("size: ", i81, "x", "\npalette: ", i82);
                                                    a11.append(O7.f.e(", ").c(arrayList7));
                                                    a11.append("\n");
                                                    String sb2 = a11.toString();
                                                    int i88 = N.f74289a;
                                                    abstractC5880y = AbstractC5880y.B(sb2.getBytes(StandardCharsets.UTF_8));
                                                    str4 = "application/vobsub";
                                                }
                                            } else {
                                                i23 = i61;
                                                i45 = i62;
                                                i24 = i55;
                                                i25 = p18;
                                                abstractC5880y = null;
                                                str4 = null;
                                            }
                                            str11 = str4;
                                        }
                                        j18 = Long.MAX_VALUE;
                                        if (str11 != null) {
                                        }
                                        i22 = f13;
                                        c8050c = c8050c5;
                                        aVar3 = aVar5;
                                        i27 = i52;
                                        arrayList2 = arrayList6;
                                        i62 = i45;
                                        c12 = 25196;
                                        i26 = 1;
                                        i54 = 0;
                                        c13 = 65535;
                                    }
                                    i23 = i61;
                                    i45 = i62;
                                    i24 = i55;
                                    i25 = p18;
                                    j18 = Long.MAX_VALUE;
                                    abstractC5880y = null;
                                    if (str11 != null) {
                                    }
                                    i22 = f13;
                                    c8050c = c8050c5;
                                    aVar3 = aVar5;
                                    i27 = i52;
                                    arrayList2 = arrayList6;
                                    i62 = i45;
                                    c12 = 25196;
                                    i26 = 1;
                                    i54 = 0;
                                    c13 = 65535;
                                } else {
                                    if (p21 == 1835365492) {
                                        int i89 = kVar.f64783a;
                                        c8050c5.R(f13 + 16);
                                        if (p21 == 1835365492) {
                                            c8050c5.z();
                                            String z16 = c8050c5.z();
                                            if (z16 != null) {
                                                C7272n.a aVar9 = new C7272n.a();
                                                aVar9.i0(i89);
                                                aVar9.y0(z16);
                                                hVar.f64772b = aVar9.P();
                                            }
                                        }
                                    } else if (p21 == 1667329389) {
                                        C7272n.a aVar10 = new C7272n.a();
                                        aVar10.i0(kVar.f64783a);
                                        aVar10.y0("application/x-camera-motion");
                                        hVar.f64772b = aVar10.P();
                                    }
                                    i22 = f13;
                                    c8050c = c8050c5;
                                    i23 = i61;
                                    i24 = i55;
                                    i25 = p18;
                                    aVar3 = aVar5;
                                    i26 = i53;
                                    arrayList2 = arrayList6;
                                    c12 = 25196;
                                    c13 = 65535;
                                    i27 = i52;
                                }
                                c8050c.R(i22 + p19);
                                i62 += i26;
                                c7270l3 = c7270l;
                                arrayList5 = arrayList2;
                                c8050c5 = c8050c;
                                c18 = c12;
                                i52 = i27;
                                b12 = b16;
                                aVar5 = aVar3;
                                i61 = i23;
                                i55 = i24;
                                i53 = i26;
                                p18 = i25;
                            } else {
                                arrayList = arrayList5;
                                i18 = i61;
                                int i91 = i55;
                                AbstractC8431d.a aVar11 = aVar5;
                                int i92 = i53;
                                i19 = 8;
                                i21 = 16;
                                if (z11) {
                                    aVar2 = aVar11;
                                } else {
                                    aVar2 = aVar11;
                                    AbstractC8431d.a b19 = aVar2.b(1701082227);
                                    if (b19 != null) {
                                        AbstractC8431d.b c22 = b19.c(1701606260);
                                        if (c22 == null) {
                                            create = null;
                                        } else {
                                            C8050C c8050c8 = c22.f76379b;
                                            c8050c8.R(8);
                                            int d14 = d(c8050c8.p());
                                            int I14 = c8050c8.I();
                                            long[] jArr3 = new long[I14];
                                            long[] jArr4 = new long[I14];
                                            for (int i93 = i54; i93 < I14; i93 += i92) {
                                                jArr3[i93] = d14 == i92 ? c8050c8.K() : c8050c8.G();
                                                jArr4[i93] = d14 == i92 ? c8050c8.y() : c8050c8.p();
                                                if (c8050c8.B() != i92) {
                                                    throw new IllegalArgumentException("Unsupported media rate.");
                                                }
                                                c8050c8.S(2);
                                            }
                                            create = Pair.create(jArr3, jArr4);
                                        }
                                        if (create != null) {
                                            jArr = (long[]) create.first;
                                            jArr2 = (long[]) create.second;
                                            if (hVar.f64772b != null) {
                                                eVar2 = eVar;
                                                oVar = null;
                                            } else {
                                                if (kVar.f64785c != 0) {
                                                    C8430c c8430c = new C8430c(kVar.f64785c);
                                                    C7272n.a a12 = hVar.f64772b.a();
                                                    t tVar2 = hVar.f64772b.f69124l;
                                                    if (tVar2 != null) {
                                                        t.a[] aVarArr = new t.a[i92];
                                                        aVarArr[i54] = c8430c;
                                                        tVar = tVar2.a(aVarArr);
                                                    } else {
                                                        t.a[] aVarArr2 = new t.a[i92];
                                                        aVarArr2[i54] = c8430c;
                                                        tVar = new t(aVarArr2);
                                                    }
                                                    a12.r0(tVar);
                                                    c7272n = a12.P();
                                                } else {
                                                    c7272n = hVar.f64772b;
                                                }
                                                eVar2 = eVar;
                                                oVar = new o(kVar.f64783a, i91, eVar3.f64765a, j15, j16, eVar3.f64766b, c7272n, hVar.f64774d, pVarArr, hVar.f64773c, jArr, jArr2);
                                            }
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                if (hVar.f64772b != null) {
                                }
                            }
                        }
                    }
                    i13 = i12;
                    c8050c3.S(16);
                    short B112 = c8050c3.B();
                    c8050c3.S(2);
                    k kVar2 = new k(p13, L12, i13, B112, c8050c3.B(), j13);
                    if (j11 != -9223372036854775807L) {
                    }
                    long j192 = f(c15.f76379b).f76384c;
                    if (j14 != -9223372036854775807L) {
                    }
                    AbstractC8431d.a b142 = b13.b(1835626086);
                    b142.getClass();
                    char c182 = 25196;
                    AbstractC8431d.a b152 = b142.b(1937007212);
                    b152.getClass();
                    AbstractC8431d.b c192 = b13.c(1835296868);
                    c192.getClass();
                    C8050C c8050c42 = c192.f76379b;
                    c8050c42.R(8);
                    int d122 = d(c8050c42.p());
                    c8050c42.S(d122 != 0 ? 8 : 16);
                    long G122 = c8050c42.G();
                    int f122 = c8050c42.f();
                    if (d122 != 0) {
                    }
                    i15 = 0;
                    while (true) {
                        if (i15 < i14) {
                        }
                        i15++;
                    }
                    int L132 = c8050c42.L();
                    i16 = 3;
                    char[] cArr2 = {(char) (((L132 >> 10) & 31) + 96), (char) (((L132 >> 5) & 31) + 96), (char) ((L132 & 31) + 96)};
                    i17 = 0;
                    while (true) {
                        b12 = 97;
                        if (i17 < i16) {
                        }
                        i17++;
                        i16 = 3;
                    }
                    str = null;
                    e eVar32 = new e(str, j17, j12);
                    c11 = b152.c(1937011556);
                    if (c11 != null) {
                    }
                }
                o oVar2 = (o) eVar2.apply(oVar);
                if (oVar2 != null) {
                    AbstractC8431d.a b21 = aVar2.b(1835297121);
                    b21.getClass();
                    AbstractC8431d.a b22 = b21.b(1835626086);
                    b22.getClass();
                    AbstractC8431d.a b23 = b22.b(1937007212);
                    b23.getClass();
                    arrayList.add(h(oVar2, b23, b11));
                    i51 = i18 + 1;
                    c7270l3 = c7270l;
                    arrayList3 = arrayList;
                    i49 = i19;
                    i48 = i21;
                    i46 = i11;
                    i47 = 4;
                    aVar4 = aVar;
                }
            }
            i51 = i18 + 1;
            c7270l3 = c7270l;
            arrayList3 = arrayList;
            i49 = i19;
            i48 = i21;
            i46 = i11;
            i47 = 4;
            aVar4 = aVar;
        }
    }

    public static t j(AbstractC8431d.b bVar) {
        C8050C c8050c = bVar.f76379b;
        c8050c.R(8);
        t tVar = new t(new t.a[0]);
        while (c8050c.a() >= 8) {
            int f7 = c8050c.f();
            int p11 = c8050c.p();
            int p12 = c8050c.p();
            t tVar2 = null;
            if (p12 == 1835365473) {
                c8050c.R(f7);
                int i11 = f7 + p11;
                c8050c.S(8);
                a(c8050c);
                while (true) {
                    if (c8050c.f() >= i11) {
                        break;
                    }
                    int f11 = c8050c.f();
                    int p13 = c8050c.p();
                    if (c8050c.p() == 1768715124) {
                        c8050c.R(f11);
                        int i12 = f11 + p13;
                        c8050c.S(8);
                        ArrayList arrayList = new ArrayList();
                        while (c8050c.f() < i12) {
                            AbstractC5532h d11 = h4.f.d(c8050c);
                            if (d11 != null) {
                                arrayList.add(d11);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            tVar2 = new t(arrayList);
                        }
                    } else {
                        c8050c.R(f11 + p13);
                    }
                }
                tVar = tVar.b(tVar2);
            } else if (p12 == 1936553057) {
                c8050c.R(f7);
                tVar = tVar.b(m.a(f7 + p11, c8050c));
            } else if (p12 == -1451722374) {
                short B11 = c8050c.B();
                c8050c.S(2);
                String C11 = c8050c.C(B11, StandardCharsets.UTF_8);
                int max = Math.max(C11.lastIndexOf(43), C11.lastIndexOf(45));
                try {
                    tVar2 = new t(new C8432e(Float.parseFloat(C11.substring(0, max)), Float.parseFloat(C11.substring(max, C11.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                tVar = tVar.b(tVar2);
            }
            c8050c.R(f7 + p11);
        }
        return tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x064c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(C8050C c8050c, int i11, int i12, int i13, int i14, String str, int i15, C7270l c7270l, h hVar, int i16) throws v {
        int i17;
        int i18;
        int i19;
        C7270l c7270l2;
        int i21;
        int i22;
        C8434g.k kVar;
        int i23;
        int i24;
        byte b11;
        int i25;
        int h11;
        int i26;
        int h12;
        int i27;
        C7267i a11;
        int i28;
        int h13;
        int i29;
        int i31;
        String str2;
        int i32;
        List list;
        d dVar;
        int i33 = i12;
        int i34 = i13;
        C7270l c7270l3 = c7270l;
        h hVar2 = hVar;
        int i35 = 11;
        int i36 = 7;
        c8050c.R(i33 + 16);
        c8050c.S(16);
        int L11 = c8050c.L();
        int L12 = c8050c.L();
        int i37 = 5;
        c8050c.S(50);
        int f7 = c8050c.f();
        int i38 = 6;
        byte b12 = 3;
        int i39 = i11;
        int i41 = 12;
        if (i39 == 1701733238) {
            Pair<Integer, p> g10 = g(c8050c, i33, i34);
            if (g10 != null) {
                i39 = ((Integer) g10.first).intValue();
                if (c7270l3 == null) {
                    c7270l3 = null;
                    i17 = 8;
                } else {
                    i17 = 8;
                    c7270l3 = c7270l3.a(((p) g10.second).f64923b);
                }
                hVar2.f64771a[i16] = (p) g10.second;
            } else {
                i17 = 8;
            }
            c8050c.R(f7);
        } else {
            i17 = 8;
        }
        String str3 = "video/3gpp";
        String str4 = i39 == 1831958048 ? "video/mpeg" : i39 == 1211250227 ? "video/3gpp" : null;
        int i42 = 1;
        int i43 = i17;
        int i44 = i43;
        float f11 = 1.0f;
        int i45 = -1;
        List list2 = null;
        C8434g.k kVar2 = null;
        ByteBuffer byteBuffer = null;
        String str5 = null;
        byte[] bArr = null;
        int i46 = -1;
        int i47 = -1;
        int i48 = -1;
        int i49 = -1;
        int i51 = -1;
        int i52 = -1;
        int i53 = -1;
        C1052a c1052a = null;
        c cVar = null;
        boolean z11 = false;
        while (f7 - i33 < i34) {
            c8050c.R(f7);
            int f12 = c8050c.f();
            int p11 = c8050c.p();
            if (p11 == 0 && c8050c.f() - i12 == i34) {
                break;
            }
            String str6 = "childAtomSize must be positive";
            N3.s.a("childAtomSize must be positive", p11 > 0 ? i42 : 0);
            int p12 = c8050c.p();
            String str7 = str3;
            if (p12 == 1635148611) {
                N3.s.a(null, str4 == null ? i42 : 0);
                c8050c.R(f12 + 8);
                C3653d a12 = C3653d.a(c8050c);
                hVar2.f64773c = a12.f18569b;
                if (!z11) {
                    f11 = a12.f18578k;
                }
                list2 = a12.f18568a;
                String str8 = a12.f18579l;
                int i54 = a12.f18577j;
                i45 = a12.f18574g;
                int i55 = a12.f18575h;
                int i56 = a12.f18576i;
                int i57 = a12.f18572e;
                i19 = a12.f18573f;
                c7270l2 = c7270l3;
                i47 = i54;
                i22 = L12;
                i23 = i39;
                i52 = i55;
                b11 = b12;
                i53 = i56;
                i21 = i46;
                str5 = str8;
                kVar = kVar2;
                i24 = i38;
                str4 = "video/avc";
                i18 = f7;
                i25 = i57;
            } else {
                i18 = f7;
                if (p12 == 1752589123) {
                    N3.s.a(null, str4 == null ? i42 : 0);
                    c8050c.R(f12 + 8);
                    C a13 = C.a(c8050c);
                    hVar2.f64773c = a13.f18469b;
                    if (!z11) {
                        f11 = a13.f18479l;
                    }
                    int i58 = a13.f18478k;
                    if (i58 != -1) {
                        i46 = i58;
                    }
                    list2 = a13.f18468a;
                    int i59 = a13.f18480m;
                    int i61 = a13.f18470c;
                    String str9 = a13.f18481n;
                    int i62 = a13.f18471d;
                    int i63 = a13.f18472e;
                    int i64 = a13.f18475h;
                    int i65 = a13.f18476i;
                    int i66 = a13.f18477j;
                    int i67 = a13.f18473f;
                    i19 = a13.f18474g;
                    c7270l2 = c7270l3;
                    i22 = L12;
                    i51 = i63;
                    i23 = i39;
                    i24 = i38;
                    i21 = i46;
                    i52 = i65;
                    i53 = i66;
                    kVar = a13.f18482o;
                    i48 = i61;
                    str4 = "video/hevc";
                    i47 = i59;
                    i25 = i67;
                    str5 = str9;
                    i49 = i62;
                    i45 = i64;
                    b11 = b12;
                } else {
                    if (p12 == 1818785347) {
                        N3.s.a("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                        N3.s.a("must have at least two layers", (kVar2 == null || kVar2.f76428a.size() < 2) ? 0 : i42);
                        c8050c.R(f12 + 8);
                        kVar2.getClass();
                        C c11 = C.c(c8050c, kVar2);
                        N3.s.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", hVar2.f64773c == c11.f18469b ? i42 : 0);
                        int i68 = c11.f18475h;
                        if (i68 != -1) {
                            N3.s.a("colorSpace must be the same for both views", i45 == i68 ? i42 : 0);
                        }
                        int i69 = c11.f18476i;
                        int i71 = i52;
                        if (i69 != -1) {
                            N3.s.a("colorRange must be the same for both views", i71 == i69 ? i42 : 0);
                        }
                        int i72 = c11.f18477j;
                        int i73 = i53;
                        if (i72 != -1) {
                            N3.s.a("colorTransfer must be the same for both views", i73 == i72 ? i42 : 0);
                        }
                        int i74 = i43;
                        N3.s.a("bitdepthLuma must be the same for both views", i74 == c11.f18473f ? i42 : 0);
                        int i75 = i44;
                        N3.s.a("bitdepthChroma must be the same for both views", i75 == c11.f18474g ? i42 : 0);
                        if (list2 != null) {
                            int i76 = AbstractC5880y.f59142c;
                            AbstractC5880y.a aVar = new AbstractC5880y.a();
                            aVar.h(list2);
                            aVar.h(c11.f18468a);
                            list2 = aVar.j();
                        } else {
                            N3.s.a("initializationData must be already set from hvcC atom", false);
                        }
                        str4 = "video/mv-hevc";
                        c7270l2 = c7270l3;
                        i52 = i71;
                        i22 = L12;
                        i53 = i73;
                        i23 = i39;
                        i19 = i75;
                        b11 = b12;
                        i25 = i74;
                        i21 = i46;
                        str5 = c11.f18481n;
                    } else {
                        int i77 = i52;
                        int i78 = i53;
                        int i79 = i43;
                        i19 = i44;
                        if (p12 == 1986361461) {
                            c8050c.R(f12 + 8);
                            int f13 = c8050c.f();
                            d dVar2 = null;
                            while (f13 - f12 < p11) {
                                c8050c.R(f13);
                                int p13 = c8050c.p();
                                int i81 = f13;
                                N3.s.a(str6, p13 > 0 ? i42 : 0);
                                C7270l c7270l4 = c7270l3;
                                if (c8050c.p() == 1702454643) {
                                    c8050c.R(i81 + 8);
                                    int f14 = c8050c.f();
                                    while (true) {
                                        if (f14 - i81 >= p13) {
                                            str2 = str6;
                                            i32 = p13;
                                            list = list2;
                                            dVar = null;
                                            break;
                                        }
                                        c8050c.R(f14);
                                        int p14 = c8050c.p();
                                        N3.s.a(str6, p14 > 0 ? i42 : 0);
                                        int i82 = f14;
                                        if (c8050c.p() == 1937011305) {
                                            c8050c.S(4);
                                            int E11 = c8050c.E();
                                            str2 = str6;
                                            i32 = p13;
                                            list = list2;
                                            dVar = new d(new g((E11 & 1) == i42, (E11 & 2) == 2, (E11 & 8) == i17));
                                        } else {
                                            f14 = i82 + p14;
                                            i17 = 8;
                                            i42 = 1;
                                        }
                                    }
                                    dVar2 = dVar;
                                } else {
                                    str2 = str6;
                                    i32 = p13;
                                    list = list2;
                                }
                                f13 = i81 + i32;
                                c7270l3 = c7270l4;
                                str6 = str2;
                                list2 = list;
                                i17 = 8;
                                i42 = 1;
                            }
                            c7270l2 = c7270l3;
                            List list3 = list2;
                            l lVar = dVar2 == null ? null : new l(dVar2);
                            if (lVar != null) {
                                if (kVar2 == null || kVar2.f76428a.size() < 2) {
                                    i29 = i46;
                                    if (i29 == -1) {
                                        i31 = lVar.f64789a.f64764a.f64770c ? i37 : 4;
                                        i53 = i78;
                                        i25 = i79;
                                        i52 = i77;
                                        i22 = L12;
                                        i23 = i39;
                                        b11 = b12;
                                        i21 = i31;
                                        list2 = list3;
                                        i17 = 8;
                                        i42 = 1;
                                    }
                                    i31 = i29;
                                    i53 = i78;
                                    i25 = i79;
                                    i52 = i77;
                                    i22 = L12;
                                    i23 = i39;
                                    b11 = b12;
                                    i21 = i31;
                                    list2 = list3;
                                    i17 = 8;
                                    i42 = 1;
                                } else {
                                    N3.s.a("both eye views must be marked as available", lVar.b());
                                    N3.s.a("for MV-HEVC, eye_views_reversed must be set to false", !lVar.f64789a.f64764a.f64770c);
                                }
                            }
                            i29 = i46;
                            i31 = i29;
                            i53 = i78;
                            i25 = i79;
                            i52 = i77;
                            i22 = L12;
                            i23 = i39;
                            b11 = b12;
                            i21 = i31;
                            list2 = list3;
                            i17 = 8;
                            i42 = 1;
                        } else {
                            c7270l2 = c7270l3;
                            List list4 = list2;
                            int i83 = i46;
                            if (p12 == 1685480259 || p12 == 1685485123) {
                                i21 = i83;
                                i22 = L12;
                                kVar = kVar2;
                                i23 = i39;
                                i24 = i38;
                                b11 = b12;
                                i42 = 1;
                            } else if (p12 == 1685485379) {
                                i21 = i83;
                                i22 = L12;
                                kVar = kVar2;
                                i23 = i39;
                                i24 = i38;
                                b11 = b12;
                                i42 = 1;
                            } else {
                                if (p12 == 1987076931) {
                                    N3.s.a(null, str4 == null);
                                    String str10 = i39 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c8050c.R(f12 + 12);
                                    byte E12 = (byte) c8050c.E();
                                    byte E13 = (byte) c8050c.E();
                                    int E14 = c8050c.E();
                                    i25 = E14 >> 4;
                                    byte b13 = (byte) ((E14 >> 1) & 7);
                                    if (str10.equals("video/x-vnd.on2.vp9")) {
                                        int i84 = C8065g.f74319d;
                                        byte[] bArr2 = new byte[i41];
                                        bArr2[0] = 1;
                                        bArr2[1] = 1;
                                        bArr2[2] = E12;
                                        bArr2[b12] = 2;
                                        bArr2[4] = 1;
                                        bArr2[i37] = E13;
                                        bArr2[i38] = b12;
                                        bArr2[i36] = 1;
                                        bArr2[8] = (byte) i25;
                                        bArr2[9] = 4;
                                        bArr2[10] = 1;
                                        bArr2[i35] = b13;
                                        list2 = AbstractC5880y.B(bArr2);
                                    } else {
                                        list2 = list4;
                                    }
                                    boolean z12 = (E14 & 1) != 0;
                                    int E15 = c8050c.E();
                                    int E16 = c8050c.E();
                                    i45 = C7267i.g(E15);
                                    int i85 = z12 ? 1 : 2;
                                    i53 = C7267i.h(E16);
                                    str4 = str10;
                                    i21 = i83;
                                    i52 = i85;
                                    i22 = L12;
                                    i19 = i25;
                                    kVar = kVar2;
                                    i23 = i39;
                                    i24 = i38;
                                    b11 = b12;
                                } else if (p12 == 1635135811) {
                                    int i86 = p11 - 8;
                                    byte[] bArr3 = new byte[i86];
                                    c8050c.n(0, i86, bArr3);
                                    list2 = AbstractC5880y.B(bArr3);
                                    c8050c.R(f12 + 8);
                                    C7267i.a aVar2 = new C7267i.a();
                                    byte[] e11 = c8050c.e();
                                    C8049B c8049b = new C8049B(e11.length, e11);
                                    c8049b.n(c8050c.f() * 8);
                                    c8049b.q(1);
                                    int h14 = c8049b.h(b12);
                                    c8049b.p(i38);
                                    boolean g11 = c8049b.g();
                                    boolean g12 = c8049b.g();
                                    int i87 = 2;
                                    if (h14 == 2) {
                                        if (g11) {
                                            aVar2.g(g12 ? 12 : 10);
                                            aVar2.b(g12 ? 12 : 10);
                                            c8049b.p(13);
                                            c8049b.o();
                                            h11 = c8049b.h(4);
                                            if (h11 == 1) {
                                                m3.s.e("BoxParsers", "Unsupported obu_type: " + h11);
                                                a11 = aVar2.a();
                                            } else if (c8049b.g()) {
                                                m3.s.e("BoxParsers", "Unsupported obu_extension_flag");
                                                a11 = aVar2.a();
                                            } else {
                                                boolean g13 = c8049b.g();
                                                c8049b.o();
                                                if (!g13 || c8049b.h(8) <= 127) {
                                                    int h15 = c8049b.h(3);
                                                    c8049b.o();
                                                    if (c8049b.g()) {
                                                        m3.s.e("BoxParsers", "Unsupported reduced_still_picture_header");
                                                        a11 = aVar2.a();
                                                    } else if (c8049b.g()) {
                                                        m3.s.e("BoxParsers", "Unsupported timing_info_present_flag");
                                                        a11 = aVar2.a();
                                                    } else if (c8049b.g()) {
                                                        m3.s.e("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        a11 = aVar2.a();
                                                    } else {
                                                        int i88 = i37;
                                                        int h16 = c8049b.h(i88);
                                                        int i89 = 0;
                                                        while (i89 <= h16) {
                                                            c8049b.p(12);
                                                            if (c8049b.h(i88) > i36) {
                                                                c8049b.o();
                                                            }
                                                            i89++;
                                                            i88 = 5;
                                                            i36 = 7;
                                                        }
                                                        int h17 = c8049b.h(4);
                                                        int h18 = c8049b.h(4);
                                                        c8049b.p(h17 + 1);
                                                        c8049b.p(h18 + 1);
                                                        if (c8049b.g()) {
                                                            c8049b.p(7);
                                                        }
                                                        c8049b.p(7);
                                                        boolean g14 = c8049b.g();
                                                        if (g14) {
                                                            c8049b.p(2);
                                                        }
                                                        if (c8049b.g()) {
                                                            i26 = 1;
                                                            h12 = 2;
                                                        } else {
                                                            i26 = 1;
                                                            h12 = c8049b.h(1);
                                                        }
                                                        if (h12 > 0 && !c8049b.g()) {
                                                            c8049b.p(i26);
                                                        }
                                                        if (g14) {
                                                            i27 = 3;
                                                            c8049b.p(3);
                                                        } else {
                                                            i27 = 3;
                                                        }
                                                        c8049b.p(i27);
                                                        boolean g15 = c8049b.g();
                                                        if (h15 == 2 && g15) {
                                                            c8049b.o();
                                                        }
                                                        boolean z13 = h15 != 1 && c8049b.g();
                                                        if (c8049b.g()) {
                                                            int h19 = c8049b.h(8);
                                                            int h21 = c8049b.h(8);
                                                            int h22 = c8049b.h(8);
                                                            if (z13) {
                                                                i28 = 1;
                                                            } else {
                                                                i28 = 1;
                                                                if (h19 == 1 && h21 == 13 && h22 == 0) {
                                                                    h13 = 1;
                                                                    aVar2.d(C7267i.g(h19));
                                                                    aVar2.c(h13 != i28 ? 1 : 2);
                                                                    aVar2.e(C7267i.h(h21));
                                                                }
                                                            }
                                                            h13 = c8049b.h(i28);
                                                            aVar2.d(C7267i.g(h19));
                                                            aVar2.c(h13 != i28 ? 1 : 2);
                                                            aVar2.e(C7267i.h(h21));
                                                        }
                                                        a11 = aVar2.a();
                                                        int i91 = a11.f69071e;
                                                        int i92 = a11.f69072f;
                                                        i45 = a11.f69067a;
                                                        int i93 = a11.f69068b;
                                                        i53 = a11.f69069c;
                                                        i21 = i83;
                                                        i19 = i92;
                                                        i22 = L12;
                                                        i52 = i93;
                                                        kVar = kVar2;
                                                        i23 = i39;
                                                        b11 = 3;
                                                        i24 = 6;
                                                        i41 = 12;
                                                        i17 = 8;
                                                        i42 = 1;
                                                        str4 = "video/av01";
                                                        i25 = i91;
                                                    }
                                                } else {
                                                    m3.s.e("BoxParsers", "Excessive obu_size");
                                                    a11 = aVar2.a();
                                                }
                                            }
                                            int i912 = a11.f69071e;
                                            int i922 = a11.f69072f;
                                            i45 = a11.f69067a;
                                            int i932 = a11.f69068b;
                                            i53 = a11.f69069c;
                                            i21 = i83;
                                            i19 = i922;
                                            i22 = L12;
                                            i52 = i932;
                                            kVar = kVar2;
                                            i23 = i39;
                                            b11 = 3;
                                            i24 = 6;
                                            i41 = 12;
                                            i17 = 8;
                                            i42 = 1;
                                            str4 = "video/av01";
                                            i25 = i912;
                                        } else {
                                            i87 = 2;
                                        }
                                    }
                                    if (h14 <= i87) {
                                        aVar2.g(g11 ? 10 : 8);
                                        aVar2.b(g11 ? 10 : 8);
                                    }
                                    c8049b.p(13);
                                    c8049b.o();
                                    h11 = c8049b.h(4);
                                    if (h11 == 1) {
                                    }
                                    int i9122 = a11.f69071e;
                                    int i9222 = a11.f69072f;
                                    i45 = a11.f69067a;
                                    int i9322 = a11.f69068b;
                                    i53 = a11.f69069c;
                                    i21 = i83;
                                    i19 = i9222;
                                    i22 = L12;
                                    i52 = i9322;
                                    kVar = kVar2;
                                    i23 = i39;
                                    b11 = 3;
                                    i24 = 6;
                                    i41 = 12;
                                    i17 = 8;
                                    i42 = 1;
                                    str4 = "video/av01";
                                    i25 = i9122;
                                } else {
                                    if (p12 == 1668050025) {
                                        if (byteBuffer == null) {
                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBuffer;
                                        byteBuffer2.position(21);
                                        byteBuffer2.putShort(c8050c.B());
                                        byteBuffer2.putShort(c8050c.B());
                                        i53 = i78;
                                        i25 = i79;
                                        i52 = i77;
                                        byteBuffer = byteBuffer2;
                                        i21 = i83;
                                        i22 = L12;
                                        kVar = kVar2;
                                        i23 = i39;
                                    } else if (p12 == 1835295606) {
                                        if (byteBuffer == null) {
                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer3 = byteBuffer;
                                        short B11 = c8050c.B();
                                        short B12 = c8050c.B();
                                        short B13 = c8050c.B();
                                        short B14 = c8050c.B();
                                        short B15 = c8050c.B();
                                        kVar = kVar2;
                                        short B16 = c8050c.B();
                                        i23 = i39;
                                        short B17 = c8050c.B();
                                        i21 = i83;
                                        short B18 = c8050c.B();
                                        long G11 = c8050c.G();
                                        long G12 = c8050c.G();
                                        i22 = L12;
                                        byteBuffer3.position(1);
                                        byteBuffer3.putShort(B15);
                                        byteBuffer3.putShort(B16);
                                        byteBuffer3.putShort(B11);
                                        byteBuffer3.putShort(B12);
                                        byteBuffer3.putShort(B13);
                                        byteBuffer3.putShort(B14);
                                        byteBuffer3.putShort(B17);
                                        byteBuffer3.putShort(B18);
                                        byteBuffer3.putShort((short) (G11 / 10000));
                                        byteBuffer3.putShort((short) (G12 / 10000));
                                        i53 = i78;
                                        i25 = i79;
                                        i52 = i77;
                                        byteBuffer = byteBuffer3;
                                    } else {
                                        i21 = i83;
                                        i22 = L12;
                                        kVar = kVar2;
                                        i23 = i39;
                                        if (p12 == 1681012275) {
                                            N3.s.a(null, str4 == null);
                                            i53 = i78;
                                            i25 = i79;
                                            i52 = i77;
                                            str4 = str7;
                                        } else if (p12 == 1702061171) {
                                            N3.s.a(null, str4 == null);
                                            cVar = b(f12, c8050c);
                                            String str11 = cVar.f64760a;
                                            byte[] bArr4 = cVar.f64761b;
                                            list2 = bArr4 != null ? AbstractC5880y.B(bArr4) : list4;
                                            i53 = i78;
                                            i25 = i79;
                                            i52 = i77;
                                            str4 = str11;
                                            b11 = 3;
                                            i24 = 6;
                                        } else if (p12 == 1651798644) {
                                            i17 = 8;
                                            c8050c.R(f12 + 8);
                                            c8050c.S(4);
                                            i53 = i78;
                                            i25 = i79;
                                            i52 = i77;
                                            c1052a = new C1052a(c8050c.G(), c8050c.G());
                                            list2 = list4;
                                            b11 = 3;
                                            i24 = 6;
                                            i41 = 12;
                                            i42 = 1;
                                        } else {
                                            i17 = 8;
                                            if (p12 == 1885434736) {
                                                c8050c.R(f12 + 8);
                                                i53 = i78;
                                                i25 = i79;
                                                i52 = i77;
                                                f11 = c8050c.I() / c8050c.I();
                                                list2 = list4;
                                                b11 = 3;
                                                i24 = 6;
                                                i41 = 12;
                                                i42 = 1;
                                                z11 = true;
                                            } else if (p12 == 1937126244) {
                                                int i94 = f12 + 8;
                                                while (true) {
                                                    if (i94 - f12 >= p11) {
                                                        bArr = null;
                                                        break;
                                                    }
                                                    c8050c.R(i94);
                                                    int p15 = c8050c.p();
                                                    if (c8050c.p() == 1886547818) {
                                                        bArr = Arrays.copyOfRange(c8050c.e(), i94, p15 + i94);
                                                        break;
                                                    }
                                                    i94 += p15;
                                                }
                                                i53 = i78;
                                                i25 = i79;
                                                i52 = i77;
                                            } else if (p12 == 1936995172) {
                                                int E17 = c8050c.E();
                                                b11 = 3;
                                                c8050c.S(3);
                                                if (E17 == 0) {
                                                    int E18 = c8050c.E();
                                                    if (E18 == 0) {
                                                        i21 = 0;
                                                    } else if (E18 == 1) {
                                                        i21 = 1;
                                                    } else if (E18 == 2) {
                                                        i21 = 2;
                                                    } else if (E18 == 3) {
                                                        i21 = 3;
                                                    }
                                                }
                                                i53 = i78;
                                                i25 = i79;
                                                i52 = i77;
                                                list2 = list4;
                                                i24 = 6;
                                            } else {
                                                b11 = 3;
                                                if (p12 == 1634760259) {
                                                    i41 = 12;
                                                    int i95 = p11 - 12;
                                                    byte[] bArr5 = new byte[i95];
                                                    c8050c.R(f12 + 12);
                                                    c8050c.n(0, i95, bArr5);
                                                    list2 = AbstractC5880y.B(bArr5);
                                                    C8050C c8050c2 = new C8050C(bArr5);
                                                    C7267i.a aVar3 = new C7267i.a();
                                                    byte[] e12 = c8050c2.e();
                                                    C8049B c8049b2 = new C8049B(e12.length, e12);
                                                    int i96 = 8;
                                                    c8049b2.n(c8050c2.f() * 8);
                                                    int i97 = 1;
                                                    c8049b2.q(1);
                                                    int h23 = c8049b2.h(8);
                                                    int i98 = 0;
                                                    while (i98 < h23) {
                                                        c8049b2.q(i97);
                                                        int h24 = c8049b2.h(i96);
                                                        int i99 = 0;
                                                        while (i99 < h24) {
                                                            c8049b2.p(6);
                                                            boolean g16 = c8049b2.g();
                                                            c8049b2.o();
                                                            int i100 = i35;
                                                            c8049b2.q(i100);
                                                            c8049b2.p(4);
                                                            int h25 = c8049b2.h(4) + 8;
                                                            aVar3.g(h25);
                                                            aVar3.b(h25);
                                                            c8049b2.q(1);
                                                            if (g16) {
                                                                int h26 = c8049b2.h(i96);
                                                                int h27 = c8049b2.h(i96);
                                                                c8049b2.q(1);
                                                                boolean g17 = c8049b2.g();
                                                                aVar3.d(C7267i.g(h26));
                                                                aVar3.c(g17 ? 1 : 2);
                                                                aVar3.e(C7267i.h(h27));
                                                            }
                                                            i99++;
                                                            i35 = i100;
                                                            i96 = 8;
                                                        }
                                                        i98++;
                                                        i97 = 1;
                                                        i96 = 8;
                                                    }
                                                    i42 = i97;
                                                    i24 = 6;
                                                    C7267i a14 = aVar3.a();
                                                    int i101 = a14.f69071e;
                                                    int i102 = a14.f69072f;
                                                    i45 = a14.f69067a;
                                                    int i103 = a14.f69068b;
                                                    i53 = a14.f69069c;
                                                    i25 = i101;
                                                    i19 = i102;
                                                    i52 = i103;
                                                    i35 = i35;
                                                    i17 = 8;
                                                    str4 = "video/apv";
                                                } else {
                                                    int i104 = i35;
                                                    i24 = 6;
                                                    i41 = 12;
                                                    i42 = 1;
                                                    if (p12 == 1668246642 && i45 == -1 && i78 == -1) {
                                                        int p16 = c8050c.p();
                                                        if (p16 == 1852009592 || p16 == 1852009571) {
                                                            int L13 = c8050c.L();
                                                            int L14 = c8050c.L();
                                                            c8050c.S(2);
                                                            boolean z14 = p11 == 19 && (c8050c.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                                                            i45 = C7267i.g(L13);
                                                            int i105 = z14 ? 1 : 2;
                                                            i53 = C7267i.h(L14);
                                                            i35 = i104;
                                                            i25 = i79;
                                                            list2 = list4;
                                                            i17 = 8;
                                                            i52 = i105;
                                                        } else {
                                                            m3.s.f("BoxParsers", "Unsupported color type: " + AbstractC8431d.a(p16));
                                                        }
                                                    }
                                                    i53 = i78;
                                                    i25 = i79;
                                                    i52 = i77;
                                                    i35 = i104;
                                                    list2 = list4;
                                                    i17 = 8;
                                                }
                                            }
                                        }
                                    }
                                    list2 = list4;
                                    b11 = 3;
                                    i24 = 6;
                                }
                                i41 = 12;
                                i17 = 8;
                                i42 = 1;
                            }
                            int i106 = p11 - 8;
                            byte[] bArr6 = new byte[i106];
                            c8050c.n(0, i106, bArr6);
                            if (list4 != null) {
                                int i107 = AbstractC5880y.f59142c;
                                AbstractC5880y.a aVar4 = new AbstractC5880y.a();
                                aVar4.h(list4);
                                aVar4.e(bArr6);
                                list2 = aVar4.j();
                            } else {
                                N3.s.a("initializationData must already be set from hvcC or avcC atom", false);
                                list2 = list4;
                            }
                            i17 = 8;
                            c8050c.R(f12 + 8);
                            C8428a a15 = C8428a.a(c8050c);
                            if (a15 != null) {
                                str4 = "video/dolby-vision";
                                str5 = a15.f76369a;
                            }
                            i53 = i78;
                            i25 = i79;
                            i52 = i77;
                        }
                    }
                    kVar = kVar2;
                    i24 = i38;
                }
            }
            i34 = i13;
            hVar2 = hVar;
            b12 = b11;
            i38 = i24;
            kVar2 = kVar;
            i39 = i23;
            c7270l3 = c7270l2;
            i46 = i21;
            i44 = i19;
            L12 = i22;
            i36 = 7;
            i37 = 5;
            str3 = str7;
            i43 = i25;
            f7 = i18 + p11;
            i33 = i12;
        }
        int i108 = L12;
        List list5 = list2;
        int i109 = i46;
        int i110 = i53;
        int i111 = i44;
        C7270l c7270l5 = c7270l3;
        int i112 = i52;
        int i113 = i43;
        if (str4 == null) {
            return;
        }
        C7272n.a aVar5 = new C7272n.a();
        aVar5.i0(i14);
        aVar5.y0(str4);
        aVar5.U(str5);
        aVar5.F0(L11);
        aVar5.h0(i108);
        aVar5.b0(i49);
        aVar5.a0(i51);
        aVar5.u0(f11);
        aVar5.x0(i15);
        aVar5.v0(bArr);
        aVar5.B0(i109);
        aVar5.k0(list5);
        aVar5.p0(i47);
        aVar5.q0(i48);
        aVar5.c0(c7270l5);
        aVar5.n0(str);
        C7267i.a aVar6 = new C7267i.a();
        aVar6.d(i45);
        aVar6.c(i112);
        aVar6.e(i110);
        aVar6.f(byteBuffer != null ? byteBuffer.array() : null);
        aVar6.g(i113);
        aVar6.b(i111);
        aVar5.V(aVar6.a());
        if (c1052a != null) {
            aVar5.S(com.google.common.primitives.b.e(c1052a.f64749a));
            aVar5.t0(com.google.common.primitives.b.e(c1052a.f64750b));
        } else if (cVar != null) {
            aVar5.S(com.google.common.primitives.b.e(cVar.f64762c));
            aVar5.t0(com.google.common.primitives.b.e(cVar.f64763d));
        }
        hVar.f64772b = aVar5.P();
    }
}
