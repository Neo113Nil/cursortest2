package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v09 extends x84 {
    public final String c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v09(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, r0);
        List split$default;
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        this.c = str2;
        this.d = str3;
        if (str.length() <= 0) {
            a70.p("id should not be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            a70.p("idToken should not be empty");
            throw null;
        }
        split$default = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null);
        if (split$default.size() != 3) {
            a70.p("Invalid token format");
            throw null;
        }
        try {
            byte[] decode = Base64.decode((String) split$default.get(1), 8);
            decode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(decode, charset));
            jSONObject.optString(NotificationCompat.CATEGORY_EMAIL).getClass();
            String optString = jSONObject.optString("sub");
            if ((optString.length() == 0 ? null : optString) != null) {
            } else {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
        } catch (JSONException e) {
            ilg.k(e);
            throw null;
        }
    }
}
