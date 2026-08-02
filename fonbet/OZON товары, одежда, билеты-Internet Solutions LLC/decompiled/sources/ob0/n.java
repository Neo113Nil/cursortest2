package ob0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotErrorViewFragment$configureErrorView$1$antibotErrorModel$2$1", f = "AntibotErrorViewFragment.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f77969d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f77970e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f77971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(q qVar, String str, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f77970e = qVar;
        this.f77971f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new n(this.f77970e, this.f77971f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f77969d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C8685A u11 = q.u(this.f77970e);
            this.f77969d = 1;
            if (u11.j(this.f77971f, this) == aVar) {
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
