package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: TransactionInactiveError.kt */
/* loaded from: classes12.dex */
public final class TransactionInactiveError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TRANSACTION_INACTIVE_ERROR = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR";

    /* compiled from: TransactionInactiveError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TransactionInactiveError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TRANSACTION_INACTIVE_ERROR);
    }
}
