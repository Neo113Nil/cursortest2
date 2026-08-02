package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: EncodingError.kt */
/* loaded from: classes12.dex */
public final class EncodingError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ENCODING_ERROR = "androidx.credentials.TYPE_ENCODING_ERROR";

    /* compiled from: EncodingError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public EncodingError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ENCODING_ERROR);
    }
}
