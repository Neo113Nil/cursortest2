package com.google.android.gms.measurement.internal;

import T7.E;

/* loaded from: classes9.dex */
final class zzkw extends zzap {
    final /* synthetic */ zzkx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzkw(zzkx zzkxVar, zzhf zzhfVar) {
        super(zzhfVar);
        this.zza = zzkxVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        this.zza.zza();
        E.g(this.zza.zzs, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzW();
    }
}
