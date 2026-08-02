package wd;

import je.B0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class H {
    @NotNull
    public static final ce.l a(@NotNull InterfaceC9839e interfaceC9839e, @NotNull B0 typeSubstitution, @NotNull ke.h kotlinTypeRefiner) {
        ce.l N11;
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        G g10 = interfaceC9839e instanceof G ? (G) interfaceC9839e : null;
        if (g10 != null && (N11 = g10.N(typeSubstitution, kotlinTypeRefiner)) != null) {
            return N11;
        }
        ce.l i02 = interfaceC9839e.i0(typeSubstitution);
        Intrinsics.checkNotNullExpressionValue(i02, "getMemberScope(...)");
        return i02;
    }

    @NotNull
    public static final ce.l b(@NotNull InterfaceC9839e interfaceC9839e, @NotNull ke.h kotlinTypeRefiner) {
        ce.l V11;
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        G g10 = interfaceC9839e instanceof G ? (G) interfaceC9839e : null;
        if (g10 != null && (V11 = g10.V(kotlinTypeRefiner)) != null) {
            return V11;
        }
        ce.l I11 = interfaceC9839e.I();
        Intrinsics.checkNotNullExpressionValue(I11, "getUnsubstitutedMemberScope(...)");
        return I11;
    }
}
