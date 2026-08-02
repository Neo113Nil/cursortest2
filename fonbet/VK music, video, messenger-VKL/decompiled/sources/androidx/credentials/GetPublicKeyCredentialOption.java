package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.qr;
import xsna.zcl;

/* compiled from: GetPublicKeyCredentialOption.kt */
/* loaded from: classes12.dex */
public final class GetPublicKeyCredentialOption extends CredentialOption {
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final String BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION";
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    /* compiled from: GetPublicKeyCredentialOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final GetPublicKeyCredentialOption createFrom$credentials_release(Bundle bundle, Set<ComponentName> set, Bundle bundle2) {
            try {
                return new GetPublicKeyCredentialOption(bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON"), bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"), set, bundle, bundle2, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100), null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toRequestDataBundle$credentials_release(String str, byte[] bArr) {
            Bundle b = qr.b(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION, "androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            b.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return b;
        }

        private Companion() {
        }
    }

    public GetPublicKeyCredentialOption(String str) {
        this(str, null, null, 6, null);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public GetPublicKeyCredentialOption(String str, byte[] bArr) {
        this(str, bArr, null, 4, null);
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i, zcl zclVar) {
        this(str, bArr, set, bundle, bundle2, i);
    }

    public GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? EmptySet.b : set);
    }

    public /* synthetic */ GetPublicKeyCredentialOption(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i, int i2, zcl zclVar) {
        this(str, bArr, set, bundle, bundle2, (i2 & 32) != 0 ? 100 : i);
    }

    private GetPublicKeyCredentialOption(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2, int i) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, true, set, i);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetPublicKeyCredentialOption(String str, byte[] bArr, Set<ComponentName> set) {
        this(str, bArr, set, r0.toRequestDataBundle$credentials_release(str, bArr), r0.toRequestDataBundle$credentials_release(str, bArr), 0, 32, null);
        Companion companion = Companion;
    }
}
