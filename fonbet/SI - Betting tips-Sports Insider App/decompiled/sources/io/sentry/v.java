package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17190a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17191b = false;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f17192c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public final long f17193d;

    /* renamed from: e, reason: collision with root package name */
    public final ILogger f17194e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17195f;

    /* renamed from: g, reason: collision with root package name */
    public final Queue f17196g;

    public v(long j, ILogger iLogger, String str, s6 s6Var) {
        this.f17193d = j;
        this.f17195f = str;
        this.f17196g = s6Var;
        this.f17194e = iLogger;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.f17190a;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z5) {
        this.f17191b = z5;
        this.f17192c.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z5) {
        this.f17190a = z5;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f17192c.await(this.f17193d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            this.f17194e.e(b5.ERROR, "Exception while awaiting on lock.", e7);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.f17191b;
    }
}
