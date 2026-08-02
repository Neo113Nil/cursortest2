package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class x84 extends t01 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x84(String str, int i, Bundle bundle) {
        super(bundle, str);
        switch (i) {
            case 1:
                super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                a70.p("credentialJson must not be empty, and must be a valid JSON");
                throw null;
            case 2:
                super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                if (str.length() > 0) {
                    return;
                }
                a70.p("password should not be empty");
                throw null;
            case 3:
                super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                a70.p("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                str.getClass();
                bundle.getClass();
                if (str.length() > 0) {
                    return;
                }
                a70.p("type should not be empty");
                throw null;
        }
    }
}
