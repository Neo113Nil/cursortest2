package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzafz {
    public static boolean zzb(zzafq zzafqVar, zzafy zzafyVar) throws IOException {
        zzafqVar.zzl();
        zzer zzerVar = new zzer(new byte[4], 4);
        zzafqVar.zzi(zzerVar.zza, 0, 4);
        boolean zzi = zzerVar.zzi();
        int zzj = zzerVar.zzj(7);
        int zzj2 = zzerVar.zzj(24) + 4;
        if (zzj == 0) {
            byte[] bArr = new byte[38];
            zzafqVar.zzc(bArr, 0, 38);
            zzafyVar.zza = new zzagc(bArr, 4);
            return zzi;
        }
        zzagc zzagcVar = zzafyVar.zza;
        if (zzagcVar == null) {
            throw new IllegalArgumentException();
        }
        if (zzj == 3) {
            zzes zzesVar = new zzes(zzj2);
            zzafqVar.zzc(zzesVar.zzi(), 0, zzj2);
            zzafyVar.zza = zzagcVar.zze(zzc(zzesVar));
            return zzi;
        }
        if (zzj == 4) {
            zzes zzesVar2 = new zzes(zzj2);
            zzafqVar.zzc(zzesVar2.zzi(), 0, zzj2);
            zzesVar2.zzk(4);
            zzafyVar.zza = new zzagc(zzagcVar.zza, zzagcVar.zzb, zzagcVar.zzc, zzagcVar.zzd, zzagcVar.zze, zzagcVar.zzg, zzagcVar.zzh, zzagcVar.zzj, zzagcVar.zzk, zzagcVar.zzd(zzahh.zzc(Arrays.asList(zzahh.zzb(zzesVar2, false, false).zza))));
            return zzi;
        }
        if (zzj != 6) {
            zzafqVar.zzf(zzj2);
            return zzi;
        }
        zzes zzesVar3 = new zzes(zzj2);
        zzafqVar.zzc(zzesVar3.zzi(), 0, zzj2);
        zzesVar3.zzk(4);
        zzafyVar.zza = new zzagc(zzagcVar.zza, zzagcVar.zzb, zzagcVar.zzc, zzagcVar.zzd, zzagcVar.zze, zzagcVar.zzg, zzagcVar.zzh, zzagcVar.zzj, zzagcVar.zzk, zzagcVar.zzd(new zzap(zzgvz.zzj(zzaiv.zzb(zzesVar3)))));
        return zzi;
    }

    public static zzagb zzc(zzes zzesVar) {
        zzesVar.zzk(1);
        int zzx = zzesVar.zzx();
        long zzg = zzesVar.zzg();
        long j = zzx;
        int i = zzx / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzD = zzesVar.zzD();
            if (zzD == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzD;
            jArr2[i2] = zzesVar.zzD();
            zzesVar.zzk(2);
            i2++;
        }
        zzesVar.zzk((int) ((zzg + j) - zzesVar.zzg()));
        return new zzagb(jArr, jArr2);
    }

    public static zzap zza(zzafq zzafqVar, boolean z) throws IOException {
        zzap zza = new zzagk().zza(zzafqVar, z ? null : zzajg.zza, 0);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
