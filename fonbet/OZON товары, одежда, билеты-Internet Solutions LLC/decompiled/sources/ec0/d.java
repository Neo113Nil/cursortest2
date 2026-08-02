package ec0;

import Ae.InterfaceC2397i;
import Be.n;
import Sc.s;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.accountMerge.presentation.OzonIdAccountMergeFragment$observeViewModel$lambda$5$lambda$4$$inlined$collectFlow$2", f = "OzonIdAccountMergeFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62125d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n f62126e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f62127f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f62128a;

        public a(h hVar) {
            this.f62128a = hVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            InterfaceC7643a interfaceC7643a = (InterfaceC7643a) t2;
            if (interfaceC7643a instanceof InterfaceC7643a.b) {
                h.v(this.f62128a, (InterfaceC7643a.b) interfaceC7643a);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, kotlin.coroutines.d dVar, h hVar) {
        super(2, dVar);
        this.f62126e = nVar;
        this.f62127f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f62126e, dVar, this.f62127f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62125d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f62127f);
            this.f62125d = 1;
            if (this.f62126e.collect(aVar2, this) == aVar) {
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
