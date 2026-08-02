package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface Z {
    void a();

    @NotNull
    Future<?> b(@NotNull Runnable runnable, long j11) throws RejectedExecutionException;

    void c(long j11);

    boolean isClosed();

    @NotNull
    Future<?> submit(@NotNull Runnable runnable) throws RejectedExecutionException;
}
