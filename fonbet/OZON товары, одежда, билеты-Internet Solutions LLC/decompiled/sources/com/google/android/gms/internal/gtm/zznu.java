package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznu implements zzjt {
    private final String zza = Build.BRAND;

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        return new zzrh(this.zza);
    }
}
