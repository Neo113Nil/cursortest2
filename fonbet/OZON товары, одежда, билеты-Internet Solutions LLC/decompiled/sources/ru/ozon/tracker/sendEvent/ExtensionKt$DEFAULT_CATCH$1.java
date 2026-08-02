package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/coroutines/CoroutineContext;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.ExtensionKt$DEFAULT_CATCH$1", f = "Extension.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ExtensionKt$DEFAULT_CATCH$1 extends j implements InterfaceC6511n<CoroutineContext, Throwable, d<? super Unit>, Object> {
    int label;

    ExtensionKt$DEFAULT_CATCH$1(d<? super ExtensionKt$DEFAULT_CATCH$1> dVar) {
        super(3, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Unit.f71690a;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(CoroutineContext coroutineContext, Throwable th2, d<? super Unit> dVar) {
        return new ExtensionKt$DEFAULT_CATCH$1(dVar).invokeSuspend(Unit.f71690a);
    }
}
