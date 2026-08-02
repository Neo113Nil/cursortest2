package Ph;

import Sh.C1571i;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class r {
    public static final void a(InterfaceC1465n interfaceC1465n, InterfaceC1456i0 interfaceC1456i0) {
        c(interfaceC1465n, new C1458j0(interfaceC1456i0));
    }

    public static final C1469p b(Continuation continuation) {
        if (!(continuation instanceof C1571i)) {
            return new C1469p(continuation, 1);
        }
        C1469p o10 = ((C1571i) continuation).o();
        if (o10 != null) {
            if (!o10.O()) {
                o10 = null;
            }
            if (o10 != null) {
                return o10;
            }
        }
        return new C1469p(continuation, 2);
    }

    public static final void c(InterfaceC1465n interfaceC1465n, InterfaceC1463m interfaceC1463m) {
        if (!(interfaceC1465n instanceof C1469p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C1469p) interfaceC1465n).I(interfaceC1463m);
    }
}
