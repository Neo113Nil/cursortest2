package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzkj extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzra zzraVar = zzra.zze;
        List<zzqw<?>> zzk = ((zzrd) zzqwVarArr[0]).zzk();
        return !zzk.isEmpty() ? zzk.remove(0) : zzraVar;
    }
}
