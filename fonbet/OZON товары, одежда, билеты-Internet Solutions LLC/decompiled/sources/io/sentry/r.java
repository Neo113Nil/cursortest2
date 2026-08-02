package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f68404a;

    /* renamed from: b, reason: collision with root package name */
    private final ILogger f68405b;

    public r(@NotNull W2 w22, ILogger iLogger) {
        this.f68404a = w22;
        this.f68405b = iLogger;
    }

    @Override // io.sentry.ILogger
    public final void a(@NotNull I2 i22, @NotNull String str, Throwable th2) {
        ILogger iLogger = this.f68405b;
        if (iLogger == null || !d(i22)) {
            return;
        }
        iLogger.a(i22, str, th2);
    }

    @Override // io.sentry.ILogger
    public final void b(@NotNull I2 i22, Throwable th2, @NotNull String str, Object... objArr) {
        ILogger iLogger = this.f68405b;
        if (iLogger == null || !d(i22)) {
            return;
        }
        iLogger.b(i22, th2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull I2 i22, @NotNull String str, Object... objArr) {
        ILogger iLogger = this.f68405b;
        if (iLogger == null || !d(i22)) {
            return;
        }
        iLogger.c(i22, str, objArr);
    }

    @Override // io.sentry.ILogger
    public final boolean d(I2 i22) {
        W2 w22 = this.f68404a;
        return i22 != null && w22.isDebug() && i22.ordinal() >= w22.getDiagnosticLevel().ordinal();
    }
}
