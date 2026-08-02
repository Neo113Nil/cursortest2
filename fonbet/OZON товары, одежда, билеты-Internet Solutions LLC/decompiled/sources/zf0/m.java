package zf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor$launchPeriodicPing$1", f = "PeriodicPingInteractor.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<h, kotlin.coroutines.d<? super EnumC9053a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f109039d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f109040e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f109041f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(k kVar, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f109041f = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        m mVar = new m(this.f109041f, dVar);
        mVar.f109040e = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h hVar, kotlin.coroutines.d<? super EnumC9053a> dVar) {
        return ((m) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109039d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        h hVar = (h) this.f109040e;
        this.f109039d = 1;
        Enum d11 = k.d(this.f109041f, hVar, this);
        return d11 == aVar ? aVar : d11;
    }
}
