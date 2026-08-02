package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzku extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        return new zzqx(Boolean.valueOf(zzju.zzf(zzqwVarArr[1], zzqwVarArr[0])));
    }
}
