package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzmq extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        double zza = length < 2 ? 0.0d : zzju.zza(zzqwVarArr[1]);
        double length2 = zzk.length();
        if (length == 3 && (zzqwVar = zzqwVarArr[2]) != zzra.zze) {
            length2 = zzju.zza(zzqwVar);
        }
        int max = (int) (zza < 0.0d ? Math.max(zzk.length() + zza, 0.0d) : Math.min(zza, zzk.length()));
        return new zzrh(zzk.substring(max, Math.max(0, ((int) (length2 < 0.0d ? Math.max(zzk.length() + length2, 0.0d) : Math.min(length2, zzk.length()))) - max) + max));
    }
}
