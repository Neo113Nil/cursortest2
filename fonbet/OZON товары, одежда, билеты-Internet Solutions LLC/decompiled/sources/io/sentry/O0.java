package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O0 implements W {

    /* renamed from: b, reason: collision with root package name */
    private static final O0 f66693b = new O0();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<W2> f66694a = new io.sentry.util.l<>(new T7.Q(2));

    private O0() {
    }

    public static O0 C() {
        return f66693b;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t A(@NotNull Throwable th2, E e11) {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.W
    @NotNull
    public final W B(@NotNull String str) {
        return f66693b;
    }

    @Override // io.sentry.W
    public final void a(boolean z11) {
    }

    @Override // io.sentry.W
    public final void b(long j11) {
    }

    @Override // io.sentry.W
    public final void c(String str, String str2) {
    }

    @Override // io.sentry.W
    @Deprecated
    @NotNull
    /* renamed from: clone */
    public final N m57clone() {
        return I0.C();
    }

    @Override // io.sentry.W
    public final void d(io.sentry.protocol.E e11) {
    }

    @Override // io.sentry.W
    public final boolean e() {
        return true;
    }

    @Override // io.sentry.W
    public final void f(@NotNull C7141f c7141f) {
    }

    @Override // io.sentry.W
    public final void g(@NotNull C7141f c7141f, E e11) {
    }

    @Override // io.sentry.W
    @NotNull
    public final W2 getOptions() {
        return this.f66694a.a();
    }

    @Override // io.sentry.W
    public final io.sentry.transport.m h() {
        return null;
    }

    @Override // io.sentry.W
    public final InterfaceC7142f0 i() {
        return null;
    }

    @Override // io.sentry.W
    public final boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t j(@NotNull C7151h1 c7151h1) {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t k(@NotNull V1 v12, E e11) {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.W
    public final void l() {
    }

    @Override // io.sentry.W
    public final void m(@NotNull InterfaceC7217w1 interfaceC7217w1) {
    }

    @Override // io.sentry.W
    public final void n() {
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t o(@NotNull X2 x22, E e11) {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t q(@NotNull String str, @NotNull I2 i22) {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.W
    @NotNull
    public final InterfaceC7142f0 s(@NotNull t3 t3Var, @NotNull u3 u3Var) {
        return Y0.t();
    }

    @Override // io.sentry.W
    public final void setTag(String str, String str2) {
    }

    @Override // io.sentry.W
    @NotNull
    public final U t() {
        return N0.b();
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t v(@NotNull io.sentry.protocol.A a11, q3 q3Var, E e11, C7167l1 c7167l1) {
        return io.sentry.protocol.t.f68325b;
    }

    @Override // io.sentry.W
    public final boolean w() {
        return true;
    }

    @Override // io.sentry.W
    @NotNull
    public final io.sentry.protocol.t z(@NotNull C7230z2 c7230z2, E e11) {
        return io.sentry.protocol.t.f68325b;
    }

    @Deprecated
    @NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public final Object m61clone() throws CloneNotSupportedException {
        return I0.C();
    }
}
