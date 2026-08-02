package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzif implements Callable<byte[]> {
    private final /* synthetic */ zzbf zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhn zzc;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzc.zza;
        return zzncVar2.zzm().zza(this.zza, this.zzb);
    }

    zzif(zzhn zzhnVar, zzbf zzbfVar, String str) {
        this.zza = zzbfVar;
        this.zzb = str;
        this.zzc = zzhnVar;
    }
}
