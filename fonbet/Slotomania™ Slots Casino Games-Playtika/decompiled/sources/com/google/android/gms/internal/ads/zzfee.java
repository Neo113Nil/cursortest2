package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfee implements zzimi {
    private final zzfed zza;

    private zzfee(zzfed zzfedVar) {
        this.zza = zzfedVar;
    }

    public static zzfee zzc(zzfed zzfedVar) {
        return new zzfee(zzfedVar);
    }

    public static String zzd(zzfed zzfedVar) {
        String zza = zzfedVar.zza();
        zzimq.zzb(zza);
        return zza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
