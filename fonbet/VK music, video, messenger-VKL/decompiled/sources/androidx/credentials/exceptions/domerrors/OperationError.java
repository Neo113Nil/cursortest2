package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: OperationError.kt */
/* loaded from: classes12.dex */
public final class OperationError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR = "androidx.credentials.TYPE_OPERATION_ERROR";

    /* compiled from: OperationError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public OperationError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR);
    }
}
