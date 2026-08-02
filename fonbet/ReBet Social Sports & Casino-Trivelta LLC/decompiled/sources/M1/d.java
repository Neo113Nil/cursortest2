package M1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import H1.r;
import H1.u;
import H1.v;
import H1.w;
import H1.x;
import H1.y;
import b1.C2334C;
import e1.AbstractC4134a;
import e1.J;
import e1.Z;

/* loaded from: classes.dex */
public final class d implements InterfaceC1183p {

    /* renamed from: n, reason: collision with root package name */
    public static final u f7402n = new u() { // from class: M1.c
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return d.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final J f7403a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7404b;

    /* renamed from: c, reason: collision with root package name */
    public final v.a f7405c;

    /* renamed from: d, reason: collision with root package name */
    public r f7406d;

    /* renamed from: e, reason: collision with root package name */
    public O f7407e;

    /* renamed from: f, reason: collision with root package name */
    public int f7408f;

    /* renamed from: g, reason: collision with root package name */
    public C2334C f7409g;

    /* renamed from: h, reason: collision with root package name */
    public y f7410h;

    /* renamed from: i, reason: collision with root package name */
    public int f7411i;

    /* renamed from: j, reason: collision with root package name */
    public int f7412j;

    /* renamed from: k, reason: collision with root package name */
    public b f7413k;

    /* renamed from: l, reason: collision with root package name */
    public int f7414l;

    /* renamed from: m, reason: collision with root package name */
    public long f7415m;
    private final byte[] streamMarkerAndInfoBlock;

    public d() {
        this(0);
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new d()};
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f7408f = 0;
        } else {
            b bVar = this.f7413k;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f7415m = j11 != 0 ? -1L : 0L;
        this.f7414l = 0;
        this.f7403a.X(0);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f7406d = rVar;
        this.f7407e = rVar.c(0, 1);
        rVar.s();
    }

    public final long d(J j10, boolean z10) {
        boolean z11;
        AbstractC4134a.e(this.f7410h);
        int g10 = j10.g();
        while (g10 <= j10.j() - 16) {
            j10.b0(g10);
            if (v.d(j10, this.f7410h, this.f7412j, this.f7405c)) {
                j10.b0(g10);
                return this.f7405c.f4479a;
            }
            g10++;
        }
        if (!z10) {
            j10.b0(g10);
            return -1L;
        }
        while (g10 <= j10.j() - this.f7411i) {
            j10.b0(g10);
            try {
                z11 = v.d(j10, this.f7410h, this.f7412j, this.f7405c);
            } catch (IndexOutOfBoundsException unused) {
                z11 = false;
            }
            if (j10.g() <= j10.j() ? z11 : false) {
                j10.b0(g10);
                return this.f7405c.f4479a;
            }
            g10++;
        }
        j10.b0(j10.j());
        return -1L;
    }

    public final void e(InterfaceC1184q interfaceC1184q) {
        this.f7412j = w.b(interfaceC1184q);
        ((r) Z.i(this.f7406d)).q(h(interfaceC1184q.getPosition(), interfaceC1184q.getLength()));
        this.f7408f = 5;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        int i11 = this.f7408f;
        if (i11 == 0) {
            n(interfaceC1184q);
            return 0;
        }
        if (i11 == 1) {
            i(interfaceC1184q);
            return 0;
        }
        if (i11 == 2) {
            p(interfaceC1184q);
            return 0;
        }
        if (i11 == 3) {
            o(interfaceC1184q);
            return 0;
        }
        if (i11 == 4) {
            e(interfaceC1184q);
            return 0;
        }
        if (i11 == 5) {
            return m(interfaceC1184q, i10);
        }
        throw new IllegalStateException();
    }

    public final H1.J h(long j10, long j11) {
        AbstractC4134a.e(this.f7410h);
        y yVar = this.f7410h;
        y.a aVar = yVar.f4493k;
        if (aVar != null && aVar.pointSampleNumbers.length > 0) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f4492j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f7412j, j10, j11);
        this.f7413k = bVar;
        return bVar.b();
    }

    public final void i(InterfaceC1184q interfaceC1184q) {
        byte[] bArr = this.streamMarkerAndInfoBlock;
        interfaceC1184q.n(bArr, 0, bArr.length);
        interfaceC1184q.g();
        this.f7408f = 2;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        w.c(interfaceC1184q, false);
        return w.a(interfaceC1184q);
    }

    public final void l() {
        ((O) Z.i(this.f7407e)).g((this.f7415m * 1000000) / ((y) Z.i(this.f7410h)).f4487e, 1, this.f7414l, 0, null);
    }

    public final int m(InterfaceC1184q interfaceC1184q, I i10) {
        boolean z10;
        AbstractC4134a.e(this.f7407e);
        AbstractC4134a.e(this.f7410h);
        b bVar = this.f7413k;
        if (bVar != null && bVar.d()) {
            return this.f7413k.c(interfaceC1184q, i10);
        }
        if (this.f7415m == -1) {
            this.f7415m = v.i(interfaceC1184q, this.f7410h);
            return 0;
        }
        int j10 = this.f7403a.j();
        if (j10 < 32768) {
            int read = interfaceC1184q.read(this.f7403a.f(), j10, 32768 - j10);
            z10 = read == -1;
            if (!z10) {
                this.f7403a.a0(j10 + read);
            } else if (this.f7403a.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int g10 = this.f7403a.g();
        int i11 = this.f7414l;
        int i12 = this.f7411i;
        if (i11 < i12) {
            e1.J j11 = this.f7403a;
            j11.c0(Math.min(i12 - i11, j11.a()));
        }
        long d10 = d(this.f7403a, z10);
        int g11 = this.f7403a.g() - g10;
        this.f7403a.b0(g10);
        this.f7407e.a(this.f7403a, g11);
        this.f7414l += g11;
        if (d10 != -1) {
            l();
            this.f7414l = 0;
            this.f7415m = d10;
        }
        int length = this.f7403a.f().length - this.f7403a.j();
        if (this.f7403a.a() < 16 && length < 16) {
            int a10 = this.f7403a.a();
            System.arraycopy(this.f7403a.f(), this.f7403a.g(), this.f7403a.f(), 0, a10);
            this.f7403a.b0(0);
            this.f7403a.a0(a10);
        }
        return 0;
    }

    public final void n(InterfaceC1184q interfaceC1184q) {
        this.f7409g = w.d(interfaceC1184q, !this.f7404b);
        this.f7408f = 1;
    }

    public final void o(InterfaceC1184q interfaceC1184q) {
        w.a aVar = new w.a(this.f7410h);
        boolean z10 = false;
        while (!z10) {
            z10 = w.e(interfaceC1184q, aVar);
            this.f7410h = (y) Z.i(aVar.f4480a);
        }
        AbstractC4134a.e(this.f7410h);
        this.f7411i = Math.max(this.f7410h.f4485c, 6);
        ((O) Z.i(this.f7407e)).c(this.f7410h.g(this.streamMarkerAndInfoBlock, this.f7409g).b().W("audio/flac").P());
        ((O) Z.i(this.f7407e)).d(this.f7410h.f());
        this.f7408f = 4;
    }

    public final void p(InterfaceC1184q interfaceC1184q) {
        w.i(interfaceC1184q);
        this.f7408f = 3;
    }

    public d(int i10) {
        this.streamMarkerAndInfoBlock = new byte[42];
        this.f7403a = new e1.J(new byte[32768], 0);
        this.f7404b = (i10 & 1) != 0;
        this.f7405c = new v.a();
        this.f7408f = 0;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
