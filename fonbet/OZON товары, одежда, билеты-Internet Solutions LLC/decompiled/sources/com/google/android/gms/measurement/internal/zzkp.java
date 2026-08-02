package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzkp implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkq zzc;

    zzkp(zzkq zzkqVar, long j11, long j12) {
        this.zzc = zzkqVar;
        this.zza = j11;
        this.zzb = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzko
            @Override // java.lang.Runnable
            public final void run() {
                zzkp zzkpVar = zzkp.this;
                zzkq zzkqVar = zzkpVar.zzc;
                long j11 = zzkpVar.zza;
                long j12 = zzkpVar.zzb;
                zzkqVar.zza.zzg();
                zzkqVar.zza.zzs.zzay().zzc().zza("Application going to the background");
                zzkqVar.zza.zzs.zzm().zzl.zza(true);
                Bundle bundle = new Bundle();
                if (!zzkqVar.zza.zzs.zzf().zzu()) {
                    zzkqVar.zza.zzb.zzb(j12);
                    zzkqVar.zza.zzb.zzd(false, false, j12);
                }
                zzkqVar.zza.zzs.zzq().zzI("auto", "_ab", j11, bundle);
            }
        });
    }
}
