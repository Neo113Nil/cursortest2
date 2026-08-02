package Ta;

import com.google.common.collect.AbstractC3440u;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class f extends AbstractC3440u implements Future {
    public abstract Future b();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return b().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return b().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return b().get(j10, timeUnit);
    }
}
