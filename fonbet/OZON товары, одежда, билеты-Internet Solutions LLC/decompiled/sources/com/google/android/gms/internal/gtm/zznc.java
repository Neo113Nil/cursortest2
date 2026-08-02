package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;

/* loaded from: classes9.dex */
public final class zznc extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzrh(zznb.zzb(zzju.zzd(zzqwVarArr.length > 0 ? (zzqw) Preconditions.checkNotNull(zzqwVarArr[0]) : zzra.zze), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()"));
        } catch (UnsupportedEncodingException unused) {
            return zzra.zze;
        }
    }
}
