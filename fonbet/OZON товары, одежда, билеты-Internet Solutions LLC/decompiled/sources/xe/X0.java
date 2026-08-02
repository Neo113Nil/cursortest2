package xe;

import Ee.C2968b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class X0 {
    @NotNull
    public static final InterfaceC10756x a(B0 b02) {
        return new W0(b02);
    }

    public static InterfaceC10756x b() {
        return new W0(null);
    }

    public static final Object c(@NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c frame) {
        V0 v02 = new V0(frame, frame.getContext());
        Object a11 = C2968b.a(v02, v02, function2);
        if (a11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a11;
    }
}
