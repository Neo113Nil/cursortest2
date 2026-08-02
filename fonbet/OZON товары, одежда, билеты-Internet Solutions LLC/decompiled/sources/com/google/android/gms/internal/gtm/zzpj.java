package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

@VisibleForTesting
/* loaded from: classes9.dex */
final class zzpj extends zzph {
    final /* synthetic */ zzpl zze;
    private final zzpi zzf;
    private final List<Integer> zzg;
    private final int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzpj(zzpl zzplVar, int i11, zzpq zzpqVar, zzpm zzpmVar, List<Integer> list, int i12, zzpi zzpiVar, zzgs zzgsVar) {
        super(i11, zzpqVar, zzpmVar, zzgsVar, DefaultClock.getInstance());
        this.zze = zzplVar;
        this.zzf = zzpiVar;
        this.zzg = list;
        this.zzh = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzph
    protected final void zza(zzps zzpsVar) {
        zzpx zzpxVar;
        if (zzpsVar.getStatus() == Status.RESULT_SUCCESS) {
            String zzd = zzpsVar.zzd();
            zzhl.zzd(zzd.length() != 0 ? "Container resource successfully loaded from ".concat(zzd) : new String("Container resource successfully loaded from "));
            if (zzpsVar.zza() == 0) {
                zzpr zzb = zzpsVar.zzb();
                if (!zzb.zzb().zzg()) {
                    this.zze.zzd(zzpsVar.getStatus(), zzb);
                    if (zzb.zzd() != null && zzb.zzd().length > 0) {
                        zzpxVar = this.zze.zzc;
                        zzpxVar.zzg(zzb.zzb().zzd(), zzb.zzd());
                    }
                }
            }
            this.zzf.zza(zzpsVar);
            return;
        }
        String zzd2 = zzpsVar.zzd();
        String str = true != zzpsVar.getStatus().isSuccess() ? "FAILURE" : "SUCCESS";
        StringBuilder sb2 = new StringBuilder(zzd2.length() + 54 + str.length());
        sb2.append("Cannot fetch a valid resource from ");
        sb2.append(zzd2);
        sb2.append(". Response status: ");
        sb2.append(str);
        zzhl.zzd(sb2.toString());
        if (zzpsVar.getStatus().isSuccess()) {
            String zzd3 = zzpsVar.zzd();
            zzhl.zzd(zzd3.length() != 0 ? "Response source: ".concat(zzd3) : new String("Response source: "));
            int length = zzpsVar.zzb().zzd().length;
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("Response size: ");
            sb3.append(length);
            zzhl.zzd(sb3.toString());
        }
        this.zze.zzb(this.zza, this.zzg, this.zzh + 1, this.zzf, this.zzd);
    }
}
