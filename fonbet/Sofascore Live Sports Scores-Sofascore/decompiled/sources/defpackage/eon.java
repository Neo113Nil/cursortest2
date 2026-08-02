package defpackage;

import com.google.android.gms.internal.wearable.zzau;
import com.ironsource.U3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eon extends zzau implements RunnableFuture {
    public volatile znn h;

    public eon(Callable callable) {
        this.h = new znn(this, callable);
    }

    @Override // com.google.android.gms.internal.wearable.zzap
    public final void d() {
        znn znnVar;
        Object obj = this.a;
        if ((obj instanceof hin) && ((hin) obj).a && (znnVar = this.h) != null) {
            gl5 gl5Var = znn.e;
            gl5 gl5Var2 = znn.d;
            Runnable runnable = (Runnable) znnVar.get();
            if (runnable instanceof Thread) {
                pln plnVar = new pln(znnVar);
                plnVar.a(Thread.currentThread());
                if (znnVar.compareAndSet(runnable, plnVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) znnVar.getAndSet(gl5Var2)) == gl5Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) znnVar.getAndSet(gl5Var2)) == gl5Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.h = null;
    }

    @Override // com.google.android.gms.internal.wearable.zzap
    public final String e() {
        znn znnVar = this.h;
        if (znnVar == null) {
            return super.e();
        }
        String znnVar2 = znnVar.toString();
        return wt3.m("task=[", znnVar2, new StringBuilder(znnVar2.length() + 7), U3.j.e);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        znn znnVar = this.h;
        if (znnVar != null) {
            znnVar.run();
        }
        this.h = null;
    }
}
