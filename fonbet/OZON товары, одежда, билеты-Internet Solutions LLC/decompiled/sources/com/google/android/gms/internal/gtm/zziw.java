package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zziw implements Runnable {
    final /* synthetic */ zzix zza;

    zziw(zzix zzixVar) {
        this.zza = zzixVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjn zzjnVar;
        zzhl.zzd("App's UI deactivated. Dispatching hits.");
        zzjnVar = this.zza.zza.zzg;
        zzjnVar.zza();
    }
}
