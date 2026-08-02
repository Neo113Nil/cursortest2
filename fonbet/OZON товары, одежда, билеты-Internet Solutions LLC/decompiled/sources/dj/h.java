package dj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Throwable error) {
        super(error);
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
