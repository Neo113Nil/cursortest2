package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.RequestValidationHelper;
import kotlin.collections.EmptySet;
import xsna.q9k;
import xsna.zcl;

/* compiled from: GetRestoreCredentialOption.kt */
/* loaded from: classes.dex */
public final class GetRestoreCredentialOption extends CredentialOption {
    private static final String BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST";
    private static final Companion Companion = new Companion(null);
    private final String requestJson;

    /* compiled from: GetRestoreCredentialOption.kt */
    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toRequestDataBundle(String str) {
            return q9k.a(GetRestoreCredentialOption.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_REQUEST, str);
        }

        private Companion() {
        }
    }

    public GetRestoreCredentialOption(String str) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, Companion.toRequestDataBundle(str), new Bundle(), false, false, EmptySet.b, 2000);
        this.requestJson = str;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public final String getRequestJson() {
        return this.requestJson;
    }
}
