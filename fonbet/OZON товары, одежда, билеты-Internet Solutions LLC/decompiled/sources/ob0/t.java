package ob0;

import Sc.InterfaceC4008j;
import We.B;
import We.G;
import We.L;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.InterfaceC9683i;
import wb0.C10469a;
import wb0.InterfaceC10470b;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class t extends Db0.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<l> f77998a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<E> f77999b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<v> f78000c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Fb0.f> f78001d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f78002e;

    static final class a extends AbstractC7737t implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Nk.a.b("1.", ((Fb0.f) t.this.f78001d.getValue()).getAntibotAppHash());
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotInterceptor$interceptAfterOzonIdInit$1$antibotFlowResult$1", f = "AntibotInterceptor.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super s>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f78004d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B.a f78006f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C10469a f78007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B.a aVar, C10469a c10469a, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f78006f = aVar;
            this.f78007g = c10469a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new b(this.f78006f, this.f78007g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super s> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f78004d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            l lVar = (l) t.this.f77998a.getValue();
            this.f78004d = 1;
            Object l11 = lVar.l(this.f78006f, this.f78007g, this);
            return l11 == aVar ? aVar : l11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@NotNull InterfaceC4008j<l> antibotActionHandler, @NotNull InterfaceC4008j<E> testCookieActionHandler, @NotNull InterfaceC4008j<v> antibotResponseParser, @NotNull InterfaceC4008j<? extends Fb0.f> ozonIdConfig) {
        Intrinsics.checkNotNullParameter(antibotActionHandler, "antibotActionHandler");
        Intrinsics.checkNotNullParameter(testCookieActionHandler, "testCookieActionHandler");
        Intrinsics.checkNotNullParameter(antibotResponseParser, "antibotResponseParser");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        this.f77998a = antibotActionHandler;
        this.f77999b = testCookieActionHandler;
        this.f78000c = antibotResponseParser;
        this.f78001d = ozonIdConfig;
        this.f78002e = Sc.k.b(new a());
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a aVar) {
        InterfaceC4008j<E> interfaceC4008j;
        InterfaceC9683i source;
        G.a aVar2 = new G.a(Ek.a.a(aVar, "chain"));
        aVar2.d("x-o3-fp", (String) this.f78002e.getValue());
        G b11 = aVar2.b();
        L proceed = aVar.proceed(b11);
        InterfaceC4008j<v> interfaceC4008j2 = this.f78000c;
        InterfaceC10470b a11 = interfaceC4008j2.getValue().a(proceed);
        while (true) {
            boolean z11 = proceed.m() == 403;
            interfaceC4008j = this.f77999b;
            if (!z11 || !(a11 instanceof C10469a)) {
                break;
            }
            C10469a c10469a = (C10469a) a11;
            interfaceC4008j.getValue().c(proceed, c10469a);
            td0.k.a(aVar);
            if (!((s) C10727i.d(kotlin.coroutines.g.f71771a, new b(aVar, (C10469a) a11, null))).f()) {
                throw new r(c10469a.f(), c10469a.d());
            }
            We.M c11 = proceed.c();
            if (c11 != null && (source = c11.source()) != null && source.isOpen()) {
                Ye.b.e(proceed);
            }
            proceed = aVar.proceed(b11);
            a11 = interfaceC4008j2.getValue().a(proceed);
        }
        interfaceC4008j.getValue().c(proceed, null);
        if (proceed.m() != 403 || a11 == null) {
            return proceed;
        }
        L.a aVar3 = new L.a(proceed);
        G L11 = proceed.L();
        L11.getClass();
        G.a aVar4 = new G.a(L11);
        String id2 = a11.id();
        D.b(id2);
        aVar4.i(Object.class, D.a(id2));
        aVar3.r(aVar4.b());
        return aVar3.c();
    }
}
