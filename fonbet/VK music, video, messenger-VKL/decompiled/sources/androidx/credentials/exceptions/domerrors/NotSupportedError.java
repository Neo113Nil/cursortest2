package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NotSupportedError.kt */
/* loaded from: classes12.dex */
public final class NotSupportedError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_SUPPORTED_ERROR = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR";

    /* compiled from: NotSupportedError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotSupportedError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_SUPPORTED_ERROR);
    }
}
