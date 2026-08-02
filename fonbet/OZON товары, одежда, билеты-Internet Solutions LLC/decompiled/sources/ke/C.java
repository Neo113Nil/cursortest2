package ke;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.H0;
import je.K0;
import je.L0;
import je.N;
import je.Y;
import je.s0;
import je.u0;
import je.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.C8902c;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
public final class C {
    private static final String a(s0 s0Var) {
        StringBuilder sb2 = new StringBuilder();
        b("type: " + s0Var, sb2);
        b("hashCode: " + s0Var.hashCode(), sb2);
        b("javaClass: " + s0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC9845k p11 = s0Var.p(); p11 != null; p11 = p11.d()) {
            b("fqName: " + Ud.n.f27602a.E(p11), sb2);
            b("javaClass: " + p11.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private static final void b(String str, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
    }

    public static final K0 c(@NotNull Y subtype, @NotNull Y supertype, @NotNull y typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new v(subtype, null));
        s0 H02 = supertype.H0();
        while (!arrayDeque.isEmpty()) {
            v vVar = (v) arrayDeque.poll();
            N b11 = vVar.b();
            s0 H03 = b11.H0();
            w wVar = (w) typeCheckingProcedureCallbacks;
            if (wVar.b(H03, H02)) {
                boolean I02 = b11.I0();
                for (v a11 = vVar.a(); a11 != null; a11 = a11.a()) {
                    N kotlinType = a11.b();
                    List<y0> F02 = kotlinType.F0();
                    if (!(F02 instanceof Collection) || !F02.isEmpty()) {
                        Iterator<T> it = F02.iterator();
                        while (it.hasNext()) {
                            L0 b12 = ((y0) it.next()).b();
                            L0 l02 = L0.INVARIANT;
                            if (b12 != l02) {
                                u0.a aVar = u0.f69930b;
                                Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                                N j11 = Wd.f.c(aVar.a(kotlinType.H0(), kotlinType.F0())).c().j(b11, l02);
                                Intrinsics.checkNotNullExpressionValue(j11, "safeSubstitute(...)");
                                b11 = C8902c.a(j11).d();
                                break;
                            }
                        }
                    }
                    u0.a aVar2 = u0.f69930b;
                    Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
                    b11 = aVar2.a(kotlinType.H0(), kotlinType.F0()).c().j(b11, L0.INVARIANT);
                    I02 = I02 || kotlinType.I0();
                }
                s0 H04 = b11.H0();
                if (wVar.b(H04, H02)) {
                    return H0.k(b11, I02);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + a(H04) + ", \n\nsupertype: " + a(H02) + " \n" + wVar.b(H04, H02));
            }
            for (N n11 : H03.o()) {
                Intrinsics.f(n11);
                arrayDeque.add(new v(n11, vVar));
            }
        }
        return null;
    }
}
