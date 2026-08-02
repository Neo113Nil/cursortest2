package Ph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes5.dex */
public class Y extends AbstractC1439a implements X {
    public Y(CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    public static /* synthetic */ Object O0(Y y10, Continuation continuation) {
        Object z10 = y10.z(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return z10;
    }

    @Override // Ph.X
    public Object await(Continuation continuation) {
        return O0(this, continuation);
    }

    @Override // Ph.X
    public Object getCompleted() {
        return M();
    }
}
