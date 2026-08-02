package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: CreateCredentialUnsupportedException.kt */
/* loaded from: classes12.dex */
public final class CreateCredentialUnsupportedException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION = "androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION";

    /* compiled from: CreateCredentialUnsupportedException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialUnsupportedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialUnsupportedException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public CreateCredentialUnsupportedException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION, charSequence);
    }
}
