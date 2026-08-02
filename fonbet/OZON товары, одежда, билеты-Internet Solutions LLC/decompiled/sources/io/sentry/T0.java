package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    private static final T0 f66743a = new T0();

    @NotNull
    public static T0 d() {
        return f66743a;
    }

    @Override // io.sentry.Z
    public final void a() {
    }

    @Override // io.sentry.Z
    @NotNull
    public final Future<?> b(@NotNull Runnable runnable, long j11) {
        return new FutureTask(new S0());
    }

    @Override // io.sentry.Z
    public final void c(long j11) {
    }

    @Override // io.sentry.Z
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.Z
    @NotNull
    public final Future<?> submit(@NotNull Runnable runnable) {
        return new FutureTask(new S0());
    }
}
