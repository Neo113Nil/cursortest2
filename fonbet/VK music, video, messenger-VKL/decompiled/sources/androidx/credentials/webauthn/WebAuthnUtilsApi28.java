package androidx.credentials.webauthn;

import androidx.credentials.provider.CallingAppInfo;
import java.security.MessageDigest;
import xsna.zcl;

/* compiled from: WebAuthnUtilsApi28.kt */
/* loaded from: classes12.dex */
public final class WebAuthnUtilsApi28 {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WebAuthnUtilsApi28.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String appInfoToOrigin(CallingAppInfo callingAppInfo) {
            return "android:apk-key-hash:" + WebAuthnUtils.Companion.b64Encode(MessageDigest.getInstance("SHA-256").digest(callingAppInfo.getSigningInfo().getApkContentsSigners()[0].toByteArray()));
        }

        private Companion() {
        }
    }
}
