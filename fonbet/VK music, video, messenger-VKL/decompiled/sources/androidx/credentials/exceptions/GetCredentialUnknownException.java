package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: GetCredentialUnknownException.kt */
/* loaded from: classes12.dex */
public final class GetCredentialUnknownException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_GET_CREDENTIAL_UNKNOWN_EXCEPTION = "android.credentials.GetCredentialException.TYPE_UNKNOWN";

    /* compiled from: GetCredentialUnknownException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialUnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GetCredentialUnknownException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public GetCredentialUnknownException(CharSequence charSequence) {
        super(TYPE_GET_CREDENTIAL_UNKNOWN_EXCEPTION, charSequence);
    }
}
