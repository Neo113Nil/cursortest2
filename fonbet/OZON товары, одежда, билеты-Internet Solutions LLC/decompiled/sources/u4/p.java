package u4;

import Bl0.k0;
import N3.M;
import j3.C7267i;
import j3.C7272n;
import java.util.Collections;
import m3.C8050C;
import m3.C8065g;
import m3.N;
import n3.C8434g;
import u4.J;

/* loaded from: classes8.dex */
public final class p implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final E f100167a;

    /* renamed from: b, reason: collision with root package name */
    private String f100168b;

    /* renamed from: c, reason: collision with root package name */
    private M f100169c;

    /* renamed from: d, reason: collision with root package name */
    private a f100170d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f100171e;

    /* renamed from: l, reason: collision with root package name */
    private long f100178l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f100172f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final v f100173g = new v(32);

    /* renamed from: h, reason: collision with root package name */
    private final v f100174h = new v(33);

    /* renamed from: i, reason: collision with root package name */
    private final v f100175i = new v(34);

    /* renamed from: j, reason: collision with root package name */
    private final v f100176j = new v(39);

    /* renamed from: k, reason: collision with root package name */
    private final v f100177k = new v(40);

    /* renamed from: m, reason: collision with root package name */
    private long f100179m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final C8050C f100180n = new C8050C();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final M f100181a;

        /* renamed from: b, reason: collision with root package name */
        private long f100182b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f100183c;

        /* renamed from: d, reason: collision with root package name */
        private int f100184d;

        /* renamed from: e, reason: collision with root package name */
        private long f100185e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f100186f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f100187g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f100188h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f100189i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f100190j;

        /* renamed from: k, reason: collision with root package name */
        private long f100191k;

        /* renamed from: l, reason: collision with root package name */
        private long f100192l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f100193m;

        public a(M m11) {
            this.f100181a = m11;
        }

        private void b(int i11) {
            long j11 = this.f100192l;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f100182b;
                long j13 = this.f100191k;
                if (j12 == j13) {
                    return;
                }
                int i12 = (int) (j12 - j13);
                this.f100181a.b(j11, this.f100193m ? 1 : 0, i12, i11, null);
            }
        }

        public final void a(long j11, int i11, boolean z11) {
            if (this.f100190j && this.f100187g) {
                this.f100193m = this.f100183c;
                this.f100190j = false;
            } else if (this.f100188h || this.f100187g) {
                if (z11 && this.f100189i) {
                    b(i11 + ((int) (j11 - this.f100182b)));
                }
                this.f100191k = this.f100182b;
                this.f100192l = this.f100185e;
                this.f100193m = this.f100183c;
                this.f100189i = true;
            }
        }

        public final void c(int i11, int i12, byte[] bArr) {
            if (this.f100186f) {
                int i13 = this.f100184d;
                int i14 = (i11 + 2) - i13;
                if (i14 >= i12) {
                    this.f100184d = (i12 - i11) + i13;
                } else {
                    this.f100187g = (bArr[i14] & 128) != 0;
                    this.f100186f = false;
                }
            }
        }

        public final void d() {
            this.f100186f = false;
            this.f100187g = false;
            this.f100188h = false;
            this.f100189i = false;
            this.f100190j = false;
        }

        public final void e(int i11, int i12, long j11, long j12, boolean z11) {
            this.f100187g = false;
            this.f100188h = false;
            this.f100185e = j12;
            this.f100184d = 0;
            this.f100182b = j11;
            if (i12 >= 32 && i12 != 40) {
                if (this.f100189i && !this.f100190j) {
                    if (z11) {
                        b(i11);
                    }
                    this.f100189i = false;
                }
                if ((32 <= i12 && i12 <= 35) || i12 == 39) {
                    this.f100188h = !this.f100190j;
                    this.f100190j = true;
                }
            }
            boolean z12 = i12 >= 16 && i12 <= 21;
            this.f100183c = z12;
            this.f100186f = z12 || i12 <= 9;
        }
    }

    public p(E e11) {
        this.f100167a = e11;
    }

    private void a(int i11, int i12, long j11, long j12) {
        this.f100170d.a(j11, i11, this.f100171e);
        boolean z11 = this.f100171e;
        E e11 = this.f100167a;
        if (!z11) {
            v vVar = this.f100173g;
            vVar.b(i12);
            v vVar2 = this.f100174h;
            vVar2.b(i12);
            v vVar3 = this.f100175i;
            vVar3.b(i12);
            if (vVar.c() && vVar2.c() && vVar3.c()) {
                String str = this.f100168b;
                int i13 = vVar.f100268e;
                byte[] bArr = new byte[vVar2.f100268e + i13 + vVar3.f100268e];
                System.arraycopy(vVar.f100267d, 0, bArr, 0, i13);
                System.arraycopy(vVar2.f100267d, 0, bArr, vVar.f100268e, vVar2.f100268e);
                System.arraycopy(vVar3.f100267d, 0, bArr, vVar.f100268e + vVar2.f100268e, vVar3.f100268e);
                C8434g.h i14 = C8434g.i(vVar2.f100267d, 3, vVar2.f100268e, null);
                C8434g.c cVar = i14.f76411b;
                String a11 = cVar != null ? C8065g.a(cVar.f76394a, cVar.f76395b, cVar.f76396c, cVar.f76397d, cVar.f76398e, cVar.f76399f) : null;
                C7272n.a aVar = new C7272n.a();
                aVar.j0(str);
                aVar.W("video/mp2t");
                aVar.y0("video/hevc");
                aVar.U(a11);
                aVar.F0(i14.f76414e);
                aVar.h0(i14.f76415f);
                aVar.b0(i14.f76416g);
                aVar.a0(i14.f76417h);
                C7267i.a aVar2 = new C7267i.a();
                aVar2.d(i14.f76420k);
                aVar2.c(i14.f76421l);
                aVar2.e(i14.f76422m);
                aVar2.g(i14.f76412c + 8);
                aVar2.b(i14.f76413d + 8);
                aVar.V(aVar2.a());
                aVar.u0(i14.f76418i);
                aVar.p0(i14.f76419j);
                aVar.q0(i14.f76410a + 1);
                aVar.k0(Collections.singletonList(bArr));
                C7272n P11 = aVar.P();
                this.f100169c.a(P11);
                int i15 = P11.f69129q;
                k0.m(i15 != -1);
                e11.f(i15);
                this.f100171e = true;
            }
        }
        v vVar4 = this.f100176j;
        boolean b11 = vVar4.b(i12);
        C8050C c8050c = this.f100180n;
        if (b11) {
            c8050c.P(C8434g.m(vVar4.f100268e, vVar4.f100267d), vVar4.f100267d);
            c8050c.S(5);
            e11.c(j12, c8050c);
        }
        v vVar5 = this.f100177k;
        if (vVar5.b(i12)) {
            c8050c.P(C8434g.m(vVar5.f100268e, vVar5.f100267d), vVar5.f100267d);
            c8050c.S(5);
            e11.c(j12, c8050c);
        }
    }

    private void g(int i11, int i12, byte[] bArr) {
        this.f100170d.c(i11, i12, bArr);
        if (!this.f100171e) {
            this.f100173g.a(i11, i12, bArr);
            this.f100174h.a(i11, i12, bArr);
            this.f100175i.a(i11, i12, bArr);
        }
        this.f100176j.a(i11, i12, bArr);
        this.f100177k.a(i11, i12, bArr);
    }

    private void h(int i11, int i12, long j11, long j12) {
        this.f100170d.e(i11, i12, j11, j12, this.f100171e);
        if (!this.f100171e) {
            this.f100173g.e(i12);
            this.f100174h.e(i12);
            this.f100175i.e(i12);
        }
        this.f100176j.e(i12);
        this.f100177k.e(i12);
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100178l = 0L;
        this.f100179m = -9223372036854775807L;
        C8434g.a(this.f100172f);
        this.f100173g.d();
        this.f100174h.d();
        this.f100175i.d();
        this.f100176j.d();
        this.f100177k.d();
        this.f100167a.b();
        a aVar = this.f100170d;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        int i11;
        G10.a.i(this.f100169c);
        int i12 = N.f74289a;
        while (c8050c.a() > 0) {
            int f7 = c8050c.f();
            int i13 = c8050c.i();
            byte[] e11 = c8050c.e();
            this.f100178l += c8050c.a();
            this.f100169c.e(c8050c.a(), c8050c);
            while (f7 < i13) {
                int b11 = C8434g.b(e11, f7, i13, this.f100172f);
                if (b11 == i13) {
                    g(f7, i13, e11);
                    return;
                }
                int i14 = (e11[b11 + 3] & 126) >> 1;
                if (b11 <= 0 || e11[b11 - 1] != 0) {
                    i11 = 3;
                } else {
                    b11--;
                    i11 = 4;
                }
                int i15 = b11;
                int i16 = i15 - f7;
                if (i16 > 0) {
                    g(f7, i15, e11);
                }
                int i17 = i13 - i15;
                long j11 = this.f100178l - i17;
                a(i17, i16 < 0 ? -i16 : 0, j11, this.f100179m);
                h(i17, i14, j11, this.f100179m);
                f7 = i15 + i11;
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100179m = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100168b = dVar.b();
        M track = rVar.track(dVar.c(), 2);
        this.f100169c = track;
        this.f100170d = new a(track);
        this.f100167a.d(rVar, dVar);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
        G10.a.i(this.f100169c);
        int i11 = N.f74289a;
        if (z11) {
            this.f100167a.e();
            a(0, 0, this.f100178l, this.f100179m);
            h(0, 48, this.f100178l, this.f100179m);
        }
    }
}
