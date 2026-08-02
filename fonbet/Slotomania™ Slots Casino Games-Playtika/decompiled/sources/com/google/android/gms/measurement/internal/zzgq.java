package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzgq implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgw zzc;

    zzgq(zzgw zzgwVar, zzaw zzawVar, String str) {
        this.zzc = zzgwVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlgVar = this.zzc.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzc.zza;
        zzlgVar2.zzF(this.zza, this.zzb);
    }
}
