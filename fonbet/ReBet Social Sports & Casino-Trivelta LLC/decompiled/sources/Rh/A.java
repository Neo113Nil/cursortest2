package Rh;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface A {
    void cancel(CancellationException cancellationException);

    Object i();

    boolean isEmpty();

    l iterator();

    Object j(Continuation continuation);

    Object m(Continuation continuation);
}
