package ob0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler$onFlowEnd$shouldRetryRequestAsync$1", f = "AntibotActionHandler.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f77939d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f77940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(l lVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f77940e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f77940e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C11115c c11115c;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f77939d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        c11115c = this.f77940e.f77967m;
        this.f77939d = 1;
        Object i12 = c11115c.i(this);
        return i12 == aVar ? aVar : i12;
    }
}
