package androidx.credentials.provider;

import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Pair;
import xsna.epx;
import xsna.pn00;
import xsna.zcl;

/* compiled from: AuthenticationError.kt */
/* loaded from: classes12.dex */
public final class AuthenticationError {
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_CODE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK = "BIOMETRIC_AUTH_ERROR_CODE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_MESSAGE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK = "BIOMETRIC_AUTH_ERROR_MESSAGE";
    private final int errorCode;
    private final CharSequence errorMsg;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthenticationError";
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackErrorMap = pn00.j(new Pair(5, 5), new Pair(12, 12), new Pair(1, 1), new Pair(7, 7), new Pair(9, 9), new Pair(11, 11), new Pair(14, 14), new Pair(4, 4), new Pair(15, 15), new Pair(3, 3), new Pair(2, 2), new Pair(10, 10), new Pair(8, 8));

    /* compiled from: AuthenticationError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ AuthenticationError createFrom$credentials_release$default(Companion companion, int i, CharSequence charSequence, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return companion.createFrom$credentials_release(i, charSequence, z);
        }

        public final int convertFrameworkBiometricErrorToJetpack$credentials_release(int i) {
            if (getBiometricFrameworkToJetpackErrorMap$credentials_release().containsKey(Integer.valueOf(i))) {
                return getBiometricFrameworkToJetpackErrorMap$credentials_release().get(Integer.valueOf(i)).intValue();
            }
            getTAG$credentials_release();
            return i;
        }

        public final AuthenticationError createFrom$credentials_release(int i, CharSequence charSequence) {
            return createFrom$credentials_release$default(this, i, charSequence, false, 4, null);
        }

        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackErrorMap$credentials_release() {
            return AuthenticationError.biometricFrameworkToJetpackErrorMap;
        }

        public final String getTAG$credentials_release() {
            return AuthenticationError.TAG;
        }

        private Companion() {
        }

        public final AuthenticationError createFrom$credentials_release(int i, CharSequence charSequence, boolean z) {
            if (z) {
                i = convertFrameworkBiometricErrorToJetpack$credentials_release(i);
            }
            return new AuthenticationError(i, charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationError(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationError) {
            AuthenticationError authenticationError = (AuthenticationError) obj;
            if (this.errorCode == authenticationError.errorCode && epx.f(this.errorMsg, authenticationError.errorMsg)) {
                return true;
            }
        }
        return false;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.errorCode), this.errorMsg);
    }

    public AuthenticationError(int i, CharSequence charSequence) {
        this.errorCode = i;
        this.errorMsg = charSequence;
    }

    public /* synthetic */ AuthenticationError(int i, CharSequence charSequence, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : charSequence);
    }
}
