package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmj extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        boolean z11;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        if (length == 1) {
            z11 = true;
        } else if (length == 2) {
            z11 = true;
            length = 2;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        int zza = length == 2 ? (int) zzju.zza(zzqwVarArr[1]) : 0;
        return (zza < 0 || zza >= zzk.length()) ? new zzrh("") : new zzrh(String.valueOf(zzk.charAt(zza)));
    }
}
