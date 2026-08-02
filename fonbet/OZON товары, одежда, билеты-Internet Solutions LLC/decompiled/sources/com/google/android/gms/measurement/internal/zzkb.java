package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes9.dex */
final class zzkb implements Runnable {
    final /* synthetic */ zzkd zza;

    zzkb(zzkd zzkdVar) {
        this.zza = zzkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzke zzkeVar = this.zza.zza;
        Context zzau = zzkeVar.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzke.zzo(zzkeVar, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
