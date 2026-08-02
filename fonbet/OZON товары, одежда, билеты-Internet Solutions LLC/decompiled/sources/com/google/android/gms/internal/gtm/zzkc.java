package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzkc extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        zzqw<?> zzqwVar = length < 2 ? zzra.zze : zzqwVarArr[1];
        List<zzqw<?>> zzk = zzrdVar.zzk();
        int size = zzk.size();
        int i11 = size - 1;
        if (length == 3) {
            int zza = (int) zzju.zza(zzqwVarArr[2]);
            i11 = zza < 0 ? size - Math.abs(zza) : Math.min(zza, i11);
        }
        while (true) {
            if (i11 < 0) {
                i11 = -1;
                break;
            }
            if (zzrdVar.zzn(i11) && zzju.zzh(zzqwVar, zzk.get(i11))) {
                break;
            }
            i11--;
        }
        return new zzqy(Double.valueOf(i11));
    }
}
