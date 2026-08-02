package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import xsna.zcl;

/* compiled from: E2eeUnavailableException.kt */
/* loaded from: classes12.dex */
public final class E2eeUnavailableException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_E2EE_UNAVAILABLE_EXCEPTION = "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION";

    /* compiled from: E2eeUnavailableException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public E2eeUnavailableException(CharSequence charSequence) {
        super(TYPE_E2EE_UNAVAILABLE_EXCEPTION, charSequence);
    }
}
