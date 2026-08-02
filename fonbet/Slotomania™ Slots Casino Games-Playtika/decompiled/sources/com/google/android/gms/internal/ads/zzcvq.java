package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcvq implements zzimi {
    private final zzcvg zza;
    private final zzimr zzb;

    private zzcvq(zzcvg zzcvgVar, zzimr zzimrVar) {
        this.zza = zzcvgVar;
        this.zzb = zzimrVar;
    }

    public static zzcvq zza(zzcvg zzcvgVar, zzimr zzimrVar) {
        return new zzcvq(zzcvgVar, zzimrVar);
    }

    public static Set zzc(zzcvg zzcvgVar, zzcww zzcwwVar) {
        Set singleton = Collections.singleton(new zzdke(zzcwwVar, zzcff.zzh));
        zzimq.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcww) this.zzb.zzb());
    }
}
