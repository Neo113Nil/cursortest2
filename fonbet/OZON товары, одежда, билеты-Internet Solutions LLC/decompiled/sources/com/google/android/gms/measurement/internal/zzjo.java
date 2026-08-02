package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjo extends zzap {
    final /* synthetic */ zzke zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjo(zzke zzkeVar, zzhf zzhfVar) {
        super(zzhfVar);
        this.zza = zzkeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        zzke zzkeVar = this.zza;
        zzkeVar.zzg();
        if (zzkeVar.zzL()) {
            zzkeVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzkeVar.zzs();
        }
    }
}
