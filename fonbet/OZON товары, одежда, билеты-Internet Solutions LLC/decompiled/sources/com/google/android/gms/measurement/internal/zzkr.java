package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzkr extends zzap {
    final /* synthetic */ zzks zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzkr(zzks zzksVar, zzhf zzhfVar) {
        super(zzhfVar);
        this.zza = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        zzks zzksVar = this.zza;
        zzksVar.zzc.zzg();
        zzksVar.zzd(false, false, zzksVar.zzc.zzs.zzav().elapsedRealtime());
        zzksVar.zzc.zzs.zzd().zzf(zzksVar.zzc.zzs.zzav().elapsedRealtime());
    }
}
