package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.InterfaceC9857w;

/* renamed from: je.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7383h0 {
    private static final N a(ArrayList arrayList, List list, qd.m mVar) {
        N l11 = F0.f(new C7381g0(arrayList)).l((N) C7714v.K(list), L0.OUT_VARIANCE);
        if (l11 != null) {
            return l11;
        }
        Y C11 = mVar.C();
        Intrinsics.checkNotNullExpressionValue(C11, "getDefaultBound(...)");
        return C11;
    }

    @NotNull
    public static final N b(@NotNull td.i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        InterfaceC9845k d11 = i0Var.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        if (d11 instanceof InterfaceC9843i) {
            List<td.i0> parameters = ((InterfaceC9843i) d11).k().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<td.i0> list = parameters;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                s0 k11 = ((td.i0) it.next()).k();
                Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
                arrayList.add(k11);
            }
            List<N> upperBounds = i0Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, Zd.e.e(i0Var));
        }
        if (!(d11 instanceof InterfaceC9857w)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<td.i0> typeParameters = ((InterfaceC9857w) d11).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        List<td.i0> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            s0 k12 = ((td.i0) it2.next()).k();
            Intrinsics.checkNotNullExpressionValue(k12, "getTypeConstructor(...)");
            arrayList2.add(k12);
        }
        List<N> upperBounds2 = i0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, Zd.e.e(i0Var));
    }
}
