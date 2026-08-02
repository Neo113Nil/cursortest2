package ld0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$resetFirstLaunchPassed$1", f = "OzonIdDebugMainFragment.kt", l = {296}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class z extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73247d;

    z() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new z(2, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73247d;
        if (i11 == 0) {
            Sc.s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            Kc0.l value = k11.W().m().getValue();
            this.f73247d = 1;
            if (value.h(this) == aVar) {
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
