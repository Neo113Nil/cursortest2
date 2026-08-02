package k7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends s {

    /* renamed from: g, reason: collision with root package name */
    public static final y f18938g;

    /* renamed from: f, reason: collision with root package name */
    public final transient m f18939f;

    static {
        i iVar = m.f18895b;
        f18938g = new y(w.f18928e, u.f18923b);
    }

    public y(m mVar, Comparator comparator) {
        super(comparator);
        this.f18939f = mVar;
    }

    @Override // k7.h
    public final int a(Object[] objArr) {
        return this.f18939f.a(objArr);
    }

    @Override // k7.h
    public final int b() {
        return this.f18939f.b();
    }

    @Override // k7.h
    public final int c() {
        return this.f18939f.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int p10 = p(obj, true);
        m mVar = this.f18939f;
        if (p10 == mVar.size()) {
            return null;
        }
        return mVar.get(p10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f18939f, obj, this.f18916d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f18916d;
        if (!a.j(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        i listIterator = this.f18939f.listIterator(0);
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

    @Override // k7.h
    public final c0 d() {
        return this.f18939f.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f18939f.f().listIterator(0);
    }

    @Override // k7.h
    public final Object[] e() {
        return this.f18939f.e();
    }

    @Override // k7.o, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            m mVar = this.f18939f;
            if (mVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f18916d;
                if (!a.j(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    i listIterator = mVar.listIterator(0);
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

    @Override // k7.s, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f18939f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int o3 = o(obj, true) - 1;
        if (o3 == -1) {
            return null;
        }
        return this.f18939f.get(o3);
    }

    @Override // k7.o
    public final m h() {
        return this.f18939f;
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int p10 = p(obj, false);
        m mVar = this.f18939f;
        if (p10 == mVar.size()) {
            return null;
        }
        return mVar.get(p10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f18939f.listIterator(0);
    }

    @Override // k7.s, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f18939f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int o3 = o(obj, false) - 1;
        if (o3 == -1) {
            return null;
        }
        return this.f18939f.get(o3);
    }

    public final int o(Object obj, boolean z5) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f18939f, obj, this.f18916d);
        return binarySearch >= 0 ? z5 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int p(Object obj, boolean z5) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f18939f, obj, this.f18916d);
        return binarySearch >= 0 ? z5 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final y q(int i5, int i10) {
        m mVar = this.f18939f;
        if (i5 == 0) {
            if (i10 == mVar.size()) {
                return this;
            }
            i5 = 0;
        }
        Comparator comparator = this.f18916d;
        return i5 < i10 ? new y(mVar.subList(i5, i10), comparator) : s.m(comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18939f.size();
    }
}
