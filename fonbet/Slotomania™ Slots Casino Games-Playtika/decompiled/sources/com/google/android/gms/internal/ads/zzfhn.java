package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfhn implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzfhn(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
    }

    public static zzfhn zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfhn(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfhk zzb() {
        zzfhk zzfhaVar;
        Context context = (Context) this.zza.zzb();
        zzflx zzflxVar = (zzflx) this.zzb.zzb();
        zzfmp zzfmpVar = (zzfmp) this.zzc.zzb();
        zzcem zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhm)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z = false;
        if (zzi != null && zzi.zzi()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzho)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhl)).booleanValue() || z) {
                zzfmo zza = zzfmpVar.zza(zzfmf.Rewarded, context, zzflxVar, new zzfgn(new zzfgm()));
                zzfhb zzfhbVar = new zzfhb(new zzfha());
                zzfmb zzfmbVar = zza.zza;
                zzhbs zzhbsVar = zzcff.zza;
                zzfhaVar = new zzfgr(zzfhbVar, new zzfgx(zzfmbVar, zzhbsVar), zza.zzb, zzfmbVar.zze().zzf, zzhbsVar);
                return zzfhaVar;
            }
        }
        zzfhaVar = new zzfha();
        return zzfhaVar;
    }
}
