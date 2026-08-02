package fa;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f9541a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f9542b;

    public a(SharedPreferences userPref, SharedPreferences settingsPref) {
        Intrinsics.checkNotNullParameter(userPref, "userPref");
        Intrinsics.checkNotNullParameter(settingsPref, "settingsPref");
        this.f9541a = userPref;
        this.f9542b = settingsPref;
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPref = this.f9541a;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        return sharedPref.getString(key, null);
    }

    public final void b(String key, boolean z5) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f9542b.edit();
        edit.putBoolean(key, z5);
        edit.apply();
    }

    public final void c(long j, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f9542b.edit();
        edit.putLong(key, j);
        edit.apply();
    }

    public final void d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPref = this.f9541a;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, str);
        edit.apply();
    }
}
