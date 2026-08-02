package lh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
