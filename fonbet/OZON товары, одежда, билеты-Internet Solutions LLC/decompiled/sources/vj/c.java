package vj;

import Sc.s;
import We.L;
import We.N;
import We.z;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import wj.C10565a;
import wj.k;
import xe.M;

@e(c = "ru.ozon.android.ozonLogger.android.harLogger.OzonHarLogger$trackRequest$1", f = "OzonHarLogger.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class c extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    wj.e f103011d;

    /* renamed from: e, reason: collision with root package name */
    Je.d f103012e;

    /* renamed from: f, reason: collision with root package name */
    C10325b f103013f;

    /* renamed from: g, reason: collision with root package name */
    int f103014g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ L f103015h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ N f103016i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C10325b f103017j;

    static final class a extends AbstractC7737t implements Function1<Pair<? extends String, ? extends String>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f103018b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
            Pair<? extends String, ? extends String> it = pair;
            Intrinsics.checkNotNullParameter(it, "it");
            return ((Object) it.e()) + ProductContainerDTO.RATIO_DELIMITER + ((Object) it.f());
        }
    }

    static final class b extends AbstractC7737t implements Function1<Pair<? extends String, ? extends String>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f103019b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
            Pair<? extends String, ? extends String> it = pair;
            Intrinsics.checkNotNullParameter(it, "it");
            return ((Object) it.e()) + ProductContainerDTO.RATIO_DELIMITER + ((Object) it.f());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(L l11, N n11, C10325b c10325b, d dVar) {
        super(2, dVar);
        this.f103015h = l11;
        this.f103016i = n11;
        this.f103017j = c10325b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f103015h, this.f103016i, this.f103017j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C10324a c10324a;
        C10324a c10324a2;
        C10324a c10324a3;
        C10324a c10324a4;
        C10324a c10324a5;
        Je.d dVar;
        C10325b c10325b;
        wj.e eVar;
        C10565a c10565a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f103014g;
        if (i11 == 0) {
            s.b(obj);
            L l11 = this.f103015h;
            l11.getClass();
            L.a aVar2 = new L.a(l11);
            aVar2.b(this.f103016i);
            L c11 = aVar2.c();
            z r11 = c11.r();
            C10325b c10325b2 = this.f103017j;
            c10324a = c10325b2.f103005b;
            List<String> g10 = c10324a.g();
            c10324a2 = c10325b2.f103005b;
            String V11 = C7714v.V(k.b(r11, g10, c10324a2.f()), "\n", null, null, b.f103019b, 30);
            z e11 = c11.L().e();
            c10324a3 = c10325b2.f103005b;
            List<String> g11 = c10324a3.g();
            c10324a4 = c10325b2.f103005b;
            String V12 = C7714v.V(k.b(e11, g11, c10324a4.f()), "\n", null, null, a.f103018b, 30);
            String a11 = c11.L().j().toString();
            byte[] c12 = k.c(c11.L().a());
            c10324a5 = c10325b2.f103005b;
            byte[] d11 = k.d(c11, c10324a5.e());
            long I11 = c11.I() - c11.O();
            long O11 = c11.O();
            wj.e eVar2 = new wj.e(0L, a11, c11.B().toString(), c11.L().h(), c11.m(), c11.w(), V12, V11, c12, d11, O11, I11);
            dVar = c10325b2.f103008e;
            this.f103011d = eVar2;
            this.f103012e = dVar;
            this.f103013f = c10325b2;
            this.f103014g = 1;
            if (dVar.a(this) == aVar) {
                return aVar;
            }
            c10325b = c10325b2;
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10325b = this.f103013f;
            dVar = this.f103012e;
            eVar = this.f103011d;
            s.b(obj);
        }
        try {
            c10565a = c10325b.f103006c;
            c10565a.f(eVar);
            Unit unit = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
    }
}
