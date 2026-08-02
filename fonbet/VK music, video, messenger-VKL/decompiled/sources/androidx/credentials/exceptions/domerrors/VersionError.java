package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: VersionError.kt */
/* loaded from: classes12.dex */
public final class VersionError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_VERSION_ERROR = "androidx.credentials.TYPE_VERSION_ERROR";

    /* compiled from: VersionError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public VersionError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_VERSION_ERROR);
    }
}
