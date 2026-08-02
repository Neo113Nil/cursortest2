package com.google.android.gms.measurement.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzer implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzeu zzf;

    zzer(zzeu zzeuVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeuVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzfj zzm = this.zzf.zzt.zzm();
        if (!zzm.zzy()) {
            Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeu zzeuVar = this.zzf;
        c = zzeuVar.zza;
        if (c == 0) {
            if (zzeuVar.zzt.zzf().zzy()) {
                zzeu zzeuVar2 = this.zzf;
                zzeuVar2.zzt.zzay();
                zzeuVar2.zza = 'C';
            } else {
                zzeu zzeuVar3 = this.zzf;
                zzeuVar3.zzt.zzay();
                zzeuVar3.zza = 'c';
            }
        }
        zzeu zzeuVar4 = this.zzf;
        j = zzeuVar4.zzb;
        if (j < 0) {
            zzeuVar4.zzt.zzf().zzh();
            zzeuVar4.zzb = 77000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        zzeu zzeuVar5 = this.zzf;
        c2 = zzeuVar5.zza;
        j2 = zzeuVar5.zzb;
        String str = "2" + charAt + c2 + j2 + ":" + zzeu.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        if (str.length() > 1024) {
            str = this.zzb.substring(0, 1024);
        }
        zzfh zzfhVar = zzm.zzb;
        if (zzfhVar != null) {
            zzfhVar.zzb(str, 1L);
        }
    }
}
