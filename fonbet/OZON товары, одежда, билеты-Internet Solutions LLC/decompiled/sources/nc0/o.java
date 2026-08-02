package nc0;

import Ib0.h;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.E0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAutologinUseCase$handleAction$1", f = "CrossAppAutologinUseCase.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f76821d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Tg.b f76822e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f76823f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(Tg.b bVar, q qVar, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f76822e = bVar;
        this.f76823f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f76822e, this.f76823f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Xb0.a aVar;
        Ib0.e eVar;
        ru.ozon.id.logout.data.d dVar;
        Ib0.e eVar2;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f76821d;
        q qVar = this.f76823f;
        try {
            if (i11 == 0) {
                s.b(obj);
                Tg.b bVar = this.f76822e;
                if (!Intrinsics.d(bVar.getId(), "autologinLogout")) {
                    throw new IllegalStateException(Nk.a.b("Illegal action from backend, action id = ", bVar.getId()));
                }
                dVar = qVar.f76830f;
                Yb0.a aVar3 = Yb0.a.AUTOLOGIN;
                this.f76821d = 1;
                if (ru.ozon.id.logout.data.d.f(dVar, false, aVar3, this, 2) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            eVar2 = qVar.f76831g;
            eVar2.i(new h.c(Gb0.c.FORCE_LOGOUT));
        } catch (Exception unused) {
            E0.f(getContext());
            aVar = qVar.f76832h;
            aVar.b();
            eVar = qVar.f76831g;
            eVar.i(new h.b(Gb0.c.FORCE_LOGOUT));
        }
        return Unit.f71690a;
    }
}
