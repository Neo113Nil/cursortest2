package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NoModificationAllowedError.kt */
/* loaded from: classes12.dex */
public final class NoModificationAllowedError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NO_MODIFICATION_ALLOWED_ERROR = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR";

    /* compiled from: NoModificationAllowedError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NoModificationAllowedError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NO_MODIFICATION_ALLOWED_ERROR);
    }
}
