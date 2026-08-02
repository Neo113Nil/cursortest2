package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: AbortError.kt */
/* loaded from: classes12.dex */
public final class AbortError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ABORT_ERROR = "androidx.credentials.TYPE_ABORT_ERROR";

    /* compiled from: AbortError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AbortError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ABORT_ERROR);
    }
}
