package qi0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.M;
import vi0.AbstractC10323a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.config.impl.TrackerConfigProviderImpl$provide$12", f = "TrackerConfigProviderImpl.kt", l = {71}, m = "invokeSuspend")
/* renamed from: qi0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C9064d extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    M f82134d;

    /* renamed from: e, reason: collision with root package name */
    int f82135e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M<Long> f82136f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f82137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9064d(M<Long> m11, n nVar, kotlin.coroutines.d<? super C9064d> dVar) {
        super(1, dVar);
        this.f82136f = m11;
        this.f82137g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C9064d(this.f82136f, this.f82137g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9064d) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M<Long> m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82135e;
        if (i11 == 0) {
            s.b(obj);
            AbstractC10323a.h hVar = AbstractC10323a.h.f102990c;
            M<Long> m12 = this.f82136f;
            this.f82134d = m12;
            this.f82135e = 1;
            obj = n.b(this.f82137g, hVar, this);
            if (obj == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = this.f82134d;
            s.b(obj);
        }
        m11.f71787a = ((Integer) obj) != null ? new Long(r4.intValue()) : 0;
        return Unit.f71690a;
    }
}
