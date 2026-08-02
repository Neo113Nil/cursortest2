package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;

/* loaded from: classes9.dex */
public final class zznx implements zzjt {
    private final String zza = Build.MANUFACTURER;
    private final String zzb = Build.MODEL;

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        String str = this.zza;
        String str2 = this.zzb;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            str2 = C6594f.a(str, " ", str2, new StringBuilder(str.length() + 1 + str2.length()));
        }
        return new zzrh(str2);
    }
}
