package td;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.y0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m0 {
    public static final C9829U a(@NotNull je.Y y11) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        InterfaceC9842h p11 = y11.H0().p();
        return b(y11, p11 instanceof InterfaceC9843i ? (InterfaceC9843i) p11 : null, 0);
    }

    private static final C9829U b(je.Y y11, InterfaceC9843i interfaceC9843i, int i11) {
        if (interfaceC9843i == null || le.l.k(interfaceC9843i)) {
            return null;
        }
        int size = interfaceC9843i.r().size() + i11;
        if (interfaceC9843i.g()) {
            List<y0> subList = y11.F0().subList(i11, size);
            InterfaceC9845k d11 = interfaceC9843i.d();
            return new C9829U(interfaceC9843i, subList, b(y11, d11 instanceof InterfaceC9843i ? (InterfaceC9843i) d11 : null, size));
        }
        if (size != y11.F0().size()) {
            Vd.i.y(interfaceC9843i);
        }
        return new C9829U(interfaceC9843i, y11.F0().subList(i11, y11.F0().size()), null);
    }

    @NotNull
    public static final List<i0> c(@NotNull InterfaceC9843i interfaceC9843i) {
        List<i0> list;
        Object obj;
        je.s0 k11;
        Intrinsics.checkNotNullParameter(interfaceC9843i, "<this>");
        List<i0> r11 = interfaceC9843i.r();
        Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
        if (!interfaceC9843i.g() && !(interfaceC9843i.d() instanceof InterfaceC9835a)) {
            return r11;
        }
        Sequence k12 = Zd.e.k(interfaceC9843i);
        j0 predicate = j0.f99395a;
        Intrinsics.checkNotNullParameter(k12, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List C11 = kotlin.sequences.l.C(kotlin.sequences.l.m(kotlin.sequences.l.h(new kotlin.sequences.G(k12, predicate), k0.f99396a), l0.f99397a));
        Iterator it = Zd.e.k(interfaceC9843i).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof InterfaceC9839e) {
                break;
            }
        }
        InterfaceC9839e interfaceC9839e = (InterfaceC9839e) obj;
        if (interfaceC9839e != null && (k11 = interfaceC9839e.k()) != null) {
            list = k11.getParameters();
        }
        if (list == null) {
            list = kotlin.collections.K.f71697a;
        }
        if (C11.isEmpty() && list.isEmpty()) {
            List<i0> r12 = interfaceC9843i.r();
            Intrinsics.checkNotNullExpressionValue(r12, "getDeclaredTypeParameters(...)");
            return r12;
        }
        ArrayList p02 = C7714v.p0(list, C11);
        ArrayList arrayList = new ArrayList(C7714v.z(p02, 10));
        Iterator it2 = p02.iterator();
        while (it2.hasNext()) {
            i0 i0Var = (i0) it2.next();
            Intrinsics.f(i0Var);
            arrayList.add(new C9837c(i0Var, interfaceC9843i, r11.size()));
        }
        return C7714v.p0(arrayList, r11);
    }
}
