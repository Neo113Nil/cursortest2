package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzlr implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        zzqw<?> zzb = zzibVar.zzb(((zzrh) zzqwVarArr[0]).zzk());
        if (zzb instanceof zzrf) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        }
        if (!(zzb instanceof zzra) || zzb == zzra.zze || zzb == zzra.zzd) {
            return zzb;
        }
        throw new IllegalStateException("Illegal InternalType encountered in Get.");
    }
}
