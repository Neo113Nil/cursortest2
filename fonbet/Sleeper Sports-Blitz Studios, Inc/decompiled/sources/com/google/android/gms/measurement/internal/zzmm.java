package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzmm {
    final /* synthetic */ zzml zza;
    private zzmp zzb;

    zzmm(zzml zzmlVar) {
        this.zza = zzmlVar;
    }

    final void zza(long j) {
        Handler handler;
        this.zzb = new zzmp(this, this.zza.zzb().currentTimeMillis(), j);
        handler = this.zza.zzc;
        handler.postDelayed(this.zzb, 2000L);
    }

    final void zza() {
        Handler handler;
        this.zza.zzt();
        if (this.zzb != null) {
            handler = this.zza.zzc;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
    }
}
