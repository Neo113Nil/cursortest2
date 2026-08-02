package ld0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$resetAutologinFlag$1", f = "OzonIdDebugMainFragment.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class y extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73245d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ x f73246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(x xVar, kotlin.coroutines.d<? super y> dVar) {
        super(2, dVar);
        this.f73246e = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new y(this.f73246e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdDebugActivity F11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73245d;
        if (i11 == 0) {
            Sc.s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            nc0.q value = k11.v().g().getValue();
            this.f73245d = 1;
            if (value.k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        F11 = this.f73246e.F();
        if (F11 != null) {
            F11.R("Флаг автологина сброшен");
        }
        return Unit.f71690a;
    }
}
