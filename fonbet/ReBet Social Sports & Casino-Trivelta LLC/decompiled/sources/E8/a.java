package E8;

import F8.e;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static e f3013b;

    /* renamed from: d, reason: collision with root package name */
    public static Context f3015d;

    /* renamed from: e, reason: collision with root package name */
    public static SharedPreferences f3016e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3017f;

    /* renamed from: a, reason: collision with root package name */
    public static final a f3012a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static HashMap f3014c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static HashMap f3018g = new HashMap();

    public final void a(Context context, String apiKey, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ACCOUNT_PREFS", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        k(sharedPreferences);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        i(applicationContext);
        j(new e(apiKey, true, false, null, z10, 12, null));
    }

    public final HashMap b() {
        return f3018g;
    }

    public final Context c() {
        Context context = f3015d;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final boolean d() {
        return f3017f;
    }

    public final e e() {
        e eVar = f3013b;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pingbackCollector");
        return null;
    }

    public final SharedPreferences f() {
        SharedPreferences sharedPreferences = f3016e;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sharedPref");
        return null;
    }

    public final boolean g() {
        return f3015d != null;
    }

    public final void h(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        f3018g = hashMap;
    }

    public final void i(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        f3015d = context;
    }

    public final void j(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        f3013b = eVar;
    }

    public final void k(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        f3016e = sharedPreferences;
    }
}
