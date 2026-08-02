package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzms extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        int zza = (int) zzju.zza(length < 2 ? zzra.zze : zzqwVarArr[1]);
        int length2 = zzk.length();
        if (length == 3 && (zzqwVar = zzqwVarArr[2]) != zzra.zze) {
            length2 = (int) zzju.zza(zzri.zzc(zzibVar, zzqwVar));
        }
        int min = Math.min(Math.max(zza, 0), zzk.length());
        int min2 = Math.min(Math.max(length2, 0), zzk.length());
        return new zzrh(zzk.substring(Math.min(min, min2), Math.max(min, min2)));
    }
}
