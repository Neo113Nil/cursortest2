package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {

    /* renamed from: d, reason: collision with root package name */
    public final long f15831d;

    /* renamed from: e, reason: collision with root package name */
    public final ILogger f15832e;

    /* renamed from: c, reason: collision with root package name */
    public CountDownLatch f15830c = new CountDownLatch(1);

    /* renamed from: a, reason: collision with root package name */
    public boolean f15828a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15829b = false;

    public r0(long j, ILogger iLogger) {
        this.f15831d = j;
        y4.a.C(iLogger, "ILogger is required.");
        this.f15832e = iLogger;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.f15828a;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z5) {
        this.f15829b = z5;
        this.f15830c.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z5) {
        this.f15828a = z5;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f15830c.await(this.f15831d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            this.f15832e.e(b5.ERROR, "Exception while awaiting on lock.", e7);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.f15829b;
    }
}
