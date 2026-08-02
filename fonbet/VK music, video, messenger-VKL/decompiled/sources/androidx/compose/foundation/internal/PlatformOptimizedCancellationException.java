package androidx.compose.foundation.internal;

import java.util.concurrent.CancellationException;
import xsna.sv1;

/* compiled from: PlatformOptimizedCancellationException.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(sv1.e);
        return this;
    }
}
