package com.rnbiometrics;

import android.util.Base64;
import androidx.biometric.BiometricPrompt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import java.security.Signature;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class CreateSignatureCallback extends BiometricPrompt.AuthenticationCallback {
    private String payload;
    private Promise promise;

    public CreateSignatureCallback(Promise promise, String str) {
        this.promise = promise;
        this.payload = str;
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        if (i == 13 || i == 10) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", false);
            writableNativeMap.putString("error", "User cancellation");
            this.promise.resolve(writableNativeMap);
            return;
        }
        this.promise.reject(charSequence.toString(), charSequence.toString());
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        try {
            Signature signature = authenticationResult.getCryptoObject().getSignature();
            signature.update(this.payload.getBytes());
            String replaceAll = Base64.encodeToString(signature.sign(), 0).replaceAll(StringUtils.CR, "").replaceAll("\n", "");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", true);
            writableNativeMap.putString("signature", replaceAll);
            this.promise.resolve(writableNativeMap);
        } catch (Exception e) {
            this.promise.reject("Error creating signature: " + e.getMessage(), "Error creating signature");
        }
    }
}
