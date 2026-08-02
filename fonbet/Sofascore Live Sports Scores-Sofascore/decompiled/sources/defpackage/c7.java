package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c7 extends u4 {
    public abstract c7 a(int i, Object obj);

    public abstract c7 c(Object obj);

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.v2, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    public c7 d(Collection collection) {
        ife m = m();
        m.addAll(collection);
        return m.d();
    }

    @Override // defpackage.u4, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.u4, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract ife m();

    public abstract c7 n(a7 a7Var);

    public abstract c7 o(int i);

    public abstract c7 p(int i, Object obj);

    @Override // defpackage.u4, java.util.List, defpackage.gv9
    public final List subList(int i, int i2) {
        return new fv9(this, i, i2);
    }
}
