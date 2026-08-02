package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: CreateRestoreCredentialRequest.kt */
/* loaded from: classes.dex */
public final class CreateRestoreCredentialRequest extends CreateCredentialRequest {
    private static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST";
    private static final String BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD = "androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD";
    public static final Companion Companion = new Companion(null);
    private final boolean isCloudBackupEnabled;
    private final String requestJson;

    /* compiled from: CreateRestoreCredentialRequest.kt */
    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final CreateCredentialRequest.DisplayInfo getDisplayInfoFromJson(String str) {
            try {
                return new CreateCredentialRequest.DisplayInfo((CharSequence) new JSONObject(str).getJSONObject("user").getString("id"), (CharSequence) null, 2, (zcl) (0 == true ? 1 : 0));
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.id must be defined in requestJson");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toCredentialDataBundle(String str, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialRequest.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST, str);
            bundle.putBoolean(CreateRestoreCredentialRequest.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD, z);
            return bundle;
        }

        private Companion() {
        }
    }

    public CreateRestoreCredentialRequest(String str) {
        this(str, false, 2, null);
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final boolean isCloudBackupEnabled() {
        return this.isCloudBackupEnabled;
    }

    public /* synthetic */ CreateRestoreCredentialRequest(String str, boolean z, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CreateRestoreCredentialRequest(String str, boolean z) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, r0.toCredentialDataBundle(str, z), new Bundle(), false, false, r0.getDisplayInfoFromJson(str), null, false);
        Companion companion = Companion;
        this.requestJson = str;
        this.isCloudBackupEnabled = z;
    }
}
