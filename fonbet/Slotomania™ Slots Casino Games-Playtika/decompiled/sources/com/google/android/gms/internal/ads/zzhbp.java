package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
abstract class zzhbp extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzhbo(null);
    private static final Runnable zzb = new zzhbo(null);

    zzhbp() {
    }

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzhbn zzhbnVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzhbn)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzhbnVar = (zzhbn) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzhbnVar);
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
            boolean zzd = zzd();
            if (!zzd) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        zzhca.zza(th);
                        if (!compareAndSet(currentThread, zza)) {
                            zzb(currentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzb(currentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzb(currentThread);
            }
            if (zzd) {
                return;
            }
            zzf(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzhbn) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append(X3.j.e);
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzc = zzc();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(zzc).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzc);
        return sb2.toString();
    }

    abstract Object zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(Object obj);

    abstract void zzg(Throwable th);

    final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzhbn zzhbnVar = new zzhbn(this, null);
            zzhbnVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzhbnVar)) {
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
}
