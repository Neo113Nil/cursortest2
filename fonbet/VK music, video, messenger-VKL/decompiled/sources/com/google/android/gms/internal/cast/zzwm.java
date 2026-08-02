package com.google.android.gms.internal.cast;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
abstract class zzwm extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzwl(null);
    private static final Runnable zzb = new zzwl(null);

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzwk zzwkVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzwk)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzwkVar = (zzwk) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzwkVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean zza2 = zza();
            if (!zza2) {
                try {
                    obj = zzb();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzc(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzg(currentThread);
            }
            if (zza2) {
                return;
            }
            zzc(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzwk) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = tdj.a(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, X3.j.e);
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzf = zzf();
        return tdj.a(new StringBuilder(str.length() + 2 + String.valueOf(zzf).length()), str, ", ", zzf);
    }

    public abstract boolean zza();

    public abstract Object zzb() throws Exception;

    public abstract void zzc(Object obj);

    public abstract void zzd(Throwable th);

    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzwk zzwkVar = new zzwk(this, null);
            zzwkVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzwkVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public abstract String zzf();
}
