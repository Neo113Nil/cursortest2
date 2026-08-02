package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class B extends AbstractC5316a {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f54611a;

    public B(Function2 function2) {
        this.f54611a = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractC5316a
    public Object c(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        Object invoke = this.f54611a.invoke(interfaceC5322g, continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }
}
