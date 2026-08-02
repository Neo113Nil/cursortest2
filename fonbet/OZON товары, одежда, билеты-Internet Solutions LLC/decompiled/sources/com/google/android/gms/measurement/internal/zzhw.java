package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
final class zzhw implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzip zzc;

    zzhw(zzip zzipVar, AtomicReference atomicReference, boolean z11) {
        this.zzc = zzipVar;
        this.zza = atomicReference;
        this.zzb = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}
