package defpackage;

import com.google.android.gms.internal.cast.zzwf;
import com.ironsource.U3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kbp extends zzwf implements RunnableFuture {
    public volatile znn h;

    public kbp(Callable callable) {
        this.h = new znn(this, callable);
    }

    @Override // com.google.android.gms.internal.cast.zzwa
    public final void d() {
        znn znnVar;
        Object obj = this.a;
        if ((obj instanceof bap) && ((bap) obj).a && (znnVar = this.h) != null) {
            gl5 gl5Var = znn.g;
            gl5 gl5Var2 = znn.f;
            Runnable runnable = (Runnable) znnVar.get();
            if (runnable instanceof Thread) {
                vap vapVar = new vap(znnVar);
                vapVar.a(Thread.currentThread());
                if (znnVar.compareAndSet(runnable, vapVar)) {
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

    @Override // com.google.android.gms.internal.cast.zzwa
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
