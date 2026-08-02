package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzli extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 3);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzrh);
        Preconditions.checkArgument(zzqwVarArr[2] instanceof zzrd);
        zzqw<?> zzqwVar = zzqwVarArr[0];
        String zzk = ((zzrh) zzqwVarArr[1]).zzk();
        List<zzqw<?>> zzk2 = ((zzrd) zzqwVarArr[2]).zzk();
        if (zzqwVar.zzh(zzk)) {
            zzqw<?> zzb = zzqwVar.zzb(zzk);
            if (zzb instanceof zzqz) {
                return ((zzqz) zzb).zzi().zzd(zzibVar, (zzqw[]) zzk2.toArray(new zzqw[zzk2.size()]));
            }
            throw new IllegalArgumentException(C6594f.a("Apply TypeError: ", zzk, " is not a function", new StringBuilder(String.valueOf(zzk).length() + 35)));
        }
        if (!zzqwVar.zzg(zzk)) {
            throw new IllegalArgumentException(C6594f.a("Apply TypeError: object has no ", zzk, " property", new StringBuilder(String.valueOf(zzk).length() + 40)));
        }
        zzjt zza = zzqwVar.zza(zzk);
        zzk2.add(0, zzqwVar);
        return zza.zzd(zzibVar, (zzqw[]) zzk2.toArray(new zzqw[zzk2.size()]));
    }
}
