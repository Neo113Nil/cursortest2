package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;

/* loaded from: classes9.dex */
public final class zzna extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrh(zzmz.zzb(zzju.zzd(zzqwVarArr.length > 0 ? (zzqw) Preconditions.checkNotNull(zzqwVarArr[0]) : zzra.zze), ""));
        } catch (UnsupportedEncodingException unused) {
            return zzra.zze;
        }
    }
}
