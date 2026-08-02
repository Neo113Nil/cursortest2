package g9;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public abstract class j {
    public static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
