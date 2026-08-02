package ld0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$deleteSsoMobileConfig$1", f = "OzonIdDebugMainFragment.kt", l = {314}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73232d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ x f73233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(x xVar, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f73233e = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f73233e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdDebugActivity F11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73232d;
        if (i11 == 0) {
            Sc.s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            hd0.i value = k11.X().f().getValue();
            this.f73232d = 1;
            if (value.e(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        F11 = this.f73233e.F();
        if (F11 != null) {
            F11.R("ssoMobileConfig удалён");
        }
        return Unit.f71690a;
    }
}
