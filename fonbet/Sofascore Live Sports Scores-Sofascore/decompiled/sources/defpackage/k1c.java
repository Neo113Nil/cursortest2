package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface k1c {
    default int a(l9a l9aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gq4((g1c) list.get(i3), m9a.b, q9a.a, i2));
        }
        return d(new baa(l9aVar, l9aVar.getLayoutDirection()), arrayList, cn3.b(0, 0, 0, i, 7)).getWidth();
    }

    l1c d(m1c m1cVar, List list, long j);

    default int h(l9a l9aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gq4((g1c) list.get(i3), m9a.a, q9a.a, i2));
        }
        return d(new baa(l9aVar, l9aVar.getLayoutDirection()), arrayList, cn3.b(0, 0, 0, i, 7)).getWidth();
    }

    default int i(l9a l9aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gq4((g1c) list.get(i3), m9a.b, q9a.b, i2));
        }
        return d(new baa(l9aVar, l9aVar.getLayoutDirection()), arrayList, cn3.b(0, i, 0, 0, 13)).getHeight();
    }

    default int j(l9a l9aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gq4((g1c) list.get(i3), m9a.a, q9a.b, i2));
        }
        return d(new baa(l9aVar, l9aVar.getLayoutDirection()), arrayList, cn3.b(0, i, 0, 0, 13)).getHeight();
    }
}
