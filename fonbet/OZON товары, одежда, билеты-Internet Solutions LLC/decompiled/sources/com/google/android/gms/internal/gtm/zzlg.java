package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzlg implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 3);
        zzqw<?> zzc = zzju.zzg(zzri.zzc(zzibVar, zzqwVarArr[0])) ? zzri.zzc(zzibVar, zzqwVarArr[1]) : zzri.zzc(zzibVar, zzqwVarArr[2]);
        if (!(zzc instanceof zzra) || zzc == zzra.zze || zzc == zzra.zzd) {
            return zzc;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
