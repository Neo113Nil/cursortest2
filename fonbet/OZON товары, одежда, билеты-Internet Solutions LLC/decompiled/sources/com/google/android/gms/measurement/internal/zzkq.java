package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzkq {
    final /* synthetic */ zzku zza;
    private zzkp zzb;

    zzkq(zzku zzkuVar) {
        this.zza = zzkuVar;
    }

    final void zza(long j11) {
        Handler handler;
        this.zzb = new zzkp(this, this.zza.zzs.zzav().currentTimeMillis(), j11);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkp zzkpVar = this.zzb;
        if (zzkpVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkpVar);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
