package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfec implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzfec(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
    }

    public static zzfec zzc(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzfec(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfea zzb() {
        return new zzfea(zzcqy.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzcng) this.zzb).zza());
    }
}
