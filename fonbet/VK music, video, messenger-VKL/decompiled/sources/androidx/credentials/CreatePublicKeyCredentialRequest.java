package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import org.json.JSONObject;
import xsna.qr;
import xsna.zcl;

/* compiled from: CreatePublicKeyCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class CreatePublicKeyCredentialRequest extends CreateCredentialRequest {
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final String BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    /* compiled from: CreatePublicKeyCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials_release$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.getRequestDisplayInfo$credentials_release(str, str2);
        }

        public static /* synthetic */ Bundle toCredentialDataBundle$credentials_release$default(Companion companion, String str, byte[] bArr, int i, Object obj) {
            if ((i & 2) != 0) {
                bArr = null;
            }
            return companion.toCredentialDataBundle$credentials_release(str, bArr);
        }

        public final CreatePublicKeyCredentialRequest createFrom$credentials_release(Bundle bundle, String str, Bundle bundle2) {
            CreateCredentialRequest.DisplayInfo requestDisplayInfo$credentials_release$default;
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                try {
                    requestDisplayInfo$credentials_release$default = CreateCredentialRequest.DisplayInfo.Companion.createFrom(bundle);
                } catch (IllegalArgumentException unused) {
                    requestDisplayInfo$credentials_release$default = getRequestDisplayInfo$credentials_release$default(this, string, null, 2, null);
                }
                return new CreatePublicKeyCredentialRequest(string, byteArray, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z, requestDisplayInfo$credentials_release$default, str, bundle, bundle2, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        public final CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials_release(String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
                return new CreateCredentialRequest.DisplayInfo(jSONObject.getString("name"), jSONObject.isNull(CommonConstant.KEY_DISPLAY_NAME) ? null : jSONObject.getString(CommonConstant.KEY_DISPLAY_NAME), (Icon) null, str2);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        public final Bundle toCandidateDataBundle$credentials_release(String str, byte[] bArr) {
            Bundle b = qr.b(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST, "androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            b.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return b;
        }

        public final Bundle toCredentialDataBundle$credentials_release(String str, byte[] bArr) {
            Bundle b = qr.b(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST, "androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            b.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return b;
        }

        private Companion() {
        }
    }

    public CreatePublicKeyCredentialRequest(String str) {
        this(str, null, false, null, false, 30, null);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public CreatePublicKeyCredentialRequest(String str, byte[] bArr) {
        this(str, bArr, false, null, false, 28, null);
    }

    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z) {
        this(str, bArr, z, null, false, 24, null);
    }

    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2) {
        this(str, bArr, z, str2, false, 16, null);
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, zcl zclVar) {
        this(str, bArr, z, z2, displayInfo, str2, bundle, bundle2);
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, int i, zcl zclVar) {
        this(str, bArr, z, z2, displayInfo, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? Companion.toCredentialDataBundle$credentials_release(str, bArr) : bundle, (i & 128) != 0 ? Companion.toCandidateDataBundle$credentials_release(str, bArr) : bundle2);
    }

    private CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str2, z2);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2);
    }

    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2) {
        this(str, bArr, z2, z, Companion.getRequestDisplayInfo$credentials_release$default(Companion, str, null, 2, null), str2, null, null, PsExtractor.AUDIO_STREAM, null);
    }

    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, String str3, boolean z2) {
        this(str, bArr, z2, z, Companion.getRequestDisplayInfo$credentials_release(str, str3), str2, null, null, PsExtractor.AUDIO_STREAM, null);
    }
}
