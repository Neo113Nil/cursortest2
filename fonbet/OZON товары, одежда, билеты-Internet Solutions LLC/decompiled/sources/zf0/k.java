package zf0;

import Ae.B0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import B0.A0;
import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qf0.c;
import qf0.d;
import qj.C9067a;
import rf0.AbstractC9267a;
import sf0.C9690a;
import sf0.C9691b;
import ve.EnumC10311b;
import xe.C10727i;
import xe.C10745r0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;
import xe.Y;
import xf0.C10771a;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final int f109011a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f109012b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Af0.a f109013c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f109014d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f109015e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f109016f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f109017g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f109018h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<Map<String, h>> f109019i;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109020a;

        static {
            int[] iArr = new int[EnumC9053a.values().length];
            try {
                iArr[EnumC9053a.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9053a.Available.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9053a.NotAvailable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f109020a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor$forceRequestLastDomainStatus$2$1", f = "PeriodicPingInteractor.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<h, kotlin.coroutines.d<? super EnumC9053a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109021d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f109022e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f109023f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f109024g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f109025h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, long j11, k kVar, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f109022e = hVar;
            this.f109023f = j11;
            this.f109024g = kVar;
            this.f109025h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f109022e, this.f109023f, this.f109024g, this.f109025h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h hVar, kotlin.coroutines.d<? super EnumC9053a> dVar) {
            return ((b) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean d11;
            ru.ozon.android.ozonLogger.core.h a11;
            boolean d12;
            ru.ozon.android.ozonLogger.core.h a12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109021d;
            if (i11 == 0) {
                s.b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                h hVar = this.f109022e;
                long i12 = currentTimeMillis - hVar.i();
                long h11 = kotlin.time.b.h(this.f109023f);
                k kVar = this.f109024g;
                if (i12 < h11) {
                    Af0.a aVar2 = kVar.f109013c;
                    d12 = aVar2.d();
                    if (d12 && (a12 = Af0.a.a(aVar2)) != null) {
                        a12.b("Валидное значение есть, возвращаем " + hVar.f(), null, null);
                    }
                    return hVar.f();
                }
                Af0.a aVar3 = kVar.f109013c;
                d11 = aVar3.d();
                if (d11 && (a11 = Af0.a.a(aVar3)) != null) {
                    a11.b("Валидного значения нет, пингуем " + this.f109025h, null, null);
                }
                this.f109021d = 1;
                obj = k.d(kVar, hVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return (EnumC9053a) obj;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor$getPingResultsFlow$$inlined$flatMapLatest$1", f = "PeriodicPingInteractor.kt", l = {193}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super qf0.e>, Map<String, ? extends h>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109026d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f109027e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String[] f109029g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f109029g = strArr;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super qf0.e> interfaceC2397i, Map<String, ? extends h> map, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(this.f109029g, dVar);
            cVar.f109027e = interfaceC2397i;
            cVar.f109028f = map;
            return cVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109026d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = this.f109027e;
                Map map = (Map) this.f109028f;
                ArrayList arrayList = new ArrayList();
                for (String str : this.f109029g) {
                    h hVar = (h) map.get(str);
                    B0<qf0.e> h11 = hVar != null ? hVar.h() : null;
                    if (h11 != null) {
                        arrayList.add(h11);
                    }
                }
                Be.n E11 = C2399j.E(arrayList);
                this.f109026d = 1;
                if (C2399j.r(interfaceC2397i, E11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor$setDomainAvailable$1", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<String> f109030d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f109031e;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor$setDomainAvailable$1$2", f = "PeriodicPingInteractor.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<h, kotlin.coroutines.d<? super EnumC9053a>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f109032d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k f109033e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f109034f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, h hVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f109033e = kVar;
                this.f109034f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f109033e, this.f109034f, dVar);
                aVar.f109032d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h hVar, kotlin.coroutines.d<? super EnumC9053a> dVar) {
                return ((a) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                h hVar = (h) this.f109032d;
                long a11 = this.f109034f.k().a();
                k kVar = this.f109033e;
                kVar.getClass();
                b.Companion companion = kotlin.time.b.INSTANCE;
                if (a11 > 0) {
                    hVar.e(new o(kVar, a11, null));
                }
                return EnumC9053a.Available;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<String> function0, k kVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f109030d = function0;
            this.f109031e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f109030d, this.f109031e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean d11;
            ru.ozon.android.ozonLogger.core.h a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            String invoke = this.f109030d.invoke();
            k kVar = this.f109031e;
            h hVar = (h) ((Map) kVar.f109019i.getValue()).get(invoke);
            if (hVar == null) {
                return Unit.f71690a;
            }
            Af0.a aVar2 = kVar.f109013c;
            d11 = aVar2.d();
            if (d11 && (a11 = Af0.a.a(aVar2)) != null) {
                a11.b(A0.b("Interceptor сообщает, что ", invoke, " доступен"), null, null);
            }
            hVar.e(new a(kVar, hVar, null));
            return Unit.f71690a;
        }
    }

    public k() {
        throw null;
    }

    public k(InterfaceC4008j httpClientLazy, InterfaceC4008j tcpClientLazy, InterfaceC4008j networkInfoProviderLazy, int i11, int i12, Af0.a logger) {
        xe.B0 b11 = X0.b();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i11);
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
        C10745r0 c10745r0 = new C10745r0(newFixedThreadPool);
        q qVar = new q(J.f105405n0, logger);
        C2862e scope = N.a(CoroutineContext.Element.a.d(c10745r0, (H0) b11).plus(qVar).plus(new L("PeriodicPingInteractor coroutine")));
        Intrinsics.checkNotNullParameter(httpClientLazy, "httpClientLazy");
        Intrinsics.checkNotNullParameter(tcpClientLazy, "tcpClientLazy");
        Intrinsics.checkNotNullParameter(networkInfoProviderLazy, "networkInfoProviderLazy");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f109011a = i12;
        this.f109012b = false;
        this.f109013c = logger;
        this.f109014d = scope;
        this.f109015e = new Object();
        this.f109016f = networkInfoProviderLazy;
        this.f109017g = httpClientLazy;
        this.f109018h = tcpClientLazy;
        this.f109019i = O0.a(U.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199 A[EDGE_INSN: B:52:0x0199->B:44:0x0199 BREAK  A[LOOP:0: B:16:0x00b8->B:37:0x017a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum d(k kVar, h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        boolean d11;
        boolean d12;
        ru.ozon.android.ozonLogger.core.h a11;
        ru.ozon.android.ozonLogger.core.h a12;
        boolean d13;
        int i12;
        boolean d14;
        boolean z11;
        EnumC9053a a13;
        boolean d15;
        int i13;
        ru.ozon.android.ozonLogger.core.h a14;
        ru.ozon.android.ozonLogger.core.h a15;
        ru.ozon.android.ozonLogger.core.h a16;
        kVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f109046h;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f109046h = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f109044f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f109046h;
                if (i11 != 0) {
                    s.b(obj);
                    Af0.a aVar2 = kVar.f109013c;
                    d11 = aVar2.d();
                    if (d11 && (a12 = Af0.a.a(aVar2)) != null) {
                        a12.b("Начало выполнения асинхронной задачи пинга для " + hVar.g(), null, null);
                    }
                    d12 = aVar2.d();
                    if (d12 && (a11 = Af0.a.a(aVar2)) != null) {
                        a11.b(hVar.g() + " ожидает, включения сервиса", null, null);
                    }
                    nVar.f109042d = kVar;
                    nVar.f109043e = hVar;
                    nVar.f109046h = 1;
                    if (kVar.e(nVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = (h) nVar.f109043e;
                    kVar = nVar.f109042d;
                    s.b(obj);
                }
                Af0.a aVar3 = kVar.f109013c;
                d13 = aVar3.d();
                if (d13 && (a16 = Af0.a.a(aVar3)) != null) {
                    a16.b(hVar.g() + " дождался, включения сервиса", null, null);
                }
                i12 = 0;
                while (true) {
                    Af0.a aVar4 = kVar.f109013c;
                    d14 = aVar4.d();
                    if (d14 && (a15 = Af0.a.a(aVar4)) != null) {
                        a15.b("Начало запроса для " + hVar.g(), null, null);
                    }
                    String g10 = hVar.g();
                    qf0.c b11 = hVar.j().b();
                    int a17 = b11.a();
                    z11 = b11 instanceof c.a;
                    InterfaceC4008j interfaceC4008j = kVar.f109017g;
                    if (!z11) {
                        a13 = ((C10771a) interfaceC4008j.getValue()).d(a17, g10);
                    } else if (b11 instanceof c.b) {
                        a13 = ((C10771a) interfaceC4008j.getValue()).e(a17, g10);
                    } else {
                        if (!(b11 instanceof c.AbstractC1391c)) {
                            throw new Sc.o();
                        }
                        ((xf0.b) kVar.f109018h.getValue()).getClass();
                        a13 = xf0.b.a(a17, g10);
                    }
                    d15 = aVar4.d();
                    if (d15 && (a14 = Af0.a.a(aVar4)) != null) {
                        a14.b("Запрос к " + hVar.g() + " завершён со статусом " + a13, null, null);
                    }
                    i13 = a.f109020a[a13.ordinal()];
                    if (i13 == 1) {
                        break;
                    }
                    if (i13 == 2) {
                        long a18 = hVar.k().a();
                        b.Companion companion = kotlin.time.b.INSTANCE;
                        if (a18 > 0) {
                            hVar.e(new o(kVar, a18, null));
                        }
                    } else {
                        if (i13 != 3) {
                            throw new Sc.o();
                        }
                        if (i12 >= hVar.j().c()) {
                            long b12 = hVar.k().b();
                            b.Companion companion2 = kotlin.time.b.INSTANCE;
                            if (b12 > 0) {
                                hVar.e(new o(kVar, b12, null));
                                return a13;
                            }
                        } else {
                            i12++;
                        }
                    }
                }
                return a13;
            }
        }
        nVar = new n(kVar, cVar);
        Object obj2 = nVar.f109044f;
        Wc.a aVar5 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f109046h;
        if (i11 != 0) {
        }
        Af0.a aVar32 = kVar.f109013c;
        d13 = aVar32.d();
        if (d13) {
            a16.b(hVar.g() + " дождался, включения сервиса", null, null);
        }
        i12 = 0;
        while (true) {
            Af0.a aVar42 = kVar.f109013c;
            d14 = aVar42.d();
            if (d14) {
                a15.b("Начало запроса для " + hVar.g(), null, null);
            }
            String g102 = hVar.g();
            qf0.c b112 = hVar.j().b();
            int a172 = b112.a();
            z11 = b112 instanceof c.a;
            InterfaceC4008j interfaceC4008j2 = kVar.f109017g;
            if (!z11) {
            }
            d15 = aVar42.d();
            if (d15) {
                a14.b("Запрос к " + hVar.g() + " завершён со статусом " + a13, null, null);
            }
            i13 = a.f109020a[a13.ordinal()];
            if (i13 == 1) {
            }
            i12++;
        }
        return a13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        k kVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f109038g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f109038g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f109036e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f109038g;
                if (i11 != 0) {
                    s.b(obj);
                    kVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = lVar.f109035d;
                    s.b(obj);
                }
                while (!kVar.f109012b) {
                    b.Companion companion = kotlin.time.b.INSTANCE;
                    long g10 = kotlin.time.c.g(100, EnumC10311b.MILLISECONDS);
                    lVar.f109035d = kVar;
                    lVar.f109038g = 1;
                    if (Y.c(g10, lVar) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f109036e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f109038g;
        if (i11 != 0) {
        }
        while (!kVar.f109012b) {
        }
        return Unit.f71690a;
    }

    public final void f(long j11, @NotNull String domain) {
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        Intrinsics.checkNotNullParameter(domain, "domain");
        Af0.a aVar = this.f109013c;
        d11 = aVar.d();
        if (d11 && (a11 = Af0.a.a(aVar)) != null) {
            a11.b("Принудельно запрашиваем последний статус " + domain, null, null);
        }
        h hVar = this.f109019i.getValue().get(domain);
        if (hVar != null) {
            hVar.e(new b(hVar, j11, this, domain, null));
        }
    }

    public final boolean g() {
        return this.f109012b;
    }

    @NotNull
    public final LinkedHashMap h() {
        Map<String, h> value = this.f109019i.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(value.size()));
        Iterator<T> it = value.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((h) entry.getValue()).f());
        }
        return linkedHashMap;
    }

    @NotNull
    public final InterfaceC2395h<qf0.e> i(@NotNull String... domains) {
        Intrinsics.checkNotNullParameter(domains, "domains");
        return domains.length == 0 ? C2399j.t() : C2399j.Q(this.f109019i, new c(domains, null));
    }

    public final boolean j(@NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        return this.f109019i.getValue().get(domain) != null;
    }

    public final void k(@NotNull Function0<String> getDomain) {
        Intrinsics.checkNotNullParameter(getDomain, "getDomain");
        C10727i.c(this.f109014d, null, null, new d(getDomain, this, null), 3);
    }

    public final void l(boolean z11) {
        this.f109012b = z11;
    }

    public final void m(@NotNull String domain, @NotNull AbstractC9267a config, @NotNull d.b mode) {
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        boolean d12;
        ru.ozon.android.ozonLogger.core.h a12;
        boolean d13;
        ru.ozon.android.ozonLogger.core.h a13;
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mode, "mode");
        synchronized (this.f109015e) {
            try {
                Map<String, h> value = this.f109019i.getValue();
                if (value.size() >= this.f109011a) {
                    Af0.a aVar = this.f109013c;
                    d13 = aVar.d();
                    if (d13 && (a13 = Af0.a.a(aVar)) != null) {
                        a13.b("Достигнут лимит доменов: " + this.f109011a, null, null);
                    }
                    throw new C9691b(this.f109011a);
                }
                if (value.containsKey(domain)) {
                    Af0.a aVar2 = this.f109013c;
                    d12 = aVar2.d();
                    if (d12 && (a12 = Af0.a.a(aVar2)) != null) {
                        a12.b("Домен " + domain + " уже был добавлен в сервис", null, null);
                    }
                    throw new C9690a();
                }
                h hVar = new h(domain, config, mode, this.f109013c, (C9067a) this.f109016f.getValue(), this.f109014d);
                x0<Map<String, h>> x0Var = this.f109019i;
                Tc.d builder = new Tc.d();
                builder.putAll(value);
                builder.put(domain, hVar);
                Intrinsics.checkNotNullParameter(builder, "builder");
                x0Var.setValue(builder.u());
                Af0.a aVar3 = this.f109013c;
                d11 = aVar3.d();
                if (d11 && (a11 = Af0.a.a(aVar3)) != null) {
                    a11.b("Начинаем циклический процесс пинга для ".concat(domain), null, null);
                }
                hVar.e(new m(this, null));
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
