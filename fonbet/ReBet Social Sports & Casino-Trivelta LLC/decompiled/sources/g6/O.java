package g6;

import android.content.SharedPreferences;
import com.facebook.Profile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46989b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f46990a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public O() {
        SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f46990a = sharedPreferences;
    }

    public final void a() {
        this.f46990a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final Profile b() {
        String string = this.f46990a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject j10 = profile.j();
        if (j10 != null) {
            this.f46990a.edit().putString("com.facebook.ProfileManager.CachedProfile", j10.toString()).apply();
        }
    }
}
