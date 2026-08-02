package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class zzjw extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length > 0);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        ArrayList arrayList = new ArrayList();
        Iterator<zzqw<?>> it = zzrdVar.zzk().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        for (int i11 = 1; i11 < zzqwVarArr.length; i11++) {
            zzqw<?> zzqwVar = zzqwVarArr[i11];
            if (zzqwVar instanceof zzrd) {
                Iterator<zzqw<?>> it2 = ((zzrd) zzqwVar).zzk().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            } else {
                arrayList.add(zzqwVar);
            }
        }
        return new zzrd(arrayList);
    }
}
