package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzghf {
    public static final Charset zza = StandardCharsets.UTF_8;
    private static Cipher zzb = null;
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzd) {
            if (zzb == null) {
                zzb = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzb;
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzghe {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = zzgdj.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 <= 16) {
                throw new zzghe();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(zzb2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzc) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = zzc().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new zzghe(e);
        }
    }

    public final String zzb(byte[] bArr, String str) throws zzghe {
        return new String(zza(bArr, str), zza);
    }
}
