package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vj4 implements jg4, ehj, ohk, bt3 {
    public final l0a a;
    public final n0a b;
    public final p0a c;
    public String d;

    public vj4(l0a l0aVar, n0a n0aVar, p0a p0aVar, String str) {
        this.a = l0aVar;
        this.b = n0aVar;
        this.c = p0aVar;
        this.d = str;
    }

    @Override // defpackage.inl
    public final void A(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.ohk
    public final Integer B() {
        return this.c.c;
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

    @Override // defpackage.ohk
    public final Boolean F() {
        return this.c.a;
    }

    @Override // defpackage.ohk
    public final Integer a() {
        return this.c.d;
    }

    @Override // defpackage.ohk
    public final void b(Integer num) {
        this.c.c = num;
    }

    @Override // defpackage.ohk
    public final void c(Integer num) {
        this.c.b = num;
    }

    @Override // defpackage.bt3
    public final Object copy() {
        l0a copy = this.a.copy();
        n0a copy2 = this.b.copy();
        p0a p0aVar = this.c;
        return new vj4(copy, copy2, new p0a(p0aVar.b, p0aVar.c, p0aVar.d, p0aVar.a), this.d);
    }

    @Override // defpackage.jg4
    public final Integer d() {
        return this.a.c;
    }

    @Override // defpackage.ehj
    public final Integer e() {
        return this.b.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        return vj4Var.a.equals(this.a) && vj4Var.b.equals(this.b) && vj4Var.c.equals(this.c) && Intrinsics.c(vj4Var.d, this.d);
    }

    @Override // defpackage.ehj
    public final Integer f() {
        return this.b.b;
    }

    @Override // defpackage.jg4
    public final void g(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.ohk
    public final Integer h() {
        return this.c.b;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        String str = this.d;
        return (str != null ? str.hashCode() : 0) ^ hashCode;
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

    @Override // defpackage.ohk
    public final void o(Integer num) {
        this.c.d = num;
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

    @Override // defpackage.ohk
    public final void w(Boolean bool) {
        this.c.a = bool;
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
