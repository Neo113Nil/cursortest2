package org.chromium.net;

import internal.org.jni_zero.JNINamespace;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.chromium.base.Log;

@JNINamespace("net::android")
/* loaded from: classes10.dex */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String algorithm) {
        try {
            Signature.getInstance(algorithm).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking support for " + algorithm + ": " + String.valueOf(e));
            return false;
        }
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String algorithm) {
        try {
            Cipher.getInstance(algorithm).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception while checking support for " + algorithm + ": " + String.valueOf(e));
            return false;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String algorithm, byte[] message) {
        try {
            Signature signature = Signature.getInstance(algorithm);
            try {
                signature.initSign(privateKey);
                signature.update(message);
                return signature.sign();
            } catch (Exception e) {
                Log.e(TAG, "Exception while signing message with " + algorithm + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + String.valueOf(e));
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            Log.e(TAG, "Signature algorithm " + algorithm + " not supported: " + String.valueOf(e2));
            return null;
        }
    }

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String algorithm, byte[] message) {
        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(message);
            } catch (Exception e) {
                Log.e(TAG, "Exception while encrypting input with " + algorithm + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + String.valueOf(e));
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e(TAG, "Cipher " + algorithm + " not supported: " + String.valueOf(e2));
            return null;
        }
    }
}
