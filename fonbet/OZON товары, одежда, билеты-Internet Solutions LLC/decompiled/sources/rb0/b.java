package rb0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import ze.h;

@e(c = "ru.ozon.id.antibot.challenge.SuspensiveChallengeManager$awaitResult$2", f = "SuspensiveChallengeManager.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83270d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c<Object, Object> f83271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c<Object, Object> cVar, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f83271e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f83271e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83270d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        h a11 = c.a(this.f83271e);
        this.f83270d = 1;
        Object i12 = a11.i(this);
        return i12 == aVar ? aVar : i12;
    }
}
