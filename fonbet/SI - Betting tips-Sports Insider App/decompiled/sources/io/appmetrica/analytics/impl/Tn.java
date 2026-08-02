package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Tn {
    public static final Qn a(Throwable th2, V v5, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Gn a7 = th2 != null ? Hn.a(th2, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(kotlin.collections.v.k(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dl((StackTraceElement) it.next()));
            }
        }
        return new Qn(a7, v5, arrayList, null, null, null, str, bool);
    }
}
