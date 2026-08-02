package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617y0 implements Ta {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0617y0 f14936e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f14937f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f14938g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14939a;

    /* renamed from: b, reason: collision with root package name */
    public final C0442r0 f14940b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f14941c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba f14942d;

    public C0617y0(@NonNull Context context) {
        this.f14939a = context;
        C0442r0 c2 = C0040b4.l().c();
        this.f14940b = c2;
        this.f14942d = c2.a(context, C0040b4.l().g());
        this.f14941c = new FutureTask(new d4.z(3, this));
    }

    @NonNull
    public static C0617y0 a(@NonNull Context context) {
        C0617y0 c0617y0;
        C0617y0 c0617y02 = f14936e;
        if (c0617y02 != null) {
            return c0617y02;
        }
        synchronized (C0617y0.class) {
            try {
                c0617y0 = f14936e;
                if (c0617y0 == null) {
                    c0617y0 = new C0617y0(context);
                    c0617y0.j();
                    C0040b4.l().f13374c.a().execute(new RunnableC0592x0(c0617y0));
                    f14936e = c0617y0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0617y0;
    }

    public static void b(boolean z5) {
        c().a(z5, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z5;
        synchronized (C0617y0.class) {
            z5 = f14937f;
        }
        return z5;
    }

    public static boolean l() {
        return f14938g;
    }

    public static synchronized boolean m() {
        boolean z5;
        synchronized (C0617y0.class) {
            C0617y0 c0617y0 = f14936e;
            if (c0617y0 != null && c0617y0.f14941c.isDone()) {
                z5 = c0617y0.f().i() != null;
            }
        }
        return z5;
    }

    public static synchronized void n() {
        synchronized (C0617y0.class) {
            f14936e = null;
            f14937f = false;
            f14938g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C0617y0.class) {
            f14937f = true;
        }
    }

    public static void r() {
        f14938g = true;
    }

    public static C0617y0 s() {
        return f14936e;
    }

    public static void setDataSendingEnabled(boolean z5) {
        c().setDataSendingEnabled(z5);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f14942d.a(appMetricaConfig, this);
    }

    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0040b4.l().f13374c.a().execute(new RunnableC0568w1(this.f14939a));
    }

    public final String e() {
        return f().e();
    }

    public final Ca f() {
        try {
            return (Ca) this.f14941c.get();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final C0254jc i() {
        return f().i();
    }

    public final void j() {
        R3 r32 = C0040b4.l().f13374c;
        aa.c cVar = new aa.c(25, this);
        r32.f12799a.getClass();
        new InterruptionSafeThread(cVar, "IAA-INIT_CORE-" + ThreadFactoryC0655zd.f14994a.incrementAndGet()).start();
    }

    public final void o() {
        C0040b4.l().f13387r.a(this.f14939a);
        new V3(this.f14939a).a(this.f14939a);
        C0040b4.l().a(this.f14939a).a();
        this.f14941c.run();
    }

    public final Ca p() {
        Ca ca2;
        C0442r0 c0442r0 = this.f14940b;
        Context context = this.f14939a;
        Ba ba2 = this.f14942d;
        synchronized (c0442r0) {
            try {
                if (c0442r0.f14535d == null) {
                    if (c0442r0.a(context)) {
                        c0442r0.f14535d = new E0();
                    } else {
                        c0442r0.f14535d = new C0(context, ba2);
                    }
                }
                ca2 = c0442r0.f14535d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ca2;
    }

    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0040b4.l().f13374c.a().execute(new RunnableC0568w1(this.f14939a));
    }

    @NonNull
    public final Ra c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Hc c() {
        if (m()) {
            return f14936e.f();
        }
        return C0040b4.l().f13373b;
    }

    @NonNull
    public final X9 d() {
        return f().d();
    }

    @NonNull
    public final C0117e4 b() {
        return this.f14942d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z5) {
        c().a(z5);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(@NonNull String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C0617y0 c0617y0) {
        synchronized (C0617y0.class) {
            f14936e = c0617y0;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Sa a() {
        return f().a();
    }
}
