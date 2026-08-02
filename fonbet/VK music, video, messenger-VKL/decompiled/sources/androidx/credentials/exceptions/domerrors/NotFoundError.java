package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NotFoundError.kt */
/* loaded from: classes12.dex */
public final class NotFoundError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_FOUND_ERROR = "androidx.credentials.TYPE_NOT_FOUND_ERROR";

    /* compiled from: NotFoundError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotFoundError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_FOUND_ERROR);
    }
}
