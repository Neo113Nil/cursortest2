package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.qr;
import xsna.zcl;

/* compiled from: PasswordCredential.kt */
/* loaded from: classes12.dex */
public final class PasswordCredential extends Credential {
    public static final String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";
    public static final String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_PASSWORD_CREDENTIAL = "android.credentials.TYPE_PASSWORD_CREDENTIAL";
    private final String id;
    private final String password;

    /* compiled from: PasswordCredential.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final PasswordCredential createFrom$credentials_release(Bundle bundle) {
            try {
                return new PasswordCredential(bundle.getString("androidx.credentials.BUNDLE_KEY_ID"), bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD"), bundle, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials_release(String str, String str2) {
            return qr.b("androidx.credentials.BUNDLE_KEY_ID", str, "androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PasswordCredential(String str, String str2, Bundle bundle, zcl zclVar) {
        this(str, str2, bundle);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    private PasswordCredential(String str, String str2, Bundle bundle) {
        super(TYPE_PASSWORD_CREDENTIAL, bundle);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public PasswordCredential(String str, String str2) {
        this(str, str2, Companion.toBundle$credentials_release(str, str2));
    }
}
