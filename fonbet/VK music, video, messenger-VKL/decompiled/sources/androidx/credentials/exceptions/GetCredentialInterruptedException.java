package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: GetCredentialInterruptedException.kt */
/* loaded from: classes12.dex */
public final class GetCredentialInterruptedException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_GET_CREDENTIAL_INTERRUPTED_EXCEPTION = "android.credentials.GetCredentialException.TYPE_INTERRUPTED";

    /* compiled from: GetCredentialInterruptedException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialInterruptedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GetCredentialInterruptedException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public GetCredentialInterruptedException(CharSequence charSequence) {
        super(TYPE_GET_CREDENTIAL_INTERRUPTED_EXCEPTION, charSequence);
    }
}
