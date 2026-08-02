package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.joda.time.DateTimeZone;

/* loaded from: classes6.dex */
public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;

    /* renamed from: A, reason: collision with root package name */
    private transient org.joda.time.b f79053A;

    /* renamed from: B, reason: collision with root package name */
    private transient org.joda.time.b f79054B;

    /* renamed from: C, reason: collision with root package name */
    private transient org.joda.time.b f79055C;

    /* renamed from: D, reason: collision with root package name */
    private transient org.joda.time.b f79056D;

    /* renamed from: E, reason: collision with root package name */
    private transient org.joda.time.b f79057E;

    /* renamed from: F, reason: collision with root package name */
    private transient org.joda.time.b f79058F;

    /* renamed from: G, reason: collision with root package name */
    private transient org.joda.time.b f79059G;

    /* renamed from: H, reason: collision with root package name */
    private transient org.joda.time.b f79060H;

    /* renamed from: I, reason: collision with root package name */
    private transient org.joda.time.b f79061I;

    /* renamed from: J, reason: collision with root package name */
    private transient int f79062J;

    /* renamed from: a, reason: collision with root package name */
    private transient org.joda.time.d f79063a;

    /* renamed from: b, reason: collision with root package name */
    private transient org.joda.time.d f79064b;

    /* renamed from: c, reason: collision with root package name */
    private transient org.joda.time.d f79065c;

    /* renamed from: d, reason: collision with root package name */
    private transient org.joda.time.d f79066d;

    /* renamed from: e, reason: collision with root package name */
    private transient org.joda.time.d f79067e;

    /* renamed from: f, reason: collision with root package name */
    private transient org.joda.time.d f79068f;

    /* renamed from: g, reason: collision with root package name */
    private transient org.joda.time.d f79069g;

    /* renamed from: h, reason: collision with root package name */
    private transient org.joda.time.d f79070h;

    /* renamed from: i, reason: collision with root package name */
    private transient org.joda.time.d f79071i;
    private final org.joda.time.a iBase;
    private final Object iParam;

    /* renamed from: j, reason: collision with root package name */
    private transient org.joda.time.d f79072j;

    /* renamed from: k, reason: collision with root package name */
    private transient org.joda.time.d f79073k;

    /* renamed from: l, reason: collision with root package name */
    private transient org.joda.time.d f79074l;

    /* renamed from: m, reason: collision with root package name */
    private transient org.joda.time.b f79075m;

    /* renamed from: n, reason: collision with root package name */
    private transient org.joda.time.b f79076n;

    /* renamed from: o, reason: collision with root package name */
    private transient org.joda.time.b f79077o;

    /* renamed from: p, reason: collision with root package name */
    private transient org.joda.time.b f79078p;

    /* renamed from: q, reason: collision with root package name */
    private transient org.joda.time.b f79079q;

    /* renamed from: r, reason: collision with root package name */
    private transient org.joda.time.b f79080r;

    /* renamed from: s, reason: collision with root package name */
    private transient org.joda.time.b f79081s;

    /* renamed from: t, reason: collision with root package name */
    private transient org.joda.time.b f79082t;

    /* renamed from: u, reason: collision with root package name */
    private transient org.joda.time.b f79083u;

    /* renamed from: v, reason: collision with root package name */
    private transient org.joda.time.b f79084v;

    /* renamed from: w, reason: collision with root package name */
    private transient org.joda.time.b f79085w;

    /* renamed from: x, reason: collision with root package name */
    private transient org.joda.time.b f79086x;

    /* renamed from: y, reason: collision with root package name */
    private transient org.joda.time.b f79087y;

    /* renamed from: z, reason: collision with root package name */
    private transient org.joda.time.b f79088z;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        public org.joda.time.b f79089A;

        /* renamed from: B, reason: collision with root package name */
        public org.joda.time.b f79090B;

        /* renamed from: C, reason: collision with root package name */
        public org.joda.time.b f79091C;

        /* renamed from: D, reason: collision with root package name */
        public org.joda.time.b f79092D;

        /* renamed from: E, reason: collision with root package name */
        public org.joda.time.b f79093E;

        /* renamed from: F, reason: collision with root package name */
        public org.joda.time.b f79094F;

        /* renamed from: G, reason: collision with root package name */
        public org.joda.time.b f79095G;

        /* renamed from: H, reason: collision with root package name */
        public org.joda.time.b f79096H;

        /* renamed from: I, reason: collision with root package name */
        public org.joda.time.b f79097I;

        /* renamed from: a, reason: collision with root package name */
        public org.joda.time.d f79098a;

        /* renamed from: b, reason: collision with root package name */
        public org.joda.time.d f79099b;

        /* renamed from: c, reason: collision with root package name */
        public org.joda.time.d f79100c;

        /* renamed from: d, reason: collision with root package name */
        public org.joda.time.d f79101d;

        /* renamed from: e, reason: collision with root package name */
        public org.joda.time.d f79102e;

        /* renamed from: f, reason: collision with root package name */
        public org.joda.time.d f79103f;

        /* renamed from: g, reason: collision with root package name */
        public org.joda.time.d f79104g;

        /* renamed from: h, reason: collision with root package name */
        public org.joda.time.d f79105h;

        /* renamed from: i, reason: collision with root package name */
        public org.joda.time.d f79106i;

        /* renamed from: j, reason: collision with root package name */
        public org.joda.time.d f79107j;

        /* renamed from: k, reason: collision with root package name */
        public org.joda.time.d f79108k;

        /* renamed from: l, reason: collision with root package name */
        public org.joda.time.d f79109l;

        /* renamed from: m, reason: collision with root package name */
        public org.joda.time.b f79110m;

        /* renamed from: n, reason: collision with root package name */
        public org.joda.time.b f79111n;

        /* renamed from: o, reason: collision with root package name */
        public org.joda.time.b f79112o;

        /* renamed from: p, reason: collision with root package name */
        public org.joda.time.b f79113p;

        /* renamed from: q, reason: collision with root package name */
        public org.joda.time.b f79114q;

        /* renamed from: r, reason: collision with root package name */
        public org.joda.time.b f79115r;

        /* renamed from: s, reason: collision with root package name */
        public org.joda.time.b f79116s;

        /* renamed from: t, reason: collision with root package name */
        public org.joda.time.b f79117t;

        /* renamed from: u, reason: collision with root package name */
        public org.joda.time.b f79118u;

        /* renamed from: v, reason: collision with root package name */
        public org.joda.time.b f79119v;

        /* renamed from: w, reason: collision with root package name */
        public org.joda.time.b f79120w;

        /* renamed from: x, reason: collision with root package name */
        public org.joda.time.b f79121x;

        /* renamed from: y, reason: collision with root package name */
        public org.joda.time.b f79122y;

        /* renamed from: z, reason: collision with root package name */
        public org.joda.time.b f79123z;

        private static boolean b(org.joda.time.b bVar) {
            if (bVar == null) {
                return false;
            }
            return bVar.F();
        }

        private static boolean c(org.joda.time.d dVar) {
            if (dVar == null) {
                return false;
            }
            return dVar.i();
        }

        public final void a(org.joda.time.a aVar) {
            org.joda.time.d F11 = aVar.F();
            if (c(F11)) {
                this.f79098a = F11;
            }
            org.joda.time.d P11 = aVar.P();
            if (c(P11)) {
                this.f79099b = P11;
            }
            org.joda.time.d K11 = aVar.K();
            if (c(K11)) {
                this.f79100c = K11;
            }
            org.joda.time.d E11 = aVar.E();
            if (c(E11)) {
                this.f79101d = E11;
            }
            org.joda.time.d B11 = aVar.B();
            if (c(B11)) {
                this.f79102e = B11;
            }
            org.joda.time.d j11 = aVar.j();
            if (c(j11)) {
                this.f79103f = j11;
            }
            org.joda.time.d S11 = aVar.S();
            if (c(S11)) {
                this.f79104g = S11;
            }
            org.joda.time.d V11 = aVar.V();
            if (c(V11)) {
                this.f79105h = V11;
            }
            org.joda.time.d M11 = aVar.M();
            if (c(M11)) {
                this.f79106i = M11;
            }
            org.joda.time.d b02 = aVar.b0();
            if (c(b02)) {
                this.f79107j = b02;
            }
            org.joda.time.d b11 = aVar.b();
            if (c(b11)) {
                this.f79108k = b11;
            }
            org.joda.time.d m11 = aVar.m();
            if (c(m11)) {
                this.f79109l = m11;
            }
            org.joda.time.b H11 = aVar.H();
            if (b(H11)) {
                this.f79110m = H11;
            }
            org.joda.time.b G11 = aVar.G();
            if (b(G11)) {
                this.f79111n = G11;
            }
            org.joda.time.b O11 = aVar.O();
            if (b(O11)) {
                this.f79112o = O11;
            }
            org.joda.time.b N11 = aVar.N();
            if (b(N11)) {
                this.f79113p = N11;
            }
            org.joda.time.b J11 = aVar.J();
            if (b(J11)) {
                this.f79114q = J11;
            }
            org.joda.time.b I11 = aVar.I();
            if (b(I11)) {
                this.f79115r = I11;
            }
            org.joda.time.b C11 = aVar.C();
            if (b(C11)) {
                this.f79116s = C11;
            }
            org.joda.time.b e11 = aVar.e();
            if (b(e11)) {
                this.f79117t = e11;
            }
            org.joda.time.b D11 = aVar.D();
            if (b(D11)) {
                this.f79118u = D11;
            }
            org.joda.time.b f7 = aVar.f();
            if (b(f7)) {
                this.f79119v = f7;
            }
            org.joda.time.b A11 = aVar.A();
            if (b(A11)) {
                this.f79120w = A11;
            }
            org.joda.time.b h11 = aVar.h();
            if (b(h11)) {
                this.f79121x = h11;
            }
            org.joda.time.b g10 = aVar.g();
            if (b(g10)) {
                this.f79122y = g10;
            }
            org.joda.time.b i11 = aVar.i();
            if (b(i11)) {
                this.f79123z = i11;
            }
            org.joda.time.b R11 = aVar.R();
            if (b(R11)) {
                this.f79089A = R11;
            }
            org.joda.time.b T11 = aVar.T();
            if (b(T11)) {
                this.f79090B = T11;
            }
            org.joda.time.b U10 = aVar.U();
            if (b(U10)) {
                this.f79091C = U10;
            }
            org.joda.time.b L11 = aVar.L();
            if (b(L11)) {
                this.f79092D = L11;
            }
            org.joda.time.b Y11 = aVar.Y();
            if (b(Y11)) {
                this.f79093E = Y11;
            }
            org.joda.time.b a02 = aVar.a0();
            if (b(a02)) {
                this.f79094F = a02;
            }
            org.joda.time.b Z11 = aVar.Z();
            if (b(Z11)) {
                this.f79095G = Z11;
            }
            org.joda.time.b d11 = aVar.d();
            if (b(d11)) {
                this.f79096H = d11;
            }
            org.joda.time.b l11 = aVar.l();
            if (b(l11)) {
                this.f79097I = l11;
            }
        }
    }

    protected AssembledChronology(org.joda.time.a aVar, Serializable serializable) {
        this.iBase = aVar;
        this.iParam = serializable;
        f0();
    }

    private void f0() {
        a aVar = new a();
        org.joda.time.a aVar2 = this.iBase;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        c0(aVar);
        org.joda.time.d dVar = aVar.f79098a;
        if (dVar == null) {
            dVar = super.F();
        }
        this.f79063a = dVar;
        org.joda.time.d dVar2 = aVar.f79099b;
        if (dVar2 == null) {
            dVar2 = super.P();
        }
        this.f79064b = dVar2;
        org.joda.time.d dVar3 = aVar.f79100c;
        if (dVar3 == null) {
            dVar3 = super.K();
        }
        this.f79065c = dVar3;
        org.joda.time.d dVar4 = aVar.f79101d;
        if (dVar4 == null) {
            dVar4 = super.E();
        }
        this.f79066d = dVar4;
        org.joda.time.d dVar5 = aVar.f79102e;
        if (dVar5 == null) {
            dVar5 = super.B();
        }
        this.f79067e = dVar5;
        org.joda.time.d dVar6 = aVar.f79103f;
        if (dVar6 == null) {
            dVar6 = super.j();
        }
        this.f79068f = dVar6;
        org.joda.time.d dVar7 = aVar.f79104g;
        if (dVar7 == null) {
            dVar7 = super.S();
        }
        this.f79069g = dVar7;
        org.joda.time.d dVar8 = aVar.f79105h;
        if (dVar8 == null) {
            dVar8 = super.V();
        }
        this.f79070h = dVar8;
        org.joda.time.d dVar9 = aVar.f79106i;
        if (dVar9 == null) {
            dVar9 = super.M();
        }
        this.f79071i = dVar9;
        org.joda.time.d dVar10 = aVar.f79107j;
        if (dVar10 == null) {
            dVar10 = super.b0();
        }
        this.f79072j = dVar10;
        org.joda.time.d dVar11 = aVar.f79108k;
        if (dVar11 == null) {
            dVar11 = super.b();
        }
        this.f79073k = dVar11;
        org.joda.time.d dVar12 = aVar.f79109l;
        if (dVar12 == null) {
            dVar12 = super.m();
        }
        this.f79074l = dVar12;
        org.joda.time.b bVar = aVar.f79110m;
        if (bVar == null) {
            bVar = super.H();
        }
        this.f79075m = bVar;
        org.joda.time.b bVar2 = aVar.f79111n;
        if (bVar2 == null) {
            bVar2 = super.G();
        }
        this.f79076n = bVar2;
        org.joda.time.b bVar3 = aVar.f79112o;
        if (bVar3 == null) {
            bVar3 = super.O();
        }
        this.f79077o = bVar3;
        org.joda.time.b bVar4 = aVar.f79113p;
        if (bVar4 == null) {
            bVar4 = super.N();
        }
        this.f79078p = bVar4;
        org.joda.time.b bVar5 = aVar.f79114q;
        if (bVar5 == null) {
            bVar5 = super.J();
        }
        this.f79079q = bVar5;
        org.joda.time.b bVar6 = aVar.f79115r;
        if (bVar6 == null) {
            bVar6 = super.I();
        }
        this.f79080r = bVar6;
        org.joda.time.b bVar7 = aVar.f79116s;
        if (bVar7 == null) {
            bVar7 = super.C();
        }
        this.f79081s = bVar7;
        org.joda.time.b bVar8 = aVar.f79117t;
        if (bVar8 == null) {
            bVar8 = super.e();
        }
        this.f79082t = bVar8;
        org.joda.time.b bVar9 = aVar.f79118u;
        if (bVar9 == null) {
            bVar9 = super.D();
        }
        this.f79083u = bVar9;
        org.joda.time.b bVar10 = aVar.f79119v;
        if (bVar10 == null) {
            bVar10 = super.f();
        }
        this.f79084v = bVar10;
        org.joda.time.b bVar11 = aVar.f79120w;
        if (bVar11 == null) {
            bVar11 = super.A();
        }
        this.f79085w = bVar11;
        org.joda.time.b bVar12 = aVar.f79121x;
        if (bVar12 == null) {
            bVar12 = super.h();
        }
        this.f79086x = bVar12;
        org.joda.time.b bVar13 = aVar.f79122y;
        if (bVar13 == null) {
            bVar13 = super.g();
        }
        this.f79087y = bVar13;
        org.joda.time.b bVar14 = aVar.f79123z;
        if (bVar14 == null) {
            bVar14 = super.i();
        }
        this.f79088z = bVar14;
        org.joda.time.b bVar15 = aVar.f79089A;
        if (bVar15 == null) {
            bVar15 = super.R();
        }
        this.f79053A = bVar15;
        org.joda.time.b bVar16 = aVar.f79090B;
        if (bVar16 == null) {
            bVar16 = super.T();
        }
        this.f79054B = bVar16;
        org.joda.time.b bVar17 = aVar.f79091C;
        if (bVar17 == null) {
            bVar17 = super.U();
        }
        this.f79055C = bVar17;
        org.joda.time.b bVar18 = aVar.f79092D;
        if (bVar18 == null) {
            bVar18 = super.L();
        }
        this.f79056D = bVar18;
        org.joda.time.b bVar19 = aVar.f79093E;
        if (bVar19 == null) {
            bVar19 = super.Y();
        }
        this.f79057E = bVar19;
        org.joda.time.b bVar20 = aVar.f79094F;
        if (bVar20 == null) {
            bVar20 = super.a0();
        }
        this.f79058F = bVar20;
        org.joda.time.b bVar21 = aVar.f79095G;
        if (bVar21 == null) {
            bVar21 = super.Z();
        }
        this.f79059G = bVar21;
        org.joda.time.b bVar22 = aVar.f79096H;
        if (bVar22 == null) {
            bVar22 = super.d();
        }
        this.f79060H = bVar22;
        org.joda.time.b bVar23 = aVar.f79097I;
        if (bVar23 == null) {
            bVar23 = super.l();
        }
        this.f79061I = bVar23;
        org.joda.time.a aVar3 = this.iBase;
        int i11 = 0;
        if (aVar3 != null) {
            int i12 = ((this.f79081s == aVar3.C() && this.f79079q == this.iBase.J() && this.f79077o == this.iBase.O() && this.f79075m == this.iBase.H()) ? 1 : 0) | (this.f79076n == this.iBase.G() ? 2 : 0);
            if (this.f79057E == this.iBase.Y() && this.f79056D == this.iBase.L() && this.f79087y == this.iBase.g()) {
                i11 = 4;
            }
            i11 |= i12;
        }
        this.f79062J = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        f0();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b A() {
        return this.f79085w;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d B() {
        return this.f79067e;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b C() {
        return this.f79081s;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b D() {
        return this.f79083u;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d E() {
        return this.f79066d;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d F() {
        return this.f79063a;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b G() {
        return this.f79076n;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b H() {
        return this.f79075m;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b I() {
        return this.f79080r;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b J() {
        return this.f79079q;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d K() {
        return this.f79065c;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b L() {
        return this.f79056D;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d M() {
        return this.f79071i;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b N() {
        return this.f79078p;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b O() {
        return this.f79077o;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d P() {
        return this.f79064b;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b R() {
        return this.f79053A;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d S() {
        return this.f79069g;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b T() {
        return this.f79054B;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b U() {
        return this.f79055C;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d V() {
        return this.f79070h;
    }

    @Override // org.joda.time.a
    public org.joda.time.a W() {
        return d0();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b Y() {
        return this.f79057E;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b Z() {
        return this.f79059G;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b a0() {
        return this.f79058F;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d b() {
        return this.f79073k;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d b0() {
        return this.f79072j;
    }

    protected abstract void c0(a aVar);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b d() {
        return this.f79060H;
    }

    protected final org.joda.time.a d0() {
        return this.iBase;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b e() {
        return this.f79082t;
    }

    protected final Object e0() {
        return this.iParam;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b f() {
        return this.f79084v;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b g() {
        return this.f79087y;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b h() {
        return this.f79086x;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b i() {
        return this.f79088z;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d j() {
        return this.f79068f;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.b l() {
        return this.f79061I;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final org.joda.time.d m() {
        return this.f79074l;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public long s(int i11) throws IllegalArgumentException {
        org.joda.time.a aVar = this.iBase;
        return (aVar == null || (this.f79062J & 5) != 5) ? super.s(i11) : aVar.s(i11);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public long u(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        org.joda.time.a aVar = this.iBase;
        return (aVar == null || (this.f79062J & 6) != 6) ? super.u(i11, i12, i13, i14) : aVar.u(i11, i12, i13, i14);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.a
    public long v(long j11) throws IllegalArgumentException {
        org.joda.time.a aVar = this.iBase;
        return (aVar == null || (this.f79062J & 1) != 1) ? super.v(j11) : aVar.v(j11);
    }

    @Override // org.joda.time.a
    public DateTimeZone y() {
        org.joda.time.a aVar = this.iBase;
        if (aVar != null) {
            return aVar.y();
        }
        return null;
    }
}
