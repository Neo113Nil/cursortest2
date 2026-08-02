package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260ji implements Sa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14045a;

    /* renamed from: b, reason: collision with root package name */
    public final Bf f14046b;

    /* renamed from: c, reason: collision with root package name */
    public final C0585wi f14047c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f14048d;

    /* renamed from: e, reason: collision with root package name */
    public final Ol f14049e;

    /* renamed from: f, reason: collision with root package name */
    public final C0479sc f14050f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f14051g;

    /* renamed from: h, reason: collision with root package name */
    public final En f14052h;

    /* renamed from: i, reason: collision with root package name */
    public final List f14053i;
    public C0203hc j;

    /* renamed from: k, reason: collision with root package name */
    public C0299l6 f14054k;

    public C0260ji(@NotNull Context context, @NotNull Bf bf2, @NotNull C0585wi c0585wi, @NotNull Handler handler, @NotNull Ol ol) {
        this.f14045a = context;
        this.f14046b = bf2;
        this.f14047c = c0585wi;
        this.f14048d = handler;
        this.f14049e = ol;
        this.f14050f = new C0479sc(context, bf2, c0585wi, ol);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14051g = linkedHashMap;
        this.f14052h = new En(new C0311li(linkedHashMap));
        this.f14053i = kotlin.collections.u.f("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return this;
    }

    @NotNull
    public final C0260ji b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0203hc b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C0293l0 c0293l0) {
        C0203hc c0203hc;
        try {
            c0203hc = this.j;
            if (c0203hc != null) {
                C0479sc c0479sc = this.f14050f;
                c0479sc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0479sc.f14634f.f12301b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f14052h.a(appMetricaConfig.apiKey);
                C0479sc c0479sc2 = this.f14050f;
                c0479sc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0479sc2.f14634f.f12301b.applyFromAnonymousConfig(appMetricaConfig);
                c0203hc = new C0203hc(this.f14050f);
                c0203hc.f12344i = new C0379ob(this.f14048d, c0203hc);
                Ol ol = this.f14049e;
                Fh fh2 = c0203hc.f12337b;
                if (ol != null) {
                    fh2.f12301b.setUuid(ol.g());
                } else {
                    fh2.getClass();
                }
                c0203hc.a(appMetricaConfig, c0293l0);
                c0203hc.k();
                this.f14047c.f14849f.f13237c = new C0234ii(c0203hc);
                this.f14051g.put(appMetricaConfig.apiKey, c0203hc);
                this.j = c0203hc;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0203hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0203hc a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C0293l0 c0293l0) {
        C0203hc c0203hc;
        try {
            c0203hc = this.j;
            if (c0203hc != null) {
                this.f14050f.a(appMetricaConfig, publicLogger);
                c0203hc.a(appMetricaConfig, c0293l0);
                C0040b4.l().getClass();
                this.f14051g.put(appMetricaConfig.apiKey, c0203hc);
            } else {
                this.f14052h.a(appMetricaConfig.apiKey);
                this.f14050f.a(appMetricaConfig, publicLogger);
                c0203hc = new C0203hc(this.f14050f);
                c0203hc.f12344i = new C0379ob(this.f14048d, c0203hc);
                Ol ol = this.f14049e;
                Fh fh2 = c0203hc.f12337b;
                if (ol != null) {
                    fh2.f12301b.setUuid(ol.g());
                } else {
                    fh2.getClass();
                }
                c0203hc.a(appMetricaConfig, c0293l0);
                c0203hc.k();
                this.f14047c.f14849f.f13237c = new C0234ii(c0203hc);
                this.f14051g.put(appMetricaConfig.apiKey, c0203hc);
                C0040b4.l().getClass();
                this.j = c0203hc;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0203hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
        try {
            if (this.f14051g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NotNull
    public final synchronized Ra b(@NotNull ReporterConfig reporterConfig) {
        Ra ra2;
        try {
            Ra ra3 = (Ra) this.f14051g.get(reporterConfig.apiKey);
            ra2 = ra3;
            if (ra3 == null) {
                if (!this.f14053i.contains(reporterConfig.apiKey)) {
                    this.f14049e.i();
                }
                Context context = this.f14045a;
                C0629yc c0629yc = new C0629yc(context, this.f14046b, reporterConfig, this.f14047c, new M9(context));
                c0629yc.f12344i = new C0379ob(this.f14048d, c0629yc);
                Ol ol = this.f14049e;
                Fh fh2 = c0629yc.f12337b;
                if (ol != null) {
                    fh2.f12301b.setUuid(ol.g());
                } else {
                    fh2.getClass();
                }
                c0629yc.k();
                this.f14051g.put(reporterConfig.apiKey, c0629yc);
                ra2 = c0629yc;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ra2;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    @NotNull
    public final synchronized Ua a(@NotNull AppMetricaConfig appMetricaConfig) {
        C0299l6 c0299l6;
        try {
            c0299l6 = this.f14054k;
            if (c0299l6 != null) {
                c0299l6.a(appMetricaConfig);
            } else {
                C0299l6 c0299l62 = new C0299l6(new C0324m6(this.f14046b, this.f14050f.f14633e, this.f14047c, appMetricaConfig));
                this.f14054k = c0299l62;
                c0299l6 = c0299l62;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0299l6;
    }
}
