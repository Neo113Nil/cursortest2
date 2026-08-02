package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzkz implements Runnable {
    private final /* synthetic */ zzkt zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzks zzc;

    zzkz(zzks zzksVar, zzkt zzktVar, long j) {
        this.zza = zzktVar;
        this.zzb = j;
        this.zzc = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzo().zza((zzkt) null);
    }
}
