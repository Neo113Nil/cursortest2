package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzml extends zzjv {
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
        return new zzqy(Double.valueOf(zzk.indexOf(zzju.zzd(zzqwVarArr[1]), (int) Math.min(Math.max(length < 3 ? 0.0d : zzju.zza(zzqwVarArr[2]), 0.0d), zzk.length()))));
    }
}
