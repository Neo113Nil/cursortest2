package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: ClearCredentialProviderConfigurationException.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialProviderConfigurationException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION";

    /* compiled from: ClearCredentialProviderConfigurationException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialProviderConfigurationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialProviderConfigurationException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public ClearCredentialProviderConfigurationException(CharSequence charSequence) {
        super(TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION, charSequence);
    }
}
