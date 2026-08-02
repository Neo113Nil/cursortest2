package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzju implements Runnable {
    final /* synthetic */ zzek zza;
    final /* synthetic */ zzjx zzb;

    zzju(zzjx zzjxVar, zzek zzekVar) {
        this.zzb = zzjxVar;
        this.zza = zzekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzt.zzaA().zzc().zza("Connected to remote service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
