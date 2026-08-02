package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzii implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzip zzb;

    zzii(zzip zzipVar, Boolean bool) {
        this.zzb = zzipVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzad(this.zza, true);
    }
}
