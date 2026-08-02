package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeem implements zzimi {
    private final zzimr zza;

    private zzeem(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzeem zzc(zzimr zzimrVar) {
        return new zzeem(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcng) this.zza).zza().getPackageName();
        zzimq.zzb(packageName);
        return packageName;
    }
}
