package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NotAllowedError.kt */
/* loaded from: classes12.dex */
public final class NotAllowedError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_ALLOWED_ERROR = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR";

    /* compiled from: NotAllowedError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotAllowedError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_ALLOWED_ERROR);
    }
}
