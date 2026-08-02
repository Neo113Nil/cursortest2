package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: InvalidCharacterError.kt */
/* loaded from: classes12.dex */
public final class InvalidCharacterError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_CHARACTER_ERROR = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR";

    /* compiled from: InvalidCharacterError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public InvalidCharacterError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_CHARACTER_ERROR);
    }
}
