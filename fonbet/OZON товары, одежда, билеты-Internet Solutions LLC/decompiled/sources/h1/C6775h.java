package h1;

import D1.AbstractC2810k0;
import D1.C2809k;
import D1.H0;
import D1.J0;
import E0.S0;
import k1.C7459e;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: h1.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6775h {
    @NotNull
    public static final C6773f a(@NotNull Function1 function1, @NotNull S0 s02) {
        return new C6773f(new C6774g(function1, s02));
    }

    public static final boolean b(InterfaceC6771d interfaceC6771d, long j11) {
        if (!interfaceC6771d.getNode().isAttached()) {
            return false;
        }
        AbstractC2810k0 abstractC2810k0 = (AbstractC2810k0) C2809k.f(interfaceC6771d).D();
        if (!abstractC2810k0.I()) {
            return false;
        }
        long a11 = abstractC2810k0.a();
        long y11 = abstractC2810k0.y(0L);
        float g10 = C7459e.g(y11);
        float h11 = C7459e.h(y11);
        float f7 = ((int) (a11 >> 32)) + g10;
        float f11 = ((int) (a11 & 4294967295L)) + h11;
        float g11 = C7459e.g(j11);
        if (g10 > g11 || g11 > f7) {
            return false;
        }
        float h12 = C7459e.h(j11);
        return h11 <= h12 && h12 <= f11;
    }

    public static final void c(InterfaceC6776i interfaceC6776i, C6769b c6769b) {
        interfaceC6776i.a1(c6769b);
        interfaceC6776i.h1(c6769b);
    }

    public static final void d(C6773f c6773f, Function1 function1) {
        if (function1.invoke(c6773f) != H0.ContinueTraversal) {
            return;
        }
        J0.d(c6773f, function1);
    }
}
