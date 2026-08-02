package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: NoCredentialException.kt */
/* loaded from: classes12.dex */
public final class NoCredentialException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_FRAMEWORK_TYPE_NO_CREDENTIAL = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL";

    /* compiled from: NoCredentialException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoCredentialException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NoCredentialException(CharSequence charSequence, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public NoCredentialException(CharSequence charSequence) {
        super(TYPE_FRAMEWORK_TYPE_NO_CREDENTIAL, charSequence);
    }
}
