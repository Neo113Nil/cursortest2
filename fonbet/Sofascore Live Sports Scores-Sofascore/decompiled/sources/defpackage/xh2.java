package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xh2 implements ddb {
    public final WeakReference a;
    public final wh2 b = new wh2(this);

    public xh2(uh2 uh2Var) {
        this.a = new WeakReference(uh2Var);
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    public final boolean b(Throwable th) {
        return this.b.k(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        uh2 uh2Var = (uh2) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && uh2Var != null) {
            uh2Var.a = null;
            uh2Var.b = null;
            uh2Var.c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof j7;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
