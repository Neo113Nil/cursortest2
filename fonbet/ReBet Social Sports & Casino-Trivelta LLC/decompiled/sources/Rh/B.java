package Rh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public interface B {

    public static final class a {
        public static /* synthetic */ boolean a(B b10, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return b10.a(th2);
        }
    }

    boolean a(Throwable th2);

    void g(Function1 function1);

    Object h(Object obj);

    Object o(Object obj, Continuation continuation);

    boolean p();
}
