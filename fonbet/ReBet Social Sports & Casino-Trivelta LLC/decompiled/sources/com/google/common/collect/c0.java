package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c0 extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f36771e = new c0(AbstractC3445z.t(), W.h());

    /* renamed from: d, reason: collision with root package name */
    public final transient AbstractC3445z f36772d;

    public c0(AbstractC3445z abstractC3445z, Comparator comparator) {
        super(comparator);
        this.f36772d = abstractC3445z;
    }

    @Override // com.google.common.collect.H
    public H D(Object obj, boolean z10) {
        return O(0, P(obj, z10));
    }

    @Override // com.google.common.collect.H
    public H G(Object obj, boolean z10, Object obj2, boolean z11) {
        return K(obj, z10).D(obj2, z11);
    }

    @Override // com.google.common.collect.H
    public H K(Object obj, boolean z10) {
        return O(Q(obj, z10), size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public m0 descendingIterator() {
        return this.f36772d.D().iterator();
    }

    public c0 O(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new c0(this.f36772d.subList(i10, i11), this.f36706b) : H.A(this.f36706b);
    }

    public int P(Object obj, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f36772d, Ra.n.k(obj), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public int Q(Object obj, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f36772d, Ra.n.k(obj), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final int R(Object obj) {
        return Collections.binarySearch(this.f36772d, obj, S());
    }

    public Comparator S() {
        return this.f36706b;
    }

    @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public AbstractC3445z a() {
        return this.f36772d;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int b(Object[] objArr, int i10) {
        return this.f36772d.b(objArr, i10);
    }

    @Override // com.google.common.collect.AbstractC3443x
    public Object[] c() {
        return this.f36772d.c();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int Q10 = Q(obj, true);
        if (Q10 == size()) {
            return null;
        }
        return this.f36772d.get(Q10);
    }

    @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (R(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof S) {
            collection = ((S) collection).J();
        }
        if (!j0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        m0 it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int L10 = L(next2, next);
                if (L10 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (L10 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (L10 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int e() {
        return this.f36772d.e();
    }

    @Override // com.google.common.collect.E, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!j0.b(this.f36706b, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            m0 it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || L(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int f() {
        return this.f36772d.f();
    }

    @Override // com.google.common.collect.H, java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f36772d.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int P10 = P(obj, true) - 1;
        if (P10 == -1) {
            return null;
        }
        return this.f36772d.get(P10);
    }

    @Override // com.google.common.collect.AbstractC3443x
    public boolean g() {
        return this.f36772d.g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: h */
    public m0 iterator() {
        return this.f36772d.iterator();
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int Q10 = Q(obj, false);
        if (Q10 == size()) {
            return null;
        }
        return this.f36772d.get(Q10);
    }

    public int indexOf(Object obj) {
        int binarySearch;
        if (obj == null) {
            return -1;
        }
        try {
            binarySearch = Collections.binarySearch(this.f36772d, obj, S());
        } catch (ClassCastException unused) {
        }
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    @Override // com.google.common.collect.H, java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f36772d.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int P10 = P(obj, false) - 1;
        if (P10 == -1) {
            return null;
        }
        return this.f36772d.get(P10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f36772d.size();
    }

    @Override // com.google.common.collect.H, com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.H
    public H y() {
        Comparator reverseOrder = Collections.reverseOrder(this.f36706b);
        return isEmpty() ? H.A(reverseOrder) : new c0(this.f36772d.D(), reverseOrder);
    }
}
