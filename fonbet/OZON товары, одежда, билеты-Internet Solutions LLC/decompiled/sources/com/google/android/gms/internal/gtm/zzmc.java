package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmc implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length > 0);
        for (zzqw<?> zzqwVar : zzqwVarArr) {
            Preconditions.checkNotNull(zzqwVar);
            Preconditions.checkArgument(zzqwVar instanceof zzrh);
            zzibVar.zzc(((zzrh) zzqwVar).zzk(), zzra.zze);
        }
        return zzra.zze;
    }
}
