package zh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6994b {
    public static Object a(Object obj, int i10) {
        if (i10 == Integer.MAX_VALUE) {
            return obj;
        }
        if (!(obj instanceof List)) {
            if (!(obj instanceof String)) {
                return obj;
            }
            String str = (String) obj;
            return str.length() < i10 ? obj : str.substring(0, i10);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), i10));
        }
        return arrayList;
    }
}
