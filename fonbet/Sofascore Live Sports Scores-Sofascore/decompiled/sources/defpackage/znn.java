package defpackage;

import com.google.android.gms.internal.cast.zzwa;
import com.google.android.gms.internal.wearable.zzap;
import com.ironsource.U3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class znn extends AtomicReference implements Runnable {
    public static final gl5 d;
    public static final gl5 e;
    public static final gl5 f;
    public static final gl5 g;
    public final /* synthetic */ int a = 0;
    public final Callable b;
    public final /* synthetic */ RunnableFuture c;

    static {
        int i = 7;
        d = new gl5(i);
        e = new gl5(i);
        int i2 = 20;
        f = new gl5(i2);
        g = new gl5(i2);
    }

    public znn(eon eonVar, Callable callable) {
        this.c = eonVar;
        callable.getClass();
        this.b = callable;
    }

    public final void a(Thread thread) {
        Object obj = null;
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) get();
                boolean z = false;
                int i = 0;
                while (true) {
                    boolean z2 = runnable instanceof pln;
                    gl5 gl5Var = e;
                    if (!z2) {
                        if (runnable != gl5Var) {
                            if (z) {
                                thread.interrupt();
                                break;
                            }
                        }
                    } else {
                        obj = (pln) runnable;
                    }
                    i++;
                    if (i <= 1000) {
                        Thread.yield();
                    } else if (runnable == gl5Var || compareAndSet(runnable, gl5Var)) {
                        z = Thread.interrupted() || z;
                        LockSupport.park(obj);
                    }
                    runnable = (Runnable) get();
                }
                break;
            default:
                Runnable runnable2 = (Runnable) get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    boolean z4 = runnable2 instanceof vap;
                    gl5 gl5Var2 = g;
                    if (!z4) {
                        if (runnable2 != gl5Var2) {
                            if (z3) {
                                thread.interrupt();
                                break;
                            }
                        }
                    } else {
                        obj = (vap) runnable2;
                    }
                    i2++;
                    if (i2 <= 1000) {
                        Thread.yield();
                    } else if (runnable2 == gl5Var2 || compareAndSet(runnable2, gl5Var2)) {
                        z3 = Thread.interrupted() || z3;
                        LockSupport.park(obj);
                    }
                    runnable2 = (Runnable) get();
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Object call2;
        int i = this.a;
        Callable callable = this.b;
        RunnableFuture runnableFuture = this.c;
        switch (i) {
            case 0:
                eon eonVar = (eon) runnableFuture;
                Thread currentThread = Thread.currentThread();
                if (compareAndSet(null, currentThread)) {
                    boolean isDone = eonVar.isDone();
                    gl5 gl5Var = d;
                    if (isDone) {
                        call = null;
                    } else {
                        try {
                            call = callable.call();
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread, gl5Var)) {
                                    a(currentThread);
                                }
                                if (yin.g.Z(eonVar, null, new iin(th))) {
                                    zzap.g(eonVar);
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                if (!compareAndSet(currentThread, gl5Var)) {
                                    a(currentThread);
                                }
                                if (yin.g.Z(eonVar, null, yin.d)) {
                                    zzap.g(eonVar);
                                }
                                throw th2;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread, gl5Var)) {
                        a(currentThread);
                    }
                    if (isDone) {
                        return;
                    }
                    if (call == null) {
                        call = yin.d;
                    }
                    if (yin.g.Z(eonVar, null, call)) {
                        zzap.g(eonVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                kbp kbpVar = (kbp) runnableFuture;
                Thread currentThread2 = Thread.currentThread();
                if (compareAndSet(null, currentThread2)) {
                    boolean isDone2 = kbpVar.isDone();
                    gl5 gl5Var2 = f;
                    if (isDone2) {
                        call2 = null;
                    } else {
                        try {
                            call2 = callable.call();
                        } catch (Throwable th3) {
                            try {
                                if (th3 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread2, gl5Var2)) {
                                    a(currentThread2);
                                }
                                if (iap.g.h0(kbpVar, null, new cap(th3))) {
                                    zzwa.g(kbpVar);
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                if (!compareAndSet(currentThread2, gl5Var2)) {
                                    a(currentThread2);
                                }
                                if (iap.g.h0(kbpVar, null, iap.d)) {
                                    zzwa.g(kbpVar);
                                }
                                throw th4;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread2, gl5Var2)) {
                        a(currentThread2);
                    }
                    if (isDone2) {
                        return;
                    }
                    if (call2 == null) {
                        call2 = iap.d;
                    }
                    if (iap.g.h0(kbpVar, null, call2)) {
                        zzwa.g(kbpVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String obj;
        StringBuilder sb;
        int i = this.a;
        Callable callable = this.b;
        String str = "running=[NOT STARTED YET]";
        switch (i) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == d) {
                    str = "running=[DONE]";
                } else if (runnable instanceof pln) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    String name = ((Thread) runnable).getName();
                    str = wt3.m("running=[RUNNING ON ", name, new StringBuilder(String.valueOf(name).length() + 21), U3.j.e);
                }
                obj = callable.toString();
                sb = new StringBuilder(str.length() + 2 + String.valueOf(obj).length());
                break;
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == f) {
                    str = "running=[DONE]";
                } else if (runnable2 instanceof vap) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    String name2 = ((Thread) runnable2).getName();
                    str = wt3.m("running=[RUNNING ON ", name2, new StringBuilder(String.valueOf(name2).length() + 21), U3.j.e);
                }
                obj = callable.toString();
                sb = new StringBuilder(str.length() + 2 + String.valueOf(obj).length());
                break;
        }
        return wt3.m(str, ", ", sb, obj);
    }

    public znn(kbp kbpVar, Callable callable) {
        this.c = kbpVar;
        callable.getClass();
        this.b = callable;
    }
}
