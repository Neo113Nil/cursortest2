package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;

/* loaded from: classes9.dex */
public final class zzmo extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0 && length <= 3);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        if (length == 1) {
            return new zzrh(zzk);
        }
        String zzd = zzju.zzd(zzqwVarArr[1]);
        zzqw<?> zzqwVar = length < 3 ? zzra.zze : zzqwVarArr[2];
        int indexOf = zzk.indexOf(zzd);
        if (indexOf == -1) {
            return new zzrh(zzk);
        }
        if (zzqwVar instanceof zzqz) {
            zzqwVar = ((zzqz) zzqwVar).zzi().zzd(zzibVar, new zzrh(zzd), new zzqy(Double.valueOf(indexOf)), new zzrh(zzk));
        }
        String zzd2 = zzju.zzd(zzqwVar);
        String substring = zzk.substring(0, indexOf);
        String substring2 = zzk.substring(zzd.length() + indexOf);
        return new zzrh(C6594f.a(substring, zzd2, substring2, new StringBuilder(String.valueOf(substring).length() + String.valueOf(zzd2).length() + String.valueOf(substring2).length())));
    }
}
