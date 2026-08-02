package fi0;

import B0.C2454a;
import Qj0.InterfaceC3890j;
import Sc.InterfaceC3999a;
import We.InterfaceC4875q;
import fi0.b;
import fi0.v;
import hi0.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.analytics.callback.VideoAnalyzerForceSendingPerfEventsCallback;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$5;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.tracker.sendEvent.Namespace;
import xe.J;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Namespace f63534a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63535b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f63536c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f63537d;

    /* renamed from: e, reason: collision with root package name */
    private final int f63538e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Fb0.e f63539f;

    /* renamed from: g, reason: collision with root package name */
    private final String f63540g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4875q f63541h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final n f63542i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final DeviceType f63543j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f63544k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f63545l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6571a f63546m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f63547n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f63548o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f63549p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f63550q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private b f63551r;

    /* renamed from: s, reason: collision with root package name */
    private c f63552s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private d.C1071d f63553t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private v f63554u;

    /* renamed from: v, reason: collision with root package name */
    private LinkedHashSet<InterfaceC3890j> f63555v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private Xj0.a f63556w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private m f63557x;

    /* renamed from: y, reason: collision with root package name */
    private Ld0.c f63558y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final w f63559z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Namespace f63560a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f63561b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final i f63562c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC4875q f63563d;

        /* renamed from: e, reason: collision with root package name */
        private String f63564e;

        /* renamed from: f, reason: collision with root package name */
        private int f63565f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private Fb0.e f63566g;

        /* renamed from: h, reason: collision with root package name */
        private String f63567h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private n f63568i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private DeviceType f63569j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private String f63570k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private String f63571l;

        /* renamed from: m, reason: collision with root package name */
        private InterfaceC6571a f63572m;

        /* renamed from: n, reason: collision with root package name */
        @NotNull
        private Object f63573n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f63574o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f63575p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f63576q;

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private b f63577r;

        /* renamed from: s, reason: collision with root package name */
        private c f63578s;

        /* renamed from: t, reason: collision with root package name */
        private v f63579t;

        /* renamed from: u, reason: collision with root package name */
        private Xj0.a f63580u;

        /* renamed from: v, reason: collision with root package name */
        @NotNull
        private LinkedHashSet<InterfaceC3890j> f63581v;

        /* renamed from: w, reason: collision with root package name */
        private m f63582w;

        /* renamed from: x, reason: collision with root package name */
        private kotlin.time.b f63583x;

        /* renamed from: y, reason: collision with root package name */
        @NotNull
        private Kj0.a f63584y;

        /* renamed from: z, reason: collision with root package name */
        private Ld0.c f63585z;

        public a(@NotNull Namespace namespace, @NotNull String appsflyerID, @NotNull i lifeTimeEvent, @NotNull InterfaceC4875q cookiejar) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appsflyerID, "appsflyerID");
            Intrinsics.checkNotNullParameter(lifeTimeEvent, "lifeTimeEvent");
            Intrinsics.checkNotNullParameter(cookiejar, "cookiejar");
            this.f63560a = namespace;
            this.f63561b = appsflyerID;
            this.f63562c = lifeTimeEvent;
            this.f63563d = cookiejar;
            this.f63565f = 20;
            this.f63566g = Fb0.e.OZON_RU;
            this.f63568i = new n(false, 15);
            this.f63569j = DeviceType.MOBILE;
            this.f63570k = "Google Play";
            this.f63571l = "ozon.ru";
            this.f63573n = K.f71697a;
            this.f63577r = b.a.f63487a;
            this.f63581v = new LinkedHashSet<>();
            this.f63584y = new Jb.j();
        }

        @NotNull
        public final void a(@NotNull VideoAnalyzerForceSendingPerfEventsCallback forceSendPerformanceCallback) {
            Intrinsics.checkNotNullParameter(forceSendPerformanceCallback, "forceSendPerformanceCallback");
            this.f63581v.add(forceSendPerformanceCallback);
        }

        @NotNull
        public final void b(InterfaceC6571a interfaceC6571a) {
            this.f63572m = interfaceC6571a;
        }

        @NotNull
        public final void c(@NotNull Fb0.e appDomain) {
            Intrinsics.checkNotNullParameter(appDomain, "appDomain");
            this.f63566g = appDomain;
        }

        @NotNull
        public final void d(String str) {
            this.f63567h = str;
        }

        @NotNull
        public final void e(@NotNull b appUsageTimeConfig) {
            Intrinsics.checkNotNullParameter(appUsageTimeConfig, "appUsageTimeConfig");
            this.f63577r = appUsageTimeConfig;
        }

        @NotNull
        public final void f(Xj0.a aVar) {
            this.f63580u = aVar;
        }

        @NotNull
        public final void g(int i11) {
            this.f63565f = i11;
        }

        /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
        @NotNull
        public final x h() {
            String str = this.f63564e;
            int i11 = this.f63565f;
            Fb0.e eVar = this.f63566g;
            String str2 = this.f63567h;
            n nVar = this.f63568i;
            DeviceType deviceType = this.f63569j;
            String str3 = this.f63570k;
            String str4 = this.f63571l;
            InterfaceC6571a interfaceC6571a = this.f63572m;
            ?? r15 = this.f63573n;
            boolean z11 = this.f63574o;
            x xVar = new x(this.f63560a, str, this.f63561b, this.f63562c, i11, eVar, str2, this.f63563d, nVar, deviceType, str3, str4, interfaceC6571a, r15, z11);
            xVar.f63549p = this.f63575p;
            xVar.f63550q = this.f63576q;
            xVar.f63551r = this.f63577r;
            xVar.f63552s = this.f63578s;
            xVar.f63555v = this.f63581v;
            v vVar = this.f63579t;
            if (vVar != null) {
                xVar.f63554u = vVar;
            }
            Xj0.a aVar = this.f63580u;
            if (aVar != null) {
                xVar.f63556w = aVar;
            }
            m mVar = this.f63582w;
            if (mVar != null) {
                xVar.f63557x = mVar;
            }
            xVar.f63558y = this.f63585z;
            kotlin.time.b bVar = this.f63583x;
            if (bVar != null) {
                ((p) xVar.x().a()).a(kotlin.time.b.e(bVar.getF71985a()));
            }
            return xVar;
        }

        @NotNull
        public final void i(@NotNull c currentPageProvider) {
            Intrinsics.checkNotNullParameter(currentPageProvider, "currentPageProvider");
            this.f63578s = currentPageProvider;
        }

        @NotNull
        public final void j(@NotNull DeviceType deviceType) {
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            this.f63569j = deviceType;
        }

        @NotNull
        public final void k(@NotNull Ld0.c diStore) {
            Intrinsics.checkNotNullParameter(diStore, "diStore");
            this.f63585z = diStore;
        }

        @NotNull
        public final void l(@NotNull String domainName) {
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            this.f63571l = domainName;
        }

        @NotNull
        public final void m(@NotNull ArrayList headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f63573n = headers;
        }

        @NotNull
        public final void n(boolean z11) {
            this.f63574o = z11;
        }

        @NotNull
        public final void o(boolean z11) {
            this.f63575p = z11;
        }

        @NotNull
        public final void p(boolean z11) {
            this.f63576q = z11;
        }

        @InterfaceC3999a
        @NotNull
        public final void q(@NotNull AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$5 loggingConfig) {
            Intrinsics.checkNotNullParameter(loggingConfig, "loggingConfig");
            this.f63584y = loggingConfig;
        }

        @NotNull
        public final void r(@NotNull m performanceLifeTimeEvent) {
            Intrinsics.checkNotNullParameter(performanceLifeTimeEvent, "performanceLifeTimeEvent");
            this.f63582w = performanceLifeTimeEvent;
        }

        @NotNull
        public final void s(@NotNull n performanceTracingSettings) {
            Intrinsics.checkNotNullParameter(performanceTracingSettings, "performanceTracingSettings");
            this.f63568i = performanceTracingSettings;
        }

        @NotNull
        public final void t(@NotNull String platformStore) {
            Intrinsics.checkNotNullParameter(platformStore, "platformStore");
            this.f63570k = platformStore;
        }

        @NotNull
        public final void u(long j11) {
            this.f63583x = kotlin.time.b.e(j11);
        }

        @NotNull
        public final void v(String str) {
            this.f63564e = str;
        }

        @NotNull
        public final void w(@NotNull Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            v.a aVar = new v.a();
            block.invoke(aVar);
            this.f63579t = aVar.a();
        }
    }

    @InterfaceC3999a
    public x(@NotNull Namespace namespace, String str, @NotNull String appsflyerID, @NotNull i lifeTimeEvent, int i11, @NotNull Fb0.e appDomain, String str2, @NotNull InterfaceC4875q cookiejar, @NotNull n performanceTracingSettings, @NotNull DeviceType deviceType, @NotNull String platformStore, @NotNull String domainName, InterfaceC6571a interfaceC6571a, @NotNull List headers, boolean z11) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(appsflyerID, "appsflyerID");
        Intrinsics.checkNotNullParameter(lifeTimeEvent, "lifeTimeEvent");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(cookiejar, "cookiejar");
        Intrinsics.checkNotNullParameter(performanceTracingSettings, "performanceTracingSettings");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(platformStore, "platformStore");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f63534a = namespace;
        this.f63535b = str;
        this.f63536c = appsflyerID;
        this.f63537d = lifeTimeEvent;
        this.f63538e = i11;
        this.f63539f = appDomain;
        this.f63540g = str2;
        this.f63541h = cookiejar;
        this.f63542i = performanceTracingSettings;
        this.f63543j = deviceType;
        this.f63544k = platformStore;
        this.f63545l = domainName;
        this.f63546m = interfaceC6571a;
        this.f63547n = headers;
        this.f63548o = z11;
        this.f63551r = b.a.f63487a;
        this.f63553t = hi0.d.b();
        this.f63554u = new v.a().a();
        this.f63556w = Xj0.b.f34485a;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f63557x = new m(0L);
        this.f63559z = new w();
    }

    @NotNull
    public final i A() {
        return this.f63537d;
    }

    @NotNull
    public final Namespace B() {
        return this.f63534a;
    }

    @NotNull
    public final m C() {
        return this.f63557x;
    }

    @NotNull
    public final n D() {
        return this.f63542i;
    }

    @NotNull
    public final String E() {
        return this.f63544k;
    }

    public final String F() {
        return this.f63535b;
    }

    public final boolean G() {
        return this.f63548o;
    }

    public final boolean H() {
        return this.f63549p;
    }

    public final boolean I() {
        return this.f63550q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f63534a == xVar.f63534a && Intrinsics.d(this.f63535b, xVar.f63535b) && this.f63536c.equals(xVar.f63536c) && this.f63537d.equals(xVar.f63537d) && this.f63538e == xVar.f63538e && this.f63539f == xVar.f63539f && Intrinsics.d(this.f63540g, xVar.f63540g) && Intrinsics.d(this.f63541h, xVar.f63541h) && Intrinsics.d(this.f63542i, xVar.f63542i) && this.f63543j == xVar.f63543j && Intrinsics.d(this.f63544k, xVar.f63544k) && Intrinsics.d(this.f63545l, xVar.f63545l) && Intrinsics.d(this.f63546m, xVar.f63546m) && Intrinsics.d(this.f63547n, xVar.f63547n) && this.f63548o == xVar.f63548o;
    }

    public final int hashCode() {
        int hashCode = this.f63534a.hashCode() * 31;
        String str = this.f63535b;
        int hashCode2 = (this.f63539f.hashCode() + C2454a.a(CounterView.COUNTER_MAX_DEFAULT, C2454a.a(this.f63538e, (this.f63537d.hashCode() + G.g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63536c)) * 31, 31), 31)) * 31;
        String str2 = this.f63540g;
        int a11 = G.g.a(G.g.a((this.f63543j.hashCode() + ((this.f63542i.hashCode() + ((this.f63541h.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f63544k), 31, this.f63545l);
        InterfaceC6571a interfaceC6571a = this.f63546m;
        return Boolean.hashCode(this.f63548o) + H00.a.c((a11 + (interfaceC6571a != null ? interfaceC6571a.hashCode() : 0)) * 31, 31, this.f63547n);
    }

    public final InterfaceC6571a j() {
        return this.f63546m;
    }

    @NotNull
    public final Fb0.e k() {
        return this.f63539f;
    }

    public final String l() {
        return this.f63540g;
    }

    @NotNull
    public final b m() {
        return this.f63551r;
    }

    @NotNull
    public final Xj0.a n() {
        return this.f63556w;
    }

    @NotNull
    public final String o() {
        return this.f63536c;
    }

    @NotNull
    public final v p() {
        return this.f63554u;
    }

    public final int q() {
        return this.f63538e;
    }

    @NotNull
    public final InterfaceC4875q r() {
        return this.f63541h;
    }

    @NotNull
    public final J s() {
        return this.f63553t;
    }

    public final c t() {
        return this.f63552s;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerSettings(namespace=");
        sb2.append(this.f63534a);
        sb2.append(", testingToolName=");
        sb2.append(this.f63535b);
        sb2.append(", appsflyerID=");
        sb2.append(this.f63536c);
        sb2.append(", lifeTimeEvent=");
        sb2.append(this.f63537d);
        sb2.append(", batchSize=");
        sb2.append(this.f63538e);
        sb2.append(", maxBatchSize=500, appDomain=");
        sb2.append(this.f63539f);
        sb2.append(", appName=");
        sb2.append(this.f63540g);
        sb2.append(", cookiejar=");
        sb2.append(this.f63541h);
        sb2.append(", performanceTracingSettings=");
        sb2.append(this.f63542i);
        sb2.append(", deviceType=");
        sb2.append(this.f63543j);
        sb2.append(", platformStore=");
        sb2.append(this.f63544k);
        sb2.append(", domainName=");
        sb2.append(this.f63545l);
        sb2.append(", advertisingService=");
        sb2.append(this.f63546m);
        sb2.append(", headers=");
        sb2.append(this.f63547n);
        sb2.append(", isConnectionTypeLoggerEnabled=");
        return Pk0.a.a(")", sb2, this.f63548o);
    }

    @NotNull
    public final DeviceType u() {
        return this.f63543j;
    }

    public final Ld0.c v() {
        return this.f63558y;
    }

    @NotNull
    public final String w() {
        return this.f63545l;
    }

    @NotNull
    public final w x() {
        return this.f63559z;
    }

    public final LinkedHashSet<InterfaceC3890j> y() {
        return this.f63555v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<fi0.h>] */
    @NotNull
    public final List<h> z() {
        return this.f63547n;
    }
}
