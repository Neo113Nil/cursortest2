package androidx.credentials;

import android.os.Bundle;
import xsna.zcl;

/* compiled from: FederatedCredential.kt */
/* loaded from: classes12.dex */
public final class FederatedCredential extends Credential {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_FEDERATED_CREDENTIAL = "type.federated_credential";

    /* compiled from: FederatedCredential.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private FederatedCredential() {
        super(TYPE_FEDERATED_CREDENTIAL, new Bundle());
    }
}
