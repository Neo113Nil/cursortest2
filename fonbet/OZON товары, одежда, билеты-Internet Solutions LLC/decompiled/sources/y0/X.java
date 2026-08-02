package y0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9106G;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {498}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class X extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105727d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b0 f105728e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f105729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(b0 b0Var, int i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f105728e = b0Var;
        this.f105729f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new X(this.f105728e, this.f105729f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((X) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        int o11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105727d;
        b0 b0Var = this.f105728e;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f105727d = 1;
            if (b0.f(b0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        double d11 = 0.0f;
        if (-0.5d > d11 || d11 > 0.5d) {
            throw new IllegalArgumentException("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5".toString());
        }
        o11 = b0Var.o(this.f105729f);
        b0Var.V(0.0f, o11);
        return Unit.f71690a;
    }
}
