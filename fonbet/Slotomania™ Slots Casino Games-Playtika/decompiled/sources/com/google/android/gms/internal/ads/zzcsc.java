package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcsc implements zzimi {
    private final zzimr zza;

    private zzcsc(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcsc zza(zzimr zzimrVar) {
        return new zzcsc(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsb((DeviceTierManager) this.zza.zzb());
    }
}
