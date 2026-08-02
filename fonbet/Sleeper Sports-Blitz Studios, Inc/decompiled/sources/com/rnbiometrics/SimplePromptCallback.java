package com.rnbiometrics;

import androidx.biometric.BiometricPrompt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;

/* loaded from: classes8.dex */
public class SimplePromptCallback extends BiometricPrompt.AuthenticationCallback {
    private Promise promise;

    public SimplePromptCallback(Promise promise) {
        this.promise = promise;
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
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", true);
        this.promise.resolve(writableNativeMap);
    }
}
