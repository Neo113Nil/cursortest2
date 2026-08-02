package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zzgo implements Runnable, zzpi {
    final /* synthetic */ zzgq zza;

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        String str;
        String str2;
        zzpl zzplVar;
        String str3;
        String str4;
        String str5;
        zzgs zzgsVar;
        i11 = this.zza.zzm;
        Preconditions.checkState(i11 == 2);
        zzhs zza = zzhs.zza();
        str = this.zza.zzb;
        if (zza.zze(str)) {
            return;
        }
        str2 = this.zza.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 24);
        sb2.append("Refreshing container ");
        sb2.append(str2);
        sb2.append("...");
        zzhl.zzd(sb2.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        zzplVar = this.zza.zzf;
        str3 = this.zza.zzb;
        str4 = this.zza.zzd;
        str5 = this.zza.zzc;
        zzgsVar = this.zza.zzk;
        zzplVar.zzc(str3, str4, str5, arrayList, this, zzgsVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzpi
    public final void zza(zzps zzpsVar) {
        zzgs zzgsVar;
        String str;
        ExecutorService executorService;
        if (zzpsVar.getStatus() != Status.RESULT_SUCCESS) {
            zzgq zzgqVar = this.zza;
            zzgsVar = zzgqVar.zzk;
            zzgq.zzr(zzgqVar, zzgsVar.zzc());
            return;
        }
        str = this.zza.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 47);
        sb2.append("Refreshed container ");
        sb2.append(str);
        sb2.append(". Reinitializing runtime...");
        zzhl.zzd(sb2.toString());
        executorService = this.zza.zzg;
        executorService.execute(new zzgp(this.zza, zzpsVar));
    }
}
