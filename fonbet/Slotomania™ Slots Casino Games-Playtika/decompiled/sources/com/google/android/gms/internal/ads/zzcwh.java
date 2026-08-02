package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcwh implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzcwh(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar2;
        this.zzb = zzimrVar3;
    }

    public static zzcwh zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzcwh(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = Boolean.valueOf(zzcwf.zza()).booleanValue();
        zzelg zzb = ((zzeok) this.zza).zzb();
        zzelg zzb2 = ((zzeqj) this.zzb).zzb();
        if (true != booleanValue) {
            zzb = zzb2;
        }
        return zzb;
    }
}
