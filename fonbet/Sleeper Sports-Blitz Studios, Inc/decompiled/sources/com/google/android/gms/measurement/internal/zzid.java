package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzid implements Runnable {
    private final /* synthetic */ zzbf zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzhn zzc;

    zzid(zzhn zzhnVar, zzbf zzbfVar, zzn zznVar) {
        this.zza = zzbfVar;
        this.zzb = zznVar;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzc(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
