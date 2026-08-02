package androidx.credentials.provider;

import android.os.Bundle;
import xsna.zcl;

/* compiled from: BeginGetCustomCredentialOption.kt */
/* loaded from: classes12.dex */
public class BeginGetCustomCredentialOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BeginGetCustomCredentialOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginGetCustomCredentialOption createFrom$credentials_release(Bundle bundle, String str, String str2) {
            return new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        public final BeginGetCustomCredentialOption createFromEntrySlice$credentials_release(Bundle bundle, String str, String str2) {
            return new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        private Companion() {
        }
    }

    public BeginGetCustomCredentialOption(String str, String str2, Bundle bundle) {
        super(str, str2, bundle);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
