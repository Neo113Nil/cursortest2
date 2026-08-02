package Rh;

import Ph.AbstractC1473r0;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class r {
    public static final void a(A a10, Throwable th2) {
        if (th2 != null) {
            r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r0 == null) {
                r0 = AbstractC1473r0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        a10.cancel(r0);
    }
}
