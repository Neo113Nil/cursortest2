package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzby extends zzcw {
    final /* synthetic */ zzcc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzby(zzcc zzccVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcw
    public final void zza() {
        zzcc zzccVar = this.zza;
        com.google.android.gms.analytics.zzr.zzh();
        if (zzccVar.zzg()) {
            zzccVar.zzO("Inactivity, disconnecting from device AnalyticsService");
            zzccVar.zzc();
        }
    }
}
