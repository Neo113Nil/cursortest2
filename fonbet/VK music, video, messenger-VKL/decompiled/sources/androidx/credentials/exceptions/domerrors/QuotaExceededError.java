package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: QuotaExceededError.kt */
/* loaded from: classes12.dex */
public final class QuotaExceededError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR";

    /* compiled from: QuotaExceededError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public QuotaExceededError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR);
    }
}
