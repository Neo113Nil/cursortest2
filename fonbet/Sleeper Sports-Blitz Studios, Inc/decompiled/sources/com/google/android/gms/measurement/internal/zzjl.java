package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzjl implements FutureCallback<Object> {
    private final /* synthetic */ zzmu zza;
    private final /* synthetic */ zziz zzb;

    zzjl(zziz zzizVar, zzmu zzmuVar) {
        this.zza = zzmuVar;
        this.zzb = zzizVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) {
        int i;
        int i2;
        int i3;
        int i4;
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbh.zzcg)) {
            this.zzb.zzar();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
            return;
        }
        this.zzb.zzal().add(this.zza);
        i = this.zzb.zzi;
        if (i > 64) {
            this.zzb.zzi = 1;
            this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzfw.zza(this.zzb.zzg().zzad()), zzfw.zza(th.toString()));
            return;
        }
        zzfy zzu = this.zzb.zzj().zzu();
        Object zza = zzfw.zza(this.zzb.zzg().zzad());
        i2 = this.zzb.zzi;
        zzu.zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zza, zzfw.zza(String.valueOf(i2)), zzfw.zza(th.toString()));
        zziz zzizVar = this.zzb;
        i3 = zzizVar.zzi;
        zziz.zzb(zzizVar, i3);
        zziz zzizVar2 = this.zzb;
        i4 = zzizVar2.zzi;
        zzizVar2.zzi = i4 << 1;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        if (this.zzb.zze().zza(zzbh.zzcg)) {
            SparseArray<Long> zzh = this.zzb.zzk().zzh();
            zzh.put(this.zza.zzc, Long.valueOf(this.zza.zzb));
            this.zzb.zzk().zza(zzh);
            this.zzb.zzh = false;
            this.zzb.zzi = 1;
            this.zzb.zzj().zzc().zza("Successfully registered trigger URI", this.zza.zza);
            this.zzb.zzar();
            return;
        }
        this.zzb.zzh = false;
        this.zzb.zzar();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }
}
