package androidx.credentials.provider.utils;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import xsna.e57;

/* compiled from: CryptoObjectUtils.kt */
/* loaded from: classes12.dex */
public final class CryptoObjectUtils {
    public static final CryptoObjectUtils INSTANCE = new CryptoObjectUtils();

    /* compiled from: CryptoObjectUtils.kt */
    public static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        public final BiometricPrompt.CryptoObject create(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public final BiometricPrompt.CryptoObject create(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public final BiometricPrompt.CryptoObject create(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }
    }

    /* compiled from: CryptoObjectUtils.kt */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final BiometricPrompt.CryptoObject create(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }
    }

    /* compiled from: CryptoObjectUtils.kt */
    public static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public final long getOperationHandle(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getOperationHandle();
        }
    }

    private CryptoObjectUtils() {
    }

    public final long getOperationHandle(e57.c cVar) {
        BiometricPrompt.CryptoObject wrapForBiometricPrompt = wrapForBiometricPrompt(cVar);
        if (wrapForBiometricPrompt != null) {
            return Api35Impl.INSTANCE.getOperationHandle(wrapForBiometricPrompt);
        }
        return 0L;
    }

    public final BiometricPrompt.CryptoObject wrapForBiometricPrompt(e57.c cVar) {
        IdentityCredential identityCredential;
        if (cVar == null) {
            return null;
        }
        Cipher cipher = cVar.b;
        if (cipher != null) {
            return Api28Impl.INSTANCE.create(cipher);
        }
        Signature signature = cVar.a;
        if (signature != null) {
            return Api28Impl.INSTANCE.create(signature);
        }
        Mac mac = cVar.c;
        if (mac != null) {
            return Api28Impl.INSTANCE.create(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cVar.d) == null) {
            return null;
        }
        return Api30Impl.INSTANCE.create(identityCredential);
    }
}
