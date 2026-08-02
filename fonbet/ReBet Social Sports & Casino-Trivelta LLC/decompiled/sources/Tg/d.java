package Tg;

import ah.C2020l;
import ah.D;
import ah.F;
import ah.InterfaceC2006A;
import ah.L;
import ah.N;
import ah.P;
import ch.AbstractC2922B;
import ch.AbstractC2927d;
import ch.C2924a;
import ch.InterfaceC2925b;
import gh.AbstractC4384e;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final b f11808b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final C2924a f11809c = new C2924a("DefaultRequest");

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f11810a;

    public static final class a implements ah.r {

        /* renamed from: a, reason: collision with root package name */
        public final C2020l f11811a = new C2020l(0, 1, null);

        /* renamed from: b, reason: collision with root package name */
        public final F f11812b = new F(null, null, 0, null, null, null, null, null, false, 511, null);

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2925b f11813c = AbstractC2927d.a(true);

        @Override // ah.r
        public C2020l a() {
            return this.f11811a;
        }

        public final InterfaceC2925b b() {
            return this.f11813c;
        }

        public final F c() {
            return this.f11812b;
        }
    }

    public static final class b implements k {

        public static final class a extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11814n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11815o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ d f11816p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, Continuation continuation) {
                super(3, continuation);
                this.f11816p = dVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
                a aVar = new a(this.f11816p, continuation);
                aVar.f11815o = abstractC4384e;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC7015a interfaceC7015a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11814n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11815o;
                String f10 = ((Wg.c) abstractC4384e.b()).i().toString();
                a aVar = new a();
                d dVar = this.f11816p;
                AbstractC2922B.c(aVar.a(), ((Wg.c) abstractC4384e.b()).a());
                dVar.f11810a.invoke(aVar);
                d.f11808b.f(aVar.c().b(), ((Wg.c) abstractC4384e.b()).i());
                for (C2924a c2924a : aVar.b().a()) {
                    if (!((Wg.c) abstractC4384e.b()).c().d(c2924a)) {
                        InterfaceC2925b c10 = ((Wg.c) abstractC4384e.b()).c();
                        Intrinsics.checkNotNull(c2924a, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                        c10.b(c2924a, aVar.b().g(c2924a));
                    }
                }
                ((Wg.c) abstractC4384e.b()).a().g(aVar.a().p());
                interfaceC7015a = e.f11817a;
                interfaceC7015a.b("Applied DefaultRequest to " + f10 + ". New url: " + ((Wg.c) abstractC4384e.b()).i());
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List d(List list, List list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty()) {
                return list2;
            }
            if (((CharSequence) CollectionsKt.first(list2)).length() == 0) {
                return list2;
            }
            List createListBuilder = CollectionsKt.createListBuilder((list.size() + list2.size()) - 1);
            int size = list.size() - 1;
            for (int i10 = 0; i10 < size; i10++) {
                createListBuilder.add(list.get(i10));
            }
            createListBuilder.addAll(list2);
            return CollectionsKt.build(createListBuilder);
        }

        @Override // Tg.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(d plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.z0().l(Wg.f.f13260g.a(), new a(plugin, null));
        }

        public final void f(P p10, F f10) {
            if (Intrinsics.areEqual(f10.o(), L.f15964c.c())) {
                f10.y(p10.k());
            }
            if (f10.j().length() > 0) {
                return;
            }
            F a10 = N.a(p10);
            a10.y(f10.o());
            if (f10.n() != 0) {
                a10.x(f10.n());
            }
            a10.u(d.f11808b.d(a10.g(), f10.g()));
            if (f10.d().length() > 0) {
                a10.r(f10.d());
            }
            InterfaceC2006A b10 = D.b(0, 1, null);
            AbstractC2922B.c(b10, a10.e());
            a10.s(f10.e());
            for (Map.Entry entry : b10.a()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!a10.e().contains(str)) {
                    a10.e().e(str, list);
                }
            }
            N.g(f10, a10);
        }

        @Override // Tg.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new d(block, null);
        }

        @Override // Tg.k
        public C2924a getKey() {
            return d.f11809c;
        }

        public b() {
        }
    }

    public /* synthetic */ d(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    public d(Function1 function1) {
        this.f11810a = function1;
    }
}
