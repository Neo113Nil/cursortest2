package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzaga implements zzags {
    private final zzagc zza;
    private final long zzb;

    public zzaga(zzagc zzagcVar, long j) {
        this.zza = zzagcVar;
        this.zzb = j;
    }

    private final zzagt zze(long j, long j2) {
        return new zzagt((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        zzagc zzagcVar = this.zza;
        zzagb zzagbVar = zzagcVar.zzk;
        zzagbVar.getClass();
        long zzb = zzagcVar.zzb(j);
        long[] jArr = zzagbVar.zza;
        int zzo = zzfk.zzo(jArr, zzb, true, false);
        long j2 = zzo == -1 ? 0L : jArr[zzo];
        long[] jArr2 = zzagbVar.zzb;
        zzagt zze = zze(j2, zzo != -1 ? jArr2[zzo] : 0L);
        if (zze.zzb == j || zzo == jArr.length - 1) {
            return new zzagq(zze, zze);
        }
        int i = zzo + 1;
        return new zzagq(zze, zze(jArr[i], jArr2[i]));
    }
}
