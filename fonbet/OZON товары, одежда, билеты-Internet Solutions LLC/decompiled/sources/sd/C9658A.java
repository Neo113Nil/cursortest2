package sd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.Y;
import je.t0;
import je.u0;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.i0;

/* renamed from: sd.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9658A {
    @NotNull
    public static final t0 a(@NotNull InterfaceC9839e from, @NotNull InterfaceC9839e to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        from.r().size();
        to.r().size();
        u0.a aVar = u0.f69930b;
        List<i0> r11 = from.r();
        Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
        List<i0> list = r11;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).k());
        }
        List<i0> r12 = to.r();
        Intrinsics.checkNotNullExpressionValue(r12, "getDeclaredTypeParameters(...)");
        List<i0> list2 = r12;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Y q11 = ((i0) it2.next()).q();
            Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
            arrayList2.add(C8701c.a(q11));
        }
        return u0.a.b(aVar, U.s(C7714v.b1(arrayList, arrayList2)));
    }
}
