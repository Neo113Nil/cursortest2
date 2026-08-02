package io.sentry.util.thread;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f52808a = Thread.currentThread().getId();

    /* renamed from: b, reason: collision with root package name */
    public static final c f52809b = new c();

    public static c d() {
        return f52809b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return f(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Thread.currentThread().getId();
    }

    public boolean e(long j10) {
        return f52808a == j10;
    }

    public boolean f(Thread thread) {
        return e(thread.getId());
    }
}
