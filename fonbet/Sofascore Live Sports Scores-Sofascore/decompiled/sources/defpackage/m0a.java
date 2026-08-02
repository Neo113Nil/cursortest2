package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class m0a implements jg4, ehj, bt3 {
    public final l0a a;
    public final n0a b;

    public m0a(l0a l0aVar, n0a n0aVar) {
        this.a = l0aVar;
        this.b = n0aVar;
    }

    @Override // defpackage.inl
    public final void A(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.inl
    public final Integer C() {
        return this.a.a.b;
    }

    @Override // defpackage.ehj
    public final void D(Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.ehj
    public final Integer E() {
        return this.b.a;
    }

    @Override // defpackage.bt3
    public final Object copy() {
        return new m0a(this.a.copy(), this.b.copy());
    }

    @Override // defpackage.jg4
    public final Integer d() {
        return this.a.c;
    }

    @Override // defpackage.ehj
    public final Integer e() {
        return this.b.f;
    }

    @Override // defpackage.ehj
    public final Integer f() {
        return this.b.b;
    }

    @Override // defpackage.jg4
    public final void g(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.jg4
    public final void i(Integer num) {
        this.a.c = num;
    }

    @Override // defpackage.ehj
    public final Integer j() {
        return this.b.e;
    }

    @Override // defpackage.ehj
    public final void k(Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.jg4
    public final void l(Integer num) {
        this.a.d = num;
    }

    @Override // defpackage.ehj
    public final void m(pl4 pl4Var) {
        this.b.m(pl4Var);
    }

    @Override // defpackage.ehj
    public final kp n() {
        return this.b.c;
    }

    @Override // defpackage.ehj
    public final void p(Integer num) {
        this.b.b = num;
    }

    @Override // defpackage.ehj
    public final void q(Integer num) {
        this.b.f = num;
    }

    @Override // defpackage.inl
    public final void r(Integer num) {
        this.a.a.b = num;
    }

    @Override // defpackage.ehj
    public final Integer s() {
        return this.b.d;
    }

    @Override // defpackage.ehj
    public final void t(Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.inl
    public final Integer u() {
        return this.a.a.a;
    }

    @Override // defpackage.ehj
    public final pl4 v() {
        return this.b.v();
    }

    @Override // defpackage.jg4
    public final Integer x() {
        return this.a.b;
    }

    @Override // defpackage.ehj
    public final void y(kp kpVar) {
        this.b.c = kpVar;
    }

    @Override // defpackage.jg4
    public final Integer z() {
        return this.a.d;
    }
}
