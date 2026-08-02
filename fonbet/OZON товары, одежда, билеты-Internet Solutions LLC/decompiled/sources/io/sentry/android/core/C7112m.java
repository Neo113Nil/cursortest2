package io.sentry.android.core;

import android.util.Log;
import io.sentry.I2;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7112m implements ILogger {
    @Override // io.sentry.ILogger
    public final void a(@NotNull I2 i22, @NotNull String str, Throwable th2) {
        Log.wtf("Sentry", str, th2);
    }

    @Override // io.sentry.ILogger
    public final void b(@NotNull I2 i22, Throwable th2, @NotNull String str, Object... objArr) {
        if (objArr.length == 0) {
            a(i22, str, th2);
        } else {
            a(i22, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull I2 i22, @NotNull String str, Object... objArr) {
        if (objArr.length == 0) {
            Log.println(7, "Sentry", str);
        } else {
            Log.println(7, "Sentry", String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public final boolean d(I2 i22) {
        return true;
    }
}
