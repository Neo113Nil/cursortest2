package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class q0 {
    public static final InterfaceC7399t a(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        ne.g K02 = n11.K0();
        InterfaceC7399t interfaceC7399t = K02 instanceof InterfaceC7399t ? (InterfaceC7399t) K02 : null;
        if (interfaceC7399t == null || !interfaceC7399t.C0()) {
            return null;
        }
        return interfaceC7399t;
    }

    public static final boolean b(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        ne.g K02 = n11.K0();
        InterfaceC7399t interfaceC7399t = K02 instanceof InterfaceC7399t ? (InterfaceC7399t) K02 : null;
        if (interfaceC7399t != null) {
            return interfaceC7399t.C0();
        }
        return false;
    }
}
