package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzftg implements Runnable {
    final /* synthetic */ zzftl zza;

    zzftg(zzftl zzftlVar) {
        Objects.requireNonNull(zzftlVar);
        this.zza = zzftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzftl zzftlVar = this.zza;
        if (zzftlVar.zzI() != null) {
            zzfsp zzI = zzftlVar.zzI();
            Clock zzJ = zzftlVar.zzJ();
            zzI.zzj(zzJ.currentTimeMillis(), zzftlVar.zzK(), zzftlVar.zze.zzd, zzftlVar.zzH());
        }
    }
}
