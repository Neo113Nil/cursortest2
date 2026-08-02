package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: ConstraintError.kt */
/* loaded from: classes12.dex */
public final class ConstraintError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_CONSTRAINT_ERROR = "androidx.credentials.TYPE_CONSTRAINT_ERROR";

    /* compiled from: ConstraintError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ConstraintError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_CONSTRAINT_ERROR);
    }
}
