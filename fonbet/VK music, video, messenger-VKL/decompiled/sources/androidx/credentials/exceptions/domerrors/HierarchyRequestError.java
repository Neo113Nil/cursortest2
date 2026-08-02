package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: HierarchyRequestError.kt */
/* loaded from: classes12.dex */
public final class HierarchyRequestError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_HIERARCHY_REQUEST_ERROR = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR";

    /* compiled from: HierarchyRequestError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public HierarchyRequestError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_HIERARCHY_REQUEST_ERROR);
    }
}
