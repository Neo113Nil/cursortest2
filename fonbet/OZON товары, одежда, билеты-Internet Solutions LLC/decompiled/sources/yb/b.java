package yb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String error) {
        super("Request ended with: " + error);
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
