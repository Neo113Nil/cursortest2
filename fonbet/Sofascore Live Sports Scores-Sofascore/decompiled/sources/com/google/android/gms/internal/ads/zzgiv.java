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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgiv {
    public static final Charset a = StandardCharsets.UTF_8;
    public static Cipher b = null;
    public static final Object c = new Object();
    public static final Object d = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] a2 = zzgfd.a(str, false);
            int length2 = a2.length;
            if (length2 <= 16) {
                throw new zzgiu();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(a2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = b().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new zzgiu(e);
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (d) {
            try {
                cipher = b;
                if (cipher == null) {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    b = cipher;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
