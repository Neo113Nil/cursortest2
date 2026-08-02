package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class b7 extends u4 implements gv9 {
    public abstract b7 a(Object obj);

    public b7 c(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        hfe d = d();
        d.addAll(collection);
        return d.d();
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.v2, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract hfe d();

    @Override // defpackage.u4, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.u4, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.u4, java.util.List, defpackage.gv9
    public final ev9 subList(int i, int i2) {
        return new ev9(i, i2, this);
    }

    @Override // defpackage.u4, java.util.List, defpackage.gv9
    public final List subList(int i, int i2) {
        return new ev9(i, i2, this);
    }
}
