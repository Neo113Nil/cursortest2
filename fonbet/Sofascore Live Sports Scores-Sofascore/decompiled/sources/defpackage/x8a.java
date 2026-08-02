package defpackage;

import com.ironsource.U3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class x8a extends AtomicReference implements Runnable {
    public static final gl5 b;
    public static final gl5 c;
    public static final gl5 d;
    public static final gl5 e;
    public final /* synthetic */ int a;

    static {
        int i = 2;
        b = new gl5(i);
        c = new gl5(i);
        int i2 = 16;
        d = new gl5(i2);
        e = new gl5(i2);
    }

    public /* synthetic */ x8a(int i) {
        this.a = i;
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public void d() {
        gl5 gl5Var = c;
        gl5 gl5Var2 = b;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            w8a w8aVar = new w8a(this);
            w8aVar.a(Thread.currentThread());
            if (compareAndSet(runnable, w8aVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(gl5Var2)) == gl5Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean g();

    public abstract Object h();

    public abstract String i();

    public void j(Thread thread) {
        Runnable runnable = (Runnable) get();
        w8a w8aVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof w8a;
            gl5 gl5Var = c;
            if (!z2 && runnable != gl5Var) {
                break;
            }
            if (z2) {
                w8aVar = (w8a) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == gl5Var || compareAndSet(runnable, gl5Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(w8aVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object k();

    public void l(Thread thread) {
        Runnable runnable = (Runnable) get();
        ylo yloVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof ylo;
            gl5 gl5Var = e;
            if (!z2) {
                if (runnable != gl5Var) {
                    break;
                }
            } else {
                yloVar = (ylo) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == gl5Var || compareAndSet(runnable, gl5Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(yloVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract String m();

    public abstract boolean n();

    public abstract void o(Object obj);

    public abstract void p(Throwable th);

    public void q() {
        gl5 gl5Var = e;
        gl5 gl5Var2 = d;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ylo yloVar = new ylo(this);
            yloVar.a(Thread.currentThread());
            if (compareAndSet(runnable, yloVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(gl5Var2)) == gl5Var) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(gl5Var2)) == gl5Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        switch (this.a) {
            case 0:
                Thread currentThread = Thread.currentThread();
                if (compareAndSet(null, currentThread)) {
                    boolean g = g();
                    gl5 gl5Var = b;
                    if (!g) {
                        try {
                            obj = h();
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread, gl5Var)) {
                                    j(currentThread);
                                }
                                if (g) {
                                    return;
                                }
                                a(th);
                                return;
                            } finally {
                                if (!compareAndSet(currentThread, gl5Var)) {
                                    j(currentThread);
                                }
                                if (!g) {
                                    b(null);
                                }
                            }
                        }
                    }
                    if (g) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                Thread currentThread2 = Thread.currentThread();
                if (compareAndSet(null, currentThread2)) {
                    boolean n = n();
                    gl5 gl5Var2 = d;
                    if (!n) {
                        try {
                            obj = k();
                        } catch (Throwable th2) {
                            try {
                                if (th2 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread2, gl5Var2)) {
                                    l(currentThread2);
                                }
                                p(th2);
                                return;
                            } catch (Throwable th3) {
                                if (!compareAndSet(currentThread2, gl5Var2)) {
                                    l(currentThread2);
                                }
                                o(null);
                                throw th3;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread2, gl5Var2)) {
                        l(currentThread2);
                    }
                    if (n) {
                        return;
                    }
                    o(obj);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str = "running=[NOT STARTED YET]";
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == b) {
                    str = "running=[DONE]";
                } else if (runnable instanceof w8a) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    str = "running=[RUNNING ON " + ((Thread) runnable).getName() + U3.j.e;
                }
                StringBuilder r = mz1.r(str, ", ");
                r.append(i());
                return r.toString();
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == d) {
                    str = "running=[DONE]";
                } else if (runnable2 instanceof ylo) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    String name = ((Thread) runnable2).getName();
                    str = wt3.m("running=[RUNNING ON ", name, new StringBuilder(String.valueOf(name).length() + 21), U3.j.e);
                }
                String m = m();
                return wt3.m(str, ", ", new StringBuilder(str.length() + 2 + String.valueOf(m).length()), m);
        }
    }
}
