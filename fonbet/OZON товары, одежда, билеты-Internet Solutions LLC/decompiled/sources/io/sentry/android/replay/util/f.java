package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f67670a;

    public f() {
        Looper looper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f67670a = new Handler(looper);
    }

    @NotNull
    public final Handler a() {
        return this.f67670a;
    }

    public final boolean b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return this.f67670a.post(runnable);
    }

    public final boolean c(Runnable runnable, long j11) {
        Handler handler = this.f67670a;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, j11);
    }

    public final void d(Runnable runnable) {
        Handler handler = this.f67670a;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }
}
