package androidx.credentials;

import android.os.Bundle;
import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* compiled from: ClearCredentialStateRequest.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialStateRequest {
    private static final String BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_STATE = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public static final String TYPE_CLEAR_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL";
    private final Bundle requestBundle;
    private final String requestType;

    /* compiled from: ClearCredentialStateRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialStateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    public final String getRequestType() {
        return this.requestType;
    }

    public ClearCredentialStateRequest(String str) {
        this.requestType = str;
        Bundle bundle = new Bundle();
        this.requestBundle = bundle;
        if (!epx.f(str, TYPE_CLEAR_CREDENTIAL_STATE) && !epx.f(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            throw new IllegalArgumentException(zr.a("The request type ", str, " is not supported."));
        }
        if (epx.f(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            bundle.putBoolean(BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST, true);
        }
    }

    public /* synthetic */ ClearCredentialStateRequest(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? TYPE_CLEAR_CREDENTIAL_STATE : str);
    }
}
