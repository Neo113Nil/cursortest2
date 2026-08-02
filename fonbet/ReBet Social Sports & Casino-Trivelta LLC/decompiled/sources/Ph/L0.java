package Ph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class L0 extends V0 {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f9040d;

    public L0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f9040d = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // Ph.I0
    public void r0() {
        Th.a.b(this.f9040d, this);
    }
}
