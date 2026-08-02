package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.domerrors.DomError;
import xsna.zcl;

/* compiled from: CreateRestoreCredentialDomException.kt */
/* loaded from: classes12.dex */
public final class CreateRestoreCredentialDomException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION = "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION";
    private final DomError domError;

    /* compiled from: CreateRestoreCredentialDomException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CreateRestoreCredentialDomException(DomError domError, CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/" + domError.getType(), charSequence);
        this.domError = domError;
    }

    public final DomError getDomError() {
        return this.domError;
    }
}
