package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.j5g;
import xsna.zcl;

/* compiled from: BeginGetPasswordOption.kt */
/* loaded from: classes12.dex */
public final class BeginGetPasswordOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final Set<String> allowedUserIds;

    /* compiled from: BeginGetPasswordOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginGetPasswordOption createForTest(Bundle bundle, String str) {
            return createFrom$credentials_release(bundle, str);
        }

        public final BeginGetPasswordOption createFrom$credentials_release(Bundle bundle, String str) {
            Set set;
            ArrayList<String> stringArrayList = bundle.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (set = j5g.S0(stringArrayList)) == null) {
                set = EmptySet.b;
            }
            return new BeginGetPasswordOption(set, bundle, str);
        }

        private Companion() {
        }
    }

    public BeginGetPasswordOption(Set<String> set, Bundle bundle, String str) {
        super(str, PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
        this.allowedUserIds = set;
    }

    public static final BeginGetPasswordOption createForTest(Bundle bundle, String str) {
        return Companion.createForTest(bundle, str);
    }

    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }
}
