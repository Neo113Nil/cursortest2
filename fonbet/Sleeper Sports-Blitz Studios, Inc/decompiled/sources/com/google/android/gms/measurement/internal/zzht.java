package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzht implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzhn zze;

    zzht(zzhn zzhnVar, String str, String str2, String str3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        if (this.zza == null) {
            zzncVar2 = this.zze.zza;
            zzncVar2.zza(this.zzb, (zzkt) null);
        } else {
            zzkt zzktVar = new zzkt(this.zzc, this.zza, this.zzd);
            zzncVar = this.zze.zza;
            zzncVar.zza(this.zzb, zzktVar);
        }
    }
}
