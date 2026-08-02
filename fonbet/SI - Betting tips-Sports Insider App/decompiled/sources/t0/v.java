package t0;

import android.os.Bundle;
import androidx.appcompat.app.h0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f23738c;

    public v(Bundle bundle, String jsonString) {
        super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        this.f23738c = jsonString;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        boolean z5 = false;
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                z5 = true;
            } catch (Exception unused) {
            }
        }
        if (!z5) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
