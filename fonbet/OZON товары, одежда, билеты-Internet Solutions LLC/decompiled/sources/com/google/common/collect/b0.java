package com.google.common.collect;

import Bl0.k0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes9.dex */
public final class b0 {

    private static class a<E> extends C5867k<E> implements Set<E> {
        a() {
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return b0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return b0.c(this);
        }
    }

    private static class b<E> extends a<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f59104a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f59104a.iterator();
            it.getClass();
            O7.i<? super E> iVar = this.f59105b;
            iVar.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (iVar.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e11) {
            return new b(((SortedSet) this.f59104a).headSet(e11), this.f59105b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f59104a;
            while (true) {
                E e11 = (Object) sortedSet.last();
                if (this.f59105b.apply(e11)) {
                    return e11;
                }
                sortedSet = sortedSet.headSet(e11);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e11, E e12) {
            return new b(((SortedSet) this.f59104a).subSet(e11, e12), this.f59105b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e11) {
            return new b(((SortedSet) this.f59104a).tailSet(e11), this.f59105b);
        }
    }

    static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof P) {
                collection = ((P) collection).y1();
            }
            boolean z11 = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    z11 |= remove(it.next());
                }
                return z11;
            }
            Iterator<E> it2 = iterator();
            collection.getClass();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Set<E> b(Set<E> set, O7.i<? super E> iVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof a)) {
                set.getClass();
                return new a(set, iVar);
            }
            a aVar = (a) set;
            return new a(aVar.f59104a, O7.j.a(aVar.f59105b, iVar));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof a)) {
            set2.getClass();
            return new b(set2, iVar);
        }
        a aVar2 = (a) set2;
        return new b((SortedSet) aVar2.f59104a, O7.j.a(aVar2.f59105b, iVar));
    }

    static int c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    public static d d(A a11, A a12) {
        k0.g(a11, "set1");
        k0.g(a12, "set2");
        return new a0(a11, a12);
    }
}
