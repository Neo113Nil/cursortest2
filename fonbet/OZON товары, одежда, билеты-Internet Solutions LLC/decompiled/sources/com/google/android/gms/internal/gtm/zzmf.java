package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmf extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        double zzb = zzju.zzb(zzqwVarArr[0]);
        double zzb2 = zzju.zzb(zzqwVarArr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzqy(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzqy(Double.valueOf(Double.NaN));
        }
        boolean z11 = (((double) Double.compare(zzb, 0.0d)) < 0.0d) ^ (((double) Double.compare(zzb2, 0.0d)) < 0.0d);
        if (Double.isInfinite(zzb) && !Double.isInfinite(zzb2)) {
            return new zzqy(Double.valueOf(true != z11 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY));
        }
        if (!Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzqy(Double.valueOf(0.0d));
        }
        if (zzb == 0.0d) {
            return zzb2 == 0.0d ? new zzqy(Double.valueOf(Double.NaN)) : new zzqy(Double.valueOf(0.0d));
        }
        if (Double.isInfinite(zzb) || zzb == 0.0d || zzb2 != 0.0d) {
            return new zzqy(Double.valueOf(zzb / zzb2));
        }
        return new zzqy(Double.valueOf(true != z11 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY));
    }
}
