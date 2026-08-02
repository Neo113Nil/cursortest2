package k30;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.health.MobileHealthInteractor$checkAndSend$1", f = "MobileHealthInteractor.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f70435d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f70436e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f70437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, boolean z11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f70436e = gVar;
        this.f70437f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f70436e, this.f70437f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f70435d;
        g gVar = this.f70436e;
        if (i11 == 0) {
            s.b(obj);
            this.f70435d = 1;
            obj = gVar.c(1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z11 = this.f70437f;
        if (booleanValue || z11) {
            g.e(gVar, z11, false);
        }
        return Unit.f71690a;
    }
}
