package ud;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ud.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10032j {
    @NotNull
    public static final InterfaceC10030h a(@NotNull InterfaceC10030h first, @NotNull InterfaceC10030h second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new C10037o(first, second);
    }
}
