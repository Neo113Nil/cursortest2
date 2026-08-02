package qi0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.M;
import vi0.AbstractC10323a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.config.impl.TrackerConfigProviderImpl$provide$2", f = "TrackerConfigProviderImpl.kt", l = {41}, m = "invokeSuspend")
/* renamed from: qi0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C9066f extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    M f82151d;

    /* renamed from: e, reason: collision with root package name */
    int f82152e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M<Integer> f82153f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f82154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9066f(M<Integer> m11, n nVar, kotlin.coroutines.d<? super C9066f> dVar) {
        super(1, dVar);
        this.f82153f = m11;
        this.f82154g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C9066f(this.f82153f, this.f82154g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9066f) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M<Integer> m11;
        T t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82152e;
        if (i11 == 0) {
            s.b(obj);
            AbstractC10323a.C2233a c2233a = AbstractC10323a.C2233a.f102983c;
            M<Integer> m12 = this.f82153f;
            this.f82151d = m12;
            this.f82152e = 1;
            Object b11 = n.b(this.f82154g, c2233a, this);
            if (b11 == aVar) {
                return aVar;
            }
            m11 = m12;
            t2 = b11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = this.f82151d;
            s.b(obj);
            t2 = obj;
        }
        m11.f71787a = t2;
        return Unit.f71690a;
    }
}
