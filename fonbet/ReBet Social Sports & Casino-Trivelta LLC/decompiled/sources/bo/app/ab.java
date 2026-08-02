package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ab extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
