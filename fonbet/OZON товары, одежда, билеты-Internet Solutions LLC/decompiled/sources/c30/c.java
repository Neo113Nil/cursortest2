package c30;

import Sc.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.base.providers.providers.DeviceIdsProvider$requestDeviceIdsMap$1", f = "DeviceIdsProvider.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56458d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f56459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f56459e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f56459e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        S30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56458d;
        b bVar = this.f56459e;
        if (i11 == 0) {
            s.b(obj);
            aVar = bVar.f56448b;
            this.f56458d = 1;
            obj = aVar.b(this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        String str = (String) obj;
        if (str.length() > 0) {
            bVar.f56453g.tryEmit(new Pair("a_gaid", str));
        }
        return Unit.f71690a;
    }
}
