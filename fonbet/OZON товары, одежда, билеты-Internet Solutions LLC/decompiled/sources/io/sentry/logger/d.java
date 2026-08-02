package io.sentry.logger;

import io.sentry.C2;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.K2;
import io.sentry.M2;
import io.sentry.R1;
import io.sentry.W2;
import io.sentry.transport.n;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    protected final W2 f68065a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final R1 f68066b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue f68067c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2 f68068d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Future<?> f68069e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68070f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final n f68071g;

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e(d.this);
        }
    }

    public d(@NotNull W2 w22, @NotNull R1 r12) {
        C2 c22 = new C2(w22);
        this.f68070f = new io.sentry.util.a();
        this.f68071g = new n();
        this.f68065a = w22;
        this.f68066b = r12;
        this.f68067c = new ConcurrentLinkedQueue();
        this.f68068d = c22;
    }

    static void e(d dVar) {
        do {
            dVar.f();
        } while (dVar.f68067c.size() >= 100);
        InterfaceC7097a0 a11 = dVar.f68070f.a();
        try {
            if (!dVar.f68067c.isEmpty()) {
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
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f68067c;
            K2 k22 = (K2) concurrentLinkedQueue.poll();
            if (k22 != null) {
                arrayList.add(k22);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f68066b.q(new M2(arrayList));
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f68071g.a();
        }
    }

    private void g(boolean z11) {
        InterfaceC7097a0 a11 = this.f68070f.a();
        try {
            try {
                this.f68069e = this.f68068d.b(new a(), z11 ? 0 : 5000);
            } catch (RejectedExecutionException e11) {
                this.f68065a.getLogger().a(I2.WARNING, "Logs batch processor flush task rejected", e11);
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

    @Override // io.sentry.logger.b
    public void a(boolean z11) {
        C2 c22 = this.f68068d;
        if (z11) {
            g(true);
            c22.submit(new MW.a(this, 3));
        } else {
            c22.c(this.f68065a.getShutdownTimeoutMillis());
            while (!this.f68067c.isEmpty()) {
                f();
            }
        }
    }

    @Override // io.sentry.logger.b
    public final void b(long j11) {
        g(true);
        try {
            n nVar = this.f68071g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            nVar.d(j11);
        } catch (InterruptedException e11) {
            this.f68065a.getLogger().a(I2.ERROR, "Failed to flush log events", e11);
            Thread.currentThread().interrupt();
        }
    }
}
