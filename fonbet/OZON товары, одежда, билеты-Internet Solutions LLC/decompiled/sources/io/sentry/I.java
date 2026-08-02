package io.sentry;

import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: classes10.dex */
public final class I implements N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7229z1 f66642a;

    public I(@NotNull C7229z1 c7229z1) {
        this.f66642a = c7229z1;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t A(@NotNull Throwable th2, E e11) {
        return this.f66642a.A(th2, e11);
    }

    @Override // io.sentry.W
    @NotNull
    public final W B(@NotNull String str) {
        return this.f66642a.B("getCurrentScopes");
    }

    @Override // io.sentry.W
    public final void a(boolean z11) {
        this.f66642a.a(z11);
    }

    @Override // io.sentry.W
    public final void b(long j11) {
        this.f66642a.b(j11);
    }

    @Override // io.sentry.W
    public final void c(String str, String str2) {
        this.f66642a.c(str, str2);
    }

    @Override // io.sentry.W
    @Deprecated
    @NotNull
    /* renamed from: clone */
    public final N m67clone() {
        return this.f66642a.m67clone();
    }

    @Override // io.sentry.W
    public final void d(io.sentry.protocol.E e11) {
        this.f66642a.d(e11);
    }

    @Override // io.sentry.W
    public final boolean e() {
        return this.f66642a.e();
    }

    @Override // io.sentry.W
    public final void f(@NotNull C7141f c7141f) {
        this.f66642a.f(c7141f);
    }

    @Override // io.sentry.W
    public final void g(@NotNull C7141f c7141f, E e11) {
        this.f66642a.g(c7141f, e11);
    }

    @Override // io.sentry.W
    @NotNull
    public final W2 getOptions() {
        return this.f66642a.getOptions();
    }

    @Override // io.sentry.W
    public final io.sentry.transport.m h() {
        return this.f66642a.h();
    }

    @Override // io.sentry.W
    public final InterfaceC7142f0 i() {
        return this.f66642a.i();
    }

    @Override // io.sentry.W
    public final boolean isEnabled() {
        return this.f66642a.isEnabled();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t j(@NotNull C7151h1 c7151h1) {
        return this.f66642a.j(c7151h1);
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t k(@NotNull V1 v12, E e11) {
        return this.f66642a.k(v12, e11);
    }

    @Override // io.sentry.W
    public final void l() {
        this.f66642a.l();
    }

    @Override // io.sentry.W
    public final void m(@NotNull InterfaceC7217w1 interfaceC7217w1) {
        this.f66642a.m(interfaceC7217w1);
    }

    @Override // io.sentry.W
    public final void n() {
        this.f66642a.n();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t o(@NotNull X2 x22, E e11) {
        return this.f66642a.o(x22, e11);
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t q(@NotNull String str, @NotNull I2 i22) {
        return this.f66642a.q(str, i22);
    }

    @Override // io.sentry.W
    @NotNull
    public final InterfaceC7142f0 s(@NotNull t3 t3Var, @NotNull u3 u3Var) {
        return this.f66642a.s(t3Var, u3Var);
    }

    @Override // io.sentry.W
    public final void setTag(String str, String str2) {
        this.f66642a.setTag(str, str2);
    }

    @Override // io.sentry.W
    @NotNull
    public final U t() {
        return this.f66642a.t();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t v(@NotNull io.sentry.protocol.A a11, q3 q3Var, E e11, C7167l1 c7167l1) {
        return this.f66642a.v(a11, q3Var, e11, c7167l1);
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t z(@NotNull C7230z2 c7230z2, E e11) {
        return this.f66642a.z(c7230z2, e11);
    }

    @Deprecated
    @NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public final Object m58clone() throws CloneNotSupportedException {
        return this.f66642a.m67clone();
    }
}
