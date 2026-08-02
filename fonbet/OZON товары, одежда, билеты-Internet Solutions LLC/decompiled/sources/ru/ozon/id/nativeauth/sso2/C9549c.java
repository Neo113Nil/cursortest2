package ru.ozon.id.nativeauth.sso2;

import Hb0.f;
import Sc.InterfaceC4008j;
import We.B;
import We.C4873o;
import We.G;
import We.InterfaceC4875q;
import We.L;
import dc0.C6144H;
import dc0.C6171q;
import hd0.C6918a;
import id0.C7050a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.Sso2Api;
import ru.ozon.id.nativeauth.sso2.t;
import ru.ozon.id.nativeauth.sso2.u;
import xe.C10727i;
import xe.M;

/* renamed from: ru.ozon.id.nativeauth.sso2.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9549c extends Db0.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Fb0.f> f97372a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f97373b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC4875q> f97374c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<v> f97375d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.i> f97376e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f97377f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.B> f97378g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.b> f97379h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f97380i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97381j;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2CheckDomainNetworkInterceptor$interceptAfterOzonIdInit$result$1", f = "Sso2CheckDomainNetworkInterceptor.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: ru.ozon.id.nativeauth.sso2.c$a */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super u>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97382d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t.c.a f97384f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t.c.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f97384f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9549c.this.new a(this.f97384f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super u> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97382d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            v vVar = (v) C9549c.this.f97375d.getValue();
            this.f97382d = 1;
            Object l11 = vVar.l(this.f97384f, this);
            return l11 == aVar ? aVar : l11;
        }
    }

    /* renamed from: ru.ozon.id.nativeauth.sso2.c$b */
    static final class b extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f97385b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return td0.f.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9549c(@NotNull InterfaceC4008j<? extends Fb0.f> ozonIdConfig, @NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<? extends InterfaceC4875q> cookieJar, @NotNull InterfaceC4008j<v> sso2ReauthorizeHandler, @NotNull InterfaceC4008j<hd0.i> sso2MobileConfigRepository, @NotNull InterfaceC4008j<C7050a> composerTrackingRepository, @NotNull InterfaceC4008j<ob0.B> ozonIdTrackingManager, @NotNull InterfaceC4008j<hd0.b> ozonIdTracker, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(sso2ReauthorizeHandler, "sso2ReauthorizeHandler");
        Intrinsics.checkNotNullParameter(sso2MobileConfigRepository, "sso2MobileConfigRepository");
        Intrinsics.checkNotNullParameter(composerTrackingRepository, "composerTrackingRepository");
        Intrinsics.checkNotNullParameter(ozonIdTrackingManager, "ozonIdTrackingManager");
        Intrinsics.checkNotNullParameter(ozonIdTracker, "ozonIdTracker");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f97372a = ozonIdConfig;
        this.f97373b = localCookieDataSource;
        this.f97374c = cookieJar;
        this.f97375d = sso2ReauthorizeHandler;
        this.f97376e = sso2MobileConfigRepository;
        this.f97377f = composerTrackingRepository;
        this.f97378g = ozonIdTrackingManager;
        this.f97379h = ozonIdTracker;
        this.f97380i = featureFlagsStore;
        this.f97381j = Sc.k.b(b.f97385b);
    }

    public static final void b(C9549c c9549c, L l11) {
        c9549c.getClass();
        if (l11.m() != 401 || c9549c.f97378g.getValue().v().contains(c9549c.f97372a.getValue().getAppName())) {
            return;
        }
        c9549c.f97377f.getValue().c(new C9547a(c9549c, l11));
    }

    public static final void c(C9549c c9549c, L l11) {
        c9549c.getClass();
        List<String> s11 = l11.s("Set-Cookie");
        boolean z11 = true;
        boolean z12 = i("__Secure-sid", s11) || C6171q.f("__Secure-sid", c9549c.f97373b.getValue().i()) != null;
        boolean i11 = i("__Secure-access-token", s11);
        if (!i("__Secure-idp-token", s11) && !i("__Secure-token", s11)) {
            z11 = false;
        }
        if (z12 && i11 && !z11) {
            c9549c.f97377f.getValue().c(new C9548b(c9549c, l11));
        }
    }

    private static boolean i(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (kotlin.text.h.e0((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    private final void j(L l11) {
        C10727i.c((M) this.f97381j.getValue(), null, null, new C9550d(this, l11, null), 3);
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!((Boolean) this.f97380i.getValue().b(f.o.f10813a)).booleanValue()) {
            L proceed = chain.proceed(chain.request());
            j(proceed);
            return proceed;
        }
        G request = chain.request();
        if (request.i(Sso2Api.a.class) == null) {
            Intrinsics.checkNotNullParameter(request, "<this>");
            if (!hd0.n.b(request.j().toString())) {
                td0.k.a(chain);
                u uVar = (u) C10727i.d(kotlin.coroutines.g.f71771a, new a(new t.c.a(request, request.j().h()), null));
                if (uVar instanceof u.b) {
                    L proceed2 = chain.proceed(chain.request());
                    j(proceed2);
                    return proceed2;
                }
                if (!(uVar instanceof u.d)) {
                    if (uVar instanceof u.c) {
                        throw new C6918a();
                    }
                    if (uVar instanceof u.a) {
                        throw ((u.a) uVar).b();
                    }
                    throw new Sc.o();
                }
                List<C4873o> loadForRequest = this.f97374c.getValue().loadForRequest(request.j());
                G.a aVar = new G.a(request);
                if (!loadForRequest.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    for (Object obj : loadForRequest) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        C4873o c4873o = (C4873o) obj;
                        if (i11 > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(c4873o.f());
                        sb2.append('=');
                        sb2.append(c4873o.i());
                        i11 = i12;
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    aVar.d("Cookie", sb3);
                }
                L proceed3 = chain.proceed(aVar.b());
                j(proceed3);
                return proceed3;
            }
        }
        L proceed4 = chain.proceed(chain.request());
        j(proceed4);
        return proceed4;
    }
}
