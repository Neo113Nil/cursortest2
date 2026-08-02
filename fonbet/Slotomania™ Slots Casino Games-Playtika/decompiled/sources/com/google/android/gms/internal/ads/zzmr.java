package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzmr extends zzwq {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmr(zzms zzmsVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmsVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzwq, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.zzb;
        zzbd zzd = zzbfVar.zzd(i, zzbdVar, z);
        if (!zzbfVar.zzb(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzf = true;
            return zzd;
        }
        Object obj = zzbdVar.zza;
        Object obj2 = zzbdVar.zzb;
        int i2 = zzbdVar.zzc;
        long j = zzbdVar.zzd;
        long j2 = zzbdVar.zze;
        zzd.zza(obj, obj2, i2, j, 0L, zzc.zza, true);
        return zzd;
    }
}
