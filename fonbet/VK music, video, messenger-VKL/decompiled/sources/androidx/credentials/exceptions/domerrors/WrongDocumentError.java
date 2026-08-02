package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: WrongDocumentError.kt */
/* loaded from: classes12.dex */
public final class WrongDocumentError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_WRONG_DOCUMENT_ERROR = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR";

    /* compiled from: WrongDocumentError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public WrongDocumentError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_WRONG_DOCUMENT_ERROR);
    }
}
