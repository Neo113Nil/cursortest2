package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.x;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {
    public static final List a(s2.c cVar) {
        int g10 = x.g(cVar, "id");
        int g11 = x.g(cVar, "seq");
        int g12 = x.g(cVar, "from");
        int g13 = x.g(cVar, "to");
        hf.e b10 = t.b();
        while (cVar.n0()) {
            b10.add(new f((int) cVar.getLong(g10), cVar.V(g12), cVar.V(g13), (int) cVar.getLong(g11)));
        }
        return CollectionsKt.Q(t.a(b10));
    }

    public static final j b(s2.a aVar, String str, boolean z5) {
        s2.c r02 = aVar.r0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int g10 = x.g(r02, "seqno");
            int g11 = x.g(r02, "cid");
            int g12 = x.g(r02, "name");
            int g13 = x.g(r02, "desc");
            if (g10 != -1 && g11 != -1 && g12 != -1 && g13 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r02.n0()) {
                    if (((int) r02.getLong(g11)) >= 0) {
                        int i5 = (int) r02.getLong(g10);
                        String V = r02.V(g12);
                        String str2 = r02.getLong(g13) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i5), V);
                        linkedHashMap2.put(Integer.valueOf(i5), str2);
                    }
                }
                List R = CollectionsKt.R(linkedHashMap.entrySet(), new androidx.coordinatorlayout.widget.i(12));
                ArrayList arrayList = new ArrayList(v.k(R, 10));
                Iterator it = R.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List W = CollectionsKt.W(arrayList);
                List R2 = CollectionsKt.R(linkedHashMap2.entrySet(), new androidx.coordinatorlayout.widget.i(13));
                ArrayList arrayList2 = new ArrayList(v.k(R2, 10));
                Iterator it2 = R2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                j jVar = new j(str, z5, W, CollectionsKt.W(arrayList2));
                u6.h.g(r02, null);
                return jVar;
            }
            u6.h.g(r02, null);
            return null;
        } finally {
        }
    }
}
