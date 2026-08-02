package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
final class zzlb implements Runnable {
    final /* synthetic */ zzlm zza;
    final /* synthetic */ zzll zzb;

    zzlb(zzll zzllVar, zzlm zzlmVar) {
        this.zzb = zzllVar;
        this.zza = zzlmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}
