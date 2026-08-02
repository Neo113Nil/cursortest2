package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zzlx implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        ArrayList arrayList = new ArrayList(zzqwVarArr.length);
        for (zzqw<?> zzqwVar : zzqwVarArr) {
            arrayList.add(zzqwVar);
        }
        return new zzrd(arrayList);
    }
}
