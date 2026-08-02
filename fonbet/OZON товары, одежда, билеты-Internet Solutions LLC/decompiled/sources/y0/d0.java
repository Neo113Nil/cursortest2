package y0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9106G;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2", f = "PagerState.kt", l = {953}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class d0 extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105795d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f105796e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC9106G, Integer, Unit> f105797f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f105798g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ E f105799h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f105800i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC8002m<Float> f105801j;

    static final class a extends AbstractC7737t implements Function2<Float, Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f105802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC9106G f105803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.J j11, InterfaceC9106G interfaceC9106G) {
            super(2);
            this.f105802b = j11;
            this.f105803c = interfaceC9106G;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Float f7, Float f11) {
            float floatValue = f7.floatValue();
            f11.floatValue();
            kotlin.jvm.internal.J j11 = this.f105802b;
            j11.f71784a += this.f105803c.a(floatValue - j11.f71784a);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(Function2 function2, int i11, E e11, float f7, InterfaceC8002m interfaceC8002m, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f105797f = function2;
        this.f105798g = i11;
        this.f105799h = e11;
        this.f105800i = f7;
        this.f105801j = interfaceC8002m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        d0 d0Var = new d0(this.f105797f, this.f105798g, this.f105799h, this.f105800i, this.f105801j, dVar);
        d0Var.f105796e = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d0) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        int i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f105795d;
        if (i12 == 0) {
            Sc.s.b(obj);
            InterfaceC9106G interfaceC9106G = (InterfaceC9106G) this.f105796e;
            int i13 = this.f105798g;
            ((U) this.f105797f).invoke(interfaceC9106G, new Integer(i13));
            E e11 = this.f105799h;
            boolean z11 = i13 > e11.f105643a.u();
            int b11 = e11.b();
            b0 b0Var = e11.f105643a;
            int u11 = (b11 - b0Var.u()) + 1;
            if (((z11 && i13 > e11.b()) || (!z11 && i13 < b0Var.u())) && Math.abs(i13 - b0Var.u()) >= 3) {
                if (z11) {
                    int u12 = i11;
                    e11.c(u12, 0);
                } else {
                    int u122 = i11;
                    e11.c(u122, 0);
                }
            }
            float d11 = e11.d(i13) + this.f105800i;
            a aVar2 = new a(new kotlin.jvm.internal.J(), interfaceC9106G);
            this.f105795d = 1;
            if (B0.d(0.0f, d11, this.f105801j, aVar2, this, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
