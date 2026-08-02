package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzka extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        int length = zzqwVarArr.length;
        int i11 = 0;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        zzqw<?> zzqwVar = length < 2 ? zzra.zze : zzqwVarArr[1];
        zzqw<?> zzqwVar2 = length < 3 ? zzra.zze : zzqwVarArr[2];
        List<zzqw<?>> zzk = zzrdVar.zzk();
        int size = zzk.size();
        if (zzqwVar2 != zzra.zze) {
            int zza = (int) zzju.zza(zzqwVar2);
            i11 = zza < 0 ? Math.max(size - Math.abs(zza), 0) : zza;
        }
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            if (zzrdVar.zzn(i11) && zzju.zzh(zzqwVar, zzk.get(i11))) {
                break;
            }
            i11++;
        }
        return new zzqy(Double.valueOf(i11));
    }
}
