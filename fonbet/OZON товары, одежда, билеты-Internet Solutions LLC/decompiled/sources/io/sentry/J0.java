package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J0 implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    private static final J0 f66646a = new J0();

    public static J0 e() {
        return f66646a;
    }

    @Override // io.sentry.ILogger
    public final void a(@NotNull I2 i22, @NotNull String str, Throwable th2) {
    }

    @Override // io.sentry.ILogger
    public final void b(@NotNull I2 i22, Throwable th2, @NotNull String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull I2 i22, @NotNull String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public final boolean d(I2 i22) {
        return false;
    }
}
