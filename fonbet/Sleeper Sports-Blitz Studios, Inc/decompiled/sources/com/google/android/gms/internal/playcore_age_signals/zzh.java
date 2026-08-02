package com.google.android.gms.internal.playcore_age_signals;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes7.dex */
final class zzh extends zze {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzo zzoVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zze zzeVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzeVar;
        Objects.requireNonNull(zzoVar);
        this.zzc = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        Object obj;
        AtomicInteger atomicInteger;
        zzd zzdVar;
        zzo zzoVar = this.zzc;
        obj = zzoVar.zzg;
        synchronized (obj) {
            zzo.zzo(zzoVar, this.zza);
            atomicInteger = zzoVar.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzdVar = zzoVar.zzc;
                zzdVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzo.zzq(zzoVar, this.zzb);
        }
    }
}
