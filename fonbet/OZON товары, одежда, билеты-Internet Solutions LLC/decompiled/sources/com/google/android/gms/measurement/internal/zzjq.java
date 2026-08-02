package com.google.android.gms.measurement.internal;

import U7.C4056a;

/* loaded from: classes.dex */
final class zzjq extends zzap {
    final /* synthetic */ zzke zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjq(zzke zzkeVar, zzhf zzhfVar) {
        super(zzhfVar);
        this.zza = zzkeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        C4056a.a(this.zza.zzs, "Tasks have been queued for a long time");
    }
}
