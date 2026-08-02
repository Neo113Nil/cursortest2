package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183gi implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final C0642z0 f13834a;

    /* renamed from: b, reason: collision with root package name */
    public final Ah f13835b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f13836c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13837d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f13838e;

    /* renamed from: f, reason: collision with root package name */
    public final C0436qi f13839f;

    /* renamed from: g, reason: collision with root package name */
    public final Oe f13840g;

    public C0183gi(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String str) {
        this(context.getApplicationContext(), str, new C0642z0());
    }

    public static Ra a(C0642z0 c0642z0, Context context, ReporterConfig reporterConfig) {
        c0642z0.getClass();
        return C0617y0.a(context).f().c(reporterConfig);
    }

    public final void c(@NonNull String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Th(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new RunnableC0106di(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f13840g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, String str2) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new RunnableC0080ci(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.f13835b.f12006h.a(adRevenue);
        this.f13839f.getClass();
        this.f13836c.execute(new Ph(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f13835b.j.a(map);
        this.f13839f.getClass();
        this.f13836c.execute(new Zh(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.f13835b.f12007i.a(eCommerceEvent);
        this.f13839f.getClass();
        this.f13836c.execute(new Rh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th2) {
        this.f13835b.f12000b.a(str);
        this.f13839f.getClass();
        if (th2 == null) {
            th2 = new N1();
            th2.fillInStackTrace();
        }
        this.f13836c.execute(new Hh(this, str, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f13835b.f11999a.a(str);
        this.f13839f.getClass();
        this.f13836c.execute(new RunnableC0131ei(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.f13835b.f12005g.a(revenue);
        this.f13839f.getClass();
        this.f13836c.execute(new Oh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        this.f13835b.f12003e.a(th2);
        this.f13839f.getClass();
        this.f13836c.execute(new Jh(this, th2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.f13835b.f12004f.a(userProfile);
        this.f13839f.getClass();
        this.f13836c.execute(new Nh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Kh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new RunnableC0054bi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z5) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Sh(this, z5));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Wh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Mh(this, str));
    }

    public C0183gi(Context context, String str, C0642z0 c0642z0) {
        this(context, new Ah(), c0642z0, new C0436qi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(@NonNull Qn qn) {
        this.f13835b.f12002d.a(qn);
        this.f13839f.getClass();
        this.f13836c.execute(new Yh(this, qn));
    }

    public C0183gi(Context context, Ah ah2, C0642z0 c0642z0, C0436qi c0436qi, ReporterConfig reporterConfig) {
        this(context, ah2, c0642z0, c0436qi, reporterConfig, new Oe(new Qh(c0642z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5) {
        this.f13835b.f12006h.a(adRevenue);
        this.f13839f.getClass();
        this.f13836c.execute(new Xh(this, adRevenue, z5));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f13835b.f11999a.a(str);
        this.f13839f.getClass();
        this.f13836c.execute(new RunnableC0157fi(this, str, str2));
    }

    public C0183gi(Context context, Ah ah2, C0642z0 c0642z0, C0436qi c0436qi, ReporterConfig reporterConfig, Oe oe2) {
        this.f13836c = C0040b4.l().g().a();
        this.f13837d = context;
        this.f13835b = ah2;
        this.f13834a = c0642z0;
        this.f13839f = c0436qi;
        this.f13838e = reporterConfig;
        this.f13840g = oe2;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th2) {
        this.f13835b.f12001c.a(str);
        this.f13839f.getClass();
        this.f13836c.execute(new Ih(this, str, str2, th2));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0165g0
    public final void a(@NonNull V v5) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new RunnableC0028ai(this, v5));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        this.f13835b.f11999a.a(str);
        this.f13839f.getClass();
        this.f13836c.execute(new Gh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Uh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.f13835b.getClass();
        this.f13839f.getClass();
        this.f13836c.execute(new Vh(this, moduleEvent));
    }
}
