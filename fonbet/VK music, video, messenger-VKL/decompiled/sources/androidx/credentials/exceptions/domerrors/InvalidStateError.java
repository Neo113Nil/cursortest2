package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: InvalidStateError.kt */
/* loaded from: classes12.dex */
public final class InvalidStateError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_STATE_ERROR = "androidx.credentials.TYPE_INVALID_STATE_ERROR";

    /* compiled from: InvalidStateError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public InvalidStateError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_STATE_ERROR);
    }
}
