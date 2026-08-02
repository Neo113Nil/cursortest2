package qi0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.M;
import vi0.AbstractC10323a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.config.impl.TrackerConfigProviderImpl$provide$7", f = "TrackerConfigProviderImpl.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    M f82171d;

    /* renamed from: e, reason: collision with root package name */
    int f82172e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M<Boolean> f82173f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f82174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(M<Boolean> m11, n nVar, kotlin.coroutines.d<? super k> dVar) {
        super(1, dVar);
        this.f82173f = m11;
        this.f82174g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new k(this.f82173f, this.f82174g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M<Boolean> m11;
        T t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82172e;
        if (i11 == 0) {
            s.b(obj);
            AbstractC10323a.j jVar = AbstractC10323a.j.f102992c;
            M<Boolean> m12 = this.f82173f;
            this.f82171d = m12;
            this.f82172e = 1;
            Object b11 = n.b(this.f82174g, jVar, this);
            if (b11 == aVar) {
                return aVar;
            }
            m11 = m12;
            t2 = b11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = this.f82171d;
            s.b(obj);
            t2 = obj;
        }
        m11.f71787a = t2;
        return Unit.f71690a;
    }
}
