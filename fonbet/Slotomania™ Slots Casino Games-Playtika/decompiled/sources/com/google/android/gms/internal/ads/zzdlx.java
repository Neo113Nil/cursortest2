package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdlx implements zzimi {
    private final zzimr zza;

    private zzdlx(zzdlr zzdlrVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdlx zza(zzdlr zzdlrVar, zzimr zzimrVar) {
        return new zzdlx(zzdlrVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdke((zzday) this.zza.zzb(), zzcff.zzh));
        zzimq.zzb(singleton);
        return singleton;
    }
}
