package androidx.credentials.provider;

import java.util.Objects;
import xsna.epx;
import xsna.zcl;

/* compiled from: BiometricPromptResult.kt */
/* loaded from: classes12.dex */
public final class BiometricPromptResult {
    private final AuthenticationError authenticationError;
    private final AuthenticationResult authenticationResult;
    private final boolean isSuccessful;

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BiometricPromptResult) {
            BiometricPromptResult biometricPromptResult = (BiometricPromptResult) obj;
            if (this.isSuccessful == biometricPromptResult.isSuccessful && epx.f(this.authenticationResult, biometricPromptResult.authenticationResult) && epx.f(this.authenticationError, biometricPromptResult.authenticationError)) {
                return true;
            }
        }
        return false;
    }

    public final AuthenticationError getAuthenticationError() {
        return this.authenticationError;
    }

    public final AuthenticationResult getAuthenticationResult() {
        return this.authenticationResult;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSuccessful), this.authenticationResult, this.authenticationError);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public BiometricPromptResult(AuthenticationResult authenticationResult, AuthenticationError authenticationError) {
        this.authenticationResult = authenticationResult;
        this.authenticationError = authenticationError;
        this.isSuccessful = authenticationResult != null;
    }

    public /* synthetic */ BiometricPromptResult(AuthenticationResult authenticationResult, AuthenticationError authenticationError, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : authenticationResult, (i & 2) != 0 ? null : authenticationError);
    }

    public BiometricPromptResult(AuthenticationError authenticationError) {
        this(null, authenticationError);
    }

    public BiometricPromptResult(AuthenticationResult authenticationResult) {
        this(authenticationResult, null);
    }
}
