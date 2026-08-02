package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NetworkError.kt */
/* loaded from: classes12.dex */
public final class NetworkError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NETWORK_ERROR = "androidx.credentials.TYPE_NETWORK_ERROR";

    /* compiled from: NetworkError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NetworkError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NETWORK_ERROR);
    }
}
