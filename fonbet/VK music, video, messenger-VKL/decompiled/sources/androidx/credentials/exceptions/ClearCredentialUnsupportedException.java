package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: ClearCredentialUnsupportedException.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialUnsupportedException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION";

    /* compiled from: ClearCredentialUnsupportedException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialUnsupportedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialUnsupportedException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public ClearCredentialUnsupportedException(CharSequence charSequence) {
        super(TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION, charSequence);
    }
}
