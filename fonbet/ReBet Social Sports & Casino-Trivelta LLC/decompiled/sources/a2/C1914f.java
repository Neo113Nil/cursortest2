package a2;

import H1.B;
import H1.C1181n;
import H1.D;
import H1.F;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.O;
import H1.r;
import H1.u;
import V1.h;
import V1.l;
import V1.n;
import a2.InterfaceC1915g;
import androidx.media3.common.a;
import b1.C2334C;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;
import java.io.EOFException;
import java.math.RoundingMode;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1914f implements InterfaceC1183p {

    /* renamed from: v, reason: collision with root package name */
    public static final u f14994v = new u() { // from class: a2.d
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C1914f.b();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    public static final h.a f14995w = new h.a() { // from class: a2.e
        @Override // V1.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return C1914f.d(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f14996a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14997b;

    /* renamed from: c, reason: collision with root package name */
    public final J f14998c;

    /* renamed from: d, reason: collision with root package name */
    public final F.a f14999d;

    /* renamed from: e, reason: collision with root package name */
    public final B f15000e;

    /* renamed from: f, reason: collision with root package name */
    public final D f15001f;

    /* renamed from: g, reason: collision with root package name */
    public final O f15002g;

    /* renamed from: h, reason: collision with root package name */
    public r f15003h;

    /* renamed from: i, reason: collision with root package name */
    public O f15004i;

    /* renamed from: j, reason: collision with root package name */
    public O f15005j;

    /* renamed from: k, reason: collision with root package name */
    public int f15006k;

    /* renamed from: l, reason: collision with root package name */
    public C2334C f15007l;

    /* renamed from: m, reason: collision with root package name */
    public long f15008m;

    /* renamed from: n, reason: collision with root package name */
    public long f15009n;

    /* renamed from: o, reason: collision with root package name */
    public long f15010o;

    /* renamed from: p, reason: collision with root package name */
    public long f15011p;

    /* renamed from: q, reason: collision with root package name */
    public int f15012q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1915g f15013r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15014s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15015t;

    /* renamed from: u, reason: collision with root package name */
    public long f15016u;

    public C1914f() {
        this(0);
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C1914f()};
    }

    public static /* synthetic */ boolean d(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void e() {
        AbstractC4134a.i(this.f15004i);
        Z.i(this.f15003h);
    }

    public static long o(C2334C c2334c) {
        if (c2334c == null) {
            return -9223372036854775807L;
        }
        int e10 = c2334c.e();
        for (int i10 = 0; i10 < e10; i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof n) {
                n nVar = (n) d10;
                if (nVar.f12353a.equals("TLEN")) {
                    return Z.a1(Long.parseLong((String) nVar.f12364d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int p(J j10, int i10) {
        if (j10.j() >= i10 + 4) {
            j10.b0(i10);
            int v10 = j10.v();
            if (v10 == 1483304551 || v10 == 1231971951) {
                return v10;
            }
        }
        if (j10.j() < 40) {
            return 0;
        }
        j10.b0(36);
        return j10.v() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean q(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static C1911c r(C2334C c2334c, long j10) {
        if (c2334c == null) {
            return null;
        }
        int e10 = c2334c.e();
        for (int i10 = 0; i10 < e10; i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof l) {
                return C1911c.a(j10, (l) d10, o(c2334c));
            }
        }
        return null;
    }

    private int w(InterfaceC1184q interfaceC1184q) {
        if (this.f15012q == 0) {
            interfaceC1184q.g();
            if (u(interfaceC1184q)) {
                return -1;
            }
            this.f14998c.b0(0);
            int v10 = this.f14998c.v();
            if (!q(v10, this.f15006k) || F.j(v10) == -1) {
                interfaceC1184q.l(1);
                this.f15006k = 0;
                return 0;
            }
            this.f14999d.a(v10);
            if (this.f15008m == -9223372036854775807L) {
                this.f15008m = this.f15013r.b(interfaceC1184q.getPosition());
                if (this.f14997b != -9223372036854775807L) {
                    this.f15008m += this.f14997b - this.f15013r.b(0L);
                }
            }
            this.f15012q = this.f14999d.f4328c;
            long position = interfaceC1184q.getPosition();
            F.a aVar = this.f14999d;
            this.f15011p = position + aVar.f4328c;
            InterfaceC1915g interfaceC1915g = this.f15013r;
            if (interfaceC1915g instanceof C1910b) {
                C1910b c1910b = (C1910b) interfaceC1915g;
                c1910b.c(i(this.f15009n + aVar.f4332g), this.f15011p);
                if (this.f15015t && c1910b.a(this.f15016u)) {
                    this.f15015t = false;
                    this.f15005j = this.f15004i;
                }
            }
        }
        int e10 = this.f15005j.e(interfaceC1184q, this.f15012q, true);
        if (e10 == -1) {
            return -1;
        }
        int i10 = this.f15012q - e10;
        this.f15012q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f15005j.g(i(this.f15009n), 1, this.f14999d.f4328c, 0, null);
        this.f15009n += this.f14999d.f4332g;
        this.f15012q = 0;
        return 0;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f15006k = 0;
        this.f15008m = -9223372036854775807L;
        this.f15009n = 0L;
        this.f15012q = 0;
        this.f15016u = j11;
        InterfaceC1915g interfaceC1915g = this.f15013r;
        if (!(interfaceC1915g instanceof C1910b) || ((C1910b) interfaceC1915g).a(j11)) {
            return;
        }
        this.f15015t = true;
        this.f15005j = this.f15002g;
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f15003h = rVar;
        O c10 = rVar.c(0, 1);
        this.f15004i = c10;
        this.f15005j = c10;
        this.f15003h.s();
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        e();
        int v10 = v(interfaceC1184q);
        if (v10 == -1 && (this.f15013r instanceof C1910b)) {
            long i11 = i(this.f15009n);
            if (this.f15013r.m() != i11) {
                ((C1910b) this.f15013r).f(i11);
                this.f15003h.q(this.f15013r);
                this.f15004i.d(this.f15013r.m());
            }
        }
        return v10;
    }

    public final InterfaceC1915g h(InterfaceC1184q interfaceC1184q) {
        long o10;
        long j10;
        long h10;
        InterfaceC1915g s10 = s(interfaceC1184q);
        C1911c r10 = r(this.f15007l, interfaceC1184q.getPosition());
        if (this.f15014s) {
            return new InterfaceC1915g.a();
        }
        if ((this.f14996a & 4) != 0) {
            if (r10 != null) {
                o10 = r10.m();
                h10 = r10.h();
            } else if (s10 != null) {
                o10 = s10.m();
                h10 = s10.h();
            } else {
                o10 = o(this.f15007l);
                j10 = -1;
                s10 = new C1910b(o10, interfaceC1184q.getPosition(), j10);
            }
            j10 = h10;
            s10 = new C1910b(o10, interfaceC1184q.getPosition(), j10);
        } else if (r10 != null) {
            s10 = r10;
        } else if (s10 == null) {
            s10 = null;
        }
        if (s10 != null && x(s10) && s10.m() != -9223372036854775807L && (s10.h() != -1 || interfaceC1184q.getLength() != -1)) {
            long d10 = s10.d() != -1 ? s10.d() : 0L;
            long h11 = s10.h() != -1 ? s10.h() : interfaceC1184q.getLength();
            s10 = new C1909a(h11, d10, com.google.common.primitives.f.n(Z.s1(h11 - d10, 8000000L, s10.m(), RoundingMode.HALF_UP)), -1, false);
        } else if (s10 == null || x(s10)) {
            s10 = n(interfaceC1184q, (this.f14996a & 2) != 0);
        }
        this.f15004i.d(s10.m());
        return s10;
    }

    public final long i(long j10) {
        return this.f15008m + ((j10 * 1000000) / this.f14999d.f4329d);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return y(interfaceC1184q, true);
    }

    public void l() {
        this.f15014s = true;
    }

    public final InterfaceC1915g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long a10 = iVar.a();
        if (a10 == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f15023c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - iVar.f15021a.f4328c;
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - iVar.f15021a.f4328c;
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new C1909a(j13, j10 + iVar.f15021a.f4328c, com.google.common.primitives.f.e(Z.s1(j16, 8000000L, a10, roundingMode)), com.google.common.primitives.f.e(com.google.common.math.e.b(j16, iVar.f15022b, roundingMode)), false);
    }

    public final InterfaceC1915g n(InterfaceC1184q interfaceC1184q, boolean z10) {
        interfaceC1184q.n(this.f14998c.f(), 0, 4);
        this.f14998c.b0(0);
        this.f14999d.a(this.f14998c.v());
        return new C1909a(interfaceC1184q.getLength(), interfaceC1184q.getPosition(), this.f14999d, z10);
    }

    public final InterfaceC1915g s(InterfaceC1184q interfaceC1184q) {
        int i10;
        int i11;
        J j10 = new J(this.f14999d.f4328c);
        interfaceC1184q.n(j10.f(), 0, this.f14999d.f4328c);
        F.a aVar = this.f14999d;
        int i12 = 21;
        if ((aVar.f4326a & 1) != 0) {
            if (aVar.f4330e != 1) {
                i12 = 36;
            }
        } else if (aVar.f4330e == 1) {
            i12 = 13;
        }
        int p10 = p(j10, i12);
        if (p10 != 1231971951) {
            if (p10 == 1447187017) {
                h a10 = h.a(interfaceC1184q.getLength(), interfaceC1184q.getPosition(), this.f14999d, j10);
                interfaceC1184q.l(this.f14999d.f4328c);
                return a10;
            }
            if (p10 != 1483304551) {
                interfaceC1184q.g();
                return null;
            }
        }
        i b10 = i.b(this.f14999d, j10);
        if (!this.f15000e.a() && (i10 = b10.f15024d) != -1 && (i11 = b10.f15025e) != -1) {
            B b11 = this.f15000e;
            b11.f4303a = i10;
            b11.f4304b = i11;
        }
        long position = interfaceC1184q.getPosition();
        if (interfaceC1184q.getLength() != -1 && b10.f15023c != -1 && interfaceC1184q.getLength() != b10.f15023c + position) {
            AbstractC4156x.g("Mp3Extractor", "Data size mismatch between stream (" + interfaceC1184q.getLength() + ") and Xing frame (" + (b10.f15023c + position) + "), using Xing value.");
        }
        interfaceC1184q.l(this.f14999d.f4328c);
        return p10 == 1483304551 ? j.a(b10, position) : m(position, b10, interfaceC1184q.getLength());
    }

    public final void t() {
        InterfaceC1915g interfaceC1915g = this.f15013r;
        if ((interfaceC1915g instanceof C1909a) && interfaceC1915g.i()) {
            long j10 = this.f15011p;
            if (j10 == -1 || j10 == this.f15013r.h()) {
                return;
            }
            this.f15013r = ((C1909a) this.f15013r).g(this.f15011p);
            ((r) AbstractC4134a.e(this.f15003h)).q(this.f15013r);
            ((O) AbstractC4134a.e(this.f15004i)).d(this.f15013r.m());
        }
    }

    public final boolean u(InterfaceC1184q interfaceC1184q) {
        InterfaceC1915g interfaceC1915g = this.f15013r;
        if (interfaceC1915g != null) {
            long h10 = interfaceC1915g.h();
            if (h10 != -1 && interfaceC1184q.i() > h10 - 4) {
                return true;
            }
        }
        try {
            return !interfaceC1184q.e(this.f14998c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int v(InterfaceC1184q interfaceC1184q) {
        if (this.f15006k == 0) {
            try {
                y(interfaceC1184q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f15013r == null) {
            InterfaceC1915g h10 = h(interfaceC1184q);
            this.f15013r = h10;
            this.f15003h.q(h10);
            a.b r02 = new a.b().W("audio/mpeg").y0(this.f14999d.f4327b).o0(4096).T(this.f14999d.f4330e).z0(this.f14999d.f4329d).d0(this.f15000e.f4303a).e0(this.f15000e.f4304b).r0((this.f14996a & 8) != 0 ? null : this.f15007l);
            if (this.f15013r.l() != -2147483647) {
                r02.S(this.f15013r.l());
            }
            this.f15005j.c(r02.P());
            this.f15010o = interfaceC1184q.getPosition();
        } else if (this.f15010o != 0) {
            long position = interfaceC1184q.getPosition();
            long j10 = this.f15010o;
            if (position < j10) {
                interfaceC1184q.l((int) (j10 - position));
            }
        }
        return w(interfaceC1184q);
    }

    public final boolean x(InterfaceC1915g interfaceC1915g) {
        return (interfaceC1915g.i() || (this.f14996a & 1) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        r11.l(r1 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        r10.f15006k = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        r11.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(InterfaceC1184q interfaceC1184q, boolean z10) {
        int i10;
        int i11;
        int j10;
        int i12 = z10 ? 32768 : PKIFailureInfo.unsupportedVersion;
        interfaceC1184q.g();
        if (interfaceC1184q.getPosition() == 0) {
            C2334C a10 = this.f15001f.a(interfaceC1184q, (this.f14996a & 8) == 0 ? null : f14995w);
            this.f15007l = a10;
            if (a10 != null) {
                this.f15000e.c(a10);
            }
            i10 = (int) interfaceC1184q.i();
            if (!z10) {
                interfaceC1184q.l(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (!u(interfaceC1184q)) {
                this.f14998c.b0(0);
                int v10 = this.f14998c.v();
                if ((i11 == 0 || q(v10, i11)) && (j10 = F.j(v10)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f14999d.a(v10);
                        i11 = v10;
                    }
                    interfaceC1184q.j(j10 - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        t();
                        throw new EOFException();
                    }
                    if (z10) {
                        interfaceC1184q.g();
                        interfaceC1184q.j(i10 + i15);
                    } else {
                        interfaceC1184q.l(1);
                    }
                    i13 = 0;
                    i14 = i15;
                    i11 = 0;
                }
            } else if (i13 <= 0) {
                t();
                throw new EOFException();
            }
        }
    }

    public C1914f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public C1914f(int i10, long j10) {
        this.f14996a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f14997b = j10;
        this.f14998c = new J(10);
        this.f14999d = new F.a();
        this.f15000e = new B();
        this.f15008m = -9223372036854775807L;
        this.f15001f = new D();
        C1181n c1181n = new C1181n();
        this.f15002g = c1181n;
        this.f15005j = c1181n;
        this.f15011p = -1L;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
