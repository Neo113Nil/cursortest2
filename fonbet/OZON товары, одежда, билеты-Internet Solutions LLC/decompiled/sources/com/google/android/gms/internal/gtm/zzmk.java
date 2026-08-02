package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmk extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length > 0);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        StringBuilder sb2 = new StringBuilder(((zzrh) zzqwVarArr[0]).zzk());
        for (int i11 = 1; i11 < zzqwVarArr.length; i11++) {
            sb2.append(zzju.zzd(zzqwVarArr[i11]));
        }
        return new zzrh(sb2.toString());
    }
}
