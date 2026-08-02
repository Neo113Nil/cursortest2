package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final x3 f16638a;

    public m0(x3 x3Var) {
        this.f16638a = x3Var;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v A(String str, b5 b5Var) {
        return this.f16638a.G(str, b5Var, null);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v B(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var, j3 j3Var) {
        return this.f16638a.B(e0Var, t6Var, h0Var, j3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v C(String str, b5 b5Var, com.google.firebase.messaging.q qVar) {
        return this.f16638a.G(str, b5Var, qVar);
    }

    @Override // io.sentry.b1
    public final b1 D(String str) {
        return this.f16638a.D("getCurrentScopes");
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v E(t4 t4Var, h0 h0Var) {
        return this.f16638a.E(t4Var, h0Var);
    }

    @Override // io.sentry.b1
    public final void a(boolean z5) {
        this.f16638a.a(z5);
    }

    @Override // io.sentry.b1
    public final void b(long j) {
        this.f16638a.b(j);
    }

    @Override // io.sentry.b1
    public final void c(e eVar) {
        this.f16638a.c(eVar);
    }

    @Override // io.sentry.b1
    /* renamed from: clone */
    public final t0 m111clone() {
        return this.f16638a.m111clone();
    }

    @Override // io.sentry.b1
    public final e5.j d() {
        return this.f16638a.d();
    }

    @Override // io.sentry.b1
    public final boolean e() {
        return this.f16638a.e();
    }

    @Override // io.sentry.b1
    public final void f(String str, String str2) {
        this.f16638a.f(str, str2);
    }

    @Override // io.sentry.b1
    public final void g(Throwable th2, m6 m6Var, String str) {
        this.f16638a.g(th2, m6Var, str);
    }

    @Override // io.sentry.b1
    public final void h(e eVar, h0 h0Var) {
        this.f16638a.h(eVar, h0Var);
    }

    @Override // io.sentry.b1
    public final i1 i() {
        return this.f16638a.i();
    }

    @Override // io.sentry.b1
    public final boolean isEnabled() {
        return this.f16638a.isEnabled();
    }

    @Override // io.sentry.b1
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v k(g3 g3Var) {
        return this.f16638a.k(g3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v l(l1.a aVar, h0 h0Var) {
        return this.f16638a.l(aVar, h0Var);
    }

    @Override // io.sentry.b1
    public final b6 m() {
        return this.f16638a.m();
    }

    @Override // io.sentry.b1
    public final k1 n() {
        return this.f16638a.n();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v o(Throwable th2, h0 h0Var, u3 u3Var) {
        return this.f16638a.o(th2, h0Var, u3Var);
    }

    @Override // io.sentry.b1
    public final void p() {
        this.f16638a.p();
    }

    @Override // io.sentry.b1
    public final void q() {
        this.f16638a.q();
    }

    @Override // io.sentry.b1
    public final k1 r(v6 v6Var, w6 w6Var) {
        return this.f16638a.r(v6Var, w6Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v s(Throwable th2, u3 u3Var) {
        return o(th2, new h0(), u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v t(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var) {
        return this.f16638a.B(e0Var, t6Var, h0Var, null);
    }

    @Override // io.sentry.b1
    public final void u(u3 u3Var) {
        this.f16638a.u(u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v v(String str, com.google.firebase.messaging.q qVar) {
        return this.f16638a.G(str, b5.INFO, qVar);
    }

    @Override // io.sentry.b1
    public final io.sentry.logger.a w() {
        return this.f16638a.f17250f;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v x(d6 d6Var, h0 h0Var) {
        return this.f16638a.x(d6Var, h0Var);
    }

    @Override // io.sentry.b1
    public final void y(u3 u3Var) {
        u(u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v z(String str) {
        return A(str, b5.INFO);
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m106clone() {
        return this.f16638a.m111clone();
    }
}
