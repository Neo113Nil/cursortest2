package io.sentry.util.thread;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f68599a = Thread.currentThread().getId();

    /* renamed from: b, reason: collision with root package name */
    private static final c f68600b = new c();

    public static c d() {
        return f68600b;
    }

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        return f68599a == Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.a
    @NotNull
    public final String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long c() {
        return Thread.currentThread().getId();
    }
}
