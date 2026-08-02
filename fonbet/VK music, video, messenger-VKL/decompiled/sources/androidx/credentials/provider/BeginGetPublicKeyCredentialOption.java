package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.RequestValidationUtil;
import xsna.zcl;

/* compiled from: BeginGetPublicKeyCredentialOption.kt */
/* loaded from: classes12.dex */
public final class BeginGetPublicKeyCredentialOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    /* compiled from: BeginGetPublicKeyCredentialOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginGetPublicKeyCredentialOption createFrom$credentials_release(Bundle bundle, String str) {
            try {
                return new BeginGetPublicKeyCredentialOption(bundle, str, bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON"), bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"));
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final BeginGetPublicKeyCredentialOption createFromEntrySlice$credentials_release(Bundle bundle, String str) {
            return new BeginGetPublicKeyCredentialOption(bundle, str, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }

        private Companion() {
        }
    }

    public BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2) {
        this(bundle, str, str2, null, 8, null);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public /* synthetic */ BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr, int i, zcl zclVar) {
        this(bundle, str, str2, (i & 8) != 0 ? null : bArr);
    }

    public BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr) {
        super(str, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        this.requestJson = str2;
        this.clientDataHash = bArr;
        if (!RequestValidationUtil.Companion.isValidJSON(str2)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }
}
