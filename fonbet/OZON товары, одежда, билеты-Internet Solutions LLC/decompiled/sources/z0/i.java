package z0;

import D1.AbstractC2810k0;
import D1.C2809k;
import D1.InterfaceC2807j;
import k1.C7460f;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i {
    public static final Object a(@NotNull InterfaceC2807j interfaceC2807j, C7460f c7460f, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object n12;
        if (!interfaceC2807j.getNode().isAttached()) {
            return Unit.f71690a;
        }
        AbstractC2810k0 e11 = C2809k.e(interfaceC2807j);
        InterfaceC10968a b11 = c.b(interfaceC2807j);
        return (b11 != null && (n12 = b11.n1(e11, new j(c7460f, e11), cVar)) == Wc.a.COROUTINE_SUSPENDED) ? n12 : Unit.f71690a;
    }
}
