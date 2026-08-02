package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface Y {
    void a(boolean z11);

    void b(long j11);

    @NotNull
    io.sentry.protocol.t c(@NotNull X2 x22, U u11, E e11);

    @NotNull
    io.sentry.protocol.t d(@NotNull io.sentry.protocol.A a11, q3 q3Var, U u11, E e11, C7167l1 c7167l1);

    default boolean e() {
        return true;
    }

    void f(@NotNull h3 h3Var, E e11);

    @NotNull
    io.sentry.protocol.t g(@NotNull C7230z2 c7230z2, U u11, E e11);

    io.sentry.transport.m h();

    boolean isEnabled();

    @NotNull
    io.sentry.protocol.t j(@NotNull C7151h1 c7151h1);

    io.sentry.protocol.t k(@NotNull V1 v12, E e11);
}
