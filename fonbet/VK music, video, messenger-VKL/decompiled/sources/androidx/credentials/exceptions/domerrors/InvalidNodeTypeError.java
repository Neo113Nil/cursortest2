package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: InvalidNodeTypeError.kt */
/* loaded from: classes12.dex */
public final class InvalidNodeTypeError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_NODE_TYPE_ERROR = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR";

    /* compiled from: InvalidNodeTypeError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public InvalidNodeTypeError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_NODE_TYPE_ERROR);
    }
}
