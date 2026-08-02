package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zzgl implements Runnable, zzpi {
    final /* synthetic */ zzgq zza;

    /* synthetic */ zzgl(zzgq zzgqVar, zzgk zzgkVar) {
        this.zza = zzgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        String str;
        zzgs zzgsVar;
        boolean z11;
        zzpl zzplVar;
        String str2;
        String str3;
        String str4;
        zzgs zzgsVar2;
        i11 = this.zza.zzm;
        Preconditions.checkState(i11 == 1);
        ArrayList arrayList = new ArrayList();
        this.zza.zzp = false;
        zzhs zza = zzhs.zza();
        str = this.zza.zzb;
        if (zza.zze(str)) {
            arrayList.add(0);
        } else {
            zzgq zzgqVar = this.zza;
            zzgsVar = zzgqVar.zzk;
            zzgqVar.zzp = zzgsVar.zzf();
            z11 = this.zza.zzp;
            if (z11) {
                arrayList.add(1);
                arrayList.add(0);
            } else {
                arrayList.add(0);
                arrayList.add(1);
            }
            arrayList.add(2);
        }
        zzplVar = this.zza.zzf;
        str2 = this.zza.zzb;
        str3 = this.zza.zzd;
        str4 = this.zza.zzc;
        zzgsVar2 = this.zza.zzk;
        zzplVar.zzc(str2, str3, str4, arrayList, this, zzgsVar2);
    }

    @Override // com.google.android.gms.internal.gtm.zzpi
    public final void zza(zzps zzpsVar) {
        ExecutorService executorService;
        ExecutorService executorService2;
        if (zzpsVar.getStatus() == Status.RESULT_SUCCESS) {
            executorService2 = this.zza.zzg;
            executorService2.execute(new zzgp(this.zza, zzpsVar));
        } else {
            executorService = this.zza.zzg;
            executorService.execute(new zzgj(this.zza, null));
        }
    }
}
