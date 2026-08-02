package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class zzmx extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        return new zzrh(((zzrh) zzqwVarArr[0]).zzk().toUpperCase(Locale.ENGLISH));
    }
}
