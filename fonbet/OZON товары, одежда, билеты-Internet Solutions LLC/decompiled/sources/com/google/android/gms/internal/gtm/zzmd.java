package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzmd implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzra zzf;
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 4);
        zzqw zzc = zzri.zzc(zzibVar, zzqwVarArr[3]);
        Preconditions.checkArgument(zzc instanceof zzrd);
        List<zzqw<?>> zzk = ((zzrd) zzc).zzk();
        zzqw<?> zzqwVar = zzqwVarArr[2];
        Preconditions.checkArgument(zzqwVar instanceof zzqx);
        if (((zzqx) zzqwVar).zzi().booleanValue()) {
            zzra zzf2 = zzri.zzf(zzibVar, zzk);
            if (zzf2 == zzra.zzb) {
                return zzra.zze;
            }
            if (zzf2.zzj()) {
                return zzf2;
            }
        }
        while (zzju.zzg(zzri.zzc(zzibVar, zzqwVarArr[0])) && (zzf = zzri.zzf(zzibVar, zzk)) != zzra.zzb) {
            if (zzf.zzj()) {
                return zzf;
            }
            zzri.zzc(zzibVar, zzqwVarArr[1]);
        }
        return zzra.zze;
    }
}
