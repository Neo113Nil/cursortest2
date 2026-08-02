package com.google.android.gms.internal.gtm;

import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzny extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        byte[] decode;
        String encodeToString;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        String zzd = zzju.zzd(zzqwVarArr[0]);
        String zzd2 = length > 1 ? zzju.zzd(zzqwVarArr[1]) : "text";
        int i11 = 2;
        String zzd3 = length > 2 ? zzju.zzd(zzqwVarArr[2]) : "base16";
        if (length > 3 && zzju.zzg(zzqwVarArr[3])) {
            i11 = 3;
        }
        try {
            if ("text".equals(zzd2)) {
                decode = zzd.getBytes();
            } else if ("base16".equals(zzd2)) {
                decode = zzgf.zzb(zzd);
            } else if ("base64".equals(zzd2)) {
                decode = Base64.decode(zzd, i11);
            } else {
                if (!"base64url".equals(zzd2)) {
                    String valueOf = String.valueOf(zzd2);
                    throw new UnsupportedOperationException(valueOf.length() != 0 ? "Encode: unknown input format: ".concat(valueOf) : new String("Encode: unknown input format: "));
                }
                decode = Base64.decode(zzd, i11 | 8);
            }
            if ("base16".equals(zzd3)) {
                encodeToString = zzgf.zza(decode);
            } else if ("base64".equals(zzd3)) {
                encodeToString = Base64.encodeToString(decode, i11);
            } else {
                if (!"base64url".equals(zzd3)) {
                    String valueOf2 = String.valueOf(zzd3);
                    throw new RuntimeException(valueOf2.length() != 0 ? "Encode: unknown output format: ".concat(valueOf2) : new String("Encode: unknown output format: "));
                }
                encodeToString = Base64.encodeToString(decode, i11 | 8);
            }
            return new zzrh(encodeToString);
        } catch (IllegalArgumentException unused) {
            String valueOf3 = String.valueOf(zzd2);
            throw new RuntimeException(valueOf3.length() != 0 ? "Encode: invalid input:".concat(valueOf3) : new String("Encode: invalid input:"));
        }
    }
}
