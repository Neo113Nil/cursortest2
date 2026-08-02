package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: InvalidModificationError.kt */
/* loaded from: classes12.dex */
public final class InvalidModificationError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_MODIFICATION_ERROR = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR";

    /* compiled from: InvalidModificationError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public InvalidModificationError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_MODIFICATION_ERROR);
    }
}
