package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzgu implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgw zzb;

    zzgu(zzgw zzgwVar, zzq zzqVar) {
        this.zzb = zzgwVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlgVar = this.zzb.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzb.zza;
        zzlgVar2.zzL(this.zza);
    }
}
