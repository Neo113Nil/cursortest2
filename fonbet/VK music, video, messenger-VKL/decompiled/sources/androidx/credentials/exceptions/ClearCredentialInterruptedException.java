package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: ClearCredentialInterruptedException.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialInterruptedException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION";

    /* compiled from: ClearCredentialInterruptedException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialInterruptedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialInterruptedException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public ClearCredentialInterruptedException(CharSequence charSequence) {
        super(TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION, charSequence);
    }
}
