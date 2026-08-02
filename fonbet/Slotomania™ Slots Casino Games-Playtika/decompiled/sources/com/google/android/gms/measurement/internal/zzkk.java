package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzkk {
    final /* synthetic */ zzko zza;
    private zzkj zzb;

    zzkk(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    final void zza(long j) {
        Handler handler;
        this.zzb = new zzkj(this, this.zza.zzt.zzax().currentTimeMillis(), j);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkj zzkjVar = this.zzb;
        if (zzkjVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkjVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
