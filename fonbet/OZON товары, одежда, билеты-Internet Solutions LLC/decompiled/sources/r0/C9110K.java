package r0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9110K {
    @NotNull
    public static final InterfaceC9108I a(@NotNull Function1<? super Float, Float> function1) {
        return new C9131k(function1);
    }

    @NotNull
    public static final InterfaceC9108I b(InterfaceC3967k interfaceC3967k, @NotNull Function1 function1) {
        InterfaceC3978p0 l11 = n1.l(function1, interfaceC3967k);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C9131k c9131k = new C9131k(new C9109J(l11));
            interfaceC3967k.x(c9131k);
            C11 = c9131k;
        }
        return (InterfaceC9108I) C11;
    }
}
