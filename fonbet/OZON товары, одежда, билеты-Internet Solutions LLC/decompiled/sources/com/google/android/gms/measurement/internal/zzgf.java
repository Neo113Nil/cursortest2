package com.google.android.gms.measurement.internal;

import N3.C3661l;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class zzgf extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzgh zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgf(zzgh zzghVar, Runnable runnable, boolean z11, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzghVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgh.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z11;
        if (andIncrement == Long.MAX_VALUE) {
            C3661l.b(zzghVar.zzs, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzgf zzgfVar = (zzgf) obj;
        boolean z11 = this.zza;
        if (z11 != zzgfVar.zza) {
            return !z11 ? 1 : -1;
        }
        long j11 = this.zzc;
        long j12 = zzgfVar.zzc;
        if (j11 < j12) {
            return -1;
        }
        if (j11 > j12) {
            return 1;
        }
        this.zzb.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzay().zzd().zzb(this.zzd, th2);
        if ((th2 instanceof zzgd) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgf(zzgh zzghVar, Callable callable, boolean z11, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzghVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzgh.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z11;
        if (andIncrement == Long.MAX_VALUE) {
            C3661l.b(zzghVar.zzs, "Tasks index overflow");
        }
    }
}
