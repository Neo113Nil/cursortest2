package Ph;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: Ph.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1481v0 {
    public static final Executor a(L l10) {
        Executor e22;
        AbstractC1477t0 abstractC1477t0 = l10 instanceof AbstractC1477t0 ? (AbstractC1477t0) l10 : null;
        return (abstractC1477t0 == null || (e22 = abstractC1477t0.e2()) == null) ? new ExecutorC1450f0(l10) : e22;
    }

    public static final L b(Executor executor) {
        L l10;
        ExecutorC1450f0 executorC1450f0 = executor instanceof ExecutorC1450f0 ? (ExecutorC1450f0) executor : null;
        return (executorC1450f0 == null || (l10 = executorC1450f0.f9084a) == null) ? new C1479u0(executor) : l10;
    }

    public static final AbstractC1477t0 c(ExecutorService executorService) {
        return new C1479u0(executorService);
    }
}
