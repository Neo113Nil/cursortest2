package d40;

import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.C4005g;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.ozon.fintech.exchanger.ExchangerImpl$observe$1", f = "ExchangerImpl.kt", l = {20}, m = "invokeSuspend")
/* renamed from: d40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6084b extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f61141d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w0 f61142e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6085c f61143f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Class<Object> f61144g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Unit> f61145h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f61146i;

    /* renamed from: d40.b$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f61147a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f61148b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6085c f61149c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Class<T> f61150d;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super T, Unit> function1, boolean z11, C6085c c6085c, Class<T> cls) {
            this.f61147a = function1;
            this.f61148b = z11;
            this.f61149c = c6085c;
            this.f61150d = cls;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, d<? super Unit> dVar) {
            this.f61147a.invoke(t2);
            if (this.f61148b) {
                this.f61149c.d(this.f61150d);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6084b(w0 w0Var, C6085c c6085c, Class cls, Function1 function1, boolean z11, d dVar) {
        super(2, dVar);
        this.f61142e = w0Var;
        this.f61143f = c6085c;
        this.f61144g = cls;
        this.f61145h = function1;
        this.f61146i = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        Function1<Object, Unit> function1 = this.f61145h;
        return new C6084b(this.f61142e, this.f61143f, this.f61144g, function1, this.f61146i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((C6084b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61141d;
        if (i11 == 0) {
            s.b(obj);
            Class<Object> cls = this.f61144g;
            C6085c c6085c = this.f61143f;
            if (!this.f61142e.equals(C6085c.f(c6085c, cls))) {
                return Unit.f71690a;
            }
            w0 f7 = C6085c.f(c6085c, cls);
            a aVar2 = new a(this.f61145h, this.f61146i, c6085c, cls);
            this.f61141d = 1;
            if (f7.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
