package z0;

import B1.B;
import D1.AbstractC2810k0;
import D1.InterfaceC2807j;
import D1.J0;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final /* synthetic */ class c {
    public static final C7460f a(AbstractC2810k0 abstractC2810k0, B b11, C7460f c7460f) {
        return c7460f.A(abstractC2810k0.K(b11, false).s());
    }

    public static final InterfaceC10968a b(@NotNull InterfaceC2807j interfaceC2807j) {
        if (!interfaceC2807j.getNode().isAttached()) {
            return null;
        }
        InterfaceC10968a interfaceC10968a = (InterfaceC10968a) J0.a(interfaceC2807j, e.f106854c);
        return interfaceC10968a == null ? new h(interfaceC2807j) : interfaceC10968a;
    }
}
