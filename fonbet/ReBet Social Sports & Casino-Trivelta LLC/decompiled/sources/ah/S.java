package ah;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class S {
    public static final void b(ch.y yVar, ch.y yVar2) {
        for (String str : yVar2.names()) {
            List c10 = yVar2.c(str);
            if (c10 == null) {
                c10 = CollectionsKt.emptyList();
            }
            String k10 = AbstractC2010b.k(str, 0, 0, false, null, 15, null);
            List list = c10;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2010b.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            yVar.e(k10, arrayList);
        }
    }

    public static final void c(ch.y yVar, ch.x xVar) {
        for (String str : xVar.names()) {
            List c10 = xVar.c(str);
            if (c10 == null) {
                c10 = CollectionsKt.emptyList();
            }
            String m10 = AbstractC2010b.m(str, false, 1, null);
            List list = c10;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2010b.n((String) it.next()));
            }
            yVar.e(m10, arrayList);
        }
    }

    public static final z d(ch.y parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        InterfaceC2006A b10 = D.b(0, 1, null);
        b(b10, parameters);
        return b10.build();
    }

    public static final InterfaceC2006A e(ch.x parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        InterfaceC2006A b10 = D.b(0, 1, null);
        c(b10, parameters);
        return b10;
    }
}
