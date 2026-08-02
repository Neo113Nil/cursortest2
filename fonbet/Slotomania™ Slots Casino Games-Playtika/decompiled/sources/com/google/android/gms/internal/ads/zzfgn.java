package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfgn implements zzfmu {
    private final zzfhk zza;

    public zzfgn(zzfhk zzfhkVar) {
        this.zza = zzfhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final ListenableFuture zza(zzfmv zzfmvVar) {
        zzfgq zzfgqVar = (zzfgq) zzfmvVar;
        return ((zzfgm) this.zza).zzb(zzfgqVar.zzb, zzfgqVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final void zzb(zzfmk zzfmkVar) {
        zzfmkVar.zza = ((zzfgm) this.zza).zza();
    }
}
