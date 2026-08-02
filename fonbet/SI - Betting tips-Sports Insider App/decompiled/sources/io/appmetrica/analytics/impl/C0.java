package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class C0 implements Ca {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12085a;

    /* renamed from: b, reason: collision with root package name */
    public final Ba f12086b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f12087c;

    /* renamed from: d, reason: collision with root package name */
    public final Ol f12088d;

    /* renamed from: e, reason: collision with root package name */
    public final C0258jg f12089e;

    /* renamed from: f, reason: collision with root package name */
    public final Bf f12090f;

    /* renamed from: g, reason: collision with root package name */
    public final C0260ji f12091g;

    /* renamed from: h, reason: collision with root package name */
    public final C0585wi f12092h;

    /* renamed from: i, reason: collision with root package name */
    public final D7 f12093i;
    public final Wk j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0254jc f12094k;

    /* renamed from: l, reason: collision with root package name */
    public final C0318m0 f12095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12096m;

    public C0(@NotNull Context context, @NotNull Ba ba2) {
        this.f12085a = context;
        this.f12086b = ba2;
        Ve b10 = C0040b4.l().b(context);
        this.f12087c = b10;
        ArrayList a7 = C0480sd.a();
        C0040b4 l6 = C0040b4.l();
        l6.m().a(new K3(context));
        D0.a(context).a(a7);
        Bf a10 = D0.a(context, D0.a(ba2.b(), this));
        this.f12090f = a10;
        D7 j = l6.j();
        this.f12093i = j;
        C0585wi a11 = D0.a(a10, context, ba2.getDefaultExecutor());
        this.f12092h = a11;
        j.a(a11);
        Ol a12 = D0.a(context, a11, b10, ba2.b());
        this.f12088d = a12;
        a11.a(a12);
        this.f12089e = D0.a(a11, b10, ba2.b());
        this.f12091g = D0.a(context, a10, a11, ba2.b(), a12);
        this.j = l6.o();
        this.f12095l = new C0318m0(b10);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final Ra c(@NotNull ReporterConfig reporterConfig) {
        return this.f12091g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final X9 d() {
        return this.f12088d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @Nullable
    public final String e() {
        return this.f12088d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @Nullable
    public final Map<String, String> g() {
        return this.f12088d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.f12088d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @Nullable
    public final C0254jc i() {
        return this.f12094k;
    }

    public final Ia j() {
        C0254jc c0254jc = this.f12094k;
        Intrinsics.checkNotNull(c0254jc);
        return c0254jc.f14030a;
    }

    @NotNull
    public final C0260ji k() {
        return this.f12091g;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z5) {
        j().setDataSendingEnabled(z5);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(@Nullable String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0318m0 c0318m0 = this.f12095l;
        C0567w0 c0567w0 = c0318m0.f14220b;
        c0567w0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0567w0.f14807a.b() && Intrinsics.areEqual(c0567w0.f14808b.f13509a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f6 = c0318m0.f14219a.f();
        if (f6 != null) {
            if (f6.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f6.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f6.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new B0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z5;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a7 = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a7 || this.f12096m) {
            z5 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z5 = true;
        }
        if (a7 || z5) {
            this.f12087c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a7) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z5) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f12096m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.A6
    public final void a(int i5, @NotNull Bundle bundle) {
        this.f12088d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f12089e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f12089e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.f12091g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.f12088d.a(startupParamsCallback, list, AbstractC0176gb.c(this.f12090f.f12060a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC0579wc interfaceC0579wc, boolean z5) {
        if (this.f12094k == null) {
            a(publicLogger, appMetricaConfig, z5);
            this.f12089e.a();
            C0203hc a7 = interfaceC0579wc.a();
            C0624y7 c0624y7 = new C0624y7(a7);
            C0254jc c0254jc = new C0254jc(a7, c0624y7);
            this.f12086b.c().a(c0624y7);
            this.f12094k = c0254jc;
            C0323m5 c0323m5 = this.j.f13114b;
            synchronized (c0323m5) {
                try {
                    c0323m5.f14229a = a7;
                    Iterator it = c0323m5.f14230b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0024ae) it.next()).consume(a7);
                    }
                    c0323m5.f14230b.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        interfaceC0579wc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z5) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f12086b.d().a(this.f12085a, appMetricaConfig, this);
            this.f12086b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f12086b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.j.a();
        } else {
            Wk wk = this.j;
            synchronized (wk) {
                if (wk.f13119g) {
                    wk.f13113a.unregisterListener(wk.f13115c, ActivityEvent.RESUMED);
                    wk.f13113a.unregisterListener(wk.f13116d, ActivityEvent.PAUSED);
                    wk.f13119g = false;
                }
            }
        }
        this.f12090f.d(appMetricaConfig);
        Ol ol = this.f12088d;
        ol.f12709e = publicLogger;
        ol.b(appMetricaConfig.customHosts);
        Ol ol2 = this.f12088d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ol2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f12088d.a(str);
        if (str != null) {
            this.f12088d.b("api");
        }
        this.f12092h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z5));
        this.f12088d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(@Nullable Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5) {
        j().a(z5);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5, boolean z7) {
        j().a(z5, z7);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(@NotNull String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return this.f12091g;
    }
}
