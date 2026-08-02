package n0;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.N, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8373N extends CancellationException {
    public C8373N() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
