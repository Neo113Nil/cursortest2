package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.zcl;

/* compiled from: GetCustomCredentialOption.kt */
/* loaded from: classes12.dex */
public class GetCustomCredentialOption extends CredentialOption {
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z) {
        this(str, bundle, bundle2, z, false, null, 48, null);
    }

    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2) {
        this(str, bundle, bundle2, z, z2, null, 32, null);
    }

    public GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set set, int i, int i2, zcl zclVar) {
        this(bundle, str, bundle2, z, (i2 & 16) != 0 ? false : z2, (Set<ComponentName>) ((i2 & 32) != 0 ? EmptySet.b : set), (i2 & 64) != 0 ? 2000 : i);
    }

    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, int i2, zcl zclVar) {
        this(str, bundle, bundle2, z, (i2 & 16) != 0 ? false : z2, (Set<ComponentName>) ((i2 & 32) != 0 ? EmptySet.b : set), (i2 & 64) != 0 ? 2000 : i);
    }

    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, zcl zclVar) {
        this(str, bundle, bundle2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? EmptySet.b : set);
    }

    public GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        super(str, bundle, bundle2, z, z2, set, i);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if (i == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }

    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set) {
        this(bundle, str, bundle2, z, z2, set, 0, 64, (zcl) null);
    }

    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        this(bundle, str, bundle2, z, z2, set, i);
    }
}
