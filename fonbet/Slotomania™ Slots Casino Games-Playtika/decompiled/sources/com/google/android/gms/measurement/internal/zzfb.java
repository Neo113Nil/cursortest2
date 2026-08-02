package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzfb implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfc zzb;

    zzfb(zzfc zzfcVar, boolean z) {
        this.zzb = zzfcVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlgVar = this.zzb.zzb;
        zzlgVar.zzJ(this.zza);
    }
}
