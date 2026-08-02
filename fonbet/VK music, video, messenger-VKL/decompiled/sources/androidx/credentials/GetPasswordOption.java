package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.j5g;
import xsna.zcl;

/* compiled from: GetPasswordOption.kt */
/* loaded from: classes.dex */
public final class GetPasswordOption extends CredentialOption {
    public static final String BUNDLE_KEY_ALLOWED_USER_IDS = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS";
    public static final Companion Companion = new Companion(null);
    private final Set<String> allowedUserIds;

    /* compiled from: GetPasswordOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final GetPasswordOption createFrom$credentials_release(Bundle bundle, Set<ComponentName> set, Bundle bundle2) {
            Set set2;
            ArrayList<String> stringArrayList = bundle.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (set2 = j5g.S0(stringArrayList)) == null) {
                set2 = EmptySet.b;
            }
            return new GetPasswordOption(set2, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle, bundle2, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 1000), null);
        }

        public final Bundle toBundle$credentials_release(Set<String> set) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS, new ArrayList<>(set));
            return bundle;
        }

        private Companion() {
        }
    }

    public GetPasswordOption() {
        this(null, false, null, 7, null);
    }

    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }

    public GetPasswordOption(Set<String> set) {
        this(set, false, null, 6, null);
    }

    public GetPasswordOption(Set<String> set, boolean z) {
        this(set, z, null, 4, null);
    }

    public /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, int i, zcl zclVar) {
        this(set, z, set2, bundle, bundle2, i);
    }

    public /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, int i, int i2, zcl zclVar) {
        this(set, z, set2, bundle, bundle2, (i2 & 32) != 0 ? 1000 : i);
    }

    public GetPasswordOption(Set set, boolean z, Set set2, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptySet.b : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? EmptySet.b : set2);
    }

    private GetPasswordOption(Set<String> set, boolean z, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, set2, i);
        this.allowedUserIds = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetPasswordOption(Set<String> set, boolean z, Set<ComponentName> set2) {
        this(set, z, set2, r0.toBundle$credentials_release(set), r0.toBundle$credentials_release(set), 0, 32, null);
        Companion companion = Companion;
    }
}
