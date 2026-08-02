package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzks implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        zzqw<?> zzc = zzri.zzc(zzibVar, zzqwVarArr[0]);
        return !zzju.zzg(zzc) ? zzc : zzri.zzc(zzibVar, zzqwVarArr[1]);
    }
}
