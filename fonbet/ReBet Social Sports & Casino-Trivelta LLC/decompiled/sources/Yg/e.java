package Yg;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable a(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Throwable th3 = th2;
        while (true) {
            if (!(th3 instanceof CancellationException)) {
                if (th3 == null) {
                    break;
                }
                return th3;
            }
            CancellationException cancellationException = (CancellationException) th3;
            if (Intrinsics.areEqual(th3, cancellationException.getCause())) {
                break;
            }
            th3 = cancellationException.getCause();
        }
    }
}
