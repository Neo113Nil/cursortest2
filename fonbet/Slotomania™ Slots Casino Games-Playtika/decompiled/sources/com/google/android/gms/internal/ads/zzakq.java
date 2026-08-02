package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzakq implements zzakn {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzakq(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzakq zze(zzakp zzakpVar, long j) {
        long zzb = zzakpVar.zzb();
        if (zzb == C.TIME_UNSET) {
            return null;
        }
        zzagm zzagmVar = zzakpVar.zza;
        return new zzakq(j, zzagmVar.zzc, zzb, zzagmVar.zzf, zzakpVar.zzc, zzakpVar.zzg);
    }

    private final long zzi(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        if (!zzb()) {
            zzagt zzagtVar = new zzagt(0L, this.zza + this.zzb);
            return new zzagq(zzagtVar, zzagtVar);
        }
        long j2 = this.zzc;
        String str = zzfk.zza;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        long j3 = this.zze;
        zzagt zzagtVar2 = new zzagt(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzagq(zzagtVar2, zzagtVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        long[] jArr2 = jArr;
        double d = (j2 * 256.0d) / this.zze;
        int zzo = zzfk.zzo(jArr2, (long) d, true, true);
        long zzi = zzi(zzo);
        long j3 = jArr2[zzo];
        int i = zzo + 1;
        long zzi2 = zzi(i);
        return zzi + Math.round((j3 == (zzo == 99 ? 256L : jArr2[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (zzi2 - zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return this.zzd;
    }
}
