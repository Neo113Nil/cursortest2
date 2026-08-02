package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jf extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(String message, Throwable innerException) {
        super(message, innerException);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(innerException, "innerException");
    }
}
