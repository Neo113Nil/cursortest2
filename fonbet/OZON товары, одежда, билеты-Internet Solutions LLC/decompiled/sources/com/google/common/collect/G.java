package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class G {

    /* loaded from: classes9.dex */
    private static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final List<F> f59015a;

        /* renamed from: b, reason: collision with root package name */
        final O7.e<? super F, ? extends T> f59016b;

        /* renamed from: com.google.common.collect.G$a$a, reason: collision with other inner class name */
        final class C0897a extends e0<F, T> {
            C0897a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.d0
            final T a(F f7) {
                return a.this.f59016b.apply(f7);
            }
        }

        a(List<F> list, O7.e<? super F, ? extends T> eVar) {
            list.getClass();
            this.f59015a = list;
            this.f59016b = eVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i11) {
            return this.f59016b.apply(this.f59015a.get(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.f59015a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i11) {
            return new C0897a(this.f59015a.listIterator(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i11) {
            return this.f59016b.apply(this.f59015a.remove(i11));
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i11, int i12) {
            this.f59015a.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f59015a.size();
        }
    }

    /* loaded from: classes9.dex */
    private static class b<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final List<F> f59018a;

        /* renamed from: b, reason: collision with root package name */
        final O7.e<? super F, ? extends T> f59019b;

        final class a extends e0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.d0
            final T a(F f7) {
                return b.this.f59019b.apply(f7);
            }
        }

        b(List<F> list, O7.e<? super F, ? extends T> eVar) {
            list.getClass();
            this.f59018a = list;
            this.f59019b = eVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.f59018a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i11) {
            return new a(this.f59018a.listIterator(i11));
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i11, int i12) {
            this.f59018a.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f59018a.size();
        }
    }

    public static AbstractList a(List list, O7.e eVar) {
        return list instanceof RandomAccess ? new a(list, eVar) : new b(list, eVar);
    }
}
