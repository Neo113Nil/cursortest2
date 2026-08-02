package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzkf extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length > 0);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        int size = zzrdVar.zzk().size();
        zzrdVar.zzm((r4 + size) - 1);
        for (int i11 = 1; i11 < zzqwVarArr.length; i11++) {
            zzrdVar.zzl(size, zzqwVarArr[i11]);
            size++;
        }
        return new zzqy(Double.valueOf(size));
    }
}
