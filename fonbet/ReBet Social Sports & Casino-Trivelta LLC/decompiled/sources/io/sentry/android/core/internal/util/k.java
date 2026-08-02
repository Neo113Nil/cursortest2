package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* loaded from: classes3.dex */
public final class k implements io.sentry.util.thread.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f51133a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f51134b = Process.myTid();

    public k() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.j
            @Override // java.lang.Runnable
            public final void run() {
                k.f51134b = Process.myTid();
            }
        });
    }

    public static k e() {
        return f51133a;
    }

    public static long f(Thread thread) {
        long threadId;
        if (Build.VERSION.SDK_INT < 36) {
            return thread.getId();
        }
        threadId = thread.threadId();
        return threadId;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return i(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    public boolean g(long j10) {
        return f(Looper.getMainLooper().getThread()) == j10;
    }

    public boolean h(io.sentry.protocol.A a10) {
        Long l10 = a10.l();
        return l10 != null && g(l10.longValue());
    }

    public boolean i(Thread thread) {
        return g(f(thread));
    }
}
