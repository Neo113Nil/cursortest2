package mi;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import ni.C8597a;
import oi.C8737a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {
    public static final long a(@NotNull C8737a c8737a, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(c8737a, "<this>");
        Function1 function1 = e.a().get(c8737a);
        C7807Z c7807z = function1 == null ? null : (C7807Z) function1.invoke(interfaceC3967k.m(d.a()));
        if (c7807z != null) {
            return c7807z.w();
        }
        Intrinsics.checkNotNullParameter(c8737a, "<this>");
        return ((InterfaceC8149b) interfaceC3967k.m(d.a())).isDark() ? C8597a.a(c8737a) : C8597a.b(c8737a);
    }
}
