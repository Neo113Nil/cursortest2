package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhj;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdvi implements zzimi {
    private final zzimr zza;

    private zzdvi(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdvi zza(zzimr zzimrVar) {
        return new zzdvi(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbhj.zza.EnumC0126zza enumC0126zza = ((zzdbw) this.zza).zza().zzp.zza == 3 ? zzbhj.zza.EnumC0126zza.REWARDED_INTERSTITIAL : zzbhj.zza.EnumC0126zza.REWARD_BASED_VIDEO_AD;
        zzimq.zzb(enumC0126zza);
        return enumC0126zza;
    }
}
