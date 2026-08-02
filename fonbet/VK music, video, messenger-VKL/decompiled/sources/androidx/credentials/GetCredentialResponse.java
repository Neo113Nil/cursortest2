package androidx.credentials;

import android.os.Bundle;
import xsna.zcl;

/* compiled from: GetCredentialResponse.kt */
/* loaded from: classes12.dex */
public final class GetCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREDENTIAL_DATA = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA";
    private static final String EXTRA_CREDENTIAL_TYPE = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE";
    private final Credential credential;

    /* compiled from: GetCredentialResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(GetCredentialResponse getCredentialResponse) {
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE, getCredentialResponse.getCredential().getType());
            bundle.putBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA, getCredentialResponse.getCredential().getData());
            return bundle;
        }

        public final GetCredentialResponse fromBundle(Bundle bundle) {
            Bundle bundle2;
            String string = bundle.getString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA)) == null) {
                return null;
            }
            return new GetCredentialResponse(Credential.Companion.createFrom(string, bundle2));
        }

        private Companion() {
        }
    }

    public GetCredentialResponse(Credential credential) {
        this.credential = credential;
    }

    public static final Bundle asBundle(GetCredentialResponse getCredentialResponse) {
        return Companion.asBundle(getCredentialResponse);
    }

    public static final GetCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final Credential getCredential() {
        return this.credential;
    }
}
