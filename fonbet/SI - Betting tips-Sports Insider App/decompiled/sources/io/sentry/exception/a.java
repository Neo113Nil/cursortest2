package io.sentry.exception;

import io.sentry.protocol.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;

    /* renamed from: a, reason: collision with root package name */
    public final m f16383a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f16384b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f16385c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16386d;

    public a(m mVar, Throwable th2, Thread thread, boolean z5) {
        this.f16383a = mVar;
        y4.a.C(th2, "Throwable is required.");
        this.f16384b = th2;
        y4.a.C(thread, "Thread is required.");
        this.f16385c = thread;
        this.f16386d = z5;
    }
}
