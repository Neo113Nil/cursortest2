package g6;

import T7.C1662b;
import T7.C1663c;
import T7.C1678s;
import T7.Y;
import T7.Z;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import h6.C4466B;
import h6.p;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.h;

/* renamed from: g6.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4331C {

    /* renamed from: d, reason: collision with root package name */
    public static Executor f46924d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile String f46925e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile String f46926f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile String f46927g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Boolean f46928h;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f46930j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f46931k;

    /* renamed from: l, reason: collision with root package name */
    public static T7.I f46932l;

    /* renamed from: m, reason: collision with root package name */
    public static Context f46933m;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f46937q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f46938r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f46939s;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f46944x;

    /* renamed from: a, reason: collision with root package name */
    public static final C4331C f46921a = new C4331C();

    /* renamed from: b, reason: collision with root package name */
    public static final String f46922b = C4331C.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f46923c = SetsKt.hashSetOf(N.DEVELOPER_ERRORS);

    /* renamed from: i, reason: collision with root package name */
    public static AtomicLong f46929i = new AtomicLong(65536);

    /* renamed from: n, reason: collision with root package name */
    public static int f46934n = 64206;

    /* renamed from: o, reason: collision with root package name */
    public static final ReentrantLock f46935o = new ReentrantLock();

    /* renamed from: p, reason: collision with root package name */
    public static String f46936p = T7.P.a();

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f46940t = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public static volatile String f46941u = "instagram.com";

    /* renamed from: v, reason: collision with root package name */
    public static volatile String f46942v = "facebook.com";

    /* renamed from: w, reason: collision with root package name */
    public static a f46943w = new a() { // from class: g6.t
        @Override // g6.C4331C.a
        public final GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
            GraphRequest C10;
            C10 = C4331C.C(accessToken, str, jSONObject, bVar);
            return C10;
        }
    };

    /* renamed from: g6.C$a */
    public interface a {
        GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar);
    }

    /* renamed from: g6.C$b */
    public interface b {
        void a();
    }

    public static final long A() {
        Z.o();
        return f46929i.get();
    }

    public static final String B() {
        return "16.3.0";
    }

    public static final GraphRequest C(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
        return GraphRequest.f30314n.A(accessToken, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return f46930j;
    }

    public static final boolean E(int i10) {
        int i11 = f46934n;
        return i10 >= i11 && i10 < i11 + 100;
    }

    public static final synchronized boolean F() {
        boolean z10;
        synchronized (C4331C.class) {
            z10 = f46944x;
        }
        return z10;
    }

    public static final boolean G() {
        return f46940t.get();
    }

    public static final boolean H() {
        return f46931k;
    }

    public static final boolean I(N behavior) {
        boolean z10;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet hashSet = f46923c;
        synchronized (hashSet) {
            if (D()) {
                z10 = hashSet.contains(behavior);
            }
        }
        return z10;
    }

    public static final void J(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f46925e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt.startsWith$default(lowerCase, "fb", false, 2, (Object) null)) {
                        String substring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        f46925e = substring;
                    } else {
                        f46925e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new C4357q("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f46926f == null) {
                f46926f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f46927g == null) {
                f46927g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f46934n == 64206) {
                f46934n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f46928h == null) {
                f46928h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void L(Context context, final String applicationId) {
        if (Y7.a.d(C4331C.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            t().execute(new Runnable() { // from class: g6.B
                @Override // java.lang.Runnable
                public final void run() {
                    C4331C.M(applicationContext, applicationId);
                }
            });
            C1678s c1678s = C1678s.f11164a;
            if (C1678s.g(C1678s.b.OnDeviceEventProcessing) && r6.c.d()) {
                r6.c.g(applicationId, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C4331C.class);
        }
    }

    public static final void M(Context applicationContext, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        f46921a.K(applicationContext, applicationId);
    }

    public static final synchronized void N(Context applicationContext) {
        synchronized (C4331C.class) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            O(applicationContext, null);
        }
    }

    public static final synchronized void O(Context applicationContext, final b bVar) {
        synchronized (C4331C.class) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            AtomicBoolean atomicBoolean = f46940t;
            if (atomicBoolean.get()) {
                if (bVar != null) {
                    bVar.a();
                }
                return;
            }
            Z.g(applicationContext, false);
            Z.i(applicationContext, false);
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext.applicationContext");
            f46933m = applicationContext2;
            h6.p.f47798b.c(applicationContext);
            Context context = f46933m;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            J(context);
            String str = f46925e;
            if (str == null || str.length() == 0) {
                throw new C4357q("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = f46927g;
            if (str2 == null || str2.length() == 0) {
                throw new C4357q("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            atomicBoolean.set(true);
            if (o()) {
                j();
            }
            Context context2 = f46933m;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            if ((context2 instanceof Application) && X.f()) {
                p6.f fVar = p6.f.f63057a;
                Context context3 = f46933m;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    throw null;
                }
                p6.f.x((Application) context3, f46925e);
            }
            T7.A.h();
            T7.M.E();
            C1663c.a aVar = C1663c.f11072b;
            Context context4 = f46933m;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
            aVar.a(context4);
            f46932l = new T7.I(new Callable() { // from class: g6.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File P10;
                    P10 = C4331C.P();
                    return P10;
                }
            });
            C1678s c1678s = C1678s.f11164a;
            C1678s.a(C1678s.b.Instrument, new C1678s.a() { // from class: g6.v
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4331C.Q(z10);
                }
            });
            C1678s.a(C1678s.b.AppEvents, new C1678s.a() { // from class: g6.w
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4331C.R(z10);
                }
            });
            C1678s.a(C1678s.b.ChromeCustomTabsPrefetching, new C1678s.a() { // from class: g6.x
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4331C.S(z10);
                }
            });
            C1678s.a(C1678s.b.IgnoreAppSwitchToLoggedOut, new C1678s.a() { // from class: g6.y
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4331C.T(z10);
                }
            });
            C1678s.a(C1678s.b.BypassAppSwitch, new C1678s.a() { // from class: g6.z
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4331C.U(z10);
                }
            });
            t().execute(new FutureTask(new Callable(bVar) { // from class: g6.A
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void V10;
                    V10 = C4331C.V(null);
                    return V10;
                }
            }));
        }
    }

    public static final File P() {
        Context context = f46933m;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    public static final void Q(boolean z10) {
        if (z10) {
            V7.g.d();
        }
    }

    public static final void R(boolean z10) {
        if (z10) {
            C4466B.a();
        }
    }

    public static final void S(boolean z10) {
        if (z10) {
            f46937q = true;
        }
    }

    public static final void T(boolean z10) {
        if (z10) {
            f46938r = true;
        }
    }

    public static final void U(boolean z10) {
        if (z10) {
            f46939s = true;
        }
    }

    public static final Void V(b bVar) {
        C4346f.f47052f.e().j();
        P.f46991d.a().d();
        if (AccessToken.INSTANCE.g()) {
            Profile.Companion companion = Profile.INSTANCE;
            if (companion.b() == null) {
                companion.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        p.a aVar = h6.p.f47798b;
        aVar.f(l(), f46925e);
        X.n();
        Context applicationContext = l().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext().applicationContext");
        aVar.g(applicationContext).b();
        return null;
    }

    public static final void W(boolean z10) {
        X.s(z10);
    }

    public static final void X(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Z.j(applicationId, "applicationId");
        f46925e = applicationId;
    }

    public static final void Y(String str) {
        f46926f = str;
    }

    public static final void Z(boolean z10) {
        X.t(z10);
        if (z10) {
            Application application = (Application) l();
            p6.f fVar = p6.f.f63057a;
            p6.f.x(application, m());
        }
    }

    public static final void a0(String str) {
        f46927g = str;
    }

    public static final void b0(String[] strArr, int i10, int i11) {
        if (Y7.a.d(C4331C.class)) {
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[0];
            } catch (Throwable th2) {
                Y7.a.b(th2, C4331C.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data_processing_options", new JSONArray((Collection) ArraysKt.toList(strArr)));
            jSONObject.put("data_processing_options_country", i10);
            jSONObject.put("data_processing_options_state", i11);
            Context context = f46933m;
            if (context != null) {
                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public static final void c0(String graphApiVersion) {
        Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        Log.w(f46922b, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (Y.d0(graphApiVersion) || Intrinsics.areEqual(f46936p, graphApiVersion)) {
            return;
        }
        f46936p = graphApiVersion;
    }

    public static final void j() {
        f46944x = true;
    }

    public static final boolean k() {
        return X.d();
    }

    public static final Context l() {
        Z.o();
        Context context = f46933m;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    public static final String m() {
        Z.o();
        String str = f46925e;
        if (str != null) {
            return str;
        }
        throw new C4357q("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        Z.o();
        return f46926f;
    }

    public static final boolean o() {
        return X.e();
    }

    public static final boolean p() {
        return X.f();
    }

    public static final int q() {
        Z.o();
        return f46934n;
    }

    public static final String r() {
        Z.o();
        String str = f46927g;
        if (str != null) {
            return str;
        }
        throw new C4357q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return X.g();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = f46935o;
        reentrantLock.lock();
        try {
            if (f46924d == null) {
                f46924d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor = f46924d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String u() {
        return f46942v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        Y y10 = Y.f11042a;
        String str = f46922b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f46936p}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        Y.k0(str, format);
        return f46936p;
    }

    public static final String x() {
        AccessToken e10 = AccessToken.INSTANCE.e();
        return Y.E(e10 != null ? e10.getGraphDomain() : null);
    }

    public static final String y() {
        return f46941u;
    }

    public static final boolean z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Z.o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public final void K(Context context, String str) {
        try {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                C1662b e10 = C1662b.f11059f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String stringPlus = Intrinsics.stringPlus(str, "ping");
                long j10 = sharedPreferences.getLong(stringPlus, 0L);
                try {
                    p6.h hVar = p6.h.f63070a;
                    JSONObject a10 = p6.h.a(h.a.MOBILE_INSTALL_EVENT, e10, h6.p.f47798b.c(context), z(context), context);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    GraphRequest a11 = f46943w.a(null, format, a10, null);
                    if (j10 == 0 && a11.k().b() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(stringPlus, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (JSONException e11) {
                    throw new C4357q("An error occurred while publishing install.", e11);
                }
            } catch (Exception e12) {
                Y.j0("Facebook-publish", e12);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
