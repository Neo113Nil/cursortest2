package t0;

import android.os.Bundle;
import androidx.appcompat.app.h0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f23736c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23737d;

    public t(String str, String str2, Bundle bundle) {
        super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        this.f23736c = str;
        this.f23737d = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }
}
