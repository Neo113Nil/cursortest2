package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import xsna.egi;
import xsna.fxc0;
import xsna.ne7;
import xsna.owj0;

/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 912559;
    public transient ImmutableList<E> c;

    /* loaded from: classes13.dex */
    public static class a<E> extends ImmutableCollection.a<E> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.b
        public /* bridge */ /* synthetic */ ImmutableCollection.b a(Object obj) {
            g(obj);
            return this;
        }

        public a<E> g(E e) {
            e.getClass();
            c(e);
            return this;
        }

        public a<E> h(Iterable<? extends E> iterable) {
            iterable.getClass();
            e(iterable);
            return this;
        }

        public ImmutableSet<E> i() {
            int i = this.b;
            if (i == 0) {
                int i2 = ImmutableSet.d;
                return i.k;
            }
            if (i != 1) {
                ImmutableSet<E> m = ImmutableSet.m(i, this.a);
                this.b = m.size();
                this.c = true;
                return m;
            }
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            int i3 = ImmutableSet.d;
            return new owj0(obj);
        }
    }

    /* loaded from: classes13.dex */
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public b(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            Object[] objArr = this.elements;
            int i = ImmutableSet.d;
            int length = objArr.length;
            return length != 0 ? length != 1 ? ImmutableSet.m(objArr.length, (Object[]) objArr.clone()) : new owj0(objArr[0]) : i.k;
        }
    }

    public static int l(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            fxc0.q(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static <E> ImmutableSet<E> m(int i, Object... objArr) {
        if (i == 0) {
            return i.k;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new owj0(obj);
        }
        int l = l(i);
        Object[] objArr2 = new Object[l];
        int i2 = l - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            ne7.k(i5, obj2);
            int hashCode = obj2.hashCode();
            int q = egi.q(hashCode);
            while (true) {
                int i6 = q & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                q++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new owj0(obj4);
        }
        if (l(i4) < l / 2) {
            return m(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new i(objArr, i3, objArr2, i2, i4);
    }

    public static <E> ImmutableSet<E> n(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.j()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> d() {
        ImmutableList<E> immutableList = this.c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> o = o();
        this.c = o;
        return o;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && p() && ((ImmutableSet) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return l.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return l.c(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ImmutableList<E> o() {
        Object[] array = toArray(ImmutableCollection.b);
        ImmutableList.b bVar = ImmutableList.c;
        return ImmutableList.l(array.length, array);
    }

    public boolean p() {
        return this instanceof i;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(toArray(ImmutableCollection.b));
    }
}
