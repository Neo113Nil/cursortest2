package nd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class V0 extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
