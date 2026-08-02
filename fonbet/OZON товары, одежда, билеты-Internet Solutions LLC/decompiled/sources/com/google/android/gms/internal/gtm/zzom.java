package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes9.dex */
public final class zzom extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        zzqw<?> zzqwVar2;
        int i11 = 1;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length >= 2);
        zzqw<?> zzqwVar3 = zzqwVarArr[0];
        zzra zzraVar = zzra.zze;
        if (zzqwVar3 != zzraVar && zzqwVarArr[1] != zzraVar) {
            String zzd = zzju.zzd(zzqwVar3);
            String zzd2 = zzju.zzd(zzqwVarArr[1]);
            int i12 = 64;
            if (length > 2 && (zzqwVar2 = zzqwVarArr[2]) != zzraVar && zzju.zzg(zzqwVar2)) {
                i12 = 66;
            }
            if (length > 3 && (zzqwVar = zzqwVarArr[3]) != zzraVar) {
                if (zzqwVar instanceof zzqy) {
                    double zza = zzju.zza(zzqwVar);
                    if (!Double.isInfinite(zza) && zza >= 0.0d) {
                        i11 = (int) zza;
                    }
                }
            }
            try {
                Matcher matcher = Pattern.compile(zzd2, i12).matcher(zzd);
                String str = null;
                if (matcher.find() && matcher.groupCount() >= i11) {
                    str = matcher.group(i11);
                }
                if (str != null) {
                    return new zzrh(str);
                }
            } catch (PatternSyntaxException unused) {
                return zzra.zze;
            }
        }
        return zzraVar;
    }
}
