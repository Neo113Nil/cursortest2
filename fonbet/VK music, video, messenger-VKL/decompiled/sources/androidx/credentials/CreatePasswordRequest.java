package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import xsna.qr;
import xsna.zcl;

/* compiled from: CreatePasswordRequest.kt */
/* loaded from: classes12.dex */
public final class CreatePasswordRequest extends CreateCredentialRequest {
    public static final String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";
    public static final String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String password;

    /* compiled from: CreatePasswordRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CreatePasswordRequest createFrom$credentials_release(Bundle bundle, String str, Bundle bundle2) {
            CreateCredentialRequest.DisplayInfo displayInfo;
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                try {
                    displayInfo = CreateCredentialRequest.DisplayInfo.Companion.createFrom(bundle);
                } catch (IllegalArgumentException unused) {
                    displayInfo = new CreateCredentialRequest.DisplayInfo(string, null);
                }
                return new CreatePasswordRequest(string, string2, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), displayInfo, str, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false), bundle, bundle2, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toCandidateDataBundle$credentials_release() {
            return new Bundle();
        }

        public final Bundle toCredentialDataBundle$credentials_release(String str, String str2) {
            return qr.b("androidx.credentials.BUNDLE_KEY_ID", str, "androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
        }

        private Companion() {
        }
    }

    public CreatePasswordRequest(String str, String str2) {
        this(str, str2, null, false, false, 28, null);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    public CreatePasswordRequest(String str, String str2, String str3) {
        this(str, str2, str3, false, false, 24, null);
    }

    public CreatePasswordRequest(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, false, 16, null);
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2, zcl zclVar) {
        this(str, str2, z, displayInfo, str3, z2, bundle, bundle2);
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2, int i, zcl zclVar) {
        this(str, str2, z, displayInfo, (i & 16) != 0 ? null : str3, z2, (i & 64) != 0 ? Companion.toCredentialDataBundle$credentials_release(str, str2) : bundle, (i & 128) != 0 ? Companion.toCandidateDataBundle$credentials_release() : bundle2);
    }

    private CreatePasswordRequest(String str, String str2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z2, Bundle bundle, Bundle bundle2) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str3, z2);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, String str3, boolean z, boolean z2, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public CreatePasswordRequest(String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, z2, new CreateCredentialRequest.DisplayInfo(str, null), str3, z, null, null, PsExtractor.AUDIO_STREAM, null);
    }

    public CreatePasswordRequest(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this(str, str2, z2, new CreateCredentialRequest.DisplayInfo(str, null, str4), str3, z, null, null, PsExtractor.AUDIO_STREAM, null);
    }
}
