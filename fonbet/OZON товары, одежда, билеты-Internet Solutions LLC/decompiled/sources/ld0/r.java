package ld0;

import Kb0.K;
import dc0.C6170p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$clearAuthData$1", f = "OzonIdDebugMainFragment.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73229d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f73230e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x f73231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(boolean z11, x xVar, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f73230e = z11;
        this.f73231f = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f73230e, this.f73231f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdDebugActivity F11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73229d;
        boolean z11 = this.f73230e;
        if (i11 == 0) {
            Sc.s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            C6170p value = k11.t().f().getValue();
            this.f73229d = 1;
            if (C6170p.e(value, false, z11, this, 1) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        x xVar = this.f73231f;
        Jb0.i iVar = xVar.f73240a;
        if (iVar != null) {
            xVar.J(iVar);
        }
        F11 = xVar.F();
        if (F11 != null) {
            F11.R(z11 ? "Куки и AM очищены" : "Куки удалены");
        }
        return Unit.f71690a;
    }
}
