package com.google.android.recaptcha.internal;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgm implements zzgx {

    @NotNull
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        boolean z10 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzgdVar.zzh().zza((String) zza2);
                }
                zzge zzc = zzgdVar.zzc();
                try {
                    zzgc.zza(zza2);
                } catch (zzce e10) {
                    if (e10.zzb() == 8 || e10.zzb() == 6) {
                        z10 = false;
                    } else if (e10.zzb() != 47) {
                        throw e10;
                    }
                }
                zzc.zze(i10, Boolean.valueOf(z10));
            } catch (zzce e11) {
                throw e11;
            }
        } catch (Exception e12) {
            throw new zzce(6, 8, e12);
        }
    }
}
