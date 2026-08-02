package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: CreateCredentialNoCreateOptionException.kt */
/* loaded from: classes12.dex */
public final class CreateCredentialNoCreateOptionException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_NO_CREATE_OPTION = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS";

    /* compiled from: CreateCredentialNoCreateOptionException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialNoCreateOptionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialNoCreateOptionException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public CreateCredentialNoCreateOptionException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_NO_CREATE_OPTION, charSequence);
    }
}
