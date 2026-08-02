package androidx.media3.effect;

import b1.V;
import e1.AbstractC4134a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20847a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f20848b;

    /* renamed from: c, reason: collision with root package name */
    public final Future f20849c;

    /* renamed from: d, reason: collision with root package name */
    public final a f20850d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20851e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Queue f20852f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public boolean f20853g;

    public interface a {
        void a(V v10);
    }

    public interface b {
        void run();
    }

    public r(ExecutorService executorService, boolean z10, a aVar) {
        this.f20848b = executorService;
        this.f20849c = executorService.submit(new Callable() { // from class: l1.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Thread.currentThread();
            }
        });
        this.f20847a = z10;
        this.f20850d = aVar;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b(r rVar, b bVar) {
        rVar.getClass();
        try {
            bVar.run();
        } catch (Exception e10) {
            rVar.f(e10);
        }
    }

    public static /* synthetic */ void c(r rVar, boolean z10, b bVar) {
        b bVar2;
        rVar.getClass();
        try {
            synchronized (rVar.f20851e) {
                try {
                    if (rVar.f20853g && z10) {
                        return;
                    }
                    while (true) {
                        synchronized (rVar.f20851e) {
                            bVar2 = (b) rVar.f20852f.poll();
                        }
                        if (bVar2 == null) {
                            bVar.run();
                            return;
                        }
                        bVar2.run();
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            rVar.f(e10);
        }
    }

    public static /* synthetic */ void d(r rVar, CountDownLatch countDownLatch) {
        synchronized (rVar.f20851e) {
            rVar.f20853g = false;
        }
        countDownLatch.countDown();
    }

    public void e() {
        synchronized (this.f20851e) {
            this.f20853g = true;
            this.f20852f.clear();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        n(new b() { // from class: l1.d1
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.r.d(androidx.media3.effect.r.this, countDownLatch);
            }
        }, false);
        countDownLatch.await();
    }

    public final void f(Exception exc) {
        synchronized (this.f20851e) {
            try {
                if (this.f20853g) {
                    return;
                }
                this.f20853g = true;
                this.f20850d.a(V.a(exc));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(final b bVar) {
        if (h()) {
            try {
                bVar.run();
                return;
            } catch (Exception e10) {
                f(e10);
                return;
            }
        }
        try {
            this.f20848b.submit(new Runnable() { // from class: l1.c1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.effect.r.b(androidx.media3.effect.r.this, bVar);
                }
            }).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e11) {
            f(e11);
        }
    }

    public final boolean h() {
        try {
            return Thread.currentThread() == ((Thread) this.f20849c.get(500L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e10) {
            throw e10;
        } catch (Exception e11) {
            f(e11);
            return false;
        }
    }

    public void i(b bVar) {
        AbstractC4134a.g(!h());
        synchronized (this.f20851e) {
            this.f20853g = true;
            this.f20852f.clear();
        }
        n(bVar, false);
        if (this.f20847a) {
            this.f20848b.shutdown();
            if (this.f20848b.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f20850d.a(new V("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    public void j(b bVar) {
        k(bVar, true);
    }

    public void k(b bVar, boolean z10) {
        synchronized (this.f20851e) {
            if (this.f20853g && z10) {
                return;
            }
            try {
                n(bVar, z10);
                e = null;
            } catch (RejectedExecutionException e10) {
                e = e10;
            }
            if (e != null) {
                f(e);
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f20851e) {
            try {
                if (this.f20853g) {
                    return;
                }
                this.f20852f.add(bVar);
                j(new b() { // from class: l1.b1
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        androidx.media3.effect.r.a();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() {
        try {
            AbstractC4134a.g(h());
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            f(e10);
        }
    }

    public final Future n(final b bVar, final boolean z10) {
        return this.f20848b.submit(new Runnable() { // from class: l1.a1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.effect.r.c(androidx.media3.effect.r.this, z10, bVar);
            }
        });
    }
}
