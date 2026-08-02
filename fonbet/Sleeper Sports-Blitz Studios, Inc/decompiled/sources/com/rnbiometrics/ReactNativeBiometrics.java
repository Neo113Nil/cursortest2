package com.rnbiometrics;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.security.OidcSecurityUtil;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.concurrent.Executors;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class ReactNativeBiometrics extends ReactContextBaseJavaModule {
    protected String biometricKeyAlias;

    public ReactNativeBiometrics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.biometricKeyAlias = "biometric_key";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeBiometrics";
    }

    @ReactMethod
    public void isSensorAvailable(Promise promise) {
        try {
            int canAuthenticate = BiometricManager.from(getReactApplicationContext()).canAuthenticate();
            if (canAuthenticate == 0) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean("available", true);
                writableNativeMap.putString("biometryType", "Biometrics");
                promise.resolve(writableNativeMap);
                return;
            }
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putBoolean("available", false);
            if (canAuthenticate == 1) {
                writableNativeMap2.putString("error", "BIOMETRIC_ERROR_HW_UNAVAILABLE");
            } else if (canAuthenticate == 11) {
                writableNativeMap2.putString("error", "BIOMETRIC_ERROR_NONE_ENROLLED");
            } else if (canAuthenticate == 12) {
                writableNativeMap2.putString("error", "BIOMETRIC_ERROR_NO_HARDWARE");
            }
            promise.resolve(writableNativeMap2);
        } catch (Exception e) {
            promise.reject("Error detecting biometrics availability: " + e.getMessage(), "Error detecting biometrics availability: " + e.getMessage());
        }
    }

    @ReactMethod
    public void createKeys(Promise promise) {
        try {
            deleteBiometricKey();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(this.biometricKeyAlias, 4).setDigests(MessageDigestAlgorithms.SHA_256).setSignaturePaddings("PKCS1").setAlgorithmParameterSpec(new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4)).setUserAuthenticationRequired(true).build());
            String replaceAll = Base64.encodeToString(keyPairGenerator.generateKeyPair().getPublic().getEncoded(), 0).replaceAll(StringUtils.CR, "").replaceAll("\n", "");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("publicKey", replaceAll);
            promise.resolve(writableNativeMap);
        } catch (Exception e) {
            promise.reject("Error generating public private keys: " + e.getMessage(), "Error generating public private keys");
        }
    }

    @ReactMethod
    public void deleteKeys(Promise promise) {
        if (doesBiometricKeyExist()) {
            if (deleteBiometricKey()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean("keysDeleted", true);
                promise.resolve(writableNativeMap);
                return;
            }
            promise.reject("Error deleting biometric key from keystore", "Error deleting biometric key from keystore");
            return;
        }
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putBoolean("keysDeleted", false);
        promise.resolve(writableNativeMap2);
    }

    @ReactMethod
    public void createSignature(final ReadableMap readableMap, final Promise promise) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.rnbiometrics.ReactNativeBiometrics.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = readableMap.getString("cancelButtonText");
                    String string2 = readableMap.getString("promptMessage");
                    String string3 = readableMap.getString("payload");
                    Signature signature = Signature.getInstance(OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256);
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    signature.initSign((PrivateKey) keyStore.getKey(ReactNativeBiometrics.this.biometricKeyAlias, null));
                    new BiometricPrompt((FragmentActivity) ReactNativeBiometrics.this.getCurrentActivity(), Executors.newSingleThreadExecutor(), new CreateSignatureCallback(promise, string3)).authenticate(new BiometricPrompt.PromptInfo.Builder().setDeviceCredentialAllowed(false).setNegativeButtonText(string).setTitle(string2).build(), new BiometricPrompt.CryptoObject(signature));
                } catch (Exception e) {
                    promise.reject("Error signing payload: " + e.getMessage(), "Error generating signature: " + e.getMessage());
                }
            }
        });
    }

    @ReactMethod
    public void simplePrompt(final ReadableMap readableMap, final Promise promise) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.rnbiometrics.ReactNativeBiometrics.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = readableMap.getString("cancelButtonText");
                    new BiometricPrompt((FragmentActivity) ReactNativeBiometrics.this.getCurrentActivity(), Executors.newSingleThreadExecutor(), new SimplePromptCallback(promise)).authenticate(new BiometricPrompt.PromptInfo.Builder().setDeviceCredentialAllowed(false).setNegativeButtonText(string).setTitle(readableMap.getString("promptMessage")).build());
                } catch (Exception e) {
                    promise.reject("Error displaying local biometric prompt: " + e.getMessage(), "Error displaying local biometric prompt: " + e.getMessage());
                }
            }
        });
    }

    @ReactMethod
    public void biometricKeysExist(Promise promise) {
        try {
            boolean doesBiometricKeyExist = doesBiometricKeyExist();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("keysExist", doesBiometricKeyExist);
            promise.resolve(writableNativeMap);
        } catch (Exception e) {
            promise.reject("Error checking if biometric key exists: " + e.getMessage(), "Error checking if biometric key exists: " + e.getMessage());
        }
    }

    protected boolean doesBiometricKeyExist() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.biometricKeyAlias);
        } catch (Exception unused) {
            return false;
        }
    }

    protected boolean deleteBiometricKey() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(this.biometricKeyAlias);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
