package Ph;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* renamed from: Ph.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1465n extends Continuation {

    /* renamed from: Ph.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1465n interfaceC1465n, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC1465n.cancel(th2);
        }
    }

    void b(L l10, Object obj);

    void c(Function1 function1);

    boolean cancel(Throwable th2);

    Object e(Throwable th2);

    void f(Object obj, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void l(Object obj, Function3 function3);

    Object n(Object obj, Object obj2, Function3 function3);

    void q(Object obj);
}
