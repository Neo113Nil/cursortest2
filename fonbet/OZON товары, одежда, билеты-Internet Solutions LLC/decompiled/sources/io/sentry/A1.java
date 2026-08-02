package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A1 implements W {

    /* renamed from: a, reason: collision with root package name */
    private static final A1 f66539a = new A1();

    public static A1 C() {
        return f66539a;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t A(@NotNull Throwable th2, E e11) {
        return K1.d().A(th2, e11);
    }

    @Override // io.sentry.W
    @NotNull
    public final W B(@NotNull String str) {
        return K1.d().B("getCurrentScopes");
    }

    @Override // io.sentry.W
    public final void a(boolean z11) {
        K1.c();
    }

    @Override // io.sentry.W
    public final void b(long j11) {
        K1.d().b(j11);
    }

    @Override // io.sentry.W
    public final void c(String str, String str2) {
        K1.d().c(str, str2);
    }

    @Override // io.sentry.W
    public final void d(io.sentry.protocol.E e11) {
        K1.d().d(e11);
    }

    @Override // io.sentry.W
    public final boolean e() {
        return K1.d().e();
    }

    @Override // io.sentry.W
    public final void f(@NotNull C7141f c7141f) {
        g(c7141f, new E());
    }

    @Override // io.sentry.W
    public final void g(@NotNull C7141f c7141f, E e11) {
        K1.d().g(c7141f, e11);
    }

    @Override // io.sentry.W
    @NotNull
    public final W2 getOptions() {
        return K1.d().getOptions();
    }

    @Override // io.sentry.W
    public final io.sentry.transport.m h() {
        return K1.d().h();
    }

    @Override // io.sentry.W
    public final InterfaceC7142f0 i() {
        return K1.d().i();
    }

    @Override // io.sentry.W
    public final boolean isEnabled() {
        return K1.i();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t j(@NotNull C7151h1 c7151h1) {
        return K1.d().j(c7151h1);
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t k(@NotNull V1 v12, E e11) {
        return K1.d().k(v12, e11);
    }

    @Override // io.sentry.W
    public final void l() {
        K1.d().l();
    }

    @Override // io.sentry.W
    public final void m(@NotNull InterfaceC7217w1 interfaceC7217w1) {
        K1.d().m(interfaceC7217w1);
    }

    @Override // io.sentry.W
    public final void n() {
        K1.d().n();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t o(@NotNull X2 x22, E e11) {
        return K1.d().o(x22, e11);
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t q(@NotNull String str, @NotNull I2 i22) {
        return K1.d().q(str, i22);
    }

    @Override // io.sentry.W
    @NotNull
    public final InterfaceC7142f0 s(@NotNull t3 t3Var, @NotNull u3 u3Var) {
        return K1.d().s(t3Var, u3Var);
    }

    @Override // io.sentry.W
    public final void setTag(String str, String str2) {
        K1.j(str, str2);
    }

    @Override // io.sentry.W
    @NotNull
    public final U t() {
        return K1.d().t();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t v(@NotNull io.sentry.protocol.A a11, q3 q3Var, E e11, C7167l1 c7167l1) {
        return K1.d().v(a11, q3Var, e11, c7167l1);
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t z(@NotNull C7230z2 c7230z2, E e11) {
        return K1.d().z(c7230z2, e11);
    }

    @Override // io.sentry.W
    @Deprecated
    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final N m57clone() {
        return K1.d().m67clone();
    }
}
