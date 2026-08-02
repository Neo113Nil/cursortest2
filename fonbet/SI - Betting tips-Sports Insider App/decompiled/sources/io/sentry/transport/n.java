package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.j0;
import io.sentry.k4;
import io.sentry.l4;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final int f17138a;

    /* renamed from: b, reason: collision with root package name */
    public k4 f17139b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f17140c;

    /* renamed from: d, reason: collision with root package name */
    public final l4 f17141d;

    /* renamed from: e, reason: collision with root package name */
    public final i2.d f17142e;

    public n(int i5, j0 j0Var, a aVar, ILogger iLogger, l4 l4Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), j0Var, aVar);
        this.f17139b = null;
        this.f17142e = new i2.d((byte) 0, 9);
        this.f17138a = i5;
        this.f17140c = iLogger;
        this.f17141d = l4Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        i2.d dVar = this.f17142e;
        try {
            super.afterExecute(runnable, th2);
        } finally {
            p pVar = (p) dVar.f10882b;
            int i5 = p.f17143a;
            pVar.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        com.appsflyer.internal.h.g(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        i2.d dVar = this.f17142e;
        p pVar = (p) dVar.f10882b;
        p pVar2 = (p) dVar.f10882b;
        int a7 = p.a(pVar);
        int i5 = this.f17138a;
        ILogger iLogger = this.f17140c;
        l4 l4Var = this.f17141d;
        if (a7 >= i5) {
            this.f17139b = l4Var.a();
            iLogger.h(b5.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        p.b(pVar2);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e7) {
            pVar2.releaseShared(1);
            this.f17139b = l4Var.a();
            iLogger.e(b5.WARNING, "Submit rejected by thread pool executor", e7);
            return new m();
        }
    }
}
