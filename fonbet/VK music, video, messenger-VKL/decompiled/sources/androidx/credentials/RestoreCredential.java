package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.RequestValidationHelper;
import xsna.zcl;

/* compiled from: RestoreCredential.kt */
/* loaded from: classes12.dex */
public final class RestoreCredential extends Credential {
    private static final String BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_RESTORE_CREDENTIAL";
    private final String authenticationResponseJson;

    /* compiled from: RestoreCredential.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final RestoreCredential createFrom$credentials_release(Bundle bundle) {
            String string = bundle.getString(RestoreCredential.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new RestoreCredential(string, bundle, null);
            }
            throw new NoCredentialException("The device does not contain a restore credential.");
        }

        private Companion() {
        }
    }

    public /* synthetic */ RestoreCredential(String str, Bundle bundle, zcl zclVar) {
        this(str, bundle);
    }

    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }

    private RestoreCredential(String str, Bundle bundle) {
        super(TYPE_RESTORE_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
