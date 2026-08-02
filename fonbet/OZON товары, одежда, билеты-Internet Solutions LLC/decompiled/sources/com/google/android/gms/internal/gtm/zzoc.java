package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes9.dex */
public final class zzoc extends zzjv {
    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        byte[] zzb;
        zzqw<?> zzqwVar;
        zzqw<?> zzqwVar2;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        zzqw<?> zzqwVar3 = zzqwVarArr[0];
        zzra zzraVar = zzra.zze;
        if (zzqwVar3 == zzraVar) {
            return zzraVar;
        }
        String zzd = zzju.zzd(zzqwVar3);
        String str = "MD5";
        if (length > 1 && (zzqwVar2 = zzqwVarArr[1]) != zzraVar) {
            str = zzju.zzd(zzqwVar2);
        }
        String zzd2 = (length <= 2 || (zzqwVar = zzqwVarArr[2]) == zzraVar) ? "text" : zzju.zzd(zzqwVar);
        if ("text".equals(zzd2)) {
            zzb = zzd.getBytes();
        } else {
            if (!"base16".equals(zzd2)) {
                String valueOf = String.valueOf(zzd2);
                throw new RuntimeException(valueOf.length() != 0 ? "Hash: Unknown input format: ".concat(valueOf) : new String("Hash: Unknown input format: "));
            }
            zzb = zzgf.zzb(zzd);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(zzb);
            return new zzrh(zzgf.zza(messageDigest.digest()));
        } catch (NoSuchAlgorithmException e11) {
            String valueOf2 = String.valueOf(str);
            throw new RuntimeException(valueOf2.length() != 0 ? "Hash: Unknown algorithm: ".concat(valueOf2) : new String("Hash: Unknown algorithm: "), e11);
        }
    }
}
