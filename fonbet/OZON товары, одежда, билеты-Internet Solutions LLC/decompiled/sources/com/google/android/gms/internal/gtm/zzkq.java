package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zzkq extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length >= 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        int zza = (int) zzju.zza(zzqwVarArr[1]);
        int max = zza < 0 ? Math.max(zzrdVar.zzk().size() + zza, 0) : Math.min(zza, zzrdVar.zzk().size());
        int min = Math.min(Math.max((int) zzju.zza(zzqwVarArr[2]), 0), zzrdVar.zzk().size() - max) + max;
        ArrayList arrayList = new ArrayList(zzrdVar.zzk().subList(max, min));
        zzrdVar.zzk().subList(max, min).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 3; i11 < zzqwVarArr.length; i11++) {
            arrayList2.add(zzqwVarArr[i11]);
        }
        zzrdVar.zzk().addAll(max, arrayList2);
        return new zzrd(arrayList);
    }
}
