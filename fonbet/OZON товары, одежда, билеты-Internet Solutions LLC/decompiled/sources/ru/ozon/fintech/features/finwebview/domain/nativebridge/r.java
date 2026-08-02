package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.NavigationLifecycleEvent;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$sendStopEventFragment$1$1", f = "NativeBridgeConfigurator.kt", l = {869}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f95653d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95654e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f95655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(NativeBridgeConfigurator nativeBridgeConfigurator, String str, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f95654e = nativeBridgeConfigurator;
        this.f95655f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f95654e, this.f95655f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95653d;
        if (i11 == 0) {
            Sc.s.b(obj);
            J60.a c11 = this.f95654e.J().c();
            if (c11 != null) {
                NavigationLifecycleEvent navigationLifecycleEvent = new NavigationLifecycleEvent(this.f95655f);
                this.f95653d = 1;
                if (c11.e(navigationLifecycleEvent, this) == aVar) {
                    return aVar;
                }
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
