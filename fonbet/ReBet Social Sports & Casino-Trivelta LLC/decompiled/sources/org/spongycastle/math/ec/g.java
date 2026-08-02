package org.spongycastle.math.ec;

import com.plaid.internal.EnumC3631g;
import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.math.ec.e;

/* loaded from: classes5.dex */
public abstract class g {
    protected static e[] EMPTY_ZS = new e[0];

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.math.ec.d f62848a;

    /* renamed from: b, reason: collision with root package name */
    public e f62849b;

    /* renamed from: c, reason: collision with root package name */
    public e f62850c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62851d;

    /* renamed from: e, reason: collision with root package name */
    public Hashtable f62852e;
    protected e[] zs;

    public static abstract class a extends g {
        public a(org.spongycastle.math.ec.d dVar, e eVar, e eVar2) {
            super(dVar, eVar, eVar2);
        }

        @Override // org.spongycastle.math.ec.g
        public g A(e eVar) {
            if (r()) {
                return this;
            }
            int i10 = i();
            if (i10 != 5 && i10 != 6) {
                return super.A(eVar);
            }
            e l10 = l();
            return h().i(l10, m().a(l10).j(eVar).a(l10), n(), this.f62851d);
        }

        public a F(int i10) {
            if (r()) {
                return this;
            }
            org.spongycastle.math.ec.d h10 = h();
            int q10 = h10.q();
            e eVar = this.f62849b;
            if (q10 != 0) {
                if (q10 != 1) {
                    if (q10 != 5) {
                        if (q10 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (a) h10.i(eVar.q(i10), this.f62850c.q(i10), new e[]{this.zs[0].q(i10)}, this.f62851d);
            }
            return (a) h10.h(eVar.q(i10), this.f62850c.q(i10), this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public boolean y() {
            e l10;
            e p10;
            org.spongycastle.math.ec.d h10 = h();
            e eVar = this.f62849b;
            e n10 = h10.n();
            e o10 = h10.o();
            int q10 = h10.q();
            if (q10 != 6) {
                e eVar2 = this.f62850c;
                e j10 = eVar2.a(eVar).j(eVar2);
                if (q10 != 0) {
                    if (q10 != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    e eVar3 = this.zs[0];
                    if (!eVar3.h()) {
                        e j11 = eVar3.j(eVar3.o());
                        j10 = j10.j(eVar3);
                        n10 = n10.j(eVar3);
                        o10 = o10.j(j11);
                    }
                }
                return j10.equals(eVar.a(n10).j(eVar.o()).a(o10));
            }
            e eVar4 = this.zs[0];
            boolean h11 = eVar4.h();
            if (eVar.i()) {
                e o11 = this.f62850c.o();
                if (!h11) {
                    o10 = o10.j(eVar4.o());
                }
                return o11.equals(o10);
            }
            e eVar5 = this.f62850c;
            e o12 = eVar.o();
            if (h11) {
                l10 = eVar5.o().a(eVar5).a(n10);
                p10 = o12.o().a(o10);
            } else {
                e o13 = eVar4.o();
                e o14 = o13.o();
                l10 = eVar5.a(eVar4).l(eVar5, n10, o13);
                p10 = o12.p(o10, o14);
            }
            return l10.j(o12).equals(p10);
        }

        @Override // org.spongycastle.math.ec.g
        public g z(e eVar) {
            if (r()) {
                return this;
            }
            int i10 = i();
            if (i10 == 5) {
                e l10 = l();
                e m10 = m();
                return h().i(l10, m10.a(l10).d(eVar).a(l10.j(eVar)), n(), this.f62851d);
            }
            if (i10 != 6) {
                return super.z(eVar);
            }
            e l11 = l();
            e m11 = m();
            e eVar2 = n()[0];
            e j10 = l11.j(eVar.o());
            return h().i(j10, m11.a(l11).a(j10), new e[]{eVar2.j(eVar)}, this.f62851d);
        }

        public a(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, e[] eVarArr) {
            super(dVar, eVar, eVar2, eVarArr);
        }
    }

    public static abstract class b extends g {
        public b(org.spongycastle.math.ec.d dVar, e eVar, e eVar2) {
            super(dVar, eVar, eVar2);
        }

        @Override // org.spongycastle.math.ec.g
        public boolean g() {
            return f().s();
        }

        @Override // org.spongycastle.math.ec.g
        public boolean y() {
            e eVar = this.f62849b;
            e eVar2 = this.f62850c;
            e n10 = this.f62848a.n();
            e o10 = this.f62848a.o();
            e o11 = eVar2.o();
            int i10 = i();
            if (i10 != 0) {
                if (i10 == 1) {
                    e eVar3 = this.zs[0];
                    if (!eVar3.h()) {
                        e o12 = eVar3.o();
                        e j10 = eVar3.j(o12);
                        o11 = o11.j(eVar3);
                        n10 = n10.j(o12);
                        o10 = o10.j(j10);
                    }
                } else {
                    if (i10 != 2 && i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    e eVar4 = this.zs[0];
                    if (!eVar4.h()) {
                        e o13 = eVar4.o();
                        e o14 = o13.o();
                        e j11 = o13.j(o14);
                        n10 = n10.j(o14);
                        o10 = o10.j(j11);
                    }
                }
            }
            return o11.equals(eVar.o().a(n10).j(eVar).a(o10));
        }

        public b(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, e[] eVarArr) {
            super(dVar, eVar, eVar2, eVarArr);
        }
    }

    public static class c extends a {
        public c(org.spongycastle.math.ec.d dVar, e eVar, e eVar2) {
            this(dVar, eVar, eVar2, false);
        }

        @Override // org.spongycastle.math.ec.g
        public g D() {
            e a10;
            if (r()) {
                return this;
            }
            org.spongycastle.math.ec.d h10 = h();
            e eVar = this.f62849b;
            if (eVar.i()) {
                return h10.u();
            }
            int q10 = h10.q();
            if (q10 == 0) {
                e a11 = this.f62850c.d(eVar).a(eVar);
                e a12 = a11.o().a(a11).a(h10.n());
                return new c(h10, a12, eVar.p(a12, a11.b()), this.f62851d);
            }
            if (q10 == 1) {
                e eVar2 = this.f62850c;
                e eVar3 = this.zs[0];
                boolean h11 = eVar3.h();
                e j10 = h11 ? eVar : eVar.j(eVar3);
                if (!h11) {
                    eVar2 = eVar2.j(eVar3);
                }
                e o10 = eVar.o();
                e a13 = o10.a(eVar2);
                e o11 = j10.o();
                e a14 = a13.a(j10);
                e l10 = a14.l(a13, o11, h10.n());
                return new c(h10, j10.j(l10), o10.o().l(j10, l10, a14), new e[]{j10.j(o11)}, this.f62851d);
            }
            if (q10 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            e eVar4 = this.f62850c;
            e eVar5 = this.zs[0];
            boolean h12 = eVar5.h();
            e j11 = h12 ? eVar4 : eVar4.j(eVar5);
            e o12 = h12 ? eVar5 : eVar5.o();
            e n10 = h10.n();
            e j12 = h12 ? n10 : n10.j(o12);
            e a15 = eVar4.o().a(j11).a(j12);
            if (a15.i()) {
                return new c(h10, a15, h10.o().n(), this.f62851d);
            }
            e o13 = a15.o();
            e j13 = h12 ? a15 : a15.j(o12);
            e o14 = h10.o();
            if (o14.c() < (h10.t() >> 1)) {
                e o15 = eVar4.a(eVar).o();
                a10 = o15.a(a15).a(o12).j(o15).a(o14.h() ? j12.a(o12).o() : j12.p(o14, o12.o())).a(o13);
                if (n10.i()) {
                    a10 = a10.a(j13);
                } else if (!n10.h()) {
                    a10 = a10.a(n10.b().j(j13));
                }
            } else {
                if (!h12) {
                    eVar = eVar.j(eVar5);
                }
                a10 = eVar.p(a15, j11).a(o13).a(j13);
            }
            return new c(h10, o13, a10, new e[]{j13}, this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public g E(g gVar) {
            if (r()) {
                return gVar;
            }
            if (gVar.r()) {
                return D();
            }
            org.spongycastle.math.ec.d h10 = h();
            e eVar = this.f62849b;
            if (eVar.i()) {
                return gVar;
            }
            if (h10.q() != 6) {
                return D().a(gVar);
            }
            e eVar2 = gVar.f62849b;
            e eVar3 = gVar.zs[0];
            if (eVar2.i() || !eVar3.h()) {
                return D().a(gVar);
            }
            e eVar4 = this.f62850c;
            e eVar5 = this.zs[0];
            e eVar6 = gVar.f62850c;
            e o10 = eVar.o();
            e o11 = eVar4.o();
            e o12 = eVar5.o();
            e a10 = h10.n().j(o12).a(o11).a(eVar4.j(eVar5));
            e b10 = eVar6.b();
            e l10 = h10.n().a(b10).j(o12).a(o11).l(a10, o10, o12);
            e j10 = eVar2.j(o12);
            e o13 = j10.a(a10).o();
            if (o13.i()) {
                return l10.i() ? gVar.D() : h10.u();
            }
            if (l10.i()) {
                return new c(h10, l10, h10.o().n(), this.f62851d);
            }
            e j11 = l10.o().j(j10);
            e j12 = l10.j(o13).j(o12);
            return new c(h10, j11, l10.a(o13).o().l(a10, b10, j12), new e[]{j12}, this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public g a(g gVar) {
            e eVar;
            e eVar2;
            e eVar3;
            e eVar4;
            e eVar5;
            e eVar6;
            if (r()) {
                return gVar;
            }
            if (gVar.r()) {
                return this;
            }
            org.spongycastle.math.ec.d h10 = h();
            int q10 = h10.q();
            e eVar7 = this.f62849b;
            e eVar8 = gVar.f62849b;
            if (q10 == 0) {
                e eVar9 = this.f62850c;
                e eVar10 = gVar.f62850c;
                e a10 = eVar7.a(eVar8);
                e a11 = eVar9.a(eVar10);
                if (a10.i()) {
                    return a11.i() ? D() : h10.u();
                }
                e d10 = a11.d(a10);
                e a12 = d10.o().a(d10).a(a10).a(h10.n());
                return new c(h10, a12, d10.j(eVar7.a(a12)).a(a12).a(eVar9), this.f62851d);
            }
            if (q10 == 1) {
                e eVar11 = this.f62850c;
                e eVar12 = this.zs[0];
                e eVar13 = gVar.f62850c;
                e eVar14 = gVar.zs[0];
                boolean h11 = eVar14.h();
                e a13 = eVar12.j(eVar13).a(h11 ? eVar11 : eVar11.j(eVar14));
                e a14 = eVar12.j(eVar8).a(h11 ? eVar7 : eVar7.j(eVar14));
                if (a14.i()) {
                    return a13.i() ? D() : h10.u();
                }
                e o10 = a14.o();
                e j10 = o10.j(a14);
                if (!h11) {
                    eVar12 = eVar12.j(eVar14);
                }
                e a15 = a13.a(a14);
                e a16 = a15.l(a13, o10, h10.n()).j(eVar12).a(j10);
                e j11 = a14.j(a16);
                if (!h11) {
                    o10 = o10.j(eVar14);
                }
                return new c(h10, j11, a13.l(eVar7, a14, eVar11).l(o10, a15, a16), new e[]{j10.j(eVar12)}, this.f62851d);
            }
            if (q10 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (eVar7.i()) {
                return eVar8.i() ? h10.u() : gVar.a(this);
            }
            e eVar15 = this.f62850c;
            e eVar16 = this.zs[0];
            e eVar17 = gVar.f62850c;
            e eVar18 = gVar.zs[0];
            boolean h12 = eVar16.h();
            if (h12) {
                eVar = eVar8;
                eVar2 = eVar17;
            } else {
                eVar = eVar8.j(eVar16);
                eVar2 = eVar17.j(eVar16);
            }
            boolean h13 = eVar18.h();
            if (h13) {
                eVar3 = eVar15;
            } else {
                eVar7 = eVar7.j(eVar18);
                eVar3 = eVar15.j(eVar18);
            }
            e a17 = eVar3.a(eVar2);
            e a18 = eVar7.a(eVar);
            if (a18.i()) {
                return a17.i() ? D() : h10.u();
            }
            if (eVar8.i()) {
                g v10 = v();
                e o11 = v10.o();
                e p10 = v10.p();
                e d11 = p10.a(eVar17).d(o11);
                eVar5 = d11.o().a(d11).a(o11).a(h10.n());
                if (eVar5.i()) {
                    return new c(h10, eVar5, h10.o().n(), this.f62851d);
                }
                e a19 = d11.j(o11.a(eVar5)).a(eVar5).a(p10).d(eVar5).a(eVar5);
                eVar6 = h10.m(org.spongycastle.math.ec.c.f62725b);
                eVar4 = a19;
            } else {
                e o12 = a18.o();
                e j12 = a17.j(eVar7);
                e j13 = a17.j(eVar);
                e j14 = j12.j(j13);
                if (j14.i()) {
                    return new c(h10, j14, h10.o().n(), this.f62851d);
                }
                e j15 = a17.j(o12);
                e j16 = !h13 ? j15.j(eVar18) : j15;
                e p11 = j13.a(o12).p(j16, eVar15.a(eVar16));
                if (!h12) {
                    j16 = j16.j(eVar16);
                }
                eVar4 = p11;
                eVar5 = j14;
                eVar6 = j16;
            }
            return new c(h10, eVar5, eVar4, new e[]{eVar6}, this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public boolean g() {
            e l10 = l();
            if (l10.i()) {
                return false;
            }
            e m10 = m();
            int i10 = i();
            return (i10 == 5 || i10 == 6) ? m10.s() != l10.s() : m10.d(l10).s();
        }

        @Override // org.spongycastle.math.ec.g
        public e p() {
            int i10 = i();
            if (i10 != 5 && i10 != 6) {
                return this.f62850c;
            }
            e eVar = this.f62849b;
            e eVar2 = this.f62850c;
            if (r() || eVar.i()) {
                return eVar2;
            }
            e j10 = eVar2.a(eVar).j(eVar);
            if (6 == i10) {
                e eVar3 = this.zs[0];
                if (!eVar3.h()) {
                    return j10.d(eVar3);
                }
            }
            return j10;
        }

        @Override // org.spongycastle.math.ec.g
        public g u() {
            if (!r()) {
                e eVar = this.f62849b;
                if (!eVar.i()) {
                    int i10 = i();
                    if (i10 == 0) {
                        return new c(this.f62848a, eVar, this.f62850c.a(eVar), this.f62851d);
                    }
                    if (i10 == 1) {
                        return new c(this.f62848a, eVar, this.f62850c.a(eVar), new e[]{this.zs[0]}, this.f62851d);
                    }
                    if (i10 == 5) {
                        return new c(this.f62848a, eVar, this.f62850c.b(), this.f62851d);
                    }
                    if (i10 != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    e eVar2 = this.f62850c;
                    e eVar3 = this.zs[0];
                    return new c(this.f62848a, eVar, eVar2.a(eVar3), new e[]{eVar3}, this.f62851d);
                }
            }
            return this;
        }

        public c(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, boolean z10) {
            super(dVar, eVar, eVar2);
            if ((eVar == null) != (eVar2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (eVar != null) {
                e.a.u(this.f62849b, this.f62850c);
                if (dVar != null) {
                    e.a.u(this.f62849b, this.f62848a.n());
                }
            }
            this.f62851d = z10;
        }

        public c(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, e[] eVarArr, boolean z10) {
            super(dVar, eVar, eVar2, eVarArr);
            this.f62851d = z10;
        }
    }

    public static class d extends b {
        public d(org.spongycastle.math.ec.d dVar, e eVar, e eVar2) {
            this(dVar, eVar, eVar2, false);
        }

        @Override // org.spongycastle.math.ec.g
        public g B() {
            if (!r()) {
                e eVar = this.f62850c;
                if (!eVar.i()) {
                    org.spongycastle.math.ec.d h10 = h();
                    int q10 = h10.q();
                    if (q10 != 0) {
                        return q10 != 4 ? D().a(this) : K(false).a(this);
                    }
                    e eVar2 = this.f62849b;
                    e L10 = L(eVar);
                    e o10 = L10.o();
                    e a10 = J(eVar2.o()).a(h().n());
                    e r10 = J(eVar2).j(o10).r(a10.o());
                    if (r10.i()) {
                        return h().u();
                    }
                    e g10 = r10.j(L10).g();
                    e j10 = r10.j(g10).j(a10);
                    e r11 = o10.o().j(g10).r(j10);
                    e a11 = r11.r(j10).j(j10.a(r11)).a(eVar2);
                    return new d(h10, a11, eVar2.r(a11).j(r11).r(eVar), this.f62851d);
                }
            }
            return this;
        }

        @Override // org.spongycastle.math.ec.g
        public g C(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i10 == 0 || r()) {
                return this;
            }
            if (i10 == 1) {
                return D();
            }
            org.spongycastle.math.ec.d h10 = h();
            e eVar = this.f62850c;
            if (eVar.i()) {
                return h10.u();
            }
            int q10 = h10.q();
            e n10 = h10.n();
            e eVar2 = this.f62849b;
            e[] eVarArr = this.zs;
            int i11 = 0;
            e m10 = eVarArr.length < 1 ? h10.m(org.spongycastle.math.ec.c.f62725b) : eVarArr[0];
            if (!m10.h() && q10 != 0) {
                if (q10 == 1) {
                    e o10 = m10.o();
                    eVar2 = eVar2.j(m10);
                    eVar = eVar.j(o10);
                    n10 = F(m10, o10);
                } else if (q10 == 2) {
                    n10 = F(m10, null);
                } else {
                    if (q10 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    n10 = I();
                }
            }
            while (i11 < i10) {
                if (eVar.i()) {
                    return h10.u();
                }
                e J10 = J(eVar2.o());
                e L10 = L(eVar);
                e j10 = L10.j(eVar);
                e L11 = L(eVar2.j(j10));
                e L12 = L(j10.o());
                if (!n10.i()) {
                    J10 = J10.a(n10);
                    n10 = L(L12.j(n10));
                }
                e r10 = J10.o().r(L(L11));
                eVar = J10.j(L11.r(r10)).r(L12);
                m10 = m10.h() ? L10 : L10.j(m10);
                i11++;
                eVar2 = r10;
            }
            if (q10 == 0) {
                e eVar3 = eVar;
                e g10 = m10.g();
                e o11 = g10.o();
                return new d(h10, eVar2.j(o11), eVar3.j(o11.j(g10)), this.f62851d);
            }
            if (q10 == 1) {
                return new d(h10, eVar2.j(m10), eVar, new e[]{m10.j(m10.o())}, this.f62851d);
            }
            if (q10 == 2) {
                return new d(h10, eVar2, eVar, new e[]{m10}, this.f62851d);
            }
            if (q10 != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            return new d(h10, eVar2, eVar, new e[]{m10, n10}, this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public g D() {
            e eVar;
            e H10;
            if (r()) {
                return this;
            }
            org.spongycastle.math.ec.d h10 = h();
            e eVar2 = this.f62850c;
            if (eVar2.i()) {
                return h10.u();
            }
            int q10 = h10.q();
            e eVar3 = this.f62849b;
            if (q10 == 0) {
                e d10 = J(eVar3.o()).a(h().n()).d(L(eVar2));
                e r10 = d10.o().r(L(eVar3));
                return new d(h10, r10, d10.j(eVar3.r(r10)).r(eVar2), this.f62851d);
            }
            if (q10 == 1) {
                e eVar4 = this.zs[0];
                boolean h11 = eVar4.h();
                e n10 = h10.n();
                if (!n10.i() && !h11) {
                    n10 = n10.j(eVar4.o());
                }
                e a10 = n10.a(J(eVar3.o()));
                e j10 = h11 ? eVar2 : eVar2.j(eVar4);
                e o10 = h11 ? eVar2.o() : j10.j(eVar2);
                e H11 = H(eVar3.j(o10));
                e r11 = a10.o().r(L(H11));
                e L10 = L(j10);
                e j11 = r11.j(L10);
                e L11 = L(o10);
                return new d(h10, j11, H11.r(r11).j(a10).r(L(L11.o())), new e[]{L(h11 ? L(L11) : L10.o()).j(j10)}, this.f62851d);
            }
            if (q10 != 2) {
                if (q10 == 4) {
                    return K(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            e eVar5 = this.zs[0];
            boolean h12 = eVar5.h();
            e o11 = eVar2.o();
            e o12 = o11.o();
            e n11 = h10.n();
            e m10 = n11.m();
            if (m10.t().equals(BigInteger.valueOf(3L))) {
                e o13 = h12 ? eVar5 : eVar5.o();
                eVar = J(eVar3.a(o13).j(eVar3.r(o13)));
                H10 = H(o11.j(eVar3));
            } else {
                e J10 = J(eVar3.o());
                if (h12) {
                    eVar = J10.a(n11);
                } else if (n11.i()) {
                    eVar = J10;
                } else {
                    e o14 = eVar5.o().o();
                    eVar = m10.c() < n11.c() ? J10.r(o14.j(m10)) : J10.a(o14.j(n11));
                }
                H10 = H(eVar3.j(o11));
            }
            e r12 = eVar.o().r(L(H10));
            e r13 = H10.r(r12).j(eVar).r(G(o12));
            e L12 = L(eVar2);
            if (!h12) {
                L12 = L12.j(eVar5);
            }
            return new d(h10, r12, r13, new e[]{L12}, this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public g E(g gVar) {
            if (this == gVar) {
                return B();
            }
            if (r()) {
                return gVar;
            }
            if (gVar.r()) {
                return D();
            }
            e eVar = this.f62850c;
            if (eVar.i()) {
                return gVar;
            }
            org.spongycastle.math.ec.d h10 = h();
            int q10 = h10.q();
            if (q10 != 0) {
                return q10 != 4 ? D().a(gVar) : K(false).a(gVar);
            }
            e eVar2 = this.f62849b;
            e eVar3 = gVar.f62849b;
            e eVar4 = gVar.f62850c;
            e r10 = eVar3.r(eVar2);
            e r11 = eVar4.r(eVar);
            if (r10.i()) {
                return r11.i() ? B() : this;
            }
            e o10 = r10.o();
            e r12 = o10.j(L(eVar2).a(eVar3)).r(r11.o());
            if (r12.i()) {
                return h10.u();
            }
            e g10 = r12.j(r10).g();
            e j10 = r12.j(g10).j(r11);
            e r13 = L(eVar).j(o10).j(r10).j(g10).r(j10);
            e a10 = r13.r(j10).j(j10.a(r13)).a(eVar3);
            return new d(h10, a10, eVar2.r(a10).j(r13).r(eVar), this.f62851d);
        }

        public e F(e eVar, e eVar2) {
            e n10 = h().n();
            if (n10.i() || eVar.h()) {
                return n10;
            }
            if (eVar2 == null) {
                eVar2 = eVar.o();
            }
            e o10 = eVar2.o();
            e m10 = n10.m();
            return m10.c() < n10.c() ? o10.j(m10).m() : o10.j(n10);
        }

        public e G(e eVar) {
            return H(L(eVar));
        }

        public e H(e eVar) {
            return L(L(eVar));
        }

        public e I() {
            e[] eVarArr = this.zs;
            e eVar = eVarArr[1];
            if (eVar != null) {
                return eVar;
            }
            e F10 = F(eVarArr[0], null);
            eVarArr[1] = F10;
            return F10;
        }

        public e J(e eVar) {
            return L(eVar).a(eVar);
        }

        public d K(boolean z10) {
            e eVar = this.f62849b;
            e eVar2 = this.f62850c;
            e eVar3 = this.zs[0];
            e I10 = I();
            e a10 = J(eVar.o()).a(I10);
            e L10 = L(eVar2);
            e j10 = L10.j(eVar2);
            e L11 = L(eVar.j(j10));
            e r10 = a10.o().r(L(L11));
            e L12 = L(j10.o());
            e r11 = a10.j(L11.r(r10)).r(L12);
            e L13 = z10 ? L(L12.j(I10)) : null;
            if (!eVar3.h()) {
                L10 = L10.j(eVar3);
            }
            return new d(h(), r10, r11, new e[]{L10, L13}, this.f62851d);
        }

        public e L(e eVar) {
            return eVar.a(eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
        @Override // org.spongycastle.math.ec.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g a(g gVar) {
            char c10;
            int i10;
            e j10;
            e eVar;
            e eVar2;
            e eVar3;
            e[] eVarArr;
            if (r()) {
                return gVar;
            }
            if (gVar.r()) {
                return this;
            }
            if (this == gVar) {
                return D();
            }
            org.spongycastle.math.ec.d h10 = h();
            int q10 = h10.q();
            e eVar4 = this.f62849b;
            e eVar5 = this.f62850c;
            e eVar6 = gVar.f62849b;
            e eVar7 = gVar.f62850c;
            if (q10 == 0) {
                e r10 = eVar6.r(eVar4);
                e r11 = eVar7.r(eVar5);
                if (r10.i()) {
                    return r11.i() ? D() : h10.u();
                }
                e d10 = r11.d(r10);
                e r12 = d10.o().r(eVar4).r(eVar6);
                return new d(h10, r12, d10.j(eVar4.r(r12)).r(eVar5), this.f62851d);
            }
            if (q10 == 1) {
                e eVar8 = this.zs[0];
                e eVar9 = gVar.zs[0];
                boolean h11 = eVar8.h();
                boolean h12 = eVar9.h();
                if (!h11) {
                    eVar7 = eVar7.j(eVar8);
                }
                if (!h12) {
                    eVar5 = eVar5.j(eVar9);
                }
                e r13 = eVar7.r(eVar5);
                if (!h11) {
                    eVar6 = eVar6.j(eVar8);
                }
                if (!h12) {
                    eVar4 = eVar4.j(eVar9);
                }
                e r14 = eVar6.r(eVar4);
                if (r14.i()) {
                    return r13.i() ? D() : h10.u();
                }
                if (h11) {
                    eVar8 = eVar9;
                } else if (!h12) {
                    eVar8 = eVar8.j(eVar9);
                }
                e o10 = r14.o();
                e j11 = o10.j(r14);
                e j12 = o10.j(eVar4);
                e r15 = r13.o().j(eVar8).r(j11).r(L(j12));
                return new d(h10, r14.j(r15), j12.r(r15).k(r13, eVar5, j11), new e[]{j11.j(eVar8)}, this.f62851d);
            }
            if (q10 != 2 && q10 != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            e eVar10 = this.zs[0];
            e eVar11 = gVar.zs[0];
            boolean h13 = eVar10.h();
            if (h13 || !eVar10.equals(eVar11)) {
                if (!h13) {
                    e o11 = eVar10.o();
                    eVar6 = o11.j(eVar6);
                    eVar7 = o11.j(eVar10).j(eVar7);
                }
                boolean h14 = eVar11.h();
                if (h14) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    e o12 = eVar11.o();
                    eVar4 = o12.j(eVar4);
                    eVar5 = o12.j(eVar11).j(eVar5);
                }
                e r16 = eVar4.r(eVar6);
                e r17 = eVar5.r(eVar7);
                if (r16.i()) {
                    return r17.i() ? D() : h10.u();
                }
                e o13 = r16.o();
                e j13 = o13.j(r16);
                e j14 = o13.j(eVar4);
                i10 = 1;
                e r18 = r17.o().a(j13).r(L(j14));
                e k10 = j14.r(r18).k(r17, j13, eVar5);
                e j15 = !h13 ? r16.j(eVar10) : r16;
                j10 = !h14 ? j15.j(eVar11) : j15;
                eVar = k10;
                eVar2 = r18;
                if (j10 == r16) {
                    eVar3 = o13;
                    if (q10 != 4) {
                        e F10 = F(j10, eVar3);
                        eVarArr = new e[2];
                        eVarArr[c10] = j10;
                        eVarArr[i10] = F10;
                    } else {
                        eVarArr = new e[i10];
                        eVarArr[c10] = j10;
                    }
                    return new d(h10, eVar2, eVar, eVarArr, this.f62851d);
                }
            } else {
                e r19 = eVar4.r(eVar6);
                e r20 = eVar5.r(eVar7);
                if (r19.i()) {
                    return r20.i() ? D() : h10.u();
                }
                e o14 = r19.o();
                e j16 = eVar4.j(o14);
                e j17 = eVar6.j(o14);
                e j18 = j16.r(j17).j(eVar5);
                e r21 = r20.o().r(j16).r(j17);
                e r22 = j16.r(r21).j(r20).r(j18);
                j10 = r19.j(eVar10);
                eVar = r22;
                eVar2 = r21;
                i10 = 1;
                c10 = 0;
            }
            eVar3 = null;
            if (q10 != 4) {
            }
            return new d(h10, eVar2, eVar, eVarArr, this.f62851d);
        }

        @Override // org.spongycastle.math.ec.g
        public e q(int i10) {
            return (i10 == 1 && 4 == i()) ? I() : super.q(i10);
        }

        @Override // org.spongycastle.math.ec.g
        public g u() {
            if (r()) {
                return this;
            }
            org.spongycastle.math.ec.d h10 = h();
            return h10.q() != 0 ? new d(h10, this.f62849b, this.f62850c.m(), this.zs, this.f62851d) : new d(h10, this.f62849b, this.f62850c.m(), this.f62851d);
        }

        public d(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, boolean z10) {
            super(dVar, eVar, eVar2);
            if ((eVar == null) != (eVar2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.f62851d = z10;
        }

        public d(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, e[] eVarArr, boolean z10) {
            super(dVar, eVar, eVar2, eVarArr);
            this.f62851d = z10;
        }
    }

    public g(org.spongycastle.math.ec.d dVar, e eVar, e eVar2) {
        this(dVar, eVar, eVar2, k(dVar));
    }

    public static e[] k(org.spongycastle.math.ec.d dVar) {
        int q10 = dVar == null ? 0 : dVar.q();
        if (q10 == 0 || q10 == 5) {
            return EMPTY_ZS;
        }
        e m10 = dVar.m(org.spongycastle.math.ec.c.f62725b);
        if (q10 != 1 && q10 != 2) {
            if (q10 == 3) {
                return new e[]{m10, m10, m10};
            }
            if (q10 == 4) {
                return new e[]{m10, dVar.n()};
            }
            if (q10 != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new e[]{m10};
    }

    public g A(e eVar) {
        return r() ? this : h().i(l(), m().j(eVar), n(), this.f62851d);
    }

    public g B() {
        return E(this);
    }

    public g C(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        g gVar = this;
        while (true) {
            i10--;
            if (i10 < 0) {
                return gVar;
            }
            gVar = gVar.D();
        }
    }

    public abstract g D();

    public abstract g E(g gVar);

    public abstract g a(g gVar);

    public void b() {
        if (!s()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public g c(e eVar, e eVar2) {
        return h().h(l().j(eVar), m().j(eVar2), this.f62851d);
    }

    public boolean d(g gVar) {
        g gVar2;
        if (gVar == null) {
            return false;
        }
        org.spongycastle.math.ec.d h10 = h();
        org.spongycastle.math.ec.d h11 = gVar.h();
        boolean z10 = h10 == null;
        boolean z11 = h11 == null;
        boolean r10 = r();
        boolean r11 = gVar.r();
        if (r10 || r11) {
            return r10 && r11 && (z10 || z11 || h10.l(h11));
        }
        if (!z10 || !z11) {
            if (!z10) {
                if (z11) {
                    gVar2 = v();
                } else {
                    if (!h10.l(h11)) {
                        return false;
                    }
                    g[] gVarArr = {this, h10.y(gVar)};
                    h10.z(gVarArr);
                    gVar2 = gVarArr[0];
                    gVar = gVarArr[1];
                }
                return !gVar2.o().equals(gVar.o()) && gVar2.p().equals(gVar.p());
            }
            gVar = gVar.v();
        }
        gVar2 = this;
        if (gVar2.o().equals(gVar.o())) {
        }
    }

    public e e() {
        b();
        return o();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return d((g) obj);
        }
        return false;
    }

    public e f() {
        b();
        return p();
    }

    public abstract boolean g();

    public org.spongycastle.math.ec.d h() {
        return this.f62848a;
    }

    public int hashCode() {
        org.spongycastle.math.ec.d h10 = h();
        int i10 = h10 == null ? 0 : ~h10.hashCode();
        if (r()) {
            return i10;
        }
        g v10 = v();
        return (i10 ^ (v10.o().hashCode() * 17)) ^ (v10.p().hashCode() * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
    }

    public int i() {
        org.spongycastle.math.ec.d dVar = this.f62848a;
        if (dVar == null) {
            return 0;
        }
        return dVar.q();
    }

    public boolean isValid() {
        return r() || h() == null || (y() && x());
    }

    public byte[] j(boolean z10) {
        if (r()) {
            return new byte[1];
        }
        g v10 = v();
        byte[] e10 = v10.o().e();
        if (z10) {
            byte[] bArr = new byte[e10.length + 1];
            bArr[0] = (byte) (v10.g() ? 3 : 2);
            System.arraycopy(e10, 0, bArr, 1, e10.length);
            return bArr;
        }
        byte[] e11 = v10.p().e();
        byte[] bArr2 = new byte[e10.length + e11.length + 1];
        bArr2[0] = 4;
        System.arraycopy(e10, 0, bArr2, 1, e10.length);
        System.arraycopy(e11, 0, bArr2, e10.length + 1, e11.length);
        return bArr2;
    }

    public final e l() {
        return this.f62849b;
    }

    public final e m() {
        return this.f62850c;
    }

    public final e[] n() {
        return this.zs;
    }

    public e o() {
        return this.f62849b;
    }

    public e p() {
        return this.f62850c;
    }

    public e q(int i10) {
        if (i10 < 0) {
            return null;
        }
        e[] eVarArr = this.zs;
        if (i10 >= eVarArr.length) {
            return null;
        }
        return eVarArr[i10];
    }

    public boolean r() {
        if (this.f62849b == null || this.f62850c == null) {
            return true;
        }
        e[] eVarArr = this.zs;
        return eVarArr.length > 0 && eVarArr[0].i();
    }

    public boolean s() {
        int i10 = i();
        return i10 == 0 || i10 == 5 || r() || this.zs[0].h();
    }

    public g t(BigInteger bigInteger) {
        return h().v().a(this, bigInteger);
    }

    public String toString() {
        if (r()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(l());
        stringBuffer.append(',');
        stringBuffer.append(m());
        for (int i10 = 0; i10 < this.zs.length; i10++) {
            stringBuffer.append(',');
            stringBuffer.append(this.zs[i10]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public abstract g u();

    public g v() {
        int i10;
        if (!r() && (i10 = i()) != 0 && i10 != 5) {
            e q10 = q(0);
            if (!q10.h()) {
                return w(q10.g());
            }
        }
        return this;
    }

    public g w(e eVar) {
        int i10 = i();
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                e o10 = eVar.o();
                return c(o10, o10.j(eVar));
            }
            if (i10 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(eVar, eVar);
    }

    public boolean x() {
        BigInteger p10 = this.f62848a.p();
        return p10 == null || p10.equals(org.spongycastle.math.ec.c.f62725b) || !org.spongycastle.math.ec.b.n(this, p10).r();
    }

    public abstract boolean y();

    public g z(e eVar) {
        return r() ? this : h().i(l().j(eVar), m(), n(), this.f62851d);
    }

    public g(org.spongycastle.math.ec.d dVar, e eVar, e eVar2, e[] eVarArr) {
        this.f62852e = null;
        this.f62848a = dVar;
        this.f62849b = eVar;
        this.f62850c = eVar2;
        this.zs = eVarArr;
    }
}
