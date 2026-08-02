package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzie implements Callable<zzal> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzhn zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzal call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        return new zzal(zzncVar2.zza(this.zza.zza));
    }

    zzie(zzhn zzhnVar, zzn zznVar) {
        this.zza = zznVar;
        this.zzb = zzhnVar;
    }
}
