package N1;

import H1.E;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.r;
import H1.u;
import e1.AbstractC4134a;
import e1.J;

/* loaded from: classes.dex */
public final class c implements InterfaceC1183p {

    /* renamed from: q, reason: collision with root package name */
    public static final u f7857q = new u() { // from class: N1.b
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return c.b();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public r f7863f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7865h;

    /* renamed from: i, reason: collision with root package name */
    public long f7866i;

    /* renamed from: j, reason: collision with root package name */
    public int f7867j;

    /* renamed from: k, reason: collision with root package name */
    public int f7868k;

    /* renamed from: l, reason: collision with root package name */
    public int f7869l;

    /* renamed from: m, reason: collision with root package name */
    public long f7870m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7871n;

    /* renamed from: o, reason: collision with root package name */
    public a f7872o;

    /* renamed from: p, reason: collision with root package name */
    public f f7873p;

    /* renamed from: a, reason: collision with root package name */
    public final J f7858a = new J(4);

    /* renamed from: b, reason: collision with root package name */
    public final J f7859b = new J(9);

    /* renamed from: c, reason: collision with root package name */
    public final J f7860c = new J(11);

    /* renamed from: d, reason: collision with root package name */
    public final J f7861d = new J();

    /* renamed from: e, reason: collision with root package name */
    public final d f7862e = new d();

    /* renamed from: g, reason: collision with root package name */
    public int f7864g = 1;

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new c()};
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f7864g = 1;
            this.f7865h = false;
        } else {
            this.f7864g = 3;
        }
        this.f7867j = 0;
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f7863f = rVar;
    }

    public final void d() {
        if (this.f7871n) {
            return;
        }
        this.f7863f.q(new J.b(-9223372036854775807L));
        this.f7871n = true;
    }

    public final long e() {
        if (this.f7865h) {
            return this.f7866i + this.f7870m;
        }
        if (this.f7862e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f7870m;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        AbstractC4134a.i(this.f7863f);
        while (true) {
            int i11 = this.f7864g;
            if (i11 != 1) {
                if (i11 == 2) {
                    n(interfaceC1184q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(interfaceC1184q)) {
                        return 0;
                    }
                } else if (!m(interfaceC1184q)) {
                    return -1;
                }
            } else if (!i(interfaceC1184q)) {
                return -1;
            }
        }
    }

    public final e1.J h(InterfaceC1184q interfaceC1184q) {
        if (this.f7869l > this.f7861d.b()) {
            e1.J j10 = this.f7861d;
            j10.Z(new byte[Math.max(j10.b() * 2, this.f7869l)], 0);
        } else {
            this.f7861d.b0(0);
        }
        this.f7861d.a0(this.f7869l);
        interfaceC1184q.readFully(this.f7861d.f(), 0, this.f7869l);
        return this.f7861d;
    }

    public final boolean i(InterfaceC1184q interfaceC1184q) {
        if (!interfaceC1184q.h(this.f7859b.f(), 0, 9, true)) {
            return false;
        }
        this.f7859b.b0(0);
        this.f7859b.c0(4);
        int M10 = this.f7859b.M();
        boolean z10 = (M10 & 4) != 0;
        boolean z11 = (M10 & 1) != 0;
        if (z10 && this.f7872o == null) {
            this.f7872o = new a(this.f7863f.c(8, 1));
        }
        if (z11 && this.f7873p == null) {
            this.f7873p = new f(this.f7863f.c(9, 2));
        }
        this.f7863f.s();
        this.f7867j = this.f7859b.v() - 5;
        this.f7864g = 2;
        return true;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.n(this.f7858a.f(), 0, 3);
        this.f7858a.b0(0);
        if (this.f7858a.P() != 4607062) {
            return false;
        }
        interfaceC1184q.n(this.f7858a.f(), 0, 2);
        this.f7858a.b0(0);
        if ((this.f7858a.U() & 250) != 0) {
            return false;
        }
        interfaceC1184q.n(this.f7858a.f(), 0, 4);
        this.f7858a.b0(0);
        int v10 = this.f7858a.v();
        interfaceC1184q.g();
        interfaceC1184q.j(v10);
        interfaceC1184q.n(this.f7858a.f(), 0, 4);
        this.f7858a.b0(0);
        return this.f7858a.v() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(InterfaceC1184q interfaceC1184q) {
        boolean z10;
        boolean z11;
        long e10 = e();
        int i10 = this.f7868k;
        if (i10 == 8 && this.f7872o != null) {
            d();
            z10 = this.f7872o.a(h(interfaceC1184q), e10);
        } else if (i10 == 9 && this.f7873p != null) {
            d();
            z10 = this.f7873p.a(h(interfaceC1184q), e10);
        } else {
            if (i10 != 18 || this.f7871n) {
                interfaceC1184q.l(this.f7869l);
                z10 = false;
                z11 = false;
                if (!this.f7865h && z10) {
                    this.f7865h = true;
                    this.f7866i = this.f7862e.d() != -9223372036854775807L ? -this.f7870m : 0L;
                }
                this.f7867j = 4;
                this.f7864g = 2;
                return z11;
            }
            z10 = this.f7862e.a(h(interfaceC1184q), e10);
            long d10 = this.f7862e.d();
            if (d10 != -9223372036854775807L) {
                this.f7863f.q(new E(this.f7862e.e(), this.f7862e.f(), d10));
                this.f7871n = true;
            }
        }
        z11 = true;
        if (!this.f7865h) {
            this.f7865h = true;
            this.f7866i = this.f7862e.d() != -9223372036854775807L ? -this.f7870m : 0L;
        }
        this.f7867j = 4;
        this.f7864g = 2;
        return z11;
    }

    public final boolean m(InterfaceC1184q interfaceC1184q) {
        if (!interfaceC1184q.h(this.f7860c.f(), 0, 11, true)) {
            return false;
        }
        this.f7860c.b0(0);
        this.f7868k = this.f7860c.M();
        this.f7869l = this.f7860c.P();
        this.f7870m = this.f7860c.P();
        this.f7870m = ((this.f7860c.M() << 24) | this.f7870m) * 1000;
        this.f7860c.c0(3);
        this.f7864g = 4;
        return true;
    }

    public final void n(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.l(this.f7867j);
        this.f7867j = 0;
        this.f7864g = 3;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
