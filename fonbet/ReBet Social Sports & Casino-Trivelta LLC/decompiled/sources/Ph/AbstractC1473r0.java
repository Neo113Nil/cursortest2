package Ph;

import java.util.concurrent.CancellationException;

/* renamed from: Ph.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1473r0 {
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
