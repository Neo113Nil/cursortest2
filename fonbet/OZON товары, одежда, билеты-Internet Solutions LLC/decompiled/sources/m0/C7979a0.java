package m0;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7979a0 extends CancellationException {
    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
