package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import xsna.q9k;
import xsna.zcl;

/* compiled from: DigitalCredential.kt */
@ExperimentalDigitalCredentialApi
/* loaded from: classes12.dex */
public final class DigitalCredential extends Credential {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_DIGITAL_CREDENTIAL = "androidx.credentials.TYPE_DIGITAL_CREDENTIAL";
    private final String credentialJson;

    /* compiled from: DigitalCredential.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final DigitalCredential createFrom$credentials_release(Bundle bundle) {
            try {
                return new DigitalCredential(bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON"), bundle, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials_release(String str) {
            return q9k.a("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DigitalCredential(String str, Bundle bundle, zcl zclVar) {
        this(str, bundle);
    }

    public final String getCredentialJson() {
        return this.credentialJson;
    }

    private DigitalCredential(String str, Bundle bundle) {
        super(TYPE_DIGITAL_CREDENTIAL, bundle);
        this.credentialJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
        }
    }

    public DigitalCredential(String str) {
        this(str, Companion.toBundle$credentials_release(str));
    }
}
