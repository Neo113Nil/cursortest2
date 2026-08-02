package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public abstract class zzox extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        try {
            double zzb = zzju.zzb(zzqwVarArr[0]);
            double zzb2 = zzju.zzb(zzqwVarArr[1]);
            return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? new zzqx(Boolean.FALSE) : new zzqx(Boolean.valueOf(zzb(zzb, zzb2)));
        } catch (IllegalArgumentException unused) {
            return new zzqx(Boolean.FALSE);
        }
    }

    protected abstract boolean zzb(double d11, double d12);
}
