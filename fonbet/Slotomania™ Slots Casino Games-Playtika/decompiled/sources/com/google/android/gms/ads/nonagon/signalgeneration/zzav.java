package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzimi;
import com.google.android.gms.internal.ads.zzimq;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzav implements zzimi {
    private final zzat zza;

    private zzav(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public static zzav zza(zzat zzatVar) {
        return new zzav(zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        String zzb = this.zza.zzb();
        zzimq.zzb(zzb);
        return zzb;
    }
}
