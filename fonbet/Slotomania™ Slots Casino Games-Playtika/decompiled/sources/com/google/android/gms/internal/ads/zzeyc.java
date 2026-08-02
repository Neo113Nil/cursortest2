package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzeyc implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzeyc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzeyc zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzeyc(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfak zzfakVar;
        zzezj zzb = ((zzezl) this.zza).zzb();
        zzewm zzewmVar = (zzewm) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("60")) {
            zzfakVar = new zzfak(zzewmVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzom)).intValue(), scheduledExecutorService);
        } else {
            zzfakVar = new zzfak(zzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzom)).intValue(), scheduledExecutorService);
        }
        return zzfakVar;
    }
}
