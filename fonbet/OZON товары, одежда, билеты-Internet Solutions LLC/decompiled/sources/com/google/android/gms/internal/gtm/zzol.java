package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzol extends zzjv {
    private static final zzqy zza = new zzqy(Double.valueOf(0.0d));
    private static final zzqy zzb = new zzqy(Double.valueOf(2.147483647E9d));

    private static final boolean zzb(zzqw<?> zzqwVar) {
        return (zzqwVar instanceof zzqy) && !Double.isNaN(((zzqy) zzqwVar).zzi().doubleValue());
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        zzqw<?> zzqwVar = length > 0 ? zzqwVarArr[0] : zza;
        zzqw<?> zzqwVar2 = length > 1 ? zzqwVarArr[1] : zzb;
        double d11 = 2.147483647E9d;
        double d12 = 0.0d;
        if (zzb(zzqwVar) && zzb(zzqwVar2) && zzju.zzf(zzqwVar, zzqwVar2)) {
            d12 = ((zzqy) zzqwVar).zzi().doubleValue();
            d11 = ((zzqy) zzqwVar2).zzi().doubleValue();
        }
        return new zzqy(Double.valueOf(Math.round(((d11 - d12) * Math.random()) + d12)));
    }
}
