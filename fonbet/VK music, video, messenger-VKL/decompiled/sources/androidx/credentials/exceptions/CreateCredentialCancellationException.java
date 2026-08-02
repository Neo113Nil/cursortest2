package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: CreateCredentialCancellationException.kt */
/* loaded from: classes12.dex */
public final class CreateCredentialCancellationException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_CANCELLATION_EXCEPTION = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED";

    /* compiled from: CreateCredentialCancellationException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialCancellationException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public CreateCredentialCancellationException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_CANCELLATION_EXCEPTION, charSequence);
    }
}
