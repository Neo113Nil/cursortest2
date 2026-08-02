package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcwb implements zzdcz {
    private final zzcki zza;
    private final zzdyz zzb;
    private final zzfjt zzc;

    zzcwb(zzcki zzckiVar, zzdyz zzdyzVar, zzfjt zzfjtVar) {
        this.zza = zzckiVar;
        this.zzb = zzdyzVar;
        this.zzc = zzfjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        zzcki zzckiVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzor)).booleanValue() || (zzckiVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzckiVar.zzE()) ? "0" : "1";
        zzdyy zza = this.zzb.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(this.zzc);
        zza.zzd();
    }
}
