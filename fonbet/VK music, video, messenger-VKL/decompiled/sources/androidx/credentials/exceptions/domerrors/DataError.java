package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: DataError.kt */
/* loaded from: classes12.dex */
public final class DataError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_ERROR = "androidx.credentials.TYPE_DATA_ERROR";

    /* compiled from: DataError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DataError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_ERROR);
    }
}
