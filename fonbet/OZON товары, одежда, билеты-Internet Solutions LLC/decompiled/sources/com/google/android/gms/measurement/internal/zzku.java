package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzku extends zzf {
    protected final zzkt zza;
    protected final zzks zzb;
    protected final zzkq zzc;
    private Handler zzd;

    zzku(zzgk zzgkVar) {
        super(zzgkVar);
        this.zza = new zzkt(this);
        this.zzb = new zzks(this);
        this.zzc = new zzkq(this);
    }

    static /* bridge */ /* synthetic */ void zzj(zzku zzkuVar, long j11) {
        zzkuVar.zzg();
        zzkuVar.zzm();
        zzkuVar.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j11));
        zzkuVar.zzc.zza(j11);
        if (zzkuVar.zzs.zzf().zzu()) {
            zzkuVar.zzb.zzb(j11);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(zzku zzkuVar, long j11) {
        zzkuVar.zzg();
        zzkuVar.zzm();
        zzkuVar.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j11));
        if (zzkuVar.zzs.zzf().zzu() || zzkuVar.zzs.zzm().zzl.zzb()) {
            zzkuVar.zzb.zzc(j11);
        }
        zzkuVar.zzc.zzb();
        zzkt zzktVar = zzkuVar.zza;
        zzktVar.zza.zzg();
        if (zzktVar.zza.zzs.zzJ()) {
            zzktVar.zzb(zzktVar.zza.zzs.zzav().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }
}
