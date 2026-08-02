package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzafd implements zzags {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzafd(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        int i = this.zza;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        long[] jArr = this.zze;
        int zzo = zzfk.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long[] jArr2 = this.zzc;
        zzagt zzagtVar = new zzagt(j2, jArr2[zzo]);
        if (zzagtVar.zzb >= j || zzo == this.zza - 1) {
            return new zzagq(zzagtVar, zzagtVar);
        }
        int i = zzo + 1;
        return new zzagq(zzagtVar, new zzagt(jArr[i], jArr2[i]));
    }
}
