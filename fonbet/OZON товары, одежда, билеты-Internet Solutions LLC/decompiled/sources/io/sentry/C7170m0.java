package io.sentry;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7170m0 implements S {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Runtime f68076a = Runtime.getRuntime();

    @Override // io.sentry.S
    public final void c() {
    }

    @Override // io.sentry.S
    public final void d(@NotNull C7143f1 c7143f1) {
        Runtime runtime = this.f68076a;
        c7143f1.f(Long.valueOf(runtime.totalMemory() - runtime.freeMemory()));
    }
}
