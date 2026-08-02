package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final z0 f5658f;

    /* renamed from: e, reason: collision with root package name */
    public final transient d0 f5659e;

    static {
        a0 a0Var = d0.f5420b;
        f5658f = new z0(s0.f5567e, o0.f5525b);
    }

    public z0(d0 d0Var, Comparator comparator) {
        super(comparator);
        this.f5659e = d0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int a(Object[] objArr) {
        return this.f5659e.a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int b() {
        return this.f5659e.b();
    }

    @Override // com.google.android.gms.internal.play_billing.y
    public final int c() {
        return this.f5659e.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int l6 = l(obj, true);
        d0 d0Var = this.f5659e;
        if (l6 == d0Var.size()) {
            return null;
        }
        return d0Var.get(l6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f5659e, obj, this.f5491c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f5491c;
        if (!d3.k(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        a0 listIterator = this.f5659e.listIterator(0);
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

    @Override // com.google.android.gms.internal.play_billing.j0, com.google.android.gms.internal.play_billing.y
    public final d0 d() {
        return this.f5659e;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f5659e.g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            d0 d0Var = this.f5659e;
            if (d0Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f5491c;
                if (!d3.k(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    a0 listIterator = d0Var.listIterator(0);
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

    @Override // com.google.android.gms.internal.play_billing.y
    public final Object[] f() {
        return this.f5659e.f();
    }

    @Override // com.google.android.gms.internal.play_billing.k0, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f5659e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int j = j(obj, true) - 1;
        if (j == -1) {
            return null;
        }
        return this.f5659e.get(j);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int l6 = l(obj, false);
        d0 d0Var = this.f5659e;
        if (l6 == d0Var.size()) {
            return null;
        }
        return d0Var.get(l6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f5659e.listIterator(0);
    }

    public final int j(Object obj, boolean z5) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f5659e, obj, this.f5491c);
        return binarySearch >= 0 ? z5 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int l(Object obj, boolean z5) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f5659e, obj, this.f5491c);
        return binarySearch >= 0 ? z5 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // com.google.android.gms.internal.play_billing.k0, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f5659e.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int j = j(obj, false) - 1;
        if (j == -1) {
            return null;
        }
        return this.f5659e.get(j);
    }

    public final z0 m(int i5, int i10) {
        d0 d0Var = this.f5659e;
        if (i5 == 0) {
            if (i10 == d0Var.size()) {
                return this;
            }
            i5 = 0;
        }
        Comparator comparator = this.f5491c;
        if (i5 < i10) {
            return new z0(d0Var.subList(i5, i10), comparator);
        }
        if (o0.f5525b.equals(comparator)) {
            return f5658f;
        }
        a0 a0Var = d0.f5420b;
        return new z0(s0.f5567e, comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5659e.size();
    }
}
