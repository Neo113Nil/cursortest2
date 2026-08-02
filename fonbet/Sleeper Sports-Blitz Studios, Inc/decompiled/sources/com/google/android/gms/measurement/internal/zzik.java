package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzik implements Callable<List<zznq>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzhn zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zznq> call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        return zzncVar2.zzf().zzk(this.zza);
    }

    zzik(zzhn zzhnVar, String str) {
        this.zza = str;
        this.zzb = zzhnVar;
    }
}
