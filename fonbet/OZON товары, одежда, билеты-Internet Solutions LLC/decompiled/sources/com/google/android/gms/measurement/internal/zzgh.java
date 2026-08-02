package com.google.android.gms.measurement.internal;

import U7.C4056a;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgh extends zzhe {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);
    private zzgg zzb;
    private zzgg zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    zzgh(zzgk zzgkVar) {
        super(zzgkVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzge(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzge(this, "Thread death: Uncaught exception on network thread");
    }

    static /* bridge */ /* synthetic */ boolean zzr(zzgh zzghVar) {
        boolean z11 = zzghVar.zzj;
        return false;
    }

    private final void zzt(zzgf zzgfVar) {
        synchronized (this.zzh) {
            try {
                this.zzd.add(zzgfVar);
                zzgg zzggVar = this.zzb;
                if (zzggVar == null) {
                    zzgg zzggVar2 = new zzgg(this, "Measurement Worker", this.zzd);
                    this.zzb = zzggVar2;
                    zzggVar2.setUncaughtExceptionHandler(this.zzf);
                    this.zzb.start();
                } else {
                    zzggVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final void zzax() {
        if (Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    final Object zzd(AtomicReference atomicReference, long j11, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzs.zzaz().zzp(runnable);
            try {
                atomicReference.wait(j11);
            } catch (InterruptedException unused) {
                this.zzs.zzay().zzk().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.zzs.zzay().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    @Override // com.google.android.gms.measurement.internal.zzhe
    protected final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final void zzg() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        zzgf zzgfVar = new zzgf(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.zzb) {
            zzt(zzgfVar);
            return zzgfVar;
        }
        if (!this.zzd.isEmpty()) {
            C4056a.a(this.zzs, "Callable skipped the worker queue.");
        }
        zzgfVar.run();
        return zzgfVar;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        zzgf zzgfVar = new zzgf(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzgfVar.run();
            return zzgfVar;
        }
        zzt(zzgfVar);
        return zzgfVar;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzgf zzgfVar = new zzgf(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            try {
                this.zze.add(zzgfVar);
                zzgg zzggVar = this.zzc;
                if (zzggVar == null) {
                    zzgg zzggVar2 = new zzgg(this, "Measurement Network", this.zze);
                    this.zzc = zzggVar2;
                    zzggVar2.setUncaughtExceptionHandler(this.zzg);
                    this.zzc.start();
                } else {
                    zzggVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzt(new zzgf(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        zzt(new zzgf(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.zzb;
    }
}
