package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import xsna.q9k;
import xsna.zcl;

/* compiled from: PublicKeyCredential.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredential extends Credential {
    public static final String BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON";
    public static final String BUNDLE_KEY_SUBTYPE = "androidx.credentials.BUNDLE_KEY_SUBTYPE";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_PUBLIC_KEY_CREDENTIAL = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL";
    private final String authenticationResponseJson;

    /* compiled from: PublicKeyCredential.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final PublicKeyCredential createFrom$credentials_release(Bundle bundle) {
            try {
                return new PublicKeyCredential(bundle.getString(PublicKeyCredential.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON), bundle, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials_release(String str) {
            return q9k.a(PublicKeyCredential.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON, str);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PublicKeyCredential(String str, Bundle bundle, zcl zclVar) {
        this(str, bundle);
    }

    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }

    private PublicKeyCredential(String str, Bundle bundle) {
        super(TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    public PublicKeyCredential(String str) {
        this(str, Companion.toBundle$credentials_release(str));
    }
}
