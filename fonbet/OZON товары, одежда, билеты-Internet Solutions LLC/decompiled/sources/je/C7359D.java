package je;

import java.util.HashSet;
import ke.InterfaceC7670b;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.D, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7359D {
    public static final ne.g a(@NotNull N inlineClassType) {
        Intrinsics.checkNotNullParameter(ke.u.f71512a, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return b(inlineClassType, new HashSet());
    }

    private static final ne.g b(ne.g receiver, HashSet hashSet) {
        ne.g b11;
        ke.u uVar = ke.u.f71512a;
        s0 C11 = uVar.C(receiver);
        if (!hashSet.add(C11)) {
            return null;
        }
        td.i0 receiver2 = InterfaceC7670b.a.q(C11);
        if (receiver2 == null) {
            if (InterfaceC7670b.a.B(C11)) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                if (!(receiver instanceof N)) {
                    throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
                }
                Y i11 = Vd.k.i((N) receiver);
                if (i11 == null || (b11 = b(i11, hashSet)) == null) {
                    return null;
                }
                if (!InterfaceC7670b.a.G(receiver)) {
                    return b11;
                }
                if (!InterfaceC7670b.a.G(b11) && (!(b11 instanceof ne.h) || !InterfaceC7670b.a.H((ne.h) b11))) {
                    return uVar.n0(b11);
                }
            }
            return receiver;
        }
        Intrinsics.checkNotNullParameter(receiver2, "$receiver");
        if (!(receiver2 instanceof td.i0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver2 + ", " + kotlin.jvm.internal.N.b(receiver2.getClass())).toString());
        }
        ne.g i12 = C8701c.i(receiver2);
        ne.g b12 = b(i12, hashSet);
        if (b12 == null) {
            return null;
        }
        boolean z11 = InterfaceC7670b.a.B(uVar.C(i12)) || ((i12 instanceof ne.h) && InterfaceC7670b.a.H((ne.h) i12));
        if ((b12 instanceof ne.h) && InterfaceC7670b.a.H((ne.h) b12) && InterfaceC7670b.a.G(receiver) && z11) {
            return uVar.n0(i12);
        }
        if (!InterfaceC7670b.a.G(b12)) {
            Intrinsics.checkNotNullParameter(receiver, "<this>");
            if ((receiver instanceof ne.h) && InterfaceC7670b.a.E((ne.h) receiver)) {
                return uVar.n0(b12);
            }
        }
        return b12;
    }
}
