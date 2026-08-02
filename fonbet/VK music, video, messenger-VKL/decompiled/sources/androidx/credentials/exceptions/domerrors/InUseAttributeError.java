package androidx.credentials.exceptions.domerrors;

import xsna.zcl;

/* compiled from: InUseAttributeError.kt */
/* loaded from: classes12.dex */
public final class InUseAttributeError extends DomError {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_IN_USE_ATTRIBUTE_ERROR = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR";

    /* compiled from: InUseAttributeError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public InUseAttributeError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_IN_USE_ATTRIBUTE_ERROR);
    }
}
