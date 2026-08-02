package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface W {
    @NotNull
    io.sentry.protocol.t A(@NotNull Throwable th2, E e11);

    @NotNull
    W B(@NotNull String str);

    void a(boolean z11);

    void b(long j11);

    void c(String str, String str2);

    @Deprecated
    @NotNull
    /* renamed from: clone */
    N m57clone();

    void d(io.sentry.protocol.E e11);

    boolean e();

    void f(@NotNull C7141f c7141f);

    void g(@NotNull C7141f c7141f, E e11);

    @NotNull
    W2 getOptions();

    io.sentry.transport.m h();

    InterfaceC7142f0 i();

    boolean isEnabled();

    @NotNull
    io.sentry.protocol.t j(@NotNull C7151h1 c7151h1);

    @NotNull
    io.sentry.protocol.t k(@NotNull V1 v12, E e11);

    void l();

    void m(@NotNull InterfaceC7217w1 interfaceC7217w1);

    void n();

    @NotNull
    io.sentry.protocol.t o(@NotNull X2 x22, E e11);

    default void p(@NotNull String str) {
        f(new C7141f(str));
    }

    @NotNull
    io.sentry.protocol.t q(@NotNull String str, @NotNull I2 i22);

    @NotNull
    default io.sentry.protocol.t r(@NotNull C7230z2 c7230z2) {
        return z(c7230z2, new E());
    }

    @NotNull
    InterfaceC7142f0 s(@NotNull t3 t3Var, @NotNull u3 u3Var);

    void setTag(String str, String str2);

    @NotNull
    U t();

    @NotNull
    default io.sentry.protocol.t u(@NotNull Throwable th2) {
        return A(th2, new E());
    }

    @NotNull
    io.sentry.protocol.t v(@NotNull io.sentry.protocol.A a11, q3 q3Var, E e11, C7167l1 c7167l1);

    default boolean w() {
        return false;
    }

    default void x(@NotNull InterfaceC7217w1 interfaceC7217w1) {
        m(interfaceC7217w1);
    }

    @NotNull
    default io.sentry.protocol.t y(@NotNull String str) {
        return q(str, I2.INFO);
    }

    @NotNull
    io.sentry.protocol.t z(@NotNull C7230z2 c7230z2, E e11);
}
