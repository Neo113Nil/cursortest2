package androidx.compose.ui.internal;

import java.util.concurrent.CancellationException;
import xsna.s1v;

/* compiled from: PlatformOptimizedCancellationException.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(s1v.b);
        return this;
    }
}
