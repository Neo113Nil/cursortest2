package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzctm implements zzbpe {
    final /* synthetic */ zzctp zza;

    zzctm(zzctp zzctpVar) {
        Objects.requireNonNull(zzctpVar);
        this.zza = zzctpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        zzctp zzctpVar = this.zza;
        if (zzctpVar.zze(map)) {
            zzctpVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzctm.this.zza.zzg().zzl();
                }
            });
        }
    }
}
