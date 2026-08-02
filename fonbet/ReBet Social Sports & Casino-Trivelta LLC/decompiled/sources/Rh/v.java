package Rh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class v extends C1560a {

    /* renamed from: e, reason: collision with root package name */
    public Continuation f10378e;

    public v(CoroutineContext coroutineContext, j jVar, Function2 function2) {
        super(coroutineContext, jVar, false);
        this.f10378e = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // Rh.k, Rh.B
    public boolean a(Throwable th2) {
        boolean a10 = super.a(th2);
        start();
        return a10;
    }

    @Override // Rh.k, Rh.B
    public Object h(Object obj) {
        start();
        return super.h(obj);
    }

    @Override // Rh.k, Rh.B
    public Object o(Object obj, Continuation continuation) {
        start();
        Object o10 = super.o(obj, continuation);
        return o10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? o10 : Unit.INSTANCE;
    }

    @Override // Ph.I0
    public void r0() {
        Th.a.b(this.f10378e, this);
    }
}
