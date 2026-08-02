package Ph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ph.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1486y extends I0 implements InterfaceC1484x {
    public C1486y(C0 c02) {
        super(true);
        a0(c02);
    }

    @Override // Ph.InterfaceC1484x
    public boolean A0(Object obj) {
        return g0(obj);
    }

    @Override // Ph.I0
    public boolean S() {
        return true;
    }

    @Override // Ph.X
    public Object await(Continuation continuation) {
        Object z10 = z(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return z10;
    }

    @Override // Ph.X
    public Object getCompleted() {
        return M();
    }

    @Override // Ph.X
    public Vh.c getOnAwait() {
        Vh.c R10 = R();
        Intrinsics.checkNotNull(R10, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return R10;
    }

    @Override // Ph.InterfaceC1484x
    public boolean k(Throwable th2) {
        return g0(new C(th2, false, 2, null));
    }
}
