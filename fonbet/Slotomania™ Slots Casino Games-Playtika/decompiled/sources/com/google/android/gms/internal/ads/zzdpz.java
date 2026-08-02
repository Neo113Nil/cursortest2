package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdpz implements zzimi {
    private final zzdps zza;

    private zzdpz(zzdps zzdpsVar) {
        this.zza = zzdpsVar;
    }

    public static zzdpz zzc(zzdps zzdpsVar) {
        return new zzdpz(zzdpsVar);
    }

    public static zzdph zzd(zzdps zzdpsVar) {
        zzdph zza = zzdpsVar.zza();
        zzimq.zzb(zza);
        return zza;
    }

    public final zzdph zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
