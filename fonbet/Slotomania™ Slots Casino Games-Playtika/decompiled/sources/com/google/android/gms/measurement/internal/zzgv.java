package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzgv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgw zze;

    zzgv(zzgw zzgwVar, String str, String str2, String str3, long j) {
        this.zze = zzgwVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        String str = this.zza;
        if (str == null) {
            zzlgVar2 = this.zze.zza;
            zzlgVar2.zzR(this.zzb, null);
        } else {
            zziq zziqVar = new zziq(this.zzc, str, this.zzd);
            zzlgVar = this.zze.zza;
            zzlgVar.zzR(this.zzb, zziqVar);
        }
    }
}
