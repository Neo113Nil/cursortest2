package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: DataCloneError.kt */
/* loaded from: classes12.dex */
public final class DataCloneError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_CLONE_ERROR = "androidx.credentials.TYPE_DATA_CLONE_ERROR";

    /* compiled from: DataCloneError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DataCloneError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_CLONE_ERROR);
    }
}
