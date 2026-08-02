package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: GetCredentialProviderConfigurationException.kt */
/* loaded from: classes.dex */
public final class GetCredentialProviderConfigurationException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION = "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION";

    /* compiled from: GetCredentialProviderConfigurationException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialProviderConfigurationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GetCredentialProviderConfigurationException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public GetCredentialProviderConfigurationException(CharSequence charSequence) {
        super(TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION, charSequence);
    }
}
