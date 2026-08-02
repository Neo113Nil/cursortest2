package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: SecurityError.kt */
/* loaded from: classes12.dex */
public final class SecurityError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR = "androidx.credentials.TYPE_SECURITY_ERROR";

    /* compiled from: SecurityError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SecurityError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR);
    }
}
