package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l5p extends g4p {
    public static final l5p g;
    public final transient q3p f;

    static {
        m3p m3pVar = q3p.b;
        g = new l5p(v4p.e, s4p.a);
    }

    public l5p(q3p q3pVar, Comparator comparator) {
        super(comparator);
        this.f = q3pVar;
    }

    public final int A(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final l5p B(int i, int i2) {
        q3p q3pVar = this.f;
        if (i == 0) {
            if (i2 == q3pVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.d;
        return i < i2 ? new l5p(q3pVar.subList(i, i2), comparator) : g4p.w(comparator);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int A = A(obj, true);
        q3p q3pVar = this.f;
        if (A == q3pVar.size()) {
            return null;
        }
        return q3pVar.get(A);
    }

    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f, obj, this.d) >= 0) {
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
        if (collection instanceof r4p) {
            collection = ((r4p) collection).zza();
        }
        Comparator comparator = this.d;
        if (!sea.C(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        m3p listIterator = this.f.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.j3p
    /* renamed from: d */
    public final q5p iterator() {
        return this.f.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f.s().listIterator(0);
    }

    @Override // defpackage.c4p, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            q3p q3pVar = this.f;
            if (q3pVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!sea.C(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    m3p listIterator = q3pVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.g4p, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f.get(0);
        }
        yhk.d();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int z = z(obj, true) - 1;
        if (z == -1) {
            return null;
        }
        return this.f.get(z);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int A = A(obj, false);
        q3p q3pVar = this.f;
        if (A == q3pVar.size()) {
            return null;
        }
        return q3pVar.get(A);
    }

    @Override // defpackage.c4p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // defpackage.g4p, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            yhk.d();
            return null;
        }
        return this.f.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int z = z(obj, false) - 1;
        if (z == -1) {
            return null;
        }
        return this.f.get(z);
    }

    @Override // defpackage.j3p
    public final Object[] m() {
        return this.f.m();
    }

    @Override // defpackage.j3p
    public final int n() {
        return this.f.n();
    }

    @Override // defpackage.j3p
    public final int o() {
        return this.f.o();
    }

    @Override // defpackage.c4p, defpackage.j3p
    public final q3p p() {
        return this.f;
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return this.f.q();
    }

    @Override // defpackage.j3p
    public final int r(Object[] objArr) {
        return this.f.r(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    public final int z(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }
}
