package nZ;

import B90.C2604f;
import CZ.c;
import CZ.e;
import CZ.g;
import Ds.C2880a;
import EZ.h;
import GZ.f;
import GZ.k;
import OZ.c;
import OZ.f;
import OZ.h;
import Sc.InterfaceC4008j;
import android.app.Application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.C8882c;
import pZ.C8883d;
import pZ.e;
import pZ.g;
import pZ.h;
import rZ.C9236a;
import rZ.C9237b;
import tZ.C9787b;
import tZ.C9789d;
import uZ.C9989a;
import uZ.C9992d;
import yZ.InterfaceC10874a;

/* renamed from: nZ.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8475a {

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<Object> f76670r = new AtomicReference<>();

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f76671s = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f76672a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ej.b f76673b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final GZ.a f76674c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC10874a f76675d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<IZ.a> f76676e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Set<EZ.a<?>> f76677f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<KZ.c> f76678g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<KZ.d> f76679h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final k f76680i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final BZ.b f76681j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final BZ.e f76682k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final HZ.d f76683l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76684m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final HZ.c f76685n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final h f76686o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final GZ.h f76687p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76688q;

    /* renamed from: nZ.a$a, reason: collision with other inner class name */
    public static final class C1293a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f76689a;

        /* renamed from: b, reason: collision with root package name */
        private GZ.a f76690b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC10874a f76691c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final HashSet f76692d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final HashSet f76693e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final HashSet f76694f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final HashMap<Class<? extends LZ.c>, MZ.c<LZ.c>> f76695g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final ArrayList f76696h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final ArrayList f76697i;

        public C1293a(@NotNull c config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f76689a = config;
            this.f76692d = new HashSet();
            this.f76693e = new HashSet();
            this.f76694f = new HashSet();
            this.f76695g = new HashMap<>();
            this.f76696h = new ArrayList();
            this.f76697i = new ArrayList();
        }

        @NotNull
        public final void a(@NotNull InterfaceC10874a checker) {
            Intrinsics.checkNotNullParameter(checker, "checker");
            this.f76691c = checker;
        }

        @NotNull
        public final void b(@NotNull KZ.c interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f76696h.add(interceptor);
        }

        @NotNull
        public final void c(@NotNull KZ.d interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f76697i.add(interceptor);
        }

        @NotNull
        public final void d(@NotNull EZ.a handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f76694f.add(handler);
        }

        @NotNull
        public final void e(@NotNull GZ.a commonPageProvider) {
            Intrinsics.checkNotNullParameter(commonPageProvider, "commonPageProvider");
            this.f76690b = commonPageProvider;
        }

        public final InterfaceC10874a f() {
            return this.f76691c;
        }

        @NotNull
        public final HashSet g() {
            return this.f76692d;
        }

        public final GZ.a h() {
            return this.f76690b;
        }

        @NotNull
        public final c i() {
            return this.f76689a;
        }

        @NotNull
        public final HashSet j() {
            return this.f76693e;
        }

        @NotNull
        public final ArrayList k() {
            return this.f76696h;
        }

        @NotNull
        public final ArrayList l() {
            return this.f76697i;
        }

        @NotNull
        public final HashSet m() {
            return this.f76694f;
        }

        @NotNull
        public final HashMap<Class<? extends LZ.c>, MZ.c<LZ.c>> n() {
            return this.f76695g;
        }
    }

    /* renamed from: nZ.a$b */
    public static final class b {
        @NotNull
        public static C8475a a(@NotNull final C1293a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Object obj = C8475a.f76670r.get();
            if (obj instanceof C8475a) {
                return (C8475a) obj;
            }
            Object updateAndGet = C8475a.f76670r.updateAndGet(new UnaryOperator() { // from class: nZ.b
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return new C8475a(C8475a.C1293a.this);
                }
            });
            Intrinsics.g(updateAndGet, "null cannot be cast to non-null type ru.ozon.compass.OzonCompass");
            return (C8475a) updateAndGet;
        }
    }

    /* renamed from: nZ.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f76698a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String[] f76699b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final GZ.d f76700c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final AZ.a f76701d;

        /* renamed from: nZ.a$c$a, reason: collision with other inner class name */
        public static final class C1294a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f76702a;

            /* renamed from: b, reason: collision with root package name */
            private String[] f76703b;

            /* renamed from: c, reason: collision with root package name */
            private C2604f f76704c;

            /* renamed from: d, reason: collision with root package name */
            private C2880a f76705d;

            public C1294a(@NotNull String appName) {
                Intrinsics.checkNotNullParameter(appName, "appName");
                Intrinsics.checkNotNullParameter("ozon", "appScheme");
                this.f76702a = appName;
            }

            @NotNull
            public final c a() {
                String[] strArr = this.f76703b;
                if (strArr == null || strArr.length == 0) {
                    strArr = new String[]{"ozon"};
                }
                GZ.d dVar = this.f76704c;
                if (dVar == null) {
                    dVar = f.a();
                }
                AZ.a aVar = this.f76705d;
                if (aVar == null) {
                    aVar = AZ.d.a();
                }
                return new c(this.f76702a, strArr, dVar, aVar);
            }

            @NotNull
            public final void b(@NotNull C2880a listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                this.f76705d = listener;
            }

            @NotNull
            public final void c(@NotNull C2604f nativePageChecker) {
                Intrinsics.checkNotNullParameter(nativePageChecker, "nativePageChecker");
                this.f76704c = nativePageChecker;
            }

            @NotNull
            public final void d(@NotNull String... scheme) {
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                this.f76703b = scheme;
            }
        }

        public c(String str, String[] strArr, GZ.d dVar, AZ.a aVar) {
            this.f76698a = str;
            this.f76699b = strArr;
            this.f76700c = dVar;
            this.f76701d = aVar;
        }

        @NotNull
        public final String a() {
            return this.f76698a;
        }

        @NotNull
        public final AZ.a b() {
            return this.f76701d;
        }

        @NotNull
        public final GZ.d c() {
            return this.f76700c;
        }

        @NotNull
        public final String[] d() {
            return this.f76699b;
        }
    }

    /* renamed from: nZ.a$d */
    static final class d extends AbstractC7737t implements Function0<HZ.f> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HZ.f invoke() {
            C8475a c8475a = C8475a.this;
            return new HZ.f(c8475a.j(), c8475a.p());
        }
    }

    /* renamed from: nZ.a$e */
    static final class e extends AbstractC7737t implements Function0<EZ.b> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EZ.b invoke() {
            C8475a c8475a = C8475a.this;
            Ej.b bVar = c8475a.f76673b;
            Set it = c8475a.f76677f;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(it, "it");
            EZ.c cVar = new EZ.c(it);
            cVar.c(new C8880a.C1351a());
            cVar.c(new sZ.d());
            cVar.c(new f.a());
            cVar.c(new C8882c.a());
            cVar.c(new C9787b());
            cVar.c(new h.a());
            cVar.c(new C9992d.a());
            cVar.c(new C9989a());
            cVar.c(new h.a());
            cVar.c(new C9237b.a());
            cVar.c(new C9236a.C1416a());
            cVar.c(new e.a());
            cVar.c(new g.a());
            cVar.c(new C9789d());
            cVar.c(new e.a());
            cVar.c(new c.a());
            cVar.c(new c.b());
            cVar.c(new C8883d.a());
            cVar.c(new g.a(c8475a.f76681j, c8475a.l()));
            return cVar;
        }
    }

    public C8475a(C1293a c1293a) {
        c i11 = c1293a.i();
        this.f76672a = i11;
        this.f76673b = EZ.d.a();
        GZ.a h11 = c1293a.h();
        GZ.a a11 = h11 == null ? GZ.b.a() : h11;
        this.f76674c = a11;
        InterfaceC10874a f7 = c1293a.f();
        this.f76675d = f7 == null ? yZ.c.a() : f7;
        Set<IZ.a> unmodifiableSet = Collections.unmodifiableSet(C7714v.S0(c1293a.j()));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(...)");
        this.f76676e = unmodifiableSet;
        Set<EZ.a<?>> unmodifiableSet2 = Collections.unmodifiableSet(C7714v.S0(c1293a.m()));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(...)");
        this.f76677f = unmodifiableSet2;
        HashMap hashMap = new HashMap(c1293a.n());
        List<KZ.c> unmodifiableList = Collections.unmodifiableList(C7714v.W0(c1293a.k()));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        this.f76678g = unmodifiableList;
        List<KZ.d> unmodifiableList2 = Collections.unmodifiableList(C7714v.W0(c1293a.l()));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList2, "unmodifiableList(...)");
        this.f76679h = unmodifiableList2;
        k kVar = new k(i11);
        this.f76680i = kVar;
        BZ.b bVar = new BZ.b(C7714v.S0(c1293a.g()));
        this.f76681j = bVar;
        BZ.e eVar = new BZ.e(i11);
        this.f76682k = eVar;
        HZ.d dVar = new HZ.d(i11, bVar, eVar);
        this.f76683l = dVar;
        this.f76684m = Sc.k.c(this, new e());
        Set it = Collections.unmodifiableSet(C7714v.S0(unmodifiableSet));
        Intrinsics.checkNotNullExpressionValue(it, "unmodifiableSet(...)");
        Intrinsics.checkNotNullParameter(it, "it");
        HZ.c cVar = new HZ.c(it);
        this.f76685n = cVar;
        EZ.h hVar = new EZ.h(this);
        this.f76686o = hVar;
        if (!hashMap.containsKey(LZ.a.class)) {
            hashMap.put(LZ.a.class, new MZ.a(cVar, kVar, dVar, a11, unmodifiableList, unmodifiableList2));
        }
        if (!hashMap.containsKey(LZ.b.class)) {
            hashMap.put(LZ.b.class, new MZ.b());
        }
        Unit unit = Unit.f71690a;
        this.f76687p = new GZ.h(kVar, hVar, cVar, new MZ.d(hashMap));
        this.f76688q = Sc.k.b(new d());
    }

    public final void e(@NotNull Set<? extends BZ.a> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f76681j.a(handlers);
    }

    public final void f(@NotNull Set<? extends IZ.a> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f76685n.a(handlers);
    }

    public final void g(@NotNull Set<? extends EZ.a<? extends pZ.f>> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        n().a(handlers);
    }

    public final void h(@NotNull Application application) {
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(application, "application");
        atomicBoolean = C8477c.f76709a;
        if (atomicBoolean.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(new yZ.d(this.f76686o, this.f76675d));
            application.registerActivityLifecycleCallbacks(this.f76682k.f());
        }
    }

    @NotNull
    public final c i() {
        return this.f76672a;
    }

    @NotNull
    public final HZ.c j() {
        return this.f76685n;
    }

    @NotNull
    public final HZ.e k() {
        return (HZ.e) this.f76688q.getValue();
    }

    @NotNull
    public final BZ.e l() {
        return this.f76682k;
    }

    @NotNull
    public final HZ.d m() {
        return this.f76683l;
    }

    @NotNull
    public final EZ.b n() {
        return (EZ.b) this.f76684m.getValue();
    }

    @NotNull
    public final EZ.h o() {
        return this.f76686o;
    }

    @NotNull
    public final k p() {
        return this.f76680i;
    }

    @NotNull
    public final GZ.h q() {
        return this.f76687p;
    }
}
