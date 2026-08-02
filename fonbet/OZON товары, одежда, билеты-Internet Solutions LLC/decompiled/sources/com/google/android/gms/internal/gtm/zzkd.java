package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzkd extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzqz);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        zzqz zzqzVar = (zzqz) zzqwVarArr[1];
        List<zzqw<?>> zzk = zzrdVar.zzk();
        int size = zzk.size();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < size && i11 < zzrdVar.zzk().size(); i11++) {
            if (zzrdVar.zzn(i11)) {
                zzqwVar = zzqzVar.zzi().zzd(zzibVar, zzk.get(i11), new zzqy(Double.valueOf(i11)), zzrdVar);
                Preconditions.checkState(!zzri.zzi(zzqwVar));
            } else {
                zzqwVar = null;
            }
            arrayList.add(zzqwVar);
        }
        return new zzrd(arrayList);
    }
}
