package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzlv extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        if (length == 2) {
            z11 = true;
        } else if (length == 3) {
            z11 = true;
            length = 3;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzrd);
        if (length == 3) {
            Preconditions.checkArgument(zzqwVarArr[2] instanceof zzrd);
        }
        List<zzqw<?>> arrayList = new ArrayList<>();
        if (zzju.zzg(zzqwVarArr[0])) {
            arrayList = ((zzrd) zzqwVarArr[1]).zzk();
        } else if (length > 2) {
            arrayList = ((zzrd) zzqwVarArr[2]).zzk();
        }
        zzra zzf = zzri.zzf(zzibVar, arrayList);
        return zzri.zzi(zzf) ? zzf : zzra.zze;
    }
}
