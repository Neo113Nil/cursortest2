package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdzq implements zzimi {
    private final zzimr zza;

    private zzdzq(zzdzo zzdzoVar, zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzdzq zza(zzdzo zzdzoVar, zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdzq(zzdzoVar, zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzb = zzdzo.zzb((zzdzy) this.zza.zzb(), zzfno.zzc());
        zzimq.zzb(zzb);
        return zzb;
    }
}
