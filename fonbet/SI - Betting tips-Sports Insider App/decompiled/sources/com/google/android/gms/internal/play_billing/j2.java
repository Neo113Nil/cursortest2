package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j2 extends AtomicReference implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final x1 f5487c = new x1();

    /* renamed from: d, reason: collision with root package name */
    public static final x1 f5488d = new x1();

    /* renamed from: a, reason: collision with root package name */
    public final Callable f5489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f5490b;

    public j2(k2 k2Var, Callable callable) {
        this.f5490b = k2Var;
        callable.getClass();
        this.f5489a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        w1 w1Var = null;
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            boolean z7 = runnable instanceof w1;
            x1 x1Var = f5488d;
            if (!z7) {
                if (runnable != x1Var) {
                    break;
                }
            } else {
                w1Var = (w1) runnable;
            }
            i5++;
            if (i5 <= 1000) {
                Thread.yield();
            } else if (runnable == x1Var || compareAndSet(runnable, x1Var)) {
                z5 = Thread.interrupted() || z5;
                LockSupport.park(w1Var);
            }
            runnable = (Runnable) get();
        }
        if (z5) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            k2 k2Var = this.f5490b;
            boolean isDone = k2Var.isDone();
            x1 x1Var = f5487c;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.f5489a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, x1Var)) {
                            a(currentThread);
                        }
                        k2Var.e(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(currentThread, x1Var)) {
                            a(currentThread);
                        }
                        if (o1.f5530f.E(k2Var, null, o1.f5531g)) {
                            o1.h(k2Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(currentThread, x1Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = o1.f5531g;
            }
            if (o1.f5530f.E(k2Var, null, call)) {
                o1.h(k2Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return r4.k.m(runnable == f5487c ? "running=[DONE]" : runnable instanceof w1 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? androidx.appcompat.widget.c1.n("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.f5489a.toString());
    }
}
