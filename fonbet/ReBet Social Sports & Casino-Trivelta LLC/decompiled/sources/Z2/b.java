package Z2;

import Ph.L;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface b {
    Executor a();

    L b();

    a c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
