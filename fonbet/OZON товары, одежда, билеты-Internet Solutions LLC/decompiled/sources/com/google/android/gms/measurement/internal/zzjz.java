package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes9.dex */
final class zzjz implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzkd zzb;

    zzjz(zzkd zzkdVar, ComponentName componentName) {
        this.zzb = zzkdVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzke.zzo(this.zzb.zza, this.zza);
    }
}
