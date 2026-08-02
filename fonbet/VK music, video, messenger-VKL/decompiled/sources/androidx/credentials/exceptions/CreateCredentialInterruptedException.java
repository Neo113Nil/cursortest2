package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: CreateCredentialInterruptedException.kt */
/* loaded from: classes12.dex */
public final class CreateCredentialInterruptedException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_INTERRUPTED_EXCEPTION = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED";

    /* compiled from: CreateCredentialInterruptedException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCredentialInterruptedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialInterruptedException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public CreateCredentialInterruptedException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_INTERRUPTED_EXCEPTION, charSequence);
    }
}
