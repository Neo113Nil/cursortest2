package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmg extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        double zzb = zzju.zzb(zzqwVarArr[0]);
        double zzb2 = zzju.zzb(zzqwVarArr[1]);
        return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? new zzqy(Double.valueOf(Double.NaN)) : (Double.isInfinite(zzb) || zzb2 == 0.0d) ? new zzqy(Double.valueOf(Double.NaN)) : (Double.isInfinite(zzb) || !Double.isInfinite(zzb2)) ? (zzb != 0.0d || zzb2 == 0.0d || Double.isInfinite(zzb2)) ? new zzqy(Double.valueOf(zzb % zzb2)) : new zzqy(Double.valueOf(zzb)) : new zzqy(Double.valueOf(zzb));
    }
}
