package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fwf extends aw9 {
    public static final fwf h;
    public final transient hv9 g;

    static {
        av9 av9Var = hv9.b;
        h = new fwf(vvf.e, x5d.a);
    }

    public fwf(hv9 hv9Var, Comparator comparator) {
        super(comparator);
        this.g = hv9Var;
    }

    public final fwf A(int i, int i2) {
        hv9 hv9Var = this.g;
        if (i == 0 && i2 == hv9Var.size()) {
            return this;
        }
        Comparator comparator = this.d;
        return i < i2 ? new fwf(hv9Var.subList(i, i2), comparator) : aw9.y(comparator);
    }

    public final int B(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.g, obj, this.d);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int C(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.g, obj, this.d);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int C = C(obj, true);
        hv9 hv9Var = this.g;
        if (C == hv9Var.size()) {
            return null;
        }
        return hv9Var.get(C);
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.g, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof sv9) {
            collection = ((dwf) ((sv9) collection)).r();
        }
        Comparator comparator = this.d;
        if (!jaa.E(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        cck it = iterator();
        Iterator it2 = collection.iterator();
        i4 i4Var = (i4) it;
        if (!i4Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = i4Var.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!i4Var.hasNext()) {
                        return false;
                    }
                    next2 = i4Var.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.vv9, defpackage.wu9
    public final hv9 d() {
        return this.g;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.g.C().listIterator(0);
    }

    @Override // defpackage.wu9
    public final int e(int i, Object[] objArr) {
        return this.g.e(i, objArr);
    }

    @Override // defpackage.vv9, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!jaa.E(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            cck it2 = iterator();
            do {
                i4 i4Var = (i4) it2;
                if (!i4Var.hasNext()) {
                    return true;
                }
                next = i4Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.g.get(0);
        }
        yhk.d();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int B = B(obj, true) - 1;
        if (B == -1) {
            return null;
        }
        return this.g.get(B);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int C = C(obj, false);
        hv9 hv9Var = this.g;
        if (C == hv9Var.size()) {
            return null;
        }
        return hv9Var.get(C);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            yhk.d();
            return null;
        }
        return this.g.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int B = B(obj, false) - 1;
        if (B == -1) {
            return null;
        }
        return this.g.get(B);
    }

    @Override // defpackage.wu9
    public final Object[] m() {
        return this.g.m();
    }

    @Override // defpackage.wu9
    public final int n() {
        return this.g.n();
    }

    @Override // defpackage.wu9
    public final int o() {
        return this.g.o();
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return this.g.p();
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return this.g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.size();
    }

    @Override // defpackage.aw9, defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}
