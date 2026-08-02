package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzamy {
    public static void zza(zzamz zzamzVar, zzand zzandVar, zzds zzdsVar) {
        for (int i = 0; i < zzamzVar.zza(); i++) {
            long zzb = zzamzVar.zzb(i);
            List zzc = zzamzVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzamzVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzamzVar.zzb(i + 1) - zzamzVar.zzb(i);
                if (zzb2 > 0) {
                    zzdsVar.zza(new zzamw(zzc, zzb, zzb2));
                }
            }
        }
    }
}
