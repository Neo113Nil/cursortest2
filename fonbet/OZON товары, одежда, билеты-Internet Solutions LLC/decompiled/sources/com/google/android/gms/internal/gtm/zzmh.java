package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmh extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        double zzb = zzju.zzb(zzqwVarArr[0]);
        double zzb2 = zzju.zzb(zzqwVarArr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzqy(Double.valueOf(Double.NaN));
        }
        if ((Double.isInfinite(zzb) && zzb2 == 0.0d) || (zzb == 0.0d && Double.isInfinite(zzb2))) {
            return new zzqy(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(zzb) || Double.isInfinite(zzb2)) {
            return new zzqy(Double.valueOf(true != (((((double) Double.compare(zzb, 0.0d)) > 0.0d ? 1 : (((double) Double.compare(zzb, 0.0d)) == 0.0d ? 0 : -1)) < 0) ^ (((double) Double.compare(zzb2, 0.0d)) < 0.0d)) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY));
        }
        return new zzqy(Double.valueOf(zzb * zzb2));
    }
}
