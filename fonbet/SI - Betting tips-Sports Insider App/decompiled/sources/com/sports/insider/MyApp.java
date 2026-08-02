package com.sports.insider;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.c0;
import androidx.lifecycle.w;
import b6.o;
import b6.p;
import c4.v;
import c4.x;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.internal.measurement.y3;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.b0;
import com.logrocket.core.e0;
import com.logrocket.core.f;
import com.logrocket.core.h0;
import com.logrocket.core.z;
import da.q;
import e3.b;
import e3.c;
import eg.m0;
import eg.u1;
import eg.y;
import gf.k;
import gf.t;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.c1;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.d4;
import io.sentry.k2;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lg.e;
import q4.r;
import y9.h;
import zc.a;
import zc.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sports/insider/MyApp;", "Landroid/app/Application;", "Landroidx/lifecycle/c0;", "Le3/b;", "Lc4/x;", "<init>", "()V", "da/r", "m3/f", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MyApp extends Application implements c0, b, x {

    /* renamed from: c, reason: collision with root package name */
    public static final d f6830c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f6831d;

    /* renamed from: a, reason: collision with root package name */
    public final t f6832a = k.b(new b2.b(12));

    /* renamed from: b, reason: collision with root package name */
    public final t f6833b = k.b(new b2.b(13));

    static {
        u1 d10 = eg.c0.d();
        e eVar = m0.f9201a;
        f6830c = eg.c0.b(kotlin.coroutines.e.c(d10, lg.d.f20063c).t(a.f25907a));
        f6831d = new y("LifecycleOnStartStop");
    }

    @Override // c4.x
    public final v a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f3.x.k0(context, null, null);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        if (Build.VERSION.SDK_INT >= 25) {
            try {
                f fVar = new f();
                fVar.f6425a = "aiwfqa/sportsinsider";
                try {
                    try {
                        LogRocketCore.e(this, base, fVar);
                    } catch (z e7) {
                        String message = e7.getMessage();
                        Objects.requireNonNull(message);
                        Log.e("LogRocket", message);
                    } catch (h e9) {
                        Log.e("LogRocket", "Failed to initialize persistence system.", e9);
                    }
                } catch (b0 e10) {
                    e = e10;
                    String message2 = e.getMessage();
                    Objects.requireNonNull(message2);
                    Log.w("LogRocket", message2);
                } catch (com.logrocket.core.c0 e11) {
                    e = e11;
                    String message22 = e.getMessage();
                    Objects.requireNonNull(message22);
                    Log.w("LogRocket", message22);
                } catch (Throwable th2) {
                    Log.e("LogRocket", th2.getMessage(), th2.getCause());
                    h0.c(th2);
                }
                e0.b(new y8.d());
            } catch (Exception ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                e eVar = m0.f9201a;
                eg.c0.t(f6830c, lg.d.f20063c, null, new r(ex, null, 18), 2);
            }
        }
    }

    public final c b() {
        p pVar = new p();
        pVar.f3078a = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        Intrinsics.checkNotNullParameter("com.sports.insider", "processName");
        pVar.f3081d = "com.sports.insider";
        q schedulingExceptionHandler = new q(0);
        Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "schedulingExceptionHandler");
        pVar.f3080c = schedulingExceptionHandler;
        q exceptionHandler = new q(1);
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        pVar.f3079b = exceptionHandler;
        return new c(pVar);
    }

    @Override // androidx.lifecycle.c0
    public final void c(androidx.lifecycle.e0 source, w event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        eg.c0.e(f6830c, f6831d, new ab.b(event, this, null, 5), 2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createConfigurationContext(Configuration overrideConfiguration) {
        Intrinsics.checkNotNullParameter(overrideConfiguration, "overrideConfiguration");
        ((g) this.f6833b.getValue()).getClass();
        g.a(overrideConfiguration);
        Context createConfigurationContext = super.createConfigurationContext(overrideConfiguration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ((g) this.f6833b.getValue()).getClass();
        g.a(newConfig);
    }

    @Override // android.app.Application
    public final void onCreate() {
        io.sentry.android.core.performance.f fVar = io.sentry.android.core.performance.f.f15800m;
        long uptimeMillis = SystemClock.uptimeMillis();
        io.sentry.android.core.performance.f b10 = io.sentry.android.core.performance.f.b();
        io.sentry.android.core.performance.g gVar = b10.f15806e;
        if (gVar.f15814c == 0) {
            gVar.c(uptimeMillis);
            b10.f(this);
        }
        super.onCreate();
        androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(15, this);
        int i5 = 3;
        io.sentry.android.core.v vVar = new io.sentry.android.core.v(i5);
        try {
            io.sentry.r a7 = c1.f15556b.a();
            try {
                d4.e(new k2(), new io.sentry.android.core.e(vVar, this, aVar));
                b1 d10 = d4.d();
                if (io.sentry.android.core.m0.h()) {
                    if (d10.m().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        d10.y(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(29, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            d10.q();
                        }
                    }
                    d10.m().getReplayController().z();
                }
                a7.close();
                AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("2867f6d4-6d6b-433f-aa11-817dee83a703");
                newConfigBuilder.withAppEnvironmentValue("AppStore", "google");
                newConfigBuilder.withErrorEnvironmentValue("AppStore", "google");
                newConfigBuilder.withAppEnvironmentValue("BASE_URL", "https://sport-insider.club/");
                newConfigBuilder.withErrorEnvironmentValue("BASE_URL", "https://sport-insider.club/");
                newConfigBuilder.withAppEnvironmentValue("APPLICATION_ID", "com.sports.insider");
                newConfigBuilder.withErrorEnvironmentValue("APPLICATION_ID", "com.sports.insider");
                newConfigBuilder.withAppEnvironmentValue("FLAVOR", "googleProduction");
                newConfigBuilder.withErrorEnvironmentValue("FLAVOR", "googleProduction");
                AppMetricaConfig build = newConfigBuilder.withRevenueAutoTrackingEnabled(true).withCrashReporting(true).withAnrMonitoring(true).withAnrMonitoringTimeout(6).withDataSendingEnabled(true).withLocationTracking(false).withAppVersion("1.2.44.123").build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                AppMetrica.activate(getApplicationContext(), build);
                AppMetrica.enableActivityAutoTracking(this);
                a2.f appDeclaration = new a2.f(i5, this);
                Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
                zh.a aVar2 = zh.a.f25987a;
                Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
                synchronized (aVar2) {
                    yh.a aVar3 = new yh.a();
                    if (zh.a.f25988b != null) {
                        Intrinsics.checkNotNullParameter("A Koin Application has already been started", "msg");
                        throw new o("A Koin Application has already been started");
                    }
                    zh.a.f25988b = aVar3.f25875a;
                    appDeclaration.invoke(aVar3);
                    aVar3.f25875a.o();
                }
                za.e eVar = (za.e) y3.m(za.e.class, null, 6);
                eVar.getClass();
                bc.a a10 = za.e.a();
                Context context = eVar.f25898a;
                a10.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                AppsFlyerLib a11 = bc.a.a();
                a11.waitForCustomerUserId(false);
                a11.enableFacebookDeferredApplinks(false);
                a11.setCollectAndroidID(true);
                a11.setOutOfStore("");
                a11.init("JjxMsatK27T7X5aaxLQsjC", null, context);
                a11.start(context, "JjxMsatK27T7X5aaxLQsjC");
                ProcessLifecycleOwner.f2124i.f2130f.a(this);
                eg.c0.t(f6830c, new y("onCreate"), null, new ab.b(this, (Continuation) null, 4), 2);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                io.sentry.android.core.performance.g gVar2 = io.sentry.android.core.performance.f.b().f15806e;
                if (gVar2.f15815d == 0) {
                    gVar2.f15812a = MyApp.class.getName().concat(".onCreate");
                    gVar2.f15815d = uptimeMillis2;
                }
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalAccessException e7) {
            vVar.e(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e7);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e7);
        } catch (InstantiationException e9) {
            vVar.e(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e9);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e9);
        } catch (NoSuchMethodException e10) {
            vVar.e(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InvocationTargetException e11) {
            vVar.e(b5.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        }
    }
}
