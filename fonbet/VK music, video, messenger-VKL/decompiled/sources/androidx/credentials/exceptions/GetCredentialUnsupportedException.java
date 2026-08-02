package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: GetCredentialUnsupportedException.kt */
/* loaded from: classes12.dex */
public final class GetCredentialUnsupportedException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION = "androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION";

    /* compiled from: GetCredentialUnsupportedException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialUnsupportedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GetCredentialUnsupportedException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public GetCredentialUnsupportedException(CharSequence charSequence) {
        super(TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION, charSequence);
    }
}
