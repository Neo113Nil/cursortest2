package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.zcl;

/* compiled from: CreateCredentialResponse.kt */
/* loaded from: classes12.dex */
public abstract class CreateCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA";
    private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE";
    private final Bundle data;
    private final String type;

    /* compiled from: CreateCredentialResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(CreateCredentialResponse createCredentialResponse) {
            Bundle bundle = new Bundle();
            bundle.putString(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE, createCredentialResponse.getType());
            bundle.putBundle(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA, createCredentialResponse.getData());
            return bundle;
        }

        public final CreateCredentialResponse createFrom(String str, Bundle bundle) {
            try {
                if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    return CreatePasswordResponse.Companion.createFrom$credentials_release(bundle);
                }
                if (str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    return CreatePublicKeyCredentialResponse.Companion.createFrom$credentials_release(bundle);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCustomCredentialResponse(str, bundle);
            }
        }

        public final CreateCredentialResponse fromBundle(Bundle bundle) {
            Bundle bundle2;
            String string = bundle.getString(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA)) == null) {
                return null;
            }
            return createFrom(string, bundle2);
        }

        private Companion() {
        }
    }

    public CreateCredentialResponse(String str, Bundle bundle) {
        this.type = str;
        this.data = bundle;
    }

    public static final Bundle asBundle(CreateCredentialResponse createCredentialResponse) {
        return Companion.asBundle(createCredentialResponse);
    }

    public static final CreateCredentialResponse createFrom(String str, Bundle bundle) {
        return Companion.createFrom(str, bundle);
    }

    public static final CreateCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }
}
