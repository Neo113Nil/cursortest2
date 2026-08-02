package Ph;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public interface C0 extends CoroutineContext.Element {

    /* renamed from: U2, reason: collision with root package name */
    public static final b f9001U2 = b.f9002a;

    public static final class b implements CoroutineContext.Key {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f9002a = new b();
    }

    InterfaceC1478u attachChild(InterfaceC1482w interfaceC1482w);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th2);

    CancellationException getCancellationException();

    Sequence getChildren();

    Vh.a getOnJoin();

    C0 getParent();

    InterfaceC1456i0 invokeOnCompletion(Function1 function1);

    InterfaceC1456i0 invokeOnCompletion(boolean z10, boolean z11, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation continuation);

    C0 plus(C0 c02);

    boolean start();

    public static final class a {
        public static /* synthetic */ void b(C0 c02, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            c02.cancel(cancellationException);
        }

        public static Object c(C0 c02, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(c02, obj, function2);
        }

        public static CoroutineContext.Element d(C0 c02, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(c02, key);
        }

        public static /* synthetic */ InterfaceC1456i0 e(C0 c02, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return c02.invokeOnCompletion(z10, z11, function1);
        }

        public static CoroutineContext f(C0 c02, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(c02, key);
        }

        public static CoroutineContext h(C0 c02, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(c02, coroutineContext);
        }

        public static C0 g(C0 c02, C0 c03) {
            return c03;
        }
    }
}
