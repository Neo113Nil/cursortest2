package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznh extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        char c11;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 2);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        String zzd = zzju.zzd(zzqwVarArr[1]);
        String zzk = ((zzrh) zzqwVarArr[0]).zzk();
        int hashCode = zzk.hashCode();
        if (hashCode == 101) {
            if (zzk.equals("e")) {
                c11 = 0;
            }
            c11 = 65535;
        } else if (hashCode == 105) {
            if (zzk.equals("i")) {
                c11 = 1;
            }
            c11 = 65535;
        } else if (hashCode != 118) {
            if (hashCode == 119 && zzk.equals("w")) {
                c11 = 3;
            }
            c11 = 65535;
        } else {
            if (zzk.equals("v")) {
                c11 = 2;
            }
            c11 = 65535;
        }
        if (c11 == 0) {
            zzhl.zza(zzd);
        } else if (c11 == 1) {
            zzhl.zzc(zzd);
        } else if (c11 == 2) {
            zzhl.zzd(zzd);
        } else {
            if (c11 != 3) {
                String valueOf = String.valueOf(((zzrh) zzqwVarArr[0]).zzk());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid logging level: ".concat(valueOf) : new String("Invalid logging level: "));
            }
            zzhl.zze(zzd);
        }
        return zzra.zze;
    }
}
