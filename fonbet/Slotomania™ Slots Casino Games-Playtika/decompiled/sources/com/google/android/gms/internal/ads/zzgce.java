package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgce implements zzimi {
    private final zzimr zza;

    private zzgce(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzgce zza(zzimr zzimrVar) {
        return new zzgce(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhbs zzb = zzhbz.zzb((ExecutorService) this.zza.zzb());
        zzimq.zzb(zzb);
        return zzb;
    }
}
