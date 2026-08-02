package rb0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import ze.h;

@e(c = "ru.ozon.id.antibot.challenge.SuspensiveChallengeManager$sendResult$1", f = "SuspensiveChallengeManager.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83278d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c<Object, Object> f83279e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f83280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c<Object, Object> cVar, Object obj, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f83279e = cVar;
        this.f83280f = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f83279e, this.f83280f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83278d;
        if (i11 == 0) {
            s.b(obj);
            h a11 = c.a(this.f83279e);
            this.f83278d = 1;
            if (a11.n(this.f83280f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
