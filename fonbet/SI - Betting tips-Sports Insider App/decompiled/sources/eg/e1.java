package eg;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public interface e1 extends CoroutineContext.Element {
    o0 J(Function1 function1);

    o0 K(boolean z5, boolean z7, h1 h1Var);

    o Y(m1 m1Var);

    boolean c();

    boolean isCancelled();

    void k(CancellationException cancellationException);

    boolean start();

    Object w(mf.c cVar);

    CancellationException y();
}
