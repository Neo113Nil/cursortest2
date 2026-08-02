package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zzkk extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        Preconditions.checkNotNull(zzqwVarArr);
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
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        zzrd zzrdVar = (zzrd) zzqwVarArr[0];
        int zza = (int) zzju.zza(zzqwVarArr[1]);
        int max = zza < 0 ? Math.max(zzrdVar.zzk().size() + zza, 0) : Math.min(zza, zzrdVar.zzk().size());
        int size = zzrdVar.zzk().size();
        if (length == 3) {
            int zza2 = (int) zzju.zza(zzqwVarArr[2]);
            size = zza2 < 0 ? Math.max(zzrdVar.zzk().size() + zza2, 0) : Math.min(zza2, zzrdVar.zzk().size());
        }
        return new zzrd(new ArrayList(zzrdVar.zzk().subList(max, Math.max(max, size))));
    }
}
