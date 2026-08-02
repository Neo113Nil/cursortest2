package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdii implements zzimi {
    private final zzdif zza;

    private zzdii(zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    public static zzdii zza(zzdif zzdifVar) {
        return new zzdii(zzdifVar);
    }

    public static Set zzc(zzdif zzdifVar) {
        Set emptySet = Collections.emptySet();
        zzimq.zzb(emptySet);
        return emptySet;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
