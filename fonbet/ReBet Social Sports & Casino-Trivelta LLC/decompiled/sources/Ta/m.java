package Ta;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class m extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final Runnable f11382a;

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f11383b;

    public static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final m f11384a;

        public final void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f11384a.toString();
        }

        public b(m mVar) {
            this.f11384a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f11382a = new c();
        f11383b = new c();
    }

    public abstract void a(Throwable th2);

    public abstract void b(Object obj);

    public final void c() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f11382a)) == f11383b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f11383b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f11383b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d10 = d();
            if (!d10) {
                try {
                    obj = e();
                } catch (Throwable th2) {
                    try {
                        u.a(th2);
                        if (!compareAndSet(currentThread, f11382a)) {
                            g(currentThread);
                        }
                        if (d10) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, f11382a)) {
                            g(currentThread);
                        }
                        if (!d10) {
                            b(s.a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f11382a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }

    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
