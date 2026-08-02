package Ph;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public interface Y0 extends CoroutineContext.Element {

    public static final class a {
        public static Object a(Y0 y02, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(y02, obj, function2);
        }

        public static CoroutineContext b(Y0 y02, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(y02, coroutineContext);
        }
    }

    Object T1(CoroutineContext coroutineContext);

    void z0(CoroutineContext coroutineContext, Object obj);
}
