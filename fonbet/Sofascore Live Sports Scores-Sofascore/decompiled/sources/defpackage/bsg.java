package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bsg extends AtomicReference implements Callable, k55 {
    public static final FutureTask c;
    public static final FutureTask d;
    public final Runnable a;
    public Thread b;

    static {
        gl5 gl5Var = un0.k;
        c = new FutureTask(gl5Var, null);
        d = new FutureTask(gl5Var, null);
    }

    public bsg(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = c;
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.b = null;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.b != Thread.currentThread());
    }
}
