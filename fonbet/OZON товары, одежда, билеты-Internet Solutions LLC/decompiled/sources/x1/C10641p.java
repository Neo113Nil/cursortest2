package x1;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10641p extends CancellationException {
    public C10641p(long j11) {
        super(Sh.b.b(j11, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = M.f104835a;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
