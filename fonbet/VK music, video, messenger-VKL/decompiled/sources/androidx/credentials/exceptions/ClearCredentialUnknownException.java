package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: ClearCredentialUnknownException.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialUnknownException extends ClearCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION = "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN";

    /* compiled from: ClearCredentialUnknownException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialUnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialUnknownException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public ClearCredentialUnknownException(CharSequence charSequence) {
        super(TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION, charSequence);
    }
}
