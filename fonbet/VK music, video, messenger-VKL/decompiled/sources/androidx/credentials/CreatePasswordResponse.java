package androidx.credentials;

import android.os.Bundle;
import xsna.zcl;

/* compiled from: CreatePasswordResponse.kt */
/* loaded from: classes12.dex */
public final class CreatePasswordResponse extends CreateCredentialResponse {
    public static final Companion Companion = new Companion(null);

    /* compiled from: CreatePasswordResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CreatePasswordResponse createFrom$credentials_release(Bundle bundle) {
            return new CreatePasswordResponse(bundle, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreatePasswordResponse(Bundle bundle, zcl zclVar) {
        this(bundle);
    }

    private CreatePasswordResponse(Bundle bundle) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
    }

    public CreatePasswordResponse() {
        this(new Bundle());
    }
}
