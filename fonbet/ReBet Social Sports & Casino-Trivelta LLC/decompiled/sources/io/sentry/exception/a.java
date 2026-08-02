package io.sentry.exception;

import io.sentry.protocol.m;
import io.sentry.util.w;

/* loaded from: classes3.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;

    /* renamed from: a, reason: collision with root package name */
    public final m f52034a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f52035b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f52036c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52037d;

    public a(m mVar, Throwable th2, Thread thread, boolean z10) {
        this.f52034a = (m) w.c(mVar, "Mechanism is required.");
        this.f52035b = (Throwable) w.c(th2, "Throwable is required.");
        this.f52036c = thread;
        this.f52037d = z10;
    }

    public m a() {
        return this.f52034a;
    }

    public Thread b() {
        return this.f52036c;
    }

    public Throwable c() {
        return this.f52035b;
    }

    public boolean d() {
        return this.f52037d;
    }

    public a(m mVar, Throwable th2, Thread thread) {
        this(mVar, th2, thread, false);
    }
}
