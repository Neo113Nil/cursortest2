package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zztn {
    public static final zzgwj zza;

    static {
        zza = Build.VERSION.SDK_INT < 32 ? zzgwj.zzl(12, 252, 6396, 4) : zzgwj.zzn(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    public static int zza(zzqb zzqbVar) {
        int zzb = zzb(zzqbVar.zze());
        if (zzb != 0) {
            return zzb;
        }
        int zzb2 = zzb(zzqbVar.zzd());
        if (zzb2 != 0) {
            return zzb2;
        }
        return 12;
    }

    private static int zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zza.contains(Integer.valueOf(intValue))) {
                return intValue;
            }
        }
        return 0;
    }
}
