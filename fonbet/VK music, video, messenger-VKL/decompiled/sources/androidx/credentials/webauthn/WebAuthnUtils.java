package androidx.credentials.webauthn;

import android.util.Base64;
import androidx.credentials.provider.CallingAppInfo;
import xsna.zcl;

/* compiled from: WebAuthnUtils.kt */
/* loaded from: classes12.dex */
public final class WebAuthnUtils {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WebAuthnUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String appInfoToOrigin(CallingAppInfo callingAppInfo) {
            return WebAuthnUtilsApi28.Companion.appInfoToOrigin(callingAppInfo);
        }

        public final byte[] b64Decode(String str) {
            return Base64.decode(str, 11);
        }

        public final String b64Encode(byte[] bArr) {
            return Base64.encodeToString(bArr, 11);
        }

        private Companion() {
        }
    }
}
