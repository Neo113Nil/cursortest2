package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzexm implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzexm(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
    }

    public static zzexm zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzexm(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object zzb = ((zzetq) this.zza).zzb();
        Object obj = (zzewm) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("2")) {
            zzb = obj;
        }
        zzimq.zzb(zzb);
        return (zzfby) zzb;
    }
}
