package Rg;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
