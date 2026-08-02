package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gw2 {
    public final String a = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public final Bundle b;

    public gw2() {
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (!"androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE") && !"androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            a70.p(lnb.o("The request type ", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", " is not supported."));
            throw null;
        }
        if ("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE".equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST", true);
        }
    }
}
