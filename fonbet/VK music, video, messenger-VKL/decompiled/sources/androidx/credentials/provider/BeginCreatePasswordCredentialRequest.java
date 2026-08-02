package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.zcl;

/* compiled from: BeginCreatePasswordCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class BeginCreatePasswordCredentialRequest extends BeginCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BeginCreatePasswordCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginCreatePasswordCredentialRequest createFrom$credentials_release(Bundle bundle, CallingAppInfo callingAppInfo) {
            try {
                return new BeginCreatePasswordCredentialRequest(callingAppInfo, bundle);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        private Companion() {
        }
    }

    public BeginCreatePasswordCredentialRequest(CallingAppInfo callingAppInfo, Bundle bundle) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, callingAppInfo);
    }
}
