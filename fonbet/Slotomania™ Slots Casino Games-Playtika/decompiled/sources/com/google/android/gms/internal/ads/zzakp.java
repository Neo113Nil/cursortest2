package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzakp {
    public final zzagm zza;
    public final long zzb;
    public final long zzc;
    public final zzakl zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzakp(zzagm zzagmVar, long j, long j2, long[] jArr, zzakl zzaklVar, int i, int i2) {
        this.zza = new zzagm(zzagmVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzg = jArr;
        this.zzd = zzaklVar;
        this.zze = i;
        this.zzf = i2;
    }

    public static zzakp zza(zzagm zzagmVar, zzes zzesVar) {
        long[] jArr;
        int i;
        int i2;
        int zzB = zzesVar.zzB();
        int zzH = (zzB & 1) != 0 ? zzesVar.zzH() : -1;
        long zzz = (zzB & 2) != 0 ? zzesVar.zzz() : -1L;
        zzakl zzaklVar = null;
        if ((zzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzesVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzB & 8) != 0) {
            zzesVar.zzk(4);
        }
        if (zzesVar.zzd() >= 24) {
            zzesVar.zzk(11);
            zzaklVar = zzakl.zzb(Float.intBitsToFloat(zzesVar.zzB()), zzesVar.zzt(), zzesVar.zzt());
            zzesVar.zzk(2);
            int zzx = zzesVar.zzx();
            i2 = zzx & 4095;
            i = zzx >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzakp(zzagmVar, zzH, zzz, jArr, zzaklVar, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return C.TIME_UNSET;
        }
        return zzfk.zzt((j * r4.zzg) - 1, this.zza.zzd);
    }
}
