package ki;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import m0.Y;
import t0.n;
import t0.q;
import t0.s;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$2$1", f = "ButtonUtils.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71615d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f71616e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Y<Boolean> f71617f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f71618g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y<Boolean> f71619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f71620b;

        a(Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0) {
            this.f71619a = y11;
            this.f71620b = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            n nVar = (n) obj;
            boolean z11 = nVar instanceof s.b;
            Y<Boolean> y11 = this.f71619a;
            if (z11) {
                if (y11.h()) {
                    y11.i(Boolean.TRUE);
                }
            } else if ((nVar instanceof s.c) || (nVar instanceof s.a)) {
                if (y11.h()) {
                    y11.i(Boolean.FALSE);
                } else {
                    this.f71620b.setValue(Boolean.TRUE);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(q qVar, Y y11, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f71616e = qVar;
        this.f71617f = y11;
        this.f71618g = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f71616e, this.f71617f, this.f71618g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71615d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h<n> interactions = this.f71616e.getInteractions();
            kotlin.time.b.INSTANCE.getClass();
            if (!kotlin.time.b.g(0L, 0L)) {
                interactions = C2399j.n(interactions, 0L);
            }
            a aVar2 = new a(this.f71617f, this.f71618g);
            this.f71615d = 1;
            if (interactions.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
