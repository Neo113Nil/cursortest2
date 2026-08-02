package ah;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class I extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
