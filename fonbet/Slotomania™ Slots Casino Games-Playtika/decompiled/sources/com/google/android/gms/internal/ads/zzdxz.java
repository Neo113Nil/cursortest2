package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbhj;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdxz implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzdxz(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar4;
    }

    public static zzdxz zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzdxz(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzfei) this.zza).zza();
        Context zza2 = ((zzcng) this.zzb).zza();
        zzhbs zzc = zzfno.zzc();
        Map zzb = ((zzimm) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzge)).booleanValue()) {
            zzbhd zzbhdVar = new zzbhd(new zzbhi(zza2));
            zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzdya
                @Override // com.google.android.gms.internal.ads.zzbhc
                public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar) {
                    zzaVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzdke(new zzdyc(zzbhdVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzimq.zzb(emptySet);
        return emptySet;
    }
}
