package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dx8 extends ex8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx8(CharSequence charSequence, int i) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_INTERRUPTED");
        switch (i) {
            case 2:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
                break;
            case 3:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx8(CharSequence charSequence, String str) {
        super(charSequence, str);
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        a70.p("type must not be empty");
        throw null;
    }
}
