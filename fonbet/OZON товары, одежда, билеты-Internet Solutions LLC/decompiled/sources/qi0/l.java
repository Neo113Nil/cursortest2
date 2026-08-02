package qi0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.M;
import vi0.AbstractC10323a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.config.impl.TrackerConfigProviderImpl$provide$8", f = "TrackerConfigProviderImpl.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    M f82175d;

    /* renamed from: e, reason: collision with root package name */
    int f82176e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M<Boolean> f82177f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f82178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(M<Boolean> m11, n nVar, kotlin.coroutines.d<? super l> dVar) {
        super(1, dVar);
        this.f82177f = m11;
        this.f82178g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new l(this.f82177f, this.f82178g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M<Boolean> m11;
        T t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82176e;
        if (i11 == 0) {
            s.b(obj);
            AbstractC10323a.e eVar = AbstractC10323a.e.f102987c;
            M<Boolean> m12 = this.f82177f;
            this.f82175d = m12;
            this.f82176e = 1;
            Object b11 = n.b(this.f82178g, eVar, this);
            if (b11 == aVar) {
                return aVar;
            }
            m11 = m12;
            t2 = b11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = this.f82175d;
            s.b(obj);
            t2 = obj;
        }
        m11.f71787a = t2;
        return Unit.f71690a;
    }
}
