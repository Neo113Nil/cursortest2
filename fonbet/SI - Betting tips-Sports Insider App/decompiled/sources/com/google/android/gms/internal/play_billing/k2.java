package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k2 extends t1 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile j2 f5493h;

    public k2(Callable callable) {
        this.f5493h = new j2(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.o1
    public final String c() {
        j2 j2Var = this.f5493h;
        return j2Var != null ? androidx.appcompat.widget.c1.n("task=[", j2Var.toString(), "]") : super.c();
    }

    @Override // com.google.android.gms.internal.play_billing.o1
    public final void d() {
        j2 j2Var;
        Object obj = this.f5532a;
        if ((obj instanceof d1) && ((d1) obj).f5423a && (j2Var = this.f5493h) != null) {
            x1 x1Var = j2.f5488d;
            x1 x1Var2 = j2.f5487c;
            Runnable runnable = (Runnable) j2Var.get();
            if (runnable instanceof Thread) {
                w1 w1Var = new w1(j2Var);
                w1Var.setExclusiveOwnerThread(Thread.currentThread());
                if (j2Var.compareAndSet(runnable, w1Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) j2Var.getAndSet(x1Var2)) == x1Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) j2Var.getAndSet(x1Var2)) == x1Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th2;
                    }
                }
            }
        }
        this.f5493h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        j2 j2Var = this.f5493h;
        if (j2Var != null) {
            j2Var.run();
        }
        this.f5493h = null;
    }
}
