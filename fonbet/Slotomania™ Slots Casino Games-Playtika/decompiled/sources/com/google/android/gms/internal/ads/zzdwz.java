package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbhj;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdwz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzdwz(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
        this.zze = zzimrVar5;
    }

    public static zzdwz zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        return new zzdwz(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcng) this.zza).zza();
        final String zzb = ((zzeem) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcnw) this.zzc).zza();
        final zzbhj.zza.EnumC0126zza enumC0126zza = (zzbhj.zza.EnumC0126zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbhd zzbhdVar = new zzbhd(new zzbhi(zza));
        zzbhj.zzar.zza zzs = zzbhj.zzar.zzs();
        zzs.zzc(zza2.buddyApkVersion);
        zzs.zzg(zza2.clientJarVersion);
        zzs.zzk(true != zza2.isClientJar ? 2 : 0);
        final zzbhj.zzar zzbu = zzs.zzbu();
        zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.internal.ads.zzbhc
            public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                zzbhj.zza.zzb zzcc = zzaVar.zzY().zzcc();
                zzcc.zzc(zzbhj.zza.EnumC0126zza.this);
                zzaVar.zzaa(zzcc);
                zzbhj.zzm.zza zzcc2 = zzaVar.zzG().zzcc();
                zzcc2.zzd(zzb);
                zzcc2.zzs(zzbu);
                zzaVar.zzI(zzcc2);
                zzaVar.zzh(str);
            }
        });
        return zzbhdVar;
    }
}
