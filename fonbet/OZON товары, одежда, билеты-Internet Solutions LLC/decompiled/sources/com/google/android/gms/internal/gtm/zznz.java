package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class zznz extends zzjv {
    private static final Pattern zza = Pattern.compile("(.+)/(.+)/(.+)");

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length >= 3);
        Preconditions.checkArgument(zzqwVarArr[1] instanceof zzrh);
        String zzd = zzju.zzd(zzqwVarArr[0]);
        String zzd2 = zzju.zzd(zzqwVarArr[1]);
        String zzd3 = zzju.zzd(zzqwVarArr[2]);
        String zzd4 = length < 4 ? "AES/CBC/NoPadding" : zzju.zzd(zzqwVarArr[3]);
        Matcher matcher = zza.matcher(zzd4);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(zzd4);
            throw new RuntimeException(valueOf.length() != 0 ? "Encrypt: invalid transformation:".concat(valueOf) : new String("Encrypt: invalid transformation:"));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzd2.getBytes(), matcher.group(1));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zzd3.getBytes());
        try {
            Cipher cipher = Cipher.getInstance(zzd4);
            if (zzd == null || zzd.length() == 0) {
                throw new RuntimeException("Encrypt: empty input string");
            }
            try {
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return new zzrh(zzgf.zza(cipher.doFinal(zzd.getBytes())));
            } catch (Exception e11) {
                String valueOf2 = String.valueOf(e11.getMessage());
                throw new RuntimeException(valueOf2.length() != 0 ? "Encrypt: ".concat(valueOf2) : new String("Encrypt: "));
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            String valueOf3 = String.valueOf(zzd4);
            throw new RuntimeException(valueOf3.length() != 0 ? "Encrypt: invalid transformation:".concat(valueOf3) : new String("Encrypt: invalid transformation:"));
        }
    }
}
