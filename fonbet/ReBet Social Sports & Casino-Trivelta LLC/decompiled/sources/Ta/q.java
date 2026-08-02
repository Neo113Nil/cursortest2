package Ta;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public interface q extends ExecutorService, AutoCloseable {
    o submit(Callable callable);
}
