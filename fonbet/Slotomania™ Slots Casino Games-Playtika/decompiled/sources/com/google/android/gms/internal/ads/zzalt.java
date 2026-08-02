package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzalt implements zzags {
    private final long zza;
    private final zzalu[] zzb;
    private final int zzc;

    public zzalt(long j, zzalu[] zzaluVarArr, int i) {
        this.zza = j;
        this.zzb = zzaluVarArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // com.google.android.gms.internal.ads.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzagq zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int zzl;
        int zzb;
        zzalu[] zzaluVarArr = this.zzb;
        if (zzaluVarArr.length == 0) {
            zzagt zzagtVar = zzagt.zza;
            return new zzagq(zzagtVar, zzagtVar);
        }
        int i2 = this.zzc;
        if (i2 != -1) {
            zzame zzameVar = zzaluVarArr[i2].zzb;
            zzl = zzalv.zzl(zzameVar, j);
            if (zzl == -1) {
                zzagt zzagtVar2 = zzagt.zza;
                return new zzagq(zzagtVar2, zzagtVar2);
            }
            long[] jArr = zzameVar.zzf;
            j3 = jArr[zzl];
            long[] jArr2 = zzameVar.zzc;
            j2 = jArr2[zzl];
            if (j3 < j && zzl < zzameVar.zzb - 1 && (zzb = zzameVar.zzb(j)) != -1 && zzb != zzl) {
                j4 = jArr[zzb];
                j5 = jArr2[zzb];
                long j6 = j2;
                long j7 = j5;
                for (i = 0; i < zzaluVarArr.length; i++) {
                    if (i != i2) {
                        zzame zzameVar2 = zzaluVarArr[i].zzb;
                        j6 = zzalv.zzh(zzameVar2, j3, j6);
                        if (j4 != C.TIME_UNSET) {
                            j7 = zzalv.zzh(zzameVar2, j4, j7);
                        }
                    }
                }
                zzagt zzagtVar3 = new zzagt(j3, j6);
                return j4 != C.TIME_UNSET ? new zzagq(zzagtVar3, zzagtVar3) : new zzagq(zzagtVar3, new zzagt(j4, j7));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = C.TIME_UNSET;
        j5 = -1;
        long j62 = j2;
        long j72 = j5;
        while (i < zzaluVarArr.length) {
        }
        zzagt zzagtVar32 = new zzagt(j3, j62);
        if (j4 != C.TIME_UNSET) {
        }
    }
}
