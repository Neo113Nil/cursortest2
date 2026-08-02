package androidx.compose.animation.core.internal;

import java.util.concurrent.CancellationException;
import xsna.imj0;

/* compiled from: PlatformOptimizedCancellationException.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(imj0.e);
        return this;
    }
}
