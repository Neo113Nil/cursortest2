package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzako implements zzakn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzako(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzako zze(long j, long j2, zzagm zzagmVar, zzes zzesVar) {
        int zzs;
        zzes zzesVar2 = zzesVar;
        zzesVar2.zzk(6);
        int zzB = zzesVar2.zzB();
        long j3 = zzagmVar.zzc;
        long j4 = zzB;
        if (zzesVar2.zzB() <= 0) {
            return null;
        }
        long zzt = zzfk.zzt((r4 * zzagmVar.zzg) - 1, zzagmVar.zzd);
        int zzt2 = zzesVar2.zzt();
        int zzt3 = zzesVar2.zzt();
        int zzt4 = zzesVar2.zzt();
        zzesVar2.zzk(2);
        long[] jArr = new long[zzt2];
        long[] jArr2 = new long[zzt2];
        int i = 0;
        long j5 = j2 + zzagmVar.zzc;
        while (i < zzt2) {
            long j6 = j3;
            jArr[i] = (i * zzt) / zzt2;
            jArr2[i] = j5;
            if (zzt4 == 1) {
                zzs = zzesVar2.zzs();
            } else if (zzt4 == 2) {
                zzs = zzesVar2.zzt();
            } else if (zzt4 == 3) {
                zzs = zzesVar2.zzx();
            } else {
                if (zzt4 != 4) {
                    return null;
                }
                zzs = zzesVar2.zzH();
            }
            j5 += zzs * zzt3;
            i++;
            zzesVar2 = zzesVar;
            zzt2 = zzt2;
            j3 = j6;
        }
        long j7 = j2 + j3;
        long j8 = j7 + j4;
        if (j != -1 && j != j8) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(j8).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j8);
            zzef.zzc("VbriSeeker", sb.toString());
        }
        if (j8 != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 43 + String.valueOf(j5).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(j8);
            sb2.append(", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzef.zzc("VbriSeeker", sb2.toString());
            j8 = Math.max(j8, j5);
        }
        return new zzako(jArr, jArr2, zzt, j7, j8, zzagmVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        long[] jArr = this.zza;
        int zzo = zzfk.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long[] jArr2 = this.zzb;
        zzagt zzagtVar = new zzagt(j2, jArr2[zzo]);
        if (zzagtVar.zzb >= j || zzo == jArr.length - 1) {
            return new zzagq(zzagtVar, zzagtVar);
        }
        int i = zzo + 1;
        return new zzagq(zzagtVar, new zzagt(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzf(long j) {
        return this.zza[zzfk.zzo(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakn
    public final int zzh() {
        return this.zze;
    }
}
