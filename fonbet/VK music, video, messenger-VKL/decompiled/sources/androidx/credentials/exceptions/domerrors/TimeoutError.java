package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: TimeoutError.kt */
/* loaded from: classes12.dex */
public final class TimeoutError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TIMEOUT_ERROR = "androidx.credentials.TYPE_TIMEOUT_ERROR";

    /* compiled from: TimeoutError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TimeoutError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TIMEOUT_ERROR);
    }
}
