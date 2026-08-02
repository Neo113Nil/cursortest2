package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NotReadableError.kt */
/* loaded from: classes12.dex */
public final class NotReadableError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_READABLE_ERROR = "androidx.credentials.TYPE_NOT_READABLE_ERROR";

    /* compiled from: NotReadableError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotReadableError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_READABLE_ERROR);
    }
}
