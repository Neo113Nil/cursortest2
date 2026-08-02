package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.protocol.v;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f16480a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public final long f16481b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f16482c;

    public c(long j, ILogger iLogger) {
        this.f16481b = j;
        this.f16482c = iLogger;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f16480a.await(this.f16481b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            this.f16482c.e(b5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e7);
            return false;
        }
    }

    public abstract boolean f(v vVar);

    public abstract void g(v vVar);
}
