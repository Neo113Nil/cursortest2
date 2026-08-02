package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import xsna.fdi;
import xsna.k15;
import xsna.ne7;
import xsna.s4q0;

/* loaded from: classes.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] b = new Object[0];
    private static final long serialVersionUID = 912559;

    /* loaded from: classes13.dex */
    public static abstract class a<E> extends b<E> {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i) {
            k15.h(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        public final void c(Object obj) {
            obj.getClass();
            f(1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
        }

        public final void d(Object... objArr) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                ne7.k(i, objArr[i]);
            }
            f(length);
            System.arraycopy(objArr, 0, this.a, this.b, length);
            this.b += length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                f(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.b = ((ImmutableCollection) collection).e(this.b, this.a);
                    return;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public final void f(int i) {
            Object[] objArr = this.a;
            int b = b.b(objArr.length, this.b + i);
            if (b > objArr.length || this.c) {
                this.a = Arrays.copyOf(this.a, b);
                this.c = false;
            }
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class b<E> {
        public static int b(int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        public abstract b<E> a(E e);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public ImmutableList<E> d() {
        if (isEmpty()) {
            ImmutableList.b bVar = ImmutableList.c;
            return g.f;
        }
        Object[] array = toArray(b);
        ImmutableList.b bVar2 = ImmutableList.c;
        return ImmutableList.l(array.length, array);
    }

    public int e(int i, Object[] objArr) {
        s4q0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] g() {
        return null;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract s4q0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(b);
    }

    public Object writeReplace() {
        return new ImmutableList.c(toArray(b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] g = g();
            if (g != null) {
                return (T[]) fdi.p(g, i(), h(), tArr);
            }
            tArr = (T[]) ne7.E(size, tArr);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(0, tArr);
        return tArr;
    }
}
