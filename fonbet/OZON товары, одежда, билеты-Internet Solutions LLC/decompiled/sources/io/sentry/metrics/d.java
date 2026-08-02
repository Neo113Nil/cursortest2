package io.sentry.metrics;

import io.sentry.C2;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.Q2;
import io.sentry.R1;
import io.sentry.R2;
import io.sentry.W2;
import io.sentry.transport.n;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    protected final W2 f68090a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final R1 f68091b;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2 f68093d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Future<?> f68094e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68095f = new io.sentry.util.a();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final n f68096g = new n();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue f68092c = new ConcurrentLinkedQueue();

    /* loaded from: classes10.dex */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e(d.this);
        }
    }

    public d(@NotNull W2 w22, @NotNull R1 r12) {
        this.f68090a = w22;
        this.f68091b = r12;
        this.f68093d = new C2(w22);
    }

    static void e(d dVar) {
        do {
            dVar.f();
        } while (dVar.f68092c.size() >= 1000);
        InterfaceC7097a0 a11 = dVar.f68095f.a();
        try {
            if (!dVar.f68092c.isEmpty()) {
                dVar.g(false);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f68092c;
            Q2 q22 = (Q2) concurrentLinkedQueue.poll();
            if (q22 != null) {
                arrayList.add(q22);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f68091b.r(new R2(arrayList));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f68096g.a();
        }
    }

    private void g(boolean z11) {
        InterfaceC7097a0 a11 = this.f68095f.a();
        try {
            try {
                this.f68094e = this.f68093d.b(new a(), z11 ? 0 : 5000);
            } catch (RejectedExecutionException e11) {
                this.f68090a.getLogger().a(I2.WARNING, "Metrics batch processor flush task rejected", e11);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.metrics.b
    public void a(boolean z11) {
        C2 c22 = this.f68093d;
        if (z11) {
            g(true);
            c22.submit(new QI.b(this, 4));
        } else {
            c22.c(this.f68090a.getShutdownTimeoutMillis());
            while (!this.f68092c.isEmpty()) {
                f();
            }
        }
    }

    @Override // io.sentry.metrics.b
    public final void b(long j11) {
        g(true);
        try {
            n nVar = this.f68096g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            nVar.d(j11);
        } catch (InterruptedException e11) {
            this.f68090a.getLogger().a(I2.ERROR, "Failed to flush metrics events", e11);
            Thread.currentThread().interrupt();
        }
    }
}
