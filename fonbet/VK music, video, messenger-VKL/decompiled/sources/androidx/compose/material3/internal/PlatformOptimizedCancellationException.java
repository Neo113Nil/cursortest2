package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;
import xsna.ine0;

/* compiled from: PlatformOptimizedCancellationException.jvm.kt */
/* loaded from: classes11.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(ine0.d);
        return this;
    }
}
