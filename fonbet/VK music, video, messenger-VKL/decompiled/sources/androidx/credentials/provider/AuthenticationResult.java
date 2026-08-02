package androidx.credentials.provider;

import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;

/* compiled from: AuthenticationResult.kt */
/* loaded from: classes12.dex */
public final class AuthenticationResult {
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE = "androidx.credentials.provider.BIOMETRIC_AUTH_RESULT";
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK = "BIOMETRIC_AUTH_RESULT";
    private final int authenticationType;
    public static final Companion Companion = new Companion(null);
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackResultMap = pn00.j(new Pair(2, 2), new Pair(1, 1));

    /* compiled from: AuthenticationResult.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ AuthenticationResult createFrom$credentials_release$default(Companion companion, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            return companion.createFrom$credentials_release(i, z);
        }

        public final int convertFrameworkBiometricResultToJetpack$credentials_release(int i) {
            if (getBiometricFrameworkToJetpackResultMap$credentials_release().containsKey(Integer.valueOf(i))) {
                return getBiometricFrameworkToJetpackResultMap$credentials_release().get(Integer.valueOf(i)).intValue();
            }
            AuthenticationError.Companion.getTAG$credentials_release();
            return i;
        }

        public final AuthenticationResult createFrom$credentials_release(int i) {
            return createFrom$credentials_release$default(this, i, false, 2, null);
        }

        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackResultMap$credentials_release() {
            return AuthenticationResult.biometricFrameworkToJetpackResultMap;
        }

        private Companion() {
        }

        public final AuthenticationResult createFrom$credentials_release(int i, boolean z) {
            if (z) {
                i = convertFrameworkBiometricResultToJetpack$credentials_release(i);
            }
            return new AuthenticationResult(i);
        }
    }

    public AuthenticationResult(int i) {
        this.authenticationType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthenticationResult) && this.authenticationType == ((AuthenticationResult) obj).authenticationType;
    }

    public final int getAuthenticationType() {
        return this.authenticationType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.authenticationType));
    }
}
