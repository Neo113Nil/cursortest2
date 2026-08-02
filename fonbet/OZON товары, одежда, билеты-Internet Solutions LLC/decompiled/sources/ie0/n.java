package ie0;

import De.C2862e;
import Sc.r;
import Sc.s;
import java.util.List;
import je0.AbstractC7409d;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ru.ozon.mapsdk.common.geoproxy.model.PreferredProvider;
import te0.C9867b;
import ue0.C10044a;
import ue0.InterfaceC10046c;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;

/* loaded from: classes3.dex */
public final class n implements Ge0.b {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7409d f66355a;

    /* renamed from: b, reason: collision with root package name */
    private Function1<? super r<? extends List<He0.a>>, Unit> f66356b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f66357c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f66358d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.OwnSuggestService$search$1", f = "OwnSuggestService.kt", l = {46, 55, 61}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f66359d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f66360e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f66362g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ He0.b f66363h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f66364i;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.OwnSuggestService$search$1$1", f = "OwnSuggestService.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ie0.n$a$a, reason: collision with other inner class name */
        static final class C1096a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n f66365d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f66366e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1096a(n nVar, List list, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f66365d = nVar;
                this.f66366e = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1096a(this.f66365d, this.f66366e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1096a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                Function1<r<? extends List<He0.a>>, Unit> c11 = this.f66365d.c();
                if (c11 == null) {
                    return null;
                }
                c11.invoke(r.a(this.f66366e));
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.OwnSuggestService$search$1$2", f = "OwnSuggestService.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n f66367d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Throwable f66368e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(n nVar, Throwable th2, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f66367d = nVar;
                this.f66368e = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f66367d, this.f66368e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                Function1<r<? extends List<He0.a>>, Unit> c11 = this.f66367d.c();
                if (c11 == null) {
                    return null;
                }
                r.Companion companion = r.INSTANCE;
                c11.invoke(r.a(s.a(new Ge0.a(this.f66368e))));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, He0.b bVar, String str2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f66362g = str;
            this.f66363h = bVar;
            this.f66364i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = n.this.new a(this.f66362g, this.f66363h, this.f66364i, dVar);
            aVar.f66360e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        
            if (xe.C10727i.f(r0, r4, r14) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
        
            if (r15 == r1) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            a aVar;
            M m11;
            List<String> list;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f66359d;
            n nVar = n.this;
            try {
            } catch (Throwable th3) {
                th2 = th3;
                aVar = this;
            }
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.f66360e;
                try {
                    g gVar = g.f66321a;
                    AbstractC7409d abstractC7409d = nVar.f66355a;
                    if (abstractC7409d == null || (list = abstractC7409d.d(PreferredProvider.Type.SUGGEST)) == null) {
                        list = K.f71697a;
                    }
                    List<String> list2 = list;
                    String str = this.f66362g;
                    He0.b bVar = this.f66363h;
                    String str2 = this.f66364i;
                    this.f66360e = m11;
                    this.f66359d = 1;
                    aVar = this;
                    try {
                        obj = gVar.j(str, bVar, 10, list2, str2, aVar);
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        C9867b c9867b = C9867b.f99466a;
                        C9867b.f("Error when calling suggestion-search", new C10044a(th2), InterfaceC10046c.a.ERROR);
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 l02 = De.s.f6650a;
                        b bVar2 = new b(nVar, th2, null);
                        aVar.f66360e = null;
                        aVar.f66359d = 3;
                        obj = C10727i.f(l02, bVar2, this);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aVar = this;
                    th2 = th;
                    C9867b c9867b2 = C9867b.f99466a;
                    C9867b.f("Error when calling suggestion-search", new C10044a(th2), InterfaceC10046c.a.ERROR);
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    L0 l022 = De.s.f6650a;
                    b bVar22 = new b(nVar, th2, null);
                    aVar.f66360e = null;
                    aVar.f66359d = 3;
                    obj = C10727i.f(l022, bVar22, this);
                }
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                m11 = (M) this.f66360e;
                s.b(obj);
                aVar = this;
            }
            List list3 = (List) obj;
            r.Companion companion = r.INSTANCE;
            if (N.f(m11)) {
                C10720e0 c10720e03 = C10720e0.f105451a;
                L0 l03 = De.s.f6650a;
                C1096a c1096a = new C1096a(nVar, list3, null);
                aVar.f66360e = null;
                aVar.f66359d = 2;
            }
            return Unit.f71690a;
        }
    }

    public n(AbstractC7409d abstractC7409d) {
        this.f66355a = abstractC7409d;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f66357c = N.a(De.s.f6650a);
        g.f66321a.getClass();
        if (g.h() == null) {
            g.m(false);
        }
    }

    @Override // Ge0.b
    public final void a(@NotNull String query, He0.b bVar, @NotNull He0.c suggestionType, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(suggestionType, "suggestionType");
        B0 b02 = this.f66358d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f66358d = null;
        if (str == null) {
            g.f66321a.getClass();
            GeoProxyConfig c11 = g.c();
            if (c11 == null) {
                str2 = null;
                C10720e0 c10720e0 = C10720e0.f105451a;
                this.f66358d = C10727i.c(this.f66357c, He.b.f10879b, null, new a(query, bVar, str2, null), 2);
            }
            str = c11.getLocationUid();
        }
        str2 = str;
        C10720e0 c10720e02 = C10720e0.f105451a;
        this.f66358d = C10727i.c(this.f66357c, He.b.f10879b, null, new a(query, bVar, str2, null), 2);
    }

    public final Function1<r<? extends List<He0.a>>, Unit> c() {
        return this.f66356b;
    }

    @Override // Ge0.b
    public final void clear() {
        B0 b02 = this.f66358d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f66358d = null;
    }

    public final void d() {
        g.f66321a.getClass();
        g.m(true);
        B0 b02 = this.f66358d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f66358d = null;
    }

    @Override // Ge0.b
    public final void setSearchListener(Function1<? super r<? extends List<He0.a>>, Unit> function1) {
        this.f66356b = function1;
    }
}
