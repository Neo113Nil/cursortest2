package io.sentry.hints;

import io.sentry.I2;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class d implements f, i {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f67971a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private final long f67972b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f67973c;

    public d(long j11, @NotNull ILogger iLogger) {
        this.f67972b = j11;
        this.f67973c = iLogger;
    }

    @Override // io.sentry.hints.f
    public final void b() {
        this.f67971a.countDown();
    }

    @Override // io.sentry.hints.i
    public final boolean h() {
        try {
            return this.f67971a.await(this.f67972b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            this.f67973c.a(I2.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e11);
            return false;
        }
    }
}
