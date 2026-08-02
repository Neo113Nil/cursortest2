package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements io.sentry.util.thread.a {

    /* renamed from: a, reason: collision with root package name */
    private static final d f67194a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f67195b;

    static {
        d dVar = new d();
        new Handler(Looper.getMainLooper()).post(new c());
        f67194a = dVar;
        f67195b = Process.myTid();
    }

    public static d d() {
        return f67194a;
    }

    public static long e(@NotNull Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        return e(Looper.getMainLooper().getThread()) == e(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    @NotNull
    public final String b() {
        return a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long c() {
        return Process.myTid();
    }
}
