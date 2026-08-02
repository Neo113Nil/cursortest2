package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import xsna.a5g;
import xsna.fxc0;
import xsna.j840;
import xsna.jxc0;
import xsna.lxc0;

/* compiled from: Sets.java */
/* loaded from: classes13.dex */
public final class l {

    /* compiled from: Sets.java */
    public static class a<E> extends a5g<E> implements Set<E> {
        public a() {
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return l.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return l.c(this);
        }
    }

    /* compiled from: Sets.java */
    public static class b<E> extends a<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.b).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.b.iterator();
            it.getClass();
            jxc0<? super E> jxc0Var = this.c;
            jxc0Var.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (jxc0Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e) {
            return new b(((SortedSet) this.b).headSet(e), this.c);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.b;
            while (true) {
                E e = (Object) sortedSet.last();
                if (this.c.apply(e)) {
                    return e;
                }
                sortedSet = sortedSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e, E e2) {
            return new b(((SortedSet) this.b).subSet(e, e2), this.c);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e) {
            return new b(((SortedSet) this.b).tailSet(e), this.c);
        }
    }

    /* compiled from: Sets.java */
    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof j840) {
                collection = ((j840) collection).ga();
            }
            boolean z = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    z |= remove(it.next());
                }
                return z;
            }
            Iterator<E> it2 = iterator();
            collection.getClass();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* compiled from: Sets.java */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
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

    public static boolean a(Set<?> set, Object obj) {
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

    public static a b(Set set, jxc0 jxc0Var) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof a)) {
                set.getClass();
                return new a(set, jxc0Var);
            }
            a aVar = (a) set;
            jxc0 jxc0Var2 = aVar.c;
            jxc0Var2.getClass();
            return new a((Set) aVar.b, new lxc0(Arrays.asList(jxc0Var2, jxc0Var)));
        }
        Collection collection = (SortedSet) set;
        if (!(collection instanceof a)) {
            collection.getClass();
            return new b(collection, jxc0Var);
        }
        a aVar2 = (a) collection;
        jxc0 jxc0Var3 = aVar2.c;
        jxc0Var3.getClass();
        return new b((SortedSet) aVar2.b, new lxc0(Arrays.asList(jxc0Var3, jxc0Var)));
    }

    public static int c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static j d(Set set, ImmutableSet immutableSet) {
        fxc0.t(set, "set1");
        fxc0.t(immutableSet, "set2");
        return new j(set, immutableSet);
    }
}
