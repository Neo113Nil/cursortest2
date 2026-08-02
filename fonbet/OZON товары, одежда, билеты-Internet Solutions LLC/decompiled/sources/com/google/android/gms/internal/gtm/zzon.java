package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzon implements zzjt {
    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        int i11 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append("5.06-");
        sb2.append(i11);
        return new zzrh(sb2.toString());
    }
}
