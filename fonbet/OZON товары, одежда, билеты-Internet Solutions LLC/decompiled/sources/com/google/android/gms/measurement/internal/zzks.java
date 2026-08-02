package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoo;

/* loaded from: classes.dex */
final class zzks {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzku zzc;
    private final zzap zzd;

    public zzks(zzku zzkuVar) {
        this.zzc = zzkuVar;
        this.zzd = new zzkr(this, zzkuVar.zzs);
        long elapsedRealtime = zzkuVar.zzs.zzav().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    final void zzb(long j11) {
        this.zzd.zzb();
    }

    final void zzc(long j11) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j11;
        this.zzb = j11;
    }

    public final boolean zzd(boolean z11, boolean z12, long j11) {
        this.zzc.zzg();
        this.zzc.zza();
        zzoo.zzc();
        if (!this.zzc.zzs.zzf().zzs(null, zzen.zzae)) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        } else if (this.zzc.zzs.zzJ()) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        }
        long j12 = j11 - this.zza;
        if (!z11 && j12 < 1000) {
            this.zzc.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j12));
            return false;
        }
        if (!z12) {
            j12 = j11 - this.zzb;
            this.zzb = j11;
        }
        this.zzc.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j12));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j12);
        zzlt.zzK(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
        if (!z12) {
            this.zzc.zzs.zzq().zzH("auto", "_e", bundle);
        }
        this.zza = j11;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
