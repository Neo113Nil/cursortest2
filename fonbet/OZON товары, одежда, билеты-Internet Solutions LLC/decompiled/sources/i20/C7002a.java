package i20;

import A00.d;
import P00.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* renamed from: i20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7002a {
    public static final ArrayList a(@NotNull List currentList, @NotNull d event) {
        int i11;
        l20.d c11;
        T00.a b11;
        Integer d11;
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        Intrinsics.checkNotNullParameter(event, "event");
        ArrayList arrayList = new ArrayList();
        Iterator it = currentList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            T00.a b12 = ((C7854a) it.next()).c().b();
            if (b12 != null) {
                Integer d12 = b12.d();
                int f71842a = event.d().getF71842a();
                if (d12 != null && d12.intValue() == f71842a) {
                    break;
                }
            }
            i12++;
        }
        if (i12 == -1) {
            return null;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(currentList.get(i13));
        }
        C7854a c7854a = (C7854a) C7714v.Z(arrayList);
        int intValue = ((c7854a == null || (c11 = c7854a.c()) == null || (b11 = c11.b()) == null || (d11 = b11.d()) == null) ? 0 : d11.intValue()) + 1;
        int size = event.e().size();
        for (int i14 = 0; i14 < size; i14++) {
            ArrayList arrayList2 = (ArrayList) ((k) event.e().get(i14)).d();
            int size2 = arrayList2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                C7854a c7854a2 = (C7854a) arrayList2.get(i15);
                T00.a b13 = c7854a2.c().b();
                if (b13 != null) {
                    b13.o(Integer.valueOf(intValue));
                }
                arrayList.add(c7854a2);
            }
            intValue++;
        }
        ListIterator listIterator = currentList.listIterator(currentList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            T00.a b14 = ((C7854a) listIterator.previous()).c().b();
            if (b14 != null) {
                Integer d13 = b14.d();
                int f71843b = event.d().getF71843b();
                if (d13 != null && d13.intValue() == f71843b) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            }
        }
        if (i11 != -1) {
            int i16 = i11 + 1;
            if (C7714v.Q(i16, currentList) != null) {
                T00.a b15 = ((C7854a) currentList.get(i16)).c().b();
                Integer d14 = b15 != null ? b15.d() : null;
                int size3 = currentList.size();
                while (i16 < size3) {
                    C7854a c7854a3 = (C7854a) currentList.get(i16);
                    T00.a b16 = c7854a3.c().b();
                    if (!Intrinsics.d(d14, b16 != null ? b16.d() : null)) {
                        T00.a b17 = c7854a3.c().b();
                        d14 = b17 != null ? b17.d() : null;
                        intValue++;
                    }
                    T00.a b18 = c7854a3.c().b();
                    if (b18 != null) {
                        b18.o(Integer.valueOf(intValue));
                    }
                    arrayList.add(c7854a3);
                    i16++;
                }
            }
        }
        return arrayList;
    }
}
