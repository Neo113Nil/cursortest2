package defpackage;

import com.ironsource.U3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class h8p extends AtomicReference implements Runnable {
    public static final g8p a = new g8p();
    public static final g8p b = new g8p();

    public abstract Object d();

    public final void e(Thread thread) {
        Runnable runnable = (Runnable) get();
        f8p f8pVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof f8p;
            g8p g8pVar = b;
            if (!z2) {
                if (runnable != g8pVar) {
                    break;
                }
            } else {
                f8pVar = (f8p) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == g8pVar || compareAndSet(runnable, g8pVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(f8pVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract String g();

    public abstract boolean h();

    public abstract void i(Object obj);

    public abstract void j(Throwable th);

    public final void k() {
        g8p g8pVar = b;
        g8p g8pVar2 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            f8p f8pVar = new f8p(this);
            f8pVar.a(Thread.currentThread());
            if (compareAndSet(runnable, f8pVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(g8pVar2)) == g8pVar) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(g8pVar2)) == g8pVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean h = h();
            g8p g8pVar = a;
            if (!h) {
                try {
                    obj = d();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, g8pVar)) {
                            e(currentThread);
                        }
                        j(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, g8pVar)) {
                            e(currentThread);
                        }
                        i(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, g8pVar)) {
                e(currentThread);
            }
            if (h) {
                return;
            }
            i(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof f8p) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = wt3.m("running=[RUNNING ON ", name, new StringBuilder(String.valueOf(name).length() + 21), U3.j.e);
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String g = g();
        return wt3.m(str, ", ", new StringBuilder(str.length() + 2 + String.valueOf(g).length()), g);
    }
}
