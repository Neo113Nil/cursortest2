package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
final class zzhx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzip zzb;

    zzhx(zzip zzipVar, long j11) {
        this.zzb = zzipVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzM(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
