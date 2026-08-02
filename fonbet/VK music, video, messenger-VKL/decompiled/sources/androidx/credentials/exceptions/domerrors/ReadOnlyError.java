package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: ReadOnlyError.kt */
/* loaded from: classes12.dex */
public final class ReadOnlyError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_READ_ONLY_ERROR = "androidx.credentials.TYPE_READ_ONLY_ERROR";

    /* compiled from: ReadOnlyError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ReadOnlyError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_READ_ONLY_ERROR);
    }
}
