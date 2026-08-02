package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class hl3 {
    public static final HashSet a;
    public static final HashSet b;

    static {
        List list = kig.u;
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kig) it.next()).a);
        }
        a = CollectionsKt.Q0(arrayList);
        List list2 = kig.t;
        list2.getClass();
        ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kig) it2.next()).a);
        }
        b = CollectionsKt.Q0(arrayList2);
    }
}
