package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public final class z implements InterfaceC5322g {

    /* renamed from: a, reason: collision with root package name */
    public final Rh.B f54791a;

    public z(Rh.B b10) {
        this.f54791a = b10;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    public Object emit(Object obj, Continuation continuation) {
        Object o10 = this.f54791a.o(obj, continuation);
        return o10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? o10 : Unit.INSTANCE;
    }
}
