package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes9.dex */
public final class zzoy extends zzjv {
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
        String zzd = zzju.zzd(zzqwVarArr[0]);
        String zzd2 = zzju.zzd(zzqwVarArr[1]);
        int i11 = 64;
        if (length >= 3 && "true".equalsIgnoreCase(zzju.zzd(zzqwVarArr[2]))) {
            i11 = 66;
        }
        try {
            return new zzqx(Boolean.valueOf(Pattern.compile(zzd2, i11).matcher(zzd).find()));
        } catch (PatternSyntaxException unused) {
            return new zzqx(Boolean.FALSE);
        }
    }
}
