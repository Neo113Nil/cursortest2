package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbbl {
    public static Cipher a;
    public static final Object b = new Object();
    public static final Object c = new Object();

    public static String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new zzbbk(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzbbk(e2);
        } catch (BadPaddingException e3) {
            throw new zzbbk(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzbbk(e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzbbk(e5);
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 <= 16) {
                throw new zzbbk();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(decode);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = c().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e) {
            throw new zzbbk(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzbbk(e2);
        } catch (InvalidKeyException e3) {
            throw new zzbbk(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzbbk(e4);
        } catch (BadPaddingException e5) {
            throw new zzbbk(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzbbk(e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzbbk(e7);
        }
    }

    public static final Cipher c() {
        Cipher cipher;
        synchronized (c) {
            try {
                cipher = a;
                if (cipher == null) {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    a = cipher;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
