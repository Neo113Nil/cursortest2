package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: CreateCredentialProviderConfigurationException.kt */
/* loaded from: classes12.dex */
public final class CreateCredentialProviderConfigurationException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION = "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION";

    /* compiled from: CreateCredentialProviderConfigurationException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialProviderConfigurationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialProviderConfigurationException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public CreateCredentialProviderConfigurationException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION, charSequence);
    }
}
