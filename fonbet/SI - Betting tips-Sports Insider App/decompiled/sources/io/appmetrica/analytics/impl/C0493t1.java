package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493t1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0642z0 f14654a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f14655b;

    /* renamed from: c, reason: collision with root package name */
    public final C0386oi f14656c;

    /* renamed from: d, reason: collision with root package name */
    public final D7 f14657d;

    /* renamed from: e, reason: collision with root package name */
    public final C0212hl f14658e;

    /* renamed from: f, reason: collision with root package name */
    public final A2 f14659f;

    /* renamed from: g, reason: collision with root package name */
    public final C0188gn f14660g;

    /* renamed from: h, reason: collision with root package name */
    public final Wk f14661h;

    public C0493t1(C0642z0 c0642z0, A2 a22, C0212hl c0212hl, Ho ho, C0188gn c0188gn, C0386oi c0386oi, D7 d72, Wk wk) {
        this.f14654a = c0642z0;
        this.f14655b = ho;
        this.f14656c = c0386oi;
        this.f14657d = d72;
        this.f14659f = a22;
        this.f14660g = c0188gn;
        this.f14658e = c0212hl;
        this.f14661h = wk;
    }

    public static IHandlerExecutor c() {
        return C0040b4.l().f13374c.a();
    }

    public final void a(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        A2 a22 = this.f14659f;
        a22.f11952f.a(context);
        a22.f11948b.a(appMetricaConfig);
        C0188gn c0188gn = this.f14660g;
        Context applicationContext = context.getApplicationContext();
        c0188gn.f13855e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0188gn.f13854d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0188gn.f13851a.getClass();
        C0617y0 a7 = C0617y0.a(applicationContext);
        a7.f14942d.a(appMetricaConfig, a7);
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new androidx.fragment.app.d(this, context, appMetricaConfig, 15));
        this.f14654a.getClass();
        C0642z0.b();
    }

    public final String b() {
        this.f14654a.getClass();
        C0617y0 c0617y0 = C0617y0.f14936e;
        if (c0617y0 == null) {
            return null;
        }
        return c0617y0.f().e();
    }

    public final C0254jc d() {
        this.f14654a.getClass();
        return C0617y0.f14936e.f().i();
    }

    public final void e() {
        d().f14030a.a(this.f14661h.a());
    }

    public final void f() {
        this.f14659f.f11947a.a(null);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new W0(this));
    }

    public final void c(Activity activity) {
        this.f14659f.f11947a.a(null);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0192h1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C0642z0 c0642z0 = this.f14654a;
        Context applicationContext = context.getApplicationContext();
        c0642z0.getClass();
        C0617y0 a7 = C0617y0.a(applicationContext);
        a7.f().b(this.f14657d.a(appMetricaConfig));
        Context context2 = a7.f14939a;
        ((C0651z9) C0040b4.l().f13374c.a()).execute(new RunnableC0568w1(context2));
    }

    public final void d(String str) {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new T0(this, str));
    }

    public C0493t1() {
        this(C0040b4.l().d(), new Ho());
    }

    public final void c(@NonNull String str, String str2) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11962r.a(str);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0369o1(this, str, str2));
    }

    public final void d(@NonNull String str, String str2) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        if (a22.f11959n.a(str).f14527a) {
            this.f14660g.getClass();
            IHandlerExecutor c2 = c();
            ((C0651z9) c2).f14990b.post(new RunnableC0089d1(this, str, str2));
        }
    }

    public C0493t1(C0642z0 c0642z0, Ho ho) {
        this(c0642z0, new A2(c0642z0), new C0212hl(c0642z0), ho, new C0188gn(c0642z0, ho), C0386oi.a(), C0040b4.l().j(), C0040b4.l().o());
    }

    public final void b(@NonNull String str) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11962r.a(str);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0344n1(this, str));
    }

    public final void c(boolean z5) {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new Q0(this, z5));
    }

    public final void a(Activity activity) {
        this.f14659f.f11947a.a(null);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0319m1(this, activity));
    }

    public final void b(@NonNull Activity activity) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11949c.a(activity);
        this.f14660g.getClass();
        Intent a7 = C0188gn.a(activity);
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new M0(this, a7));
    }

    public final void c(@NonNull String str) {
        if (this.f14658e.a((Void) null).f14527a && this.f14659f.f11958m.a(str).f14527a) {
            this.f14660g.getClass();
            IHandlerExecutor c2 = c();
            ((C0651z9) c2).f14990b.post(new RunnableC0114e1(this, str));
        }
    }

    public final void a(@NonNull Application application) {
        this.f14659f.f11951e.a(application);
        this.f14660g.f13853c.a(application);
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new aa.c(23, this));
    }

    public final void b(boolean z5) {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new S0(this, z5));
    }

    public final void b(@NonNull String str, String str2) {
        this.f14659f.f11956k.a(str);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0037b1(this, str, str2));
    }

    public final void a(@NonNull String str, Map<String, Object> map) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11962r.a(str);
        this.f14660g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0394p1(this, str, listFromMap));
    }

    public final void b(@NonNull Object... objArr) {
        this.f14659f.f11947a.a(null);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new aa.c(24, objArr));
    }

    public final void a(@NonNull String str, Throwable th2) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11963s.a(str);
        this.f14660g.getClass();
        if (th2 == null) {
            th2 = new N1();
            th2.fillInStackTrace();
        }
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0419q1(this, str, th2));
    }

    public final void b(@NonNull Context context) {
        this.f14659f.f11952f.a(context);
        this.f14660g.f13855e.a(context);
        this.f14654a.getClass();
        C0617y0.a(context);
    }

    public final void a(@NonNull String str, String str2, Throwable th2) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11964t.a(str);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0443r1(this, str, str2, th2));
    }

    public final void a(@NonNull Throwable th2) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11965u.a(th2);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0468s1(this, th2));
    }

    public final void a(@NonNull String str) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11955i.a(str);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new N0(this, str));
    }

    public final void a(@NonNull Intent intent) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11950d.a(intent);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new O0(this, intent));
    }

    public final void a(Location location) {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new P0(this, location));
    }

    public final void a(boolean z5) {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new R0(this, z5));
    }

    public final void a(@NonNull UserProfile userProfile) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11966v.a(userProfile);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new U0(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11967w.a(revenue);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new V0(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11968x.a(adRevenue);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new X0(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11969y.a(eCommerceEvent);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new Y0(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11953g.a(deferredDeeplinkParametersListener);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new Z0(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11953g.a(deferredDeeplinkListener);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0011a1(this, deferredDeeplinkListener));
    }

    @NonNull
    public final Ra a(@NonNull Context context, @NonNull String str) {
        A2 a22 = this.f14659f;
        a22.f11952f.a(context);
        a22.j.a(str);
        C0188gn c0188gn = this.f14660g;
        c0188gn.f13855e.a(context.getApplicationContext());
        return this.f14656c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        A2 a22 = this.f14659f;
        a22.f11952f.a(context);
        a22.f11954h.a(reporterConfig);
        C0188gn c0188gn = this.f14660g;
        c0188gn.f13855e.a(context.getApplicationContext());
        C0386oi c0386oi = this.f14656c;
        Context applicationContext = context.getApplicationContext();
        if (((C0183gi) c0386oi.f14423a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0386oi.f14423a) {
                try {
                    if (((C0183gi) c0386oi.f14423a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a7 = C0040b4.l().f13374c.a();
                        c0386oi.f14424b.getClass();
                        if (C0617y0.f14936e == null) {
                            ((C0651z9) a7).f14990b.post(new RunnableC0336mi(c0386oi, applicationContext));
                        }
                        C0183gi c0183gi = new C0183gi(applicationContext.getApplicationContext(), str, new C0642z0());
                        c0386oi.f14423a.put(str, c0183gi);
                        c0183gi.a(reporterConfig);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(@NonNull WebView webView) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11957l.a(webView);
        Ho ho = this.f14660g.f13852b;
        ho.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Eo eo = new Eo();
                synchronized (ho) {
                    try {
                        PublicLogger publicLogger = ho.f12332b;
                        if (publicLogger == null) {
                            ho.f12331a.add(eo);
                        } else {
                            eo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                ho.a(new Fo());
            }
        } catch (Throwable th2) {
            ho.a(new Go(th2));
        }
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0063c1(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f14659f.f11952f.a(context);
        C0188gn c0188gn = this.f14660g;
        Context applicationContext = context.getApplicationContext();
        c0188gn.f13855e.a(applicationContext);
        c0188gn.f13856f.a(applicationContext);
        return C0040b4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, String str2) {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0140f1(this, str, str2));
    }

    public final void a() {
        this.f14659f.getClass();
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0166g1(this));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        A2 a22 = this.f14659f;
        a22.f11952f.a(context);
        a22.f11960o.a(startupParamsCallback);
        C0188gn c0188gn = this.f14660g;
        c0188gn.f13855e.a(context.getApplicationContext());
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0218i1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.f11961p.a(anrListener);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0243j1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        A2 a22 = this.f14659f;
        a22.f11947a.a(null);
        a22.q.a(externalAttribution);
        this.f14660g.getClass();
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0269k1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b10 = C0040b4.l().m().b();
        if (b10 != null) {
            b10.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f14659f.f11970z.a(map);
        this.f14660g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c2 = c();
        ((C0651z9) c2).f14990b.post(new RunnableC0294l1(this, listFromMap));
    }

    public static Ia a(C0493t1 c0493t1) {
        return c0493t1.d().f14030a;
    }
}
