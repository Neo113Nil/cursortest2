package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzlq extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    public final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkNotNull(zzqwVarArr);
        Preconditions.checkArgument(zzqwVarArr.length == 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        Preconditions.checkArgument(zzibVar.zzf(zzk));
        zzqw<?> zzqwVar = zzqwVarArr[1];
        Preconditions.checkNotNull(zzqwVar);
        zzqw<?> zzqwVar2 = zzqwVarArr[2];
        Preconditions.checkArgument(zzqwVar2 instanceof zzrd);
        List<zzqw<?>> zzk2 = ((zzrd) zzqwVar2).zzk();
        Iterator<zzqw<?>> zze = zzqwVar.zze();
        while (zze.hasNext()) {
            zzibVar.zze(zzk, zze.next());
            zzra zzf = zzri.zzf(zzibVar, zzk2);
            if (zzf == zzra.zzb) {
                return zzra.zze;
            }
            if (zzf.zzj()) {
                return zzf;
            }
        }
        return zzra.zze;
    }
}
