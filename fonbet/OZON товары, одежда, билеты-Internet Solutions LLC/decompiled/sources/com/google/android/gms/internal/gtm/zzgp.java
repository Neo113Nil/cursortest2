package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
import java.util.List;

/* loaded from: classes9.dex */
final class zzgp implements Runnable {
    final /* synthetic */ zzgq zza;
    private final zzps zzb;

    zzgp(zzgq zzgqVar, zzps zzpsVar) {
        this.zza = zzgqVar;
        this.zzb = zzpsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar;
        zzia zziaVar;
        String str;
        List list;
        zzhz zzhzVar2;
        String str2;
        zzgs zzgsVar;
        Clock clock;
        boolean z11;
        Clock clock2;
        zzgs zzgsVar2;
        List<zzgx> list2;
        zzhz zzhzVar3;
        zzqg zzc = this.zzb.zzb().zzc();
        zzqp zzc2 = this.zzb.zzc();
        zzhzVar = this.zza.zzl;
        zzgq zzgqVar = this.zza;
        zziaVar = zzgqVar.zze;
        zzgqVar.zzl = zziaVar.zza(zzc, zzc2);
        this.zza.zzm = 2;
        str = this.zza.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 48);
        sb2.append("Container ");
        sb2.append(str);
        sb2.append(" loaded during runtime initialization.");
        zzhl.zzd(sb2.toString());
        list = this.zza.zzn;
        if (list != null) {
            list2 = this.zza.zzn;
            for (zzgx zzgxVar : list2) {
                String valueOf = String.valueOf(zzgxVar.zzb());
                zzhl.zzd(valueOf.length() != 0 ? "Evaluating tags for pending event ".concat(valueOf) : new String("Evaluating tags for pending event "));
                zzhzVar3 = this.zza.zzl;
                zzhzVar3.zzf(zzgxVar);
            }
            this.zza.zzn = null;
        }
        zzhzVar2 = this.zza.zzl;
        zzhzVar2.zze();
        str2 = this.zza.zzb;
        String valueOf2 = String.valueOf(str2);
        zzhl.zzd(valueOf2.length() != 0 ? "Runtime initialized successfully for container ".concat(valueOf2) : new String("Runtime initialized successfully for container "));
        long zza = this.zzb.zzb().zza();
        zzgsVar = this.zza.zzk;
        long zzb = zzgsVar.zzb() + zza;
        if (zzhzVar == null) {
            z11 = this.zza.zzp;
            if (z11 && this.zzb.zza() == 1) {
                clock2 = this.zza.zzj;
                if (zzb < clock2.currentTimeMillis()) {
                    zzgq zzgqVar2 = this.zza;
                    zzgsVar2 = zzgqVar2.zzk;
                    zzgq.zzr(zzgqVar2, zzgsVar2.zza());
                    return;
                }
            }
        }
        zzgq zzgqVar3 = this.zza;
        clock = zzgqVar3.zzj;
        zzgq.zzr(zzgqVar3, Math.max(900000L, zzb - clock.currentTimeMillis()));
    }
}
