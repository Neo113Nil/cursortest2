package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdnr implements zzimi {
    private final zzimr zza;

    private zzdnr(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdnr zza(zzimr zzimrVar) {
        return new zzdnr(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdno) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzimq.zzb(singleton);
        return singleton;
    }
}
