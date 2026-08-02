package s7;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 extends l1 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f22677k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public c1 f22678c;

    /* renamed from: d, reason: collision with root package name */
    public c1 f22679d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f22680e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f22681f;

    /* renamed from: g, reason: collision with root package name */
    public final a1 f22682g;

    /* renamed from: h, reason: collision with root package name */
    public final a1 f22683h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f22684i;
    public final Semaphore j;

    public d1(f1 f1Var) {
        super(f1Var);
        this.f22684i = new Object();
        this.j = new Semaphore(2);
        this.f22680e = new PriorityBlockingQueue();
        this.f22681f = new LinkedBlockingQueue();
        this.f22682g = new a1(this, "Thread death: Uncaught exception on worker thread");
        this.f22683h = new a1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // c0.x
    public final void j() {
        if (Thread.currentThread() != this.f22678c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // s7.l1
    public final boolean k() {
        return false;
    }

    public final void n() {
        if (Thread.currentThread() != this.f22679d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void o() {
        if (Thread.currentThread() == this.f22678c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f22678c;
    }

    public final b1 q(Callable callable) {
        l();
        b1 b1Var = new b1(this, callable, false);
        if (Thread.currentThread() != this.f22678c) {
            w(b1Var);
            return b1Var;
        }
        if (!this.f22680e.isEmpty()) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22906i.a("Callable skipped the worker queue.");
        }
        b1Var.run();
        return b1Var;
    }

    public final b1 r(Callable callable) {
        l();
        b1 b1Var = new b1(this, callable, true);
        if (Thread.currentThread() == this.f22678c) {
            b1Var.run();
            return b1Var;
        }
        w(b1Var);
        return b1Var;
    }

    public final void s(Runnable runnable) {
        l();
        g6.v.h(runnable);
        w(new b1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object t(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            d1 d1Var = ((f1) this.f3328a).f22746g;
            f1.m(d1Var);
            d1Var.s(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                l0 l0Var = n0Var.f22906i;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                l0Var.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void u(Runnable runnable) {
        l();
        w(new b1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void v(Runnable runnable) {
        l();
        b1 b1Var = new b1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f22684i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f22681f;
                linkedBlockingQueue.add(b1Var);
                c1 c1Var = this.f22679d;
                if (c1Var == null) {
                    c1 c1Var2 = new c1(this, "Measurement Network", linkedBlockingQueue);
                    this.f22679d = c1Var2;
                    c1Var2.setUncaughtExceptionHandler(this.f22683h);
                    this.f22679d.start();
                } else {
                    c1Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(b1 b1Var) {
        synchronized (this.f22684i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f22680e;
                priorityBlockingQueue.add(b1Var);
                c1 c1Var = this.f22678c;
                if (c1Var == null) {
                    c1 c1Var2 = new c1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f22678c = c1Var2;
                    c1Var2.setUncaughtExceptionHandler(this.f22682g);
                    this.f22678c.start();
                } else {
                    c1Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
