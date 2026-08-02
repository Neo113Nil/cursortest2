package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzibo extends zziaz {
    public static final zzibo zza = new zzibo();

    private zzibo() {
    }

    public final void zza(zzibs zzibsVar, zziat zziatVar) throws IOException {
        if (zziatVar == null || (zziatVar instanceof zziau)) {
            zzibsVar.zzj();
            return;
        }
        if (zziatVar instanceof zziax) {
            zziax zzg = zziatVar.zzg();
            if (zzg.zzc()) {
                zzibsVar.zzi(zzg.zzh());
                return;
            } else if (zzg.zza()) {
                zzibsVar.zzh(zzg.zzb());
                return;
            } else {
                zzibsVar.zzg(zzg.zzd());
                return;
            }
        }
        if (zziatVar instanceof zzias) {
            zzibsVar.zzb();
            Iterator it = zziatVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzibsVar, (zziat) it.next());
            }
            zzibsVar.zzc();
            return;
        }
        if (!(zziatVar instanceof zziav)) {
            String valueOf = String.valueOf(zziatVar.getClass());
            String.valueOf(valueOf);
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(valueOf)));
        }
        zzibsVar.zzd();
        for (Map.Entry entry : zziatVar.zze().zzb()) {
            zzibsVar.zzf((String) entry.getKey());
            zza(zzibsVar, (zziat) entry.getValue());
        }
        zzibsVar.zze();
    }
}
