package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzafc {
    public static void zza(long j, zzes zzesVar, zzahb[] zzahbVarArr) {
        int i;
        while (true) {
            if (zzesVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzesVar);
            int zzc2 = zzc(zzesVar);
            int zzg = zzesVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzesVar.zzd()) {
                zzef.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzesVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzs = zzesVar.zzs();
                int zzt = zzesVar.zzt();
                if (zzt == 49) {
                    i = zzesVar.zzB();
                    zzt = 49;
                } else {
                    i = 0;
                }
                int zzs2 = zzesVar.zzs();
                if (zzt == 47) {
                    zzesVar.zzk(1);
                    zzt = 47;
                }
                boolean z = zzs == 181 && (zzt == 49 || zzt == 47) && zzs2 == 3;
                if (zzt == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzesVar, zzahbVarArr);
                }
            }
            zzesVar.zzh(zzg);
        }
    }

    public static void zzb(long j, zzes zzesVar, zzahb[] zzahbVarArr) {
        int zzs = zzesVar.zzs();
        if ((zzs & 64) != 0) {
            int i = zzs & 31;
            zzesVar.zzk(1);
            int zzg = zzesVar.zzg();
            for (zzahb zzahbVar : zzahbVarArr) {
                int i2 = i * 3;
                zzesVar.zzh(zzg);
                zzahbVar.zzc(zzesVar, i2);
                zzgsw.zzi(j != C.TIME_UNSET);
                zzahbVar.zze(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzes zzesVar) {
        int i = 0;
        while (zzesVar.zzd() != 0) {
            int zzs = zzesVar.zzs();
            i += zzs;
            if (zzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
