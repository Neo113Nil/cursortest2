package Ph;

import Sh.AbstractC1572j;
import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: Ph.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC1450f0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final L f9084a;

    public ExecutorC1450f0(L l10) {
        this.f9084a = l10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        L l10 = this.f9084a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (AbstractC1572j.d(l10, emptyCoroutineContext)) {
            AbstractC1572j.c(this.f9084a, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f9084a.toString();
    }
}
