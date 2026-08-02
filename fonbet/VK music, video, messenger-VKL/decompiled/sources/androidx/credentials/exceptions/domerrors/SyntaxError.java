package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: SyntaxError.kt */
/* loaded from: classes12.dex */
public final class SyntaxError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SYNTAX_ERROR = "androidx.credentials.TYPE_SYNTAX_ERROR";

    /* compiled from: SyntaxError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SyntaxError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SYNTAX_ERROR);
    }
}
