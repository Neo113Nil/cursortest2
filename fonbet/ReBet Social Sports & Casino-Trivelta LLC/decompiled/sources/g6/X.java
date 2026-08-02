package g6;

import T7.C1662b;
import T7.C1682w;
import T7.Y;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.hermes.intl.Constants;
import com.twilio.voice.EventKeys;
import h6.C4470F;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public static final X f47019a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static final String f47020b = X.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f47021c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f47022d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final a f47023e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f, reason: collision with root package name */
    public static final a f47024f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g, reason: collision with root package name */
    public static final a f47025g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h, reason: collision with root package name */
    public static final a f47026h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i, reason: collision with root package name */
    public static final a f47027i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j, reason: collision with root package name */
    public static SharedPreferences f47028j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f47029a;

        /* renamed from: b, reason: collision with root package name */
        public String f47030b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f47031c;

        /* renamed from: d, reason: collision with root package name */
        public long f47032d;

        public a(boolean z10, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f47029a = z10;
            this.f47030b = key;
        }

        public final boolean a() {
            return this.f47029a;
        }

        public final String b() {
            return this.f47030b;
        }

        public final long c() {
            return this.f47032d;
        }

        public final Boolean d() {
            return this.f47031c;
        }

        public final boolean e() {
            Boolean bool = this.f47031c;
            return bool == null ? this.f47029a : bool.booleanValue();
        }

        public final void f(long j10) {
            this.f47032d = j10;
        }

        public final void g(Boolean bool) {
            this.f47031c = bool;
        }
    }

    public static final boolean d() {
        if (Y7.a.d(X.class)) {
            return false;
        }
        try {
            f47019a.j();
            return f47025g.e();
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
            return false;
        }
    }

    public static final boolean e() {
        if (Y7.a.d(X.class)) {
            return false;
        }
        try {
            f47019a.j();
            return f47023e.e();
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
            return false;
        }
    }

    public static final boolean f() {
        if (Y7.a.d(X.class)) {
            return false;
        }
        try {
            X x10 = f47019a;
            x10.j();
            return x10.b();
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
            return false;
        }
    }

    public static final boolean g() {
        if (Y7.a.d(X.class)) {
            return false;
        }
        try {
            f47019a.j();
            return f47026h.e();
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
            return false;
        }
    }

    public static final void i(long j10) {
        if (Y7.a.d(X.class)) {
            return;
        }
        try {
            if (f47025g.e()) {
                T7.A a10 = T7.A.f10965a;
                C1682w q10 = T7.A.q(C4331C.m(), false);
                if (q10 != null && q10.b()) {
                    C1662b e10 = C1662b.f11059f.e(C4331C.l());
                    String h10 = (e10 == null || e10.h() == null) ? null : e10.h();
                    if (h10 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", h10);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        GraphRequest x10 = GraphRequest.f30314n.x(null, "app", null);
                        x10.J(bundle);
                        JSONObject c10 = x10.k().c();
                        if (c10 != null) {
                            a aVar = f47026h;
                            aVar.g(Boolean.valueOf(c10.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j10);
                            f47019a.v(aVar);
                        }
                    }
                }
            }
            f47022d.set(false);
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
        }
    }

    public static final void n() {
        if (Y7.a.d(X.class)) {
            return;
        }
        try {
            Context l10 = C4331C.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            C4470F c4470f = new C4470F(l10);
            Bundle bundle2 = new Bundle();
            if (!Y.V()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f47020b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            c4470f.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
        }
    }

    public static final Boolean q() {
        SharedPreferences sharedPreferences;
        String str = "";
        if (Y7.a.d(X.class)) {
            return null;
        }
        try {
            f47019a.u();
            try {
                sharedPreferences = f47028j;
            } catch (JSONException e10) {
                Y y10 = Y.f11042a;
                Y.j0(f47020b, e10);
            }
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                throw null;
            }
            String string = sharedPreferences.getString(f47024f.b(), "");
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return Boolean.valueOf(new JSONObject(str).getBoolean(EventKeys.VALUE_KEY));
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
            return null;
        }
    }

    public static final void s(boolean z10) {
        if (Y7.a.d(X.class)) {
            return;
        }
        try {
            a aVar = f47025g;
            aVar.g(Boolean.valueOf(z10));
            aVar.f(System.currentTimeMillis());
            if (f47021c.get()) {
                f47019a.v(aVar);
            } else {
                f47019a.j();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
        }
    }

    public static final void t(boolean z10) {
        if (Y7.a.d(X.class)) {
            return;
        }
        try {
            a aVar = f47024f;
            aVar.g(Boolean.valueOf(z10));
            aVar.f(System.currentTimeMillis());
            if (f47021c.get()) {
                f47019a.v(aVar);
            } else {
                f47019a.j();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, X.class);
        }
    }

    public final boolean b() {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            Map g10 = T7.A.g();
            if (g10 != null && !g10.isEmpty()) {
                Boolean bool = (Boolean) g10.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) g10.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean c10 = c();
                if (c10 != null) {
                    return c10.booleanValue();
                }
                if (bool2 == null) {
                    return true;
                }
                return bool2.booleanValue();
            }
            return f47024f.e();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final Boolean c() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Boolean q10 = q();
            if (q10 != null) {
                return q10;
            }
            Boolean l10 = l();
            if (l10 == null) {
                return null;
            }
            return l10;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void h() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            a aVar = f47026h;
            r(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (f47022d.compareAndSet(false, true)) {
                    C4331C.t().execute(new Runnable() { // from class: g6.W
                        @Override // java.lang.Runnable
                        public final void run() {
                            X.i(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void j() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (C4331C.G() && f47021c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f47028j = sharedPreferences;
                k(f47024f, f47025g, f47023e);
                h();
                p();
                o();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void k(a... aVarArr) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            int length = aVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = aVarArr[i10];
                i10++;
                if (aVar == f47026h) {
                    h();
                } else if (aVar.d() == null) {
                    r(aVar);
                    if (aVar.d() == null) {
                        m(aVar);
                    }
                } else {
                    v(aVar);
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final Boolean l() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            u();
            try {
                Context l10 = C4331C.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f47024f;
                    if (bundle.containsKey(aVar.b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Y y10 = Y.f11042a;
                Y.j0(f47020b, e10);
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void m(a aVar) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            u();
            try {
                Context l10 = C4331C.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
            } catch (PackageManager.NameNotFoundException e10) {
                Y y10 = Y.f11042a;
                Y.j0(f47020b, e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void o() {
        int i10;
        int i11;
        ApplicationInfo applicationInfo;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (f47021c.get() && C4331C.G()) {
                Context l10 = C4331C.l();
                int i12 = (f47023e.e() ? 1 : 0) | ((f47024f.e() ? 1 : 0) << 1) | ((f47025g.e() ? 1 : 0) << 2) | ((f47027i.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f47028j;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
                int i13 = 0;
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i12) {
                    SharedPreferences sharedPreferences2 = f47028j;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).apply();
                    try {
                        applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i10 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i11 = 0;
                        C4470F c4470f = new C4470F(l10);
                        Bundle bundle = new Bundle();
                        bundle.putInt(Constants.COLLATION_OPTION_USAGE, i13);
                        bundle.putInt("initial", i11);
                        bundle.putInt("previous", i14);
                        bundle.putInt("current", i12);
                        c4470f.b(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        int i15 = i13 + 1;
                        try {
                            i10 |= (applicationInfo.metaData.containsKey(strArr[i13]) ? 1 : 0) << i13;
                            i11 |= (applicationInfo.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                            if (i15 > 3) {
                                break;
                            } else {
                                i13 = i15;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i13 = i11;
                            i11 = i13;
                            i13 = i10;
                            C4470F c4470f2 = new C4470F(l10);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt(Constants.COLLATION_OPTION_USAGE, i13);
                            bundle2.putInt("initial", i11);
                            bundle2.putInt("previous", i14);
                            bundle2.putInt("current", i12);
                            c4470f2.b(bundle2);
                        }
                    }
                    i13 = i10;
                    C4470F c4470f22 = new C4470F(l10);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt(Constants.COLLATION_OPTION_USAGE, i13);
                    bundle22.putInt("initial", i11);
                    bundle22.putInt("previous", i14);
                    bundle22.putInt("current", i12);
                    c4470f22.b(bundle22);
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void p() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Context l10 = C4331C.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f47020b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (d()) {
                    return;
                }
                Log.w(f47020b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void r(a aVar) {
        String str = "";
        if (Y7.a.d(this)) {
            return;
        }
        try {
            u();
            try {
                SharedPreferences sharedPreferences = f47028j;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean(EventKeys.VALUE_KEY)));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                Y y10 = Y.f11042a;
                Y.j0(f47020b, e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void u() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (f47021c.get()) {
            } else {
                throw new C4332D("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void v(a aVar) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            u();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EventKeys.VALUE_KEY, aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f47028j;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                o();
            } catch (Exception e10) {
                Y y10 = Y.f11042a;
                Y.j0(f47020b, e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
