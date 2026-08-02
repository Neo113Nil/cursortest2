package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcpb implements zzear {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    private final Context zze;
    private final zzbqe zzf;
    private final zzcol zzg;
    private final zzcpb zzh = this;

    zzcpb(zzcol zzcolVar, Context context, zzbqe zzbqeVar) {
        this.zzg = zzcolVar;
        this.zze = context;
        this.zzf = zzbqeVar;
        zzimi zza = zzimj.zza(this);
        this.zza = zza;
        zzimi zza2 = zzimj.zza(zzbqeVar);
        this.zzb = zza2;
        zzean zzc = zzean.zzc(zza2);
        this.zzc = zzc;
        this.zzd = zzimh.zza(zzeap.zza(zza, zzc));
    }

    final zzeam zza() {
        return zzean.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzeao zzb() {
        return (zzeao) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzeaj zzc() {
        return new zzcoy(this.zzg, this.zzh, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
