package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.q9k;
import xsna.zcl;

/* compiled from: GetDigitalCredentialOption.kt */
@ExperimentalDigitalCredentialApi
/* loaded from: classes.dex */
public final class GetDigitalCredentialOption extends CredentialOption {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    private final String requestJson;

    /* compiled from: GetDigitalCredentialOption.kt */
    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final GetDigitalCredentialOption createFrom$credentials_release(Bundle bundle, Bundle bundle2, boolean z, Set<ComponentName> set) {
            try {
                return new GetDigitalCredentialOption(bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON"), bundle, bundle2, z, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100));
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

    public GetDigitalCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        super(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, z, z2, set, i);
        this.requestJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetDigitalCredentialOption(String str) {
        this(str, r0.toBundle$credentials_release(str), r0.toBundle$credentials_release(str), false, false, EmptySet.b, 100);
        Companion companion = Companion;
    }
}
