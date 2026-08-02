package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fw2 extends Exception {
    public fw2(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
    }

    public fw2() {
        this("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
    }

    public fw2(String str) {
        this(str, "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN");
    }
}
