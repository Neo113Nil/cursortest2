package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public abstract class zzjv implements zzjt {
    protected abstract zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr);

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr != null);
        zzqw<?>[] zzqwVarArr2 = new zzqw[zzqwVarArr.length];
        for (int i11 = 0; i11 < zzqwVarArr.length; i11++) {
            Preconditions.checkArgument(zzqwVarArr[i11] != null);
            zzqw<?> zzqwVar = zzqwVarArr[i11];
            zzra zzraVar = zzra.zzb;
            Preconditions.checkArgument(zzqwVar != zzraVar);
            zzqw<?> zzqwVar2 = zzqwVarArr[i11];
            zzra zzraVar2 = zzra.zzc;
            Preconditions.checkArgument(zzqwVar2 != zzraVar2);
            zzqwVarArr2[i11] = zzri.zzc(zzibVar, zzqwVarArr[i11]);
            Preconditions.checkArgument(true);
            Preconditions.checkArgument(zzqwVarArr2[i11] != zzraVar);
            Preconditions.checkArgument(zzqwVarArr2[i11] != zzraVar2);
        }
        zzqw<?> zza = zza(zzibVar, zzqwVarArr2);
        Preconditions.checkState(zza != null);
        return zza;
    }
}
