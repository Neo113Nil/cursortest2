package xe;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10740o0 {
    @NotNull
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
