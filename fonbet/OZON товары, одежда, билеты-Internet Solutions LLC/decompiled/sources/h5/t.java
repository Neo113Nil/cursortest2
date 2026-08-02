package h5;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class t implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
