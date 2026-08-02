package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzfpp implements zzhbf {
    final /* synthetic */ zzfps zza;
    final /* synthetic */ zzfpi zzb;

    zzfpp(zzfps zzfpsVar, zzfpi zzfpiVar) {
        this.zza = zzfpsVar;
        this.zzb = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfpi zzfpiVar = this.zzb;
        zzfpiVar.zzj(th);
        zzfpiVar.zzd(false);
        this.zza.zza(zzfpiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
    }
}
