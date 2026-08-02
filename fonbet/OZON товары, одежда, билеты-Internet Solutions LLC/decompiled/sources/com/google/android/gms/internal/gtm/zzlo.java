package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class zzlo extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < zzqwVarArr.length - 1; i11 += 2) {
            String zzd = zzju.zzd(zzqwVarArr[i11]);
            zzqw<?> zzqwVar = zzqwVarArr[i11 + 1];
            if ((zzqwVar instanceof zzra) && zzqwVar != zzra.zzd && zzqwVar != zzra.zze) {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
            hashMap.put(zzd, zzqwVar);
        }
        return new zzre(hashMap);
    }
}
