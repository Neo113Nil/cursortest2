package io.sentry.hints;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class d implements f, i {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f52095a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public final long f52096b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f52097c;

    public d(long j10, ILogger iLogger) {
        this.f52096b = j10;
        this.f52097c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void e() {
        this.f52095a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean g() {
        try {
            return this.f52095a.await(this.f52096b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f52097c.b(EnumC4788n3.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
