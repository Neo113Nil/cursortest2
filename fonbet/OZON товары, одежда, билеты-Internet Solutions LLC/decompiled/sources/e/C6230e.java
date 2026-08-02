package e;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import b1.C5503f;
import g.AbstractC6595g;
import g.InterfaceC6599k;
import h.C6763i;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6230e {
    @NotNull
    public static final C6236k a(@NotNull C6763i c6763i, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k) {
        C6763i c6763i2;
        interfaceC3967k.B(-1408504823);
        InterfaceC3978p0 l11 = n1.l(c6763i, interfaceC3967k);
        InterfaceC3978p0 l12 = n1.l(function1, interfaceC3967k);
        String str = (String) C5503f.c(new Object[0], null, C6229d.f61687b, interfaceC3967k, 3072, 6);
        InterfaceC6599k a11 = C6234i.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        AbstractC6595g activityResultRegistry = a11.getActivityResultRegistry();
        interfaceC3967k.B(-1672765924);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new C6226a();
            interfaceC3967k.x(C11);
        }
        C6226a c6226a = (C6226a) C11;
        interfaceC3967k.K();
        interfaceC3967k.B(-1672765850);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new C6236k(c6226a, l11);
            interfaceC3967k.x(C12);
        }
        C6236k c6236k = (C6236k) C12;
        interfaceC3967k.K();
        interfaceC3967k.B(-1672765582);
        boolean n11 = interfaceC3967k.n(c6226a) | interfaceC3967k.n(activityResultRegistry) | interfaceC3967k.n(str) | interfaceC3967k.n(c6763i) | interfaceC3967k.n(l12);
        Object C13 = interfaceC3967k.C();
        if (n11 || C13 == InterfaceC3967k.a.a()) {
            c6763i2 = c6763i;
            Object c6228c = new C6228c(c6226a, activityResultRegistry, str, c6763i2, l12);
            interfaceC3967k.x(c6228c);
            C13 = c6228c;
        } else {
            c6763i2 = c6763i;
        }
        interfaceC3967k.K();
        Q.a(activityResultRegistry, str, c6763i2, (Function1) C13, interfaceC3967k);
        interfaceC3967k.K();
        return c6236k;
    }
}
