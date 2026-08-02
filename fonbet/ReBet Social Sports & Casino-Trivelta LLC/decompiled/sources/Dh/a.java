package Dh;

import Bh.l;
import Bh.x;
import Dh.a;
import androidx.lifecycle.AbstractC2177b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import qh.InterfaceC6172A;
import qh.k;
import qh.r;
import qh.t;
import uh.InterfaceC6579c;
import yh.C6896e;
import zh.ThreadFactoryC7006n;

/* loaded from: classes3.dex */
public final class a implements x {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f2769d = Logger.getLogger(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final String f2770e = a.class.getSimpleName() + "_WorkerThread";

    /* renamed from: f, reason: collision with root package name */
    public static final oh.e f2771f = oh.e.a("processorType");

    /* renamed from: g, reason: collision with root package name */
    public static final oh.e f2772g = oh.e.b("dropped");

    /* renamed from: h, reason: collision with root package name */
    public static final String f2773h = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2774a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2775b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2776c = new AtomicBoolean(false);

    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final k f2777a;

        /* renamed from: b, reason: collision with root package name */
        public final oh.g f2778b;

        /* renamed from: c, reason: collision with root package name */
        public final oh.g f2779c;

        /* renamed from: d, reason: collision with root package name */
        public final h f2780d;

        /* renamed from: e, reason: collision with root package name */
        public final long f2781e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2782f;

        /* renamed from: g, reason: collision with root package name */
        public final long f2783g;

        /* renamed from: h, reason: collision with root package name */
        public long f2784h;

        /* renamed from: i, reason: collision with root package name */
        public final Queue f2785i;

        /* renamed from: j, reason: collision with root package name */
        public final AtomicInteger f2786j;

        /* renamed from: k, reason: collision with root package name */
        public final BlockingQueue f2787k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicReference f2788l;

        /* renamed from: m, reason: collision with root package name */
        public volatile boolean f2789m;

        /* renamed from: n, reason: collision with root package name */
        public final ArrayList f2790n;

        public static /* synthetic */ void c(C6896e c6896e, C6896e c6896e2, C6896e c6896e3) {
            if (c6896e.f() && c6896e2.f()) {
                c6896e3.k();
            } else {
                c6896e3.b();
            }
        }

        public static /* synthetic */ void d(b bVar, final C6896e c6896e, final C6896e c6896e2) {
            bVar.f2789m = false;
            final C6896e shutdown = bVar.f2780d.shutdown();
            shutdown.l(new Runnable() { // from class: Dh.e
                @Override // java.lang.Runnable
                public final void run() {
                    a.b.c(C6896e.this, shutdown, c6896e2);
                }
            });
        }

        public final void l(l lVar) {
            if (!this.f2785i.offer(lVar)) {
                this.f2777a.a(1L, this.f2778b);
            } else if (this.f2785i.size() >= this.f2786j.get()) {
                this.f2787k.offer(Boolean.TRUE);
            }
        }

        public final void m() {
            if (this.f2790n.isEmpty()) {
                return;
            }
            try {
                C6896e O10 = this.f2780d.O(Collections.unmodifiableList(this.f2790n));
                O10.g(this.f2783g, TimeUnit.NANOSECONDS);
                if (O10.f()) {
                    this.f2777a.a(this.f2790n.size(), this.f2779c);
                } else {
                    a.f2769d.log(Level.FINE, "Exporter failed");
                }
            } finally {
                try {
                } finally {
                }
            }
        }

        public final void n() {
            int size = this.f2785i.size();
            while (size > 0) {
                this.f2790n.add(((l) this.f2785i.poll()).c());
                size--;
                if (this.f2790n.size() >= this.f2782f) {
                    m();
                }
            }
            m();
            C6896e c6896e = (C6896e) this.f2788l.get();
            if (c6896e != null) {
                c6896e.k();
                this.f2788l.set(null);
            }
        }

        public final C6896e o() {
            if (AbstractC2177b.a(this.f2788l, null, new C6896e())) {
                this.f2787k.offer(Boolean.TRUE);
            }
            C6896e c6896e = (C6896e) this.f2788l.get();
            return c6896e == null ? C6896e.j() : c6896e;
        }

        public final C6896e p() {
            final C6896e c6896e = new C6896e();
            final C6896e o10 = o();
            o10.l(new Runnable() { // from class: Dh.d
                @Override // java.lang.Runnable
                public final void run() {
                    a.b.d(a.b.this, o10, c6896e);
                }
            });
            return c6896e;
        }

        public final void q() {
            this.f2784h = System.nanoTime() + this.f2781e;
        }

        @Override // java.lang.Runnable
        public void run() {
            q();
            while (this.f2789m) {
                if (this.f2788l.get() != null) {
                    n();
                }
                Eh.d.a(this.f2785i, this.f2782f - this.f2790n.size(), new Consumer() { // from class: Dh.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        a.b.this.f2790n.add(((l) obj).c());
                    }
                });
                if (this.f2790n.size() >= this.f2782f || System.nanoTime() >= this.f2784h) {
                    m();
                    q();
                }
                if (this.f2785i.isEmpty()) {
                    try {
                        long nanoTime = this.f2784h - System.nanoTime();
                        if (nanoTime > 0) {
                            this.f2786j.set(this.f2782f - this.f2790n.size());
                            this.f2787k.poll(nanoTime, TimeUnit.NANOSECONDS);
                            this.f2786j.set(Integer.MAX_VALUE);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }

        public b(h hVar, t tVar, long j10, int i10, long j11, final Queue queue) {
            this.f2786j = new AtomicInteger(Integer.MAX_VALUE);
            this.f2788l = new AtomicReference();
            this.f2789m = true;
            this.f2780d = hVar;
            this.f2781e = j10;
            this.f2782f = i10;
            this.f2783g = j11;
            this.f2785i = queue;
            this.f2787k = new ArrayBlockingQueue(1);
            r build = tVar.e("io.opentelemetry.sdk.trace").build();
            build.b("queueSize").a().c("The number of items queued").a("1").b(new Consumer() { // from class: Dh.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Queue queue2 = queue;
                    ((InterfaceC6172A) obj).a(queue2.size(), oh.g.b(a.f2771f, a.f2773h));
                }
            });
            this.f2777a = build.a("processedSpans").a("1").c("The number of spans processed by the BatchSpanProcessor. [dropped=true if they were dropped due to high throughput]").build();
            this.f2778b = oh.g.c(a.f2771f, a.f2773h, a.f2772g, Boolean.TRUE);
            this.f2779c = oh.g.c(a.f2771f, a.f2773h, a.f2772g, Boolean.FALSE);
            this.f2790n = new ArrayList(i10);
        }
    }

    public a(h hVar, boolean z10, t tVar, long j10, int i10, int i11, long j11) {
        this.f2774a = z10;
        b bVar = new b(hVar, tVar, j10, i11, j11, Eh.d.c(i10));
        this.f2775b = bVar;
        new ThreadFactoryC7006n(f2770e).newThread(bVar).start();
    }

    public static g J(h hVar) {
        return new g(hVar);
    }

    @Override // Bh.x
    public boolean F() {
        return false;
    }

    @Override // Bh.x
    public void M1(l lVar) {
        if (lVar != null) {
            if (this.f2774a || lVar.a().b()) {
                this.f2775b.l(lVar);
            }
        }
    }

    @Override // Bh.x
    public boolean S1() {
        return true;
    }

    @Override // Bh.x
    public C6896e T() {
        return this.f2775b.o();
    }

    @Override // Bh.x
    public C6896e shutdown() {
        return this.f2776c.getAndSet(true) ? C6896e.j() : this.f2775b.p();
    }

    public String toString() {
        return "BatchSpanProcessor{spanExporter=" + this.f2775b.f2780d + ", exportUnsampledSpans=" + this.f2774a + ", scheduleDelayNanos=" + this.f2775b.f2781e + ", maxExportBatchSize=" + this.f2775b.f2782f + ", exporterTimeoutNanos=" + this.f2775b.f2783g + '}';
    }

    @Override // Bh.x
    public void D1(InterfaceC6579c interfaceC6579c, Bh.k kVar) {
    }
}
