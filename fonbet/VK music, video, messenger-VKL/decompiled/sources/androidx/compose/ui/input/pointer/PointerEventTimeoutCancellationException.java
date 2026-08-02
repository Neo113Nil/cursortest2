package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import xsna.qlb0;
import xsna.sua;

/* compiled from: SuspendingPointerInputFilter.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j) {
        super(qlb0.a(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(sua.f);
        return this;
    }
}
