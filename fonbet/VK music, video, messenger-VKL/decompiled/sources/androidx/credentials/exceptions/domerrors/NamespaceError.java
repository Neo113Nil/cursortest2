package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: NamespaceError.kt */
/* loaded from: classes12.dex */
public final class NamespaceError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NAMESPACE_ERROR = "androidx.credentials.TYPE_NAMESPACE_ERROR";

    /* compiled from: NamespaceError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public NamespaceError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NAMESPACE_ERROR);
    }
}
