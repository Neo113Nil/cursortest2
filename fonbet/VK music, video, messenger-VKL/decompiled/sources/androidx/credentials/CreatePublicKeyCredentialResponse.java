package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import xsna.q9k;
import xsna.zcl;

/* compiled from: CreatePublicKeyCredentialResponse.kt */
/* loaded from: classes12.dex */
public final class CreatePublicKeyCredentialResponse extends CreateCredentialResponse {
    public static final String BUNDLE_KEY_REGISTRATION_RESPONSE_JSON = "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON";
    public static final Companion Companion = new Companion(null);
    private final String registrationResponseJson;

    /* compiled from: CreatePublicKeyCredentialResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CreatePublicKeyCredentialResponse createFrom$credentials_release(Bundle bundle) {
            try {
                return new CreatePublicKeyCredentialResponse(bundle.getString(CreatePublicKeyCredentialResponse.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON), bundle, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials_release(String str) {
            return q9k.a(CreatePublicKeyCredentialResponse.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON, str);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialResponse(String str, Bundle bundle, zcl zclVar) {
        this(str, bundle);
    }

    public final String getRegistrationResponseJson() {
        return this.registrationResponseJson;
    }

    private CreatePublicKeyCredentialResponse(String str, Bundle bundle) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        this.registrationResponseJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    public CreatePublicKeyCredentialResponse(String str) {
        this(str, Companion.toBundle$credentials_release(str));
    }
}
