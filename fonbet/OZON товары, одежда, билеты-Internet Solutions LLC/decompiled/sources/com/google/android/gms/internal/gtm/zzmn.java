package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class zzmn extends zzjv {
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
        Matcher matcher = Pattern.compile(length < 2 ? "" : zzju.zzd(zzqwVarArr[1])).matcher(((zzrh) zzqwVarArr[0]).zzk());
        if (!matcher.find()) {
            return zzra.zzd;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzrh(matcher.group()));
        return new zzrd(arrayList);
    }
}
