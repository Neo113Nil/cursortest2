package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479sc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14629a;

    /* renamed from: b, reason: collision with root package name */
    public final C0585wi f14630b;

    /* renamed from: c, reason: collision with root package name */
    public final Bd f14631c;

    /* renamed from: d, reason: collision with root package name */
    public final M9 f14632d;

    /* renamed from: e, reason: collision with root package name */
    public final D8 f14633e;

    /* renamed from: f, reason: collision with root package name */
    public final Fh f14634f;

    /* renamed from: g, reason: collision with root package name */
    public final C0115e2 f14635g;

    /* renamed from: h, reason: collision with root package name */
    public final C0448r6 f14636h;

    /* renamed from: i, reason: collision with root package name */
    public final C0417q f14637i;
    public final Je j;

    /* renamed from: k, reason: collision with root package name */
    public final Rn f14638k;

    /* renamed from: l, reason: collision with root package name */
    public final Eg f14639l;

    /* renamed from: m, reason: collision with root package name */
    public final C0548v6 f14640m;

    /* renamed from: n, reason: collision with root package name */
    public final C0088d0 f14641n;

    public C0479sc(Context context, Bf bf2, C0585wi c0585wi, Ol ol) {
        this.f14629a = context;
        this.f14630b = c0585wi;
        this.f14631c = new Bd(bf2);
        M9 m92 = new M9(context);
        this.f14632d = m92;
        D8 d82 = new D8(new C0463rl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f14633e = d82;
        this.f14634f = new Fh(bf2, new CounterConfiguration(CounterConfigurationReporterType.MAIN), d82);
        this.f14635g = new C0115e2();
        this.f14636h = C0040b4.l().n();
        this.f14637i = new C0417q();
        this.j = new Je(m92);
        this.f14638k = new Rn();
        this.f14639l = new Eg();
        this.f14640m = new C0548v6();
        this.f14641n = new C0088d0();
    }

    public final C0088d0 a() {
        return this.f14641n;
    }

    public final Context b() {
        return this.f14629a;
    }

    public final C0548v6 c() {
        return this.f14640m;
    }

    public final M9 d() {
        return this.f14632d;
    }

    public final Je e() {
        return this.j;
    }

    public final C0448r6 f() {
        return this.f14636h;
    }

    public final Eg g() {
        return this.f14639l;
    }

    public final Fh h() {
        return this.f14634f;
    }

    public final C0585wi i() {
        return this.f14630b;
    }

    public final Rn j() {
        return this.f14638k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f14634f.f12301b.applyFromConfig(appMetricaConfig);
        Fh fh2 = this.f14634f;
        String str = appMetricaConfig.userProfileID;
        synchronized (fh2) {
            fh2.f12229f = str;
        }
        Fh fh3 = this.f14634f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        fh3.f12227d = new C0532uf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb2 = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb2.append(num.intValue());
        publicLogger.info(sb2.toString(), new Object[0]);
    }
}
