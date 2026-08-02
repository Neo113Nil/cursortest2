package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface ILogger {
    void a(@NotNull I2 i22, @NotNull String str, Throwable th2);

    void b(@NotNull I2 i22, Throwable th2, @NotNull String str, Object... objArr);

    void c(@NotNull I2 i22, @NotNull String str, Object... objArr);

    boolean d(I2 i22);
}
