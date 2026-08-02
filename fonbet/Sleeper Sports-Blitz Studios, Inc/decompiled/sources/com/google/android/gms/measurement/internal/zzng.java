package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzng implements Callable<String> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zznc zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (!this.zzb.zzb((String) Preconditions.checkNotNull(this.zza.zza)).zzj() || !zzin.zzb(this.zza.zzt).zzj()) {
            this.zzb.zzj().zzp().zza("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        zzf zza = this.zzb.zza(this.zza);
        if (zza != null) {
            return zza.zzad();
        }
        this.zzb.zzj().zzu().zza("App info was null when attempting to get app instance id");
        return null;
    }

    zzng(zznc zzncVar, zzn zznVar) {
        this.zza = zznVar;
        this.zzb = zzncVar;
    }
}
