package com.google.android.gms.measurement.internal;

import T7.E;
import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzps;

/* loaded from: classes.dex */
final class zzkt {
    final /* synthetic */ zzku zza;

    zzkt(zzku zzkuVar) {
        this.zza = zzkuVar;
    }

    final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzav().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                E.g(this.zza.zzs, "Detected application was in foreground");
                zzc(this.zza.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    final void zzb(long j11, boolean z11) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j11)) {
            this.zza.zzs.zzm().zzg.zza(true);
            zzps.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzen.zzaI)) {
                this.zza.zzs.zzh().zzo();
            }
        }
        this.zza.zzs.zzm().zzj.zzb(j11);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j11, z11);
        }
    }

    @VisibleForTesting
    final void zzc(long j11, boolean z11) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j11);
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzav().elapsedRealtime()));
            long j12 = j11 / 1000;
            this.zza.zzs.zzq().zzaa("auto", "_sid", Long.valueOf(j12), j11);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j12);
            if (this.zza.zzs.zzf().zzs(null, zzen.zzaa) && z11) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzs.zzq().zzI("auto", "_s", j11, bundle);
            zzoc.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzen.zzad)) {
                String zza = this.zza.zzs.zzm().zzo.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzs.zzq().zzI("auto", "_ssr", j11, bundle2);
            }
        }
    }
}
