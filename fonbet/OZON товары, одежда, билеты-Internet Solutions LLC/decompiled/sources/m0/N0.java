package m0;

import Sc.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10733l;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2191}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class N0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Je.d f73562d;

    /* renamed from: e, reason: collision with root package name */
    S0 f73563e;

    /* renamed from: f, reason: collision with root package name */
    int f73564f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ S0<Object> f73565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(S0<Object> s02, kotlin.coroutines.d<? super N0> dVar) {
        super(2, dVar);
        this.f73565g = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new N0(this.f73565g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((N0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Je.d E11;
        S0<Object> s02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73564f;
        if (i11 == 0) {
            Sc.s.b(obj);
            S0<Object> s03 = this.f73565g;
            C7989f0 c7989f0 = (C7989f0) s03;
            c7989f0.H();
            E11 = c7989f0.E();
            this.f73562d = E11;
            this.f73563e = s03;
            this.f73564f = 1;
            if (E11.a(this) == aVar) {
                return aVar;
            }
            s02 = s03;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s02 = this.f73563e;
            E11 = this.f73562d;
            Sc.s.b(obj);
        }
        try {
            ((C7989f0) s02).M(s02.b());
            InterfaceC10733l D11 = ((C7989f0) s02).D();
            if (D11 != null) {
                r.Companion companion = Sc.r.INSTANCE;
                ((C10737n) D11).resumeWith(s02.b());
            }
            ((C7989f0) s02).N();
            Unit unit = Unit.f71690a;
            E11.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            E11.c(null);
            throw th2;
        }
    }
}
