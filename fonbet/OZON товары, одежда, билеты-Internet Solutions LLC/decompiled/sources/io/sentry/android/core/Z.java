package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class Z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f67042a = new Handler(Looper.getMainLooper());

    Z() {
    }

    @NotNull
    public final Thread a() {
        return this.f67042a.getLooper().getThread();
    }

    public final void b(@NotNull Runnable runnable) {
        this.f67042a.post(runnable);
    }
}
