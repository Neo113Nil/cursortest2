package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzagl implements zzags {
    private final zzeg zza;
    private final zzeg zzb;
    private long zzc;

    public zzagl(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgsw.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzeg(length2);
            this.zzb = new zzeg(length2);
        } else {
            int i = length2 + 1;
            zzeg zzegVar = new zzeg(i);
            this.zza = zzegVar;
            zzeg zzegVar2 = new zzeg(i);
            this.zzb = zzegVar2;
            zzegVar.zza(0L);
            zzegVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        zzeg zzegVar = this.zzb;
        if (zzegVar.zzd() == 0) {
            zzagt zzagtVar = zzagt.zza;
            return new zzagq(zzagtVar, zzagtVar);
        }
        int zzp = zzfk.zzp(zzegVar, j, true, true);
        long zzc = zzegVar.zzc(zzp);
        zzeg zzegVar2 = this.zza;
        zzagt zzagtVar2 = new zzagt(zzc, zzegVar2.zzc(zzp));
        if (zzagtVar2.zzb == j || zzp == zzegVar.zzd() - 1) {
            return new zzagq(zzagtVar2, zzagtVar2);
        }
        int i = zzp + 1;
        return new zzagq(zzagtVar2, new zzagt(zzegVar.zzc(i), zzegVar2.zzc(i)));
    }
}
