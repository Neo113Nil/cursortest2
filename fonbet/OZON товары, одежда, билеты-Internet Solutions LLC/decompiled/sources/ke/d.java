package ke;

import java.util.ArrayList;
import java.util.Iterator;
import je.AbstractC7360E;
import je.C7357B;
import je.C7363H;
import je.K0;
import je.Q;
import je.S;
import je.Y;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {
    @NotNull
    public static final K0 a(@NotNull ArrayList types) {
        Y P02;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (K0) C7714v.A0(types);
        }
        ArrayList arrayList = new ArrayList(C7714v.z(types, 10));
        Iterator it = types.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            K0 k02 = (K0) it.next();
            z11 = z11 || S.a(k02);
            if (k02 instanceof Y) {
                P02 = (Y) k02;
            } else {
                if (!(k02 instanceof AbstractC7360E)) {
                    throw new Sc.o();
                }
                if (C7357B.a(k02)) {
                    return k02;
                }
                P02 = ((AbstractC7360E) k02).P0();
                z12 = true;
            }
            arrayList.add(P02);
        }
        if (z11) {
            return le.l.c(le.k.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z12) {
            return z.f71515a.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C7363H.c((K0) it2.next()));
        }
        z zVar = z.f71515a;
        return Q.c(zVar.b(arrayList), zVar.b(arrayList2));
    }
}
