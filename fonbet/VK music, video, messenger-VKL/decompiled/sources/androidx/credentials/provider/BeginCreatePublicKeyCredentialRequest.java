package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.RequestValidationUtil;
import xsna.zcl;

/* compiled from: BeginCreatePublicKeyCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class BeginCreatePublicKeyCredentialRequest extends BeginCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    /* compiled from: BeginCreatePublicKeyCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginCreatePublicKeyCredentialRequest createForTest(Bundle bundle, CallingAppInfo callingAppInfo) {
            return createFrom$credentials_release(bundle, callingAppInfo);
        }

        public final BeginCreatePublicKeyCredentialRequest createFrom$credentials_release(Bundle bundle, CallingAppInfo callingAppInfo) {
            try {
                return new BeginCreatePublicKeyCredentialRequest(bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON"), callingAppInfo, bundle, bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"));
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        private Companion() {
        }
    }

    public BeginCreatePublicKeyCredentialRequest(String str, CallingAppInfo callingAppInfo, Bundle bundle) {
        this(str, callingAppInfo, bundle, null, 8, null);
    }

    public static final BeginCreatePublicKeyCredentialRequest createForTest(Bundle bundle, CallingAppInfo callingAppInfo) {
        return Companion.createForTest(bundle, callingAppInfo);
    }

    private final void initiateBundle(Bundle bundle, String str) {
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public /* synthetic */ BeginCreatePublicKeyCredentialRequest(String str, CallingAppInfo callingAppInfo, Bundle bundle, byte[] bArr, int i, zcl zclVar) {
        this(str, callingAppInfo, bundle, (i & 8) != 0 ? null : bArr);
    }

    public BeginCreatePublicKeyCredentialRequest(String str, CallingAppInfo callingAppInfo, Bundle bundle, byte[] bArr) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, callingAppInfo);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (RequestValidationUtil.Companion.isValidJSON(str)) {
            initiateBundle(bundle, str);
            return;
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
