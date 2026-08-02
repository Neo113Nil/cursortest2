package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: GetCredentialCancellationException.kt */
/* loaded from: classes.dex */
public final class GetCredentialCancellationException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_GET_CREDENTIAL_CANCELLATION_EXCEPTION = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";

    /* compiled from: GetCredentialCancellationException.kt */
    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GetCredentialCancellationException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public GetCredentialCancellationException(CharSequence charSequence) {
        super(TYPE_GET_CREDENTIAL_CANCELLATION_EXCEPTION, charSequence);
    }
}
