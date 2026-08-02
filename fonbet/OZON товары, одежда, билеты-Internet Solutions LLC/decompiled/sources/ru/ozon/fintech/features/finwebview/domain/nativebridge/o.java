package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$sendRotatedEvent$1$1", f = "NativeBridgeConfigurator.kt", l = {879}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f95645d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(NativeBridgeConfigurator nativeBridgeConfigurator, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f95646e = nativeBridgeConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f95646e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC6618a interfaceC6618a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95645d;
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f95646e;
        if (i11 == 0) {
            Sc.s.b(obj);
            J60.a c11 = nativeBridgeConfigurator.J().c();
            if (c11 != null) {
                this.f95645d = 1;
                if (c11.f(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        interfaceC6618a = nativeBridgeConfigurator.f95561l;
        interfaceC6618a.Q0();
        return Unit.f71690a;
    }
}
