package io.sentry.exception;

import io.sentry.protocol.l;
import io.sentry.util.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f67888a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f67889b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Thread f67890c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f67891d;

    public a(@NotNull l lVar, @NotNull Throwable th2, @NotNull Thread thread, boolean z11) {
        this.f67888a = lVar;
        p.b(th2, "Throwable is required.");
        this.f67889b = th2;
        p.b(thread, "Thread is required.");
        this.f67890c = thread;
        this.f67891d = z11;
    }

    @NotNull
    public final l a() {
        return this.f67888a;
    }

    @NotNull
    public final Thread b() {
        return this.f67890c;
    }

    @NotNull
    public final Throwable d() {
        return this.f67889b;
    }

    public final boolean e() {
        return this.f67891d;
    }

    public a(@NotNull l lVar, @NotNull Throwable th2, @NotNull Thread thread) {
        this(lVar, th2, thread, false);
    }
}
