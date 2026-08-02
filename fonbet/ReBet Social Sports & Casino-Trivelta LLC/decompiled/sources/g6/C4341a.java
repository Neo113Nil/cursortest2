package g6;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4341a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0683a f47033d = new C0683a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f47034a;

    /* renamed from: b, reason: collision with root package name */
    public final b f47035b;

    /* renamed from: c, reason: collision with root package name */
    public M f47036c;

    /* renamed from: g6.a$a, reason: collision with other inner class name */
    public static final class C0683a {
        public /* synthetic */ C0683a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0683a() {
        }
    }

    /* renamed from: g6.a$b */
    public static final class b {
        public final M a() {
            return new M(C4331C.l(), null, 2, null);
        }
    }

    public C4341a(SharedPreferences sharedPreferences, b tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f47034a = sharedPreferences;
        this.f47035b = tokenCachingStrategyFactory;
    }

    public final void a() {
        this.f47034a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final AccessToken b() {
        String string = this.f47034a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final AccessToken c() {
        Bundle c10 = d().c();
        if (c10 == null || !M.f46977c.g(c10)) {
            return null;
        }
        return AccessToken.INSTANCE.c(c10);
    }

    public final M d() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            if (this.f47036c == null) {
                synchronized (this) {
                    try {
                        if (this.f47036c == null) {
                            this.f47036c = this.f47035b.a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
            }
            M m10 = this.f47036c;
            if (m10 != null) {
                return m10;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean e() {
        return this.f47034a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    public final AccessToken f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        AccessToken c10 = c();
        if (c10 != null) {
            g(c10);
            d().a();
        }
        return c10;
    }

    public final void g(AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f47034a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.Y().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final boolean h() {
        return C4331C.H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4341a() {
        this(r0, new b());
        SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
    }
}
