package h6;

import T7.C1678s;
import T7.C1681v;
import T7.F;
import T7.Y;
import T7.Z;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import g6.C4331C;
import g6.C4357q;
import g6.N;
import h6.p;
import h6.s;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o6.C5817b;
import o6.C5818c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f47813c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f47814d;

    /* renamed from: e, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f47815e;

    /* renamed from: f, reason: collision with root package name */
    public static p.b f47816f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f47817g;

    /* renamed from: h, reason: collision with root package name */
    public static String f47818h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f47819i;

    /* renamed from: j, reason: collision with root package name */
    public static String f47820j;

    /* renamed from: a, reason: collision with root package name */
    public final String f47821a;

    /* renamed from: b, reason: collision with root package name */
    public C4474a f47822b;

    public static final class a {

        /* renamed from: h6.s$a$a, reason: collision with other inner class name */
        public static final class C0717a implements F.a {
            @Override // T7.F.a
            public void a(String str) {
                s.f47813c.u(str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void n(Context context, s logger) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                String str = strArr[i10];
                String str2 = strArr2[i10];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i10;
                } catch (ClassNotFoundException unused) {
                }
                if (i12 > 10) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                logger.r("fb_sdk_initialize", null, bundle);
            }
        }

        public static final void p() {
            HashSet hashSet = new HashSet();
            Iterator it = n.p().iterator();
            while (it.hasNext()) {
                hashSet.add(((C4474a) it.next()).b());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                T7.A.q((String) it2.next(), true);
            }
        }

        public final void f(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (!C4331C.G()) {
                throw new C4357q("The Facebook sdk must be initialized before calling activateApp");
            }
            C4477d.e();
            K.f();
            if (str == null) {
                str = C4331C.m();
            }
            C4331C.L(application, str);
            p6.f.x(application, str);
        }

        public final void g() {
            if (j() != p.b.EXPLICIT_ONLY) {
                n nVar = n.f47789a;
                n.l(EnumC4467C.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor h() {
            if (s.b() == null) {
                o();
            }
            ScheduledThreadPoolExecutor b10 = s.b();
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String i(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (s.a() == null) {
                synchronized (s.e()) {
                    try {
                        if (s.a() == null) {
                            s.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (s.a() == null) {
                                UUID randomUUID = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                                s.h(Intrinsics.stringPlus("XZ", randomUUID));
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", s.a()).apply();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String a10 = s.a();
            if (a10 != null) {
                return a10;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final p.b j() {
            p.b c10;
            synchronized (s.e()) {
                c10 = s.c();
            }
            return c10;
        }

        public final String k() {
            T7.F f10 = T7.F.f10984a;
            T7.F.d(new C0717a());
            return C4331C.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String l() {
            String d10;
            synchronized (s.e()) {
                d10 = s.d();
            }
            return d10;
        }

        public final void m(final Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C4331C.p()) {
                final s sVar = new s(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor b10 = s.b();
                if (b10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b10.execute(new Runnable() { // from class: h6.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.n(context, sVar);
                    }
                });
            }
        }

        public final void o() {
            synchronized (s.e()) {
                if (s.b() != null) {
                    return;
                }
                s.i(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.INSTANCE;
                Runnable runnable = new Runnable() { // from class: h6.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.p();
                    }
                };
                ScheduledThreadPoolExecutor b10 = s.b();
                if (b10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b10.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        public final void q(C4478e c4478e, C4474a c4474a) {
            n.g(c4474a, c4478e);
            C1678s c1678s = C1678s.f11164a;
            if (C1678s.g(C1678s.b.OnDevicePostInstallEventProcessing) && r6.c.d()) {
                r6.c.e(c4474a.b(), c4478e);
            }
            if (c4478e.c() || s.f()) {
                return;
            }
            if (Intrinsics.areEqual(c4478e.f(), "fb_mobile_activate_app")) {
                s.g(true);
            } else {
                T7.J.f10993e.b(N.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public final void r(String str) {
            T7.J.f10993e.b(N.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void s() {
            n.s();
        }

        public final void t(p.b flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            synchronized (s.e()) {
                s.j(flushBehavior);
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void u(String str) {
            SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        public final void v(String str) {
            synchronized (s.e()) {
                try {
                    Y y10 = Y.f11042a;
                    if (!Y.J0(s.d(), str)) {
                        s.k(str);
                        s sVar = new s(C4331C.l(), (String) null, (AccessToken) null);
                        sVar.m("fb_mobile_obtain_push_token");
                        if (s.f47813c.j() != p.b.EXPLICIT_ONLY) {
                            sVar.l();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public a() {
        }
    }

    static {
        String canonicalName = s.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f47814d = canonicalName;
        f47816f = p.b.AUTO;
        f47817g = new Object();
    }

    public s(String activityName, String str, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Z.o();
        this.f47821a = activityName;
        accessToken = accessToken == null ? AccessToken.INSTANCE.e() : accessToken;
        if (accessToken == null || accessToken.N() || !(str == null || Intrinsics.areEqual(str, accessToken.getApplicationId()))) {
            if (str == null) {
                Y y10 = Y.f11042a;
                str = Y.J(C4331C.l());
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.f47822b = new C4474a(null, str);
        } else {
            this.f47822b = new C4474a(accessToken);
        }
        f47813c.o();
    }

    public static final /* synthetic */ String a() {
        if (Y7.a.d(s.class)) {
            return null;
        }
        try {
            return f47818h;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (Y7.a.d(s.class)) {
            return null;
        }
        try {
            return f47815e;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ p.b c() {
        if (Y7.a.d(s.class)) {
            return null;
        }
        try {
            return f47816f;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (Y7.a.d(s.class)) {
            return null;
        }
        try {
            return f47820j;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (Y7.a.d(s.class)) {
            return null;
        }
        try {
            return f47817g;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (Y7.a.d(s.class)) {
            return false;
        }
        try {
            return f47819i;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z10) {
        if (Y7.a.d(s.class)) {
            return;
        }
        try {
            f47819i = z10;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (Y7.a.d(s.class)) {
            return;
        }
        try {
            f47818h = str;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (Y7.a.d(s.class)) {
            return;
        }
        try {
            f47815e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
        }
    }

    public static final /* synthetic */ void j(p.b bVar) {
        if (Y7.a.d(s.class)) {
            return;
        }
        try {
            f47816f = bVar;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
        }
    }

    public static final /* synthetic */ void k(String str) {
        if (Y7.a.d(s.class)) {
            return;
        }
        try {
            f47820j = str;
        } catch (Throwable th2) {
            Y7.a.b(th2, s.class);
        }
    }

    public final void l() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            n nVar = n.f47789a;
            n.l(EnumC4467C.EXPLICIT);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void m(String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            o(str, null);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void n(String str, double d10, Bundle bundle) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            try {
                p(str, Double.valueOf(d10), bundle, false, p6.f.m());
            } catch (Throwable th2) {
                th = th2;
                Y7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void o(String str, Bundle bundle) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            try {
                p(str, null, bundle, false, p6.f.m());
            } catch (Throwable th2) {
                th = th2;
                Y7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void p(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (Y7.a.d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            C1681v c1681v = C1681v.f11207a;
            if (C1681v.d("app_events_killswitch", C4331C.m(), false)) {
                T7.J.f10993e.c(N.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                try {
                    C5817b.h(bundle, str);
                    C5818c.e(bundle);
                    f47813c.q(new C4478e(this.f47821a, str, d10, bundle, z10, p6.f.o(), uuid), this.f47822b);
                } catch (JSONException e10) {
                    T7.J.f10993e.c(N.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
                }
            } catch (C4357q e11) {
                T7.J.f10993e.c(N.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void q(String str, String str2) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            o(str, bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void r(String str, Double d10, Bundle bundle) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            try {
                p(str, d10, bundle, true, p6.f.m());
            } catch (Throwable th2) {
                th = th2;
                Y7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void s(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        Throwable th2;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                Y y10 = Y.f11042a;
                Y.k0(f47814d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th3) {
                    th2 = th3;
                    Y7.a.b(th2, this);
                }
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                p(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, p6.f.m());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                Y7.a.b(th2, this);
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void t(String str, p.c cVar, p.d dVar, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (str == null) {
                f47813c.r("itemID cannot be null");
                return;
            }
            if (cVar == null) {
                f47813c.r("availability cannot be null");
                return;
            }
            if (dVar == null) {
                f47813c.r("condition cannot be null");
                return;
            }
            if (str2 == null) {
                f47813c.r("description cannot be null");
                return;
            }
            if (str3 == null) {
                f47813c.r("imageLink cannot be null");
                return;
            }
            if (str4 == null) {
                f47813c.r("link cannot be null");
                return;
            }
            if (str5 == null) {
                f47813c.r("title cannot be null");
                return;
            }
            if (bigDecimal == null) {
                f47813c.r("priceAmount cannot be null");
                return;
            }
            if (currency == null) {
                f47813c.r("currency cannot be null");
                return;
            }
            if (str6 == null && str7 == null && str8 == null) {
                f47813c.r("Either gtin, mpn or brand is required");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("fb_product_item_id", str);
            bundle.putString("fb_product_availability", cVar.name());
            bundle.putString("fb_product_condition", dVar.name());
            bundle.putString("fb_product_description", str2);
            bundle.putString("fb_product_image_link", str3);
            bundle.putString("fb_product_link", str4);
            bundle.putString("fb_product_title", str5);
            bundle.putString("fb_product_price_amount", bigDecimal.setScale(3, 4).toString());
            bundle.putString("fb_product_price_currency", currency.getCurrencyCode());
            if (str6 != null) {
                bundle.putString("fb_product_gtin", str6);
            }
            if (str7 != null) {
                bundle.putString("fb_product_mpn", str7);
            }
            if (str8 != null) {
                bundle.putString("fb_product_brand", str8);
            }
            o("fb_mobile_catalog_update", bundle);
            f47813c.g();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void u(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (p6.i.c()) {
                Log.w(f47814d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
            }
            v(bigDecimal, currency, bundle, false);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void v(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10) {
        Throwable th2;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f47813c.r("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f47813c.r("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                try {
                    p("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, p6.f.m());
                    f47813c.g();
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    Y7.a.b(th2, this);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public final void w(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            v(bigDecimal, currency, bundle, true);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void x(Bundle payload, String str) {
        String str2;
        String string;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                string = payload.getString("fb_push_payload");
            } catch (JSONException unused) {
                str2 = null;
            }
            if (Y.d0(string)) {
                return;
            }
            str2 = new JSONObject(string).getString("campaign");
            if (str2 == null) {
                T7.J.f10993e.b(N.DEVELOPER_ERRORS, f47814d, "Malformed payload specified for logging a push notification open.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_push_campaign", str2);
            if (str != null) {
                bundle.putString("fb_push_action", str);
            }
            o("fb_mobile_push_opened", bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public s(Context context, String str, AccessToken accessToken) {
        this(Y.t(context), str, accessToken);
    }
}
