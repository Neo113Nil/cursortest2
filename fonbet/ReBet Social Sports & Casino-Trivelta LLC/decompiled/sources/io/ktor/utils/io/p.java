package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p {
    public static final Throwable a(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            if (Intrinsics.areEqual(th3, th3.getCause())) {
                return th2;
            }
            Throwable cause = th3.getCause();
            if (cause == null) {
                return th3;
            }
            th3 = cause;
        }
        return th3;
    }
}
