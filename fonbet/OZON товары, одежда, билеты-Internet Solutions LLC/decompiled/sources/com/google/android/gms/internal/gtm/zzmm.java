package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmm extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        if (length == 2) {
            z11 = true;
        } else if (length == 3) {
            z11 = true;
            length = 3;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        String zzd = zzju.zzd(zzqwVarArr[1]);
        double d11 = Double.POSITIVE_INFINITY;
        if (length == 3 && !Double.isNaN(zzju.zzb(zzqwVarArr[2]))) {
            d11 = zzju.zza(zzqwVarArr[2]);
        }
        return new zzqy(Double.valueOf(zzk.lastIndexOf(zzd, (int) Math.min(Math.max(d11, 0.0d), zzk.length()))));
    }
}
