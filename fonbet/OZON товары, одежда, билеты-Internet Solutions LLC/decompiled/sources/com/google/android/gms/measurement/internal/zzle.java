package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzle implements Callable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzll zzb;

    zzle(zzll zzllVar, zzq zzqVar) {
        this.zzb = zzllVar;
        this.zza = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzai zzh = this.zzb.zzh((String) Preconditions.checkNotNull(this.zza.zza));
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (zzh.zzi(zzahVar) && zzai.zzb(this.zza.zzv).zzi(zzahVar)) {
            return this.zzb.zzd(this.zza).zzu();
        }
        this.zzb.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
