package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzma extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 3);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzrd);
        Preconditions.checkArgument(zzqwVarArr[2] instanceof zzrd);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        List<zzqw<?>> zzk = ((zzrd) zzqwVarArr[1]).zzk();
        List<zzqw<?>> zzk2 = ((zzrd) zzqwVarArr[2]).zzk();
        Preconditions.checkArgument(zzk2.size() <= zzk.size() + 1);
        boolean z11 = false;
        for (int i11 = 0; i11 < zzk.size(); i11++) {
            if (z11 || zzju.zzh(zzqwVar, zzri.zzc(zzibVar, zzk.get(i11)))) {
                zzqw<?> zzc = zzri.zzc(zzibVar, zzk2.get(i11));
                if (!(zzc instanceof zzra)) {
                    z11 = true;
                } else {
                    if (zzc == zzra.zzc || ((zzra) zzc).zzj()) {
                        return zzc;
                    }
                    if (zzc == zzra.zzb) {
                        return zzra.zze;
                    }
                }
            }
        }
        if (zzk.size() < zzk2.size()) {
            zzqw<?> zzc2 = zzri.zzc(zzibVar, zzk2.get(zzk2.size() - 1));
            if ((zzc2 instanceof zzra) && (zzc2 == zzra.zzc || ((zzra) zzc2).zzj())) {
                return zzc2;
            }
        }
        return zzra.zze;
    }
}
