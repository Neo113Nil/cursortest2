package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zzkr extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length > 0);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < zzqwVarArr.length; i11++) {
            arrayList.add(zzqwVarArr[i11]);
        }
        zzrdVar.zzk().addAll(0, arrayList);
        return new zzqy(Double.valueOf(zzrdVar.zzk().size()));
    }
}
