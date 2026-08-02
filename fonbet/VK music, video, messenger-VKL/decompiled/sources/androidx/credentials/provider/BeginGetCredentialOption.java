package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import xsna.zcl;

/* compiled from: BeginGetCredentialOption.kt */
/* loaded from: classes12.dex */
public abstract class BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final Bundle candidateQueryData;
    private final String id;
    private final String type;

    /* compiled from: BeginGetCredentialOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginGetCredentialOption createFrom$credentials_release(String str, String str2, Bundle bundle) {
            return str2.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? BeginGetPasswordOption.Companion.createFrom$credentials_release(bundle, str) : str2.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginGetPublicKeyCredentialOption.Companion.createFrom$credentials_release(bundle, str) : new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        private Companion() {
        }
    }

    public BeginGetCredentialOption(String str, String str2, Bundle bundle) {
        this.id = str;
        this.type = str2;
        this.candidateQueryData = bundle;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }
}
