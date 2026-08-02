package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class zzll extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrd);
        Iterator<zzqw<?>> it = ((zzrd) zzqwVarArr[0]).zzk().iterator();
        while (it.hasNext()) {
            zzqw<?> zzc = zzri.zzc(zzibVar, it.next());
            if ((zzc instanceof zzra) && (zzc == zzra.zzb || zzc == zzra.zzc || ((zzra) zzc).zzj())) {
                return zzc;
            }
        }
        return zzra.zze;
    }
}
