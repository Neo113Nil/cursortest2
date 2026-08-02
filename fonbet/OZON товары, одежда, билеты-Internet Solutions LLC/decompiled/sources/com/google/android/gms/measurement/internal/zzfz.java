package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes9.dex */
final class zzfz implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzgb zza;

    zzfz(zzgb zzgbVar) {
        this.zza = zzgbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i11, String str, List list, boolean z11, boolean z12) {
        int i12 = i11 - 1;
        zzey zzi = i12 != 0 ? i12 != 1 ? i12 != 3 ? i12 != 4 ? this.zza.zzs.zzay().zzi() : z11 ? this.zza.zzs.zzay().zzm() : !z12 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk() : this.zza.zzs.zzay().zzj() : z11 ? this.zza.zzs.zzay().zzh() : !z12 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd() : this.zza.zzs.zzay().zzc();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
