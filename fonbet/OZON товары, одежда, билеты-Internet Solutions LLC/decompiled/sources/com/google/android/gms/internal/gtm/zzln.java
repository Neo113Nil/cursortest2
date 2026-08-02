package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zzln extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        ArrayList arrayList = new ArrayList();
        int length = zzqwVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            zzqw<?> zzqwVar = zzqwVarArr[i11];
            Preconditions.checkArgument(!(zzqwVar instanceof zzra) || zzqwVar == zzra.zze || zzqwVar == zzra.zzd);
            arrayList.add(zzqwVar);
        }
        return new zzrd(arrayList);
    }
}
