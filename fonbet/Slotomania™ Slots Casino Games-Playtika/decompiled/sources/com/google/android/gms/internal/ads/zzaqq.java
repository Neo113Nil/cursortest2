package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzaqq implements zzafa {
    private final zzfh zza;
    private final zzes zzb = new zzes();
    private final int zzc;

    public zzaqq(int i, zzfh zzfhVar, int i2) {
        this.zzc = i;
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaez zza(zzafq zzafqVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzn = zzafqVar.zzn();
        int min = (int) Math.min(112800L, zzafqVar.zzo() - zzn);
        zzes zzesVar = this.zzb;
        zzesVar.zza(min);
        zzafqVar.zzi(zzesVar.zzi(), 0, min);
        int zze = zzesVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzesVar.zzd() >= 188 && (zza2 = (zza = zzarc.zza(zzesVar.zzi(), zzesVar.zzg(), zze)) + TsExtractor.TS_PACKET_SIZE) <= zze) {
            long zzb = zzarc.zzb(zzesVar, zza, this.zzc);
            if (zzb != C.TIME_UNSET) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j) {
                    return j3 == C.TIME_UNSET ? zzaez.zza(zze2, zzn) : zzaez.zzc(zzn + j4);
                }
                j4 = zza;
                if (100000 + zze2 > j) {
                    return zzaez.zzc(zzn + j4);
                }
                j3 = zze2;
            }
            zzesVar.zzh(zza2);
            j2 = zza2;
        }
        return j3 != C.TIME_UNSET ? zzaez.zzb(j3, zzn + j2) : zzaez.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzb() {
        byte[] bArr = zzfk.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
