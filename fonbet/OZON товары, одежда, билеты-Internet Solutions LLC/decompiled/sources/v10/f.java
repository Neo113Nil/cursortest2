package v10;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {
    @NotNull
    public static final <T> InterfaceC4008j<T> a(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return k.a(n.NONE, initializer);
    }
}
