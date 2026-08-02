package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o30.EnumC8636a;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.NavigationTabId;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$sendStopEventActivity$1", f = "NativeBridgeConfigurator.kt", l = {847}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class q extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    NativeBridgeConfigurator f95650d;

    /* renamed from: e, reason: collision with root package name */
    int f95651e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(NativeBridgeConfigurator nativeBridgeConfigurator, kotlin.coroutines.d<? super q> dVar) {
        super(2, dVar);
        this.f95652f = nativeBridgeConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new q(this.f95652f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NativeBridgeConfigurator nativeBridgeConfigurator;
        Function0 function0;
        Function0 function02;
        String str;
        NativeBridgeConfigurator nativeBridgeConfigurator2;
        InterfaceC6618a interfaceC6618a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95651e;
        if (i11 == 0) {
            Sc.s.b(obj);
            nativeBridgeConfigurator = this.f95652f;
            function0 = nativeBridgeConfigurator.f95580u0;
            if (function0 == null || (str = (String) function0.invoke()) == null) {
                function02 = nativeBridgeConfigurator.f95582v0;
                str = function02 != null ? (String) function02.invoke() : null;
            }
            if (str != null) {
                J60.a c11 = nativeBridgeConfigurator.J().c();
                if (c11 != null) {
                    NavigationTabId navigationTabId = new NavigationTabId(str);
                    this.f95650d = nativeBridgeConfigurator;
                    this.f95651e = 1;
                    if (c11.b(navigationTabId, this) == aVar) {
                        return aVar;
                    }
                    nativeBridgeConfigurator2 = nativeBridgeConfigurator;
                }
                interfaceC6618a = nativeBridgeConfigurator.f95561l;
                interfaceC6618a.X(EnumC8636a.ENTER_BACKGROUND);
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nativeBridgeConfigurator2 = this.f95650d;
        Sc.s.b(obj);
        nativeBridgeConfigurator = nativeBridgeConfigurator2;
        interfaceC6618a = nativeBridgeConfigurator.f95561l;
        interfaceC6618a.X(EnumC8636a.ENTER_BACKGROUND);
        return Unit.f71690a;
    }
}
