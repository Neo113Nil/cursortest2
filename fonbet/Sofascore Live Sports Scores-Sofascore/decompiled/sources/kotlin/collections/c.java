package kotlin.collections;

import defpackage.p13;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class c extends p13 {
    public static ArrayList I(Iterable iterable, Class cls) {
        iterable.getClass();
        cls.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static SortedSet J(List list) {
        list.getClass();
        TreeSet treeSet = new TreeSet();
        CollectionsKt___CollectionsKt.L(list, treeSet);
        return treeSet;
    }
}
