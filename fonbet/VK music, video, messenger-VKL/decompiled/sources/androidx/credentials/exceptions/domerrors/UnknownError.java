package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: UnknownError.kt */
/* loaded from: classes12.dex */
public final class UnknownError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_UNKNOWN_ERROR = "androidx.credentials.TYPE_UNKNOWN_ERROR";

    /* compiled from: UnknownError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public UnknownError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_UNKNOWN_ERROR);
    }
}
