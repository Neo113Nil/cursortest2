package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rm4 implements n55 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ e1d d;
    public final /* synthetic */ e1d e;

    public rm4(Object obj, Set set, Set set2, e1d e1dVar, e1d e1dVar2) {
        this.a = obj;
        this.b = set;
        this.c = set2;
        this.d = e1dVar;
        this.e = e1dVar2;
    }

    @Override // defpackage.n55
    public final void d() {
        ArrayList arrayList;
        List list = (List) this.d.getValue();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((e7d) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((e7d) it.next()).b);
            }
        }
        Object obj = this.a;
        if (!(arrayList.contains(obj) ? false : this.b.remove(obj)) || this.c.contains(obj)) {
            return;
        }
        List list2 = (List) this.e.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = CollectionsKt.B0(list2).iterator();
            while (it2.hasNext()) {
                ((f7d) it2.next()).a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            ((f7d) list2.get(size2)).a.invoke(obj);
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }
}
