package androidx.compose.material.internal;

import java.util.concurrent.CancellationException;
import xsna.sd9;

/* compiled from: PlatformOptimizedCancellationException.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(sd9.c);
        return this;
    }
}
