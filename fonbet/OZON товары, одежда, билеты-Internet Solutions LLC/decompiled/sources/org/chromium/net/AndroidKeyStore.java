package org.chromium.net;

import N3.C3660k;
import internal.org.jni_zero.CalledByNative;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes10.dex */
public final class AndroidKeyStore {
    @CalledByNative
    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e11) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                String valueOf = String.valueOf(e11);
                StringBuilder d11 = C3660k.d("Exception while encrypting input with ", str, " and ", algorithm, " private key (");
                d11.append(name);
                d11.append("): ");
                d11.append(valueOf);
                org.chromium.base.j.a("AndroidKeyStore", d11.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e12) {
            org.chromium.base.j.a("AndroidKeyStore", "Cipher " + str + " not supported: " + String.valueOf(e12));
            return null;
        }
    }

    @CalledByNative
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    @CalledByNative
    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e11) {
            org.chromium.base.j.a("AndroidKeyStore", "Exception while checking support for " + str + ": " + String.valueOf(e11));
            return false;
        }
    }

    @CalledByNative
    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e11) {
            org.chromium.base.j.a("AndroidKeyStore", "Exception while checking support for " + str + ": " + String.valueOf(e11));
            return false;
        }
    }

    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e11) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                String valueOf = String.valueOf(e11);
                StringBuilder d11 = C3660k.d("Exception while signing message with ", str, " and ", algorithm, " private key (");
                d11.append(name);
                d11.append("): ");
                d11.append(valueOf);
                org.chromium.base.j.a("AndroidKeyStore", d11.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException e12) {
            org.chromium.base.j.a("AndroidKeyStore", "Signature algorithm " + str + " not supported: " + String.valueOf(e12));
            return null;
        }
    }
}
