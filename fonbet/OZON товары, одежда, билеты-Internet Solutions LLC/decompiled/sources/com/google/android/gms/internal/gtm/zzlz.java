package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzlz extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 3);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        zzqw<?> zzqwVar2 = zzqwVarArr[1];
        zzqw<?> zzqwVar3 = zzqwVarArr[2];
        Preconditions.checkArgument(zzqwVar != zzra.zzd);
        Preconditions.checkArgument(zzqwVar != zzra.zze);
        Preconditions.checkArgument(!zzri.zzi(zzqwVar));
        Preconditions.checkArgument(!zzri.zzi(zzqwVar2));
        Preconditions.checkArgument(!zzri.zzi(zzqwVar3));
        if (!zzri.zzj(zzqwVar)) {
            String zzd = zzju.zzd(zzqwVar2);
            if (!(zzqwVar instanceof zzre)) {
                if (zzqwVar instanceof zzrd) {
                    zzrd zzrdVar = (zzrd) zzqwVar;
                    if ("length".equals(zzd)) {
                        double zzb = zzju.zzb(zzqwVar3);
                        Preconditions.checkArgument(!Double.isInfinite(zzb) && zzb == Math.floor(zzb));
                        zzrdVar.zzm((int) zzb);
                        return zzqwVar3;
                    }
                    double zzb2 = zzju.zzb(zzqwVar2);
                    if (!Double.isInfinite(zzb2) && zzb2 >= 0.0d) {
                        int i11 = (int) zzb2;
                        if (zzd.equals(Integer.toString(i11))) {
                            zzrdVar.zzl(i11, zzqwVar3);
                            return zzqwVar3;
                        }
                    }
                }
                zzqwVar.zzf(zzd, zzqwVar3);
                return zzqwVar3;
            }
            zzre zzreVar = (zzre) zzqwVar;
            if (!zzreVar.zzk()) {
                zzreVar.zzf(zzd, zzqwVar3);
            }
        }
        return zzqwVar3;
    }
}
