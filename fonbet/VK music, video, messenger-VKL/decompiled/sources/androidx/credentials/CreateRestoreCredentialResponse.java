package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.internal.RequestValidationHelper;
import xsna.q9k;
import xsna.zcl;

/* compiled from: CreateRestoreCredentialResponse.kt */
/* loaded from: classes12.dex */
public final class CreateRestoreCredentialResponse extends CreateCredentialResponse {
    public static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE";
    public static final Companion Companion = new Companion(null);
    private final String responseJson;

    /* compiled from: CreateRestoreCredentialResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CreateRestoreCredentialResponse createFrom(Bundle bundle) {
            String string = bundle.getString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new CreateRestoreCredentialResponse(string, bundle, null);
            }
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }

        public final Bundle toBundle$credentials_release(String str) {
            return q9k.a(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE, str);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateRestoreCredentialResponse(String str, Bundle bundle, zcl zclVar) {
        this(str, bundle);
    }

    public static final CreateRestoreCredentialResponse createFrom(Bundle bundle) {
        return Companion.createFrom(bundle);
    }

    public final String getResponseJson() {
        return this.responseJson;
    }

    private CreateRestoreCredentialResponse(String str, Bundle bundle) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, bundle);
        this.responseJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    public CreateRestoreCredentialResponse(String str) {
        this(str, Companion.toBundle$credentials_release(str));
    }
}
