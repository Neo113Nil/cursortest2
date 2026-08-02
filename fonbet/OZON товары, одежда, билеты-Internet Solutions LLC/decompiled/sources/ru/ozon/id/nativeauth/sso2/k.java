package ru.ozon.id.nativeauth.sso2;

import Sc.InterfaceC4008j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor$handleDomainsWithNoAuthActions$2", f = "Sso2DomainsAuthMobileInteractor.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97432d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f97433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(r rVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f97433e = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f97433e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97432d;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC4008j = this.f97433e.f97462h;
            hd0.e eVar = (hd0.e) interfaceC4008j.getValue();
            this.f97432d = 1;
            if (eVar.h(true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
