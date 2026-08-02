package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import xsna.fxc0;
import xsna.ne7;
import xsna.qhz;
import xsna.s4q0;
import xsna.sd9;
import xsna.se;

/* loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public static final b c = new b(g.f, 0);
    private static final long serialVersionUID = -889275714;

    /* loaded from: classes13.dex */
    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        public final ImmutableCollection.b a(Object obj) {
            c(obj);
            return this;
        }

        public final g g() {
            this.c = true;
            return ImmutableList.l(this.b, this.a);
        }

        public a(int i) {
            super(i);
        }
    }

    public static class b<E> extends se<E> {
        public final ImmutableList<E> d;

        public b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.d = immutableList;
        }

        @Override // xsna.se
        public final E a(int i) {
            return this.d.get(i);
        }
    }

    /* loaded from: classes13.dex */
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public c(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.n(this.elements);
        }
    }

    /* loaded from: classes13.dex */
    public class d extends ImmutableList<E> {
        public final transient int d;
        public final transient int e;

        public d(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] g() {
            return ImmutableList.this.g();
        }

        @Override // java.util.List
        public final E get(int i) {
            fxc0.s(i, this.e);
            return ImmutableList.this.get(i + this.d);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int h() {
            return ImmutableList.this.i() + this.d + this.e;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int i() {
            return ImmutableList.this.i() + this.d;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.e;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public final ImmutableList<E> subList(int i, int i2) {
            fxc0.w(i, i2, this.e);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.d;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static g l(int i, Object[] objArr) {
        return i == 0 ? g.f : new g(objArr, i);
    }

    public static <E> ImmutableList<E> m(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            ne7.l(array);
            return l(array.length, array);
        }
        ImmutableList<E> d2 = ((ImmutableCollection) collection).d();
        if (!d2.j()) {
            return d2;
        }
        Object[] array2 = d2.toArray(ImmutableCollection.b);
        return l(array2.length, array2);
    }

    public static g n(Object[] objArr) {
        if (objArr.length == 0) {
            return g.f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ne7.l(objArr2);
        return l(objArr2.length, objArr2);
    }

    public static g p(Object obj) {
        Object[] objArr = {obj};
        ne7.l(objArr);
        return l(1, objArr);
    }

    public static g q(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ne7.l(objArr);
        return l(2, objArr);
    }

    public static g r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        ne7.l(objArr);
        return l(5, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @SafeVarargs
    public static g s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        fxc0.q(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        ne7.l(objArr2);
        return l(length, objArr2);
    }

    public static g t(String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, str6};
        ne7.l(objArr);
        return l(6, objArr);
    }

    public static g u(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] v = sd9.v(iterable);
        ne7.l(v);
        Arrays.sort(v, comparator);
        return l(v.length, v);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return qhz.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return qhz.b(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: k */
    public final s4q0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return qhz.c(this, obj);
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i) {
        fxc0.v(i, size());
        return isEmpty() ? c : new b(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v */
    public ImmutableList<E> subList(int i, int i2) {
        fxc0.w(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? g.f : new d(i, i3);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new c(toArray(ImmutableCollection.b));
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> d() {
        return this;
    }
}
