package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: OptOutError.kt */
/* loaded from: classes12.dex */
public final class OptOutError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPT_OUT_ERROR = "androidx.credentials.TYPE_OPT_OUT_ERROR";

    /* compiled from: OptOutError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public OptOutError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPT_OUT_ERROR);
    }
}
