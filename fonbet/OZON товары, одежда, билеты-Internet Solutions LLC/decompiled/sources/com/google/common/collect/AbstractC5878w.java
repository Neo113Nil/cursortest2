package com.google.common.collect;

import com.google.common.collect.AbstractC5880y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: com.google.common.collect.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5878w<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f59135a = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.w$a */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f59136a;

        /* renamed from: b, reason: collision with root package name */
        int f59137b;

        /* renamed from: c, reason: collision with root package name */
        boolean f59138c;

        a(int i11) {
            C5866j.b(i11, "initialCapacity");
            this.f59136a = new Object[i11];
            this.f59137b = 0;
        }

        private void i(int i11) {
            Object[] objArr = this.f59136a;
            int b11 = b.b(objArr.length, this.f59137b + i11);
            if (b11 > objArr.length || this.f59138c) {
                this.f59136a = Arrays.copyOf(this.f59136a, b11);
                this.f59138c = false;
            }
        }

        public final void c(Object obj) {
            obj.getClass();
            i(1);
            Object[] objArr = this.f59136a;
            int i11 = this.f59137b;
            this.f59137b = i11 + 1;
            objArr[i11] = obj;
        }

        public final void d(Object... objArr) {
            int length = objArr.length;
            S.a(length, objArr);
            i(length);
            System.arraycopy(objArr, 0, this.f59136a, this.f59137b, length);
            this.f59137b += length;
        }

        public void e(Object obj) {
            c(obj);
        }

        public void f(Object... objArr) {
            d(objArr);
        }

        public final b<E> g(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                i(collection.size());
                if (collection instanceof AbstractC5878w) {
                    this.f59137b = ((AbstractC5878w) collection).b(this.f59137b, this.f59136a);
                    return this;
                }
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public void h(List list) {
            g(list);
        }
    }

    /* renamed from: com.google.common.collect.w$b */
    public static abstract class b<E> {
        static int b(int i11, int i12) {
            if (i12 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i12 <= i11) {
                return i11;
            }
            int i13 = i11 + (i11 >> 1) + 1;
            if (i13 < i12) {
                i13 = Integer.highestOneBit(i12 - 1) << 1;
            }
            if (i13 < 0) {
                return Integer.MAX_VALUE;
            }
            return i13;
        }

        public abstract b<E> a(E e11);
    }

    AbstractC5878w() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public AbstractC5880y<E> a() {
        if (isEmpty()) {
            int i11 = AbstractC5880y.f59142c;
            return (AbstractC5880y<E>) U.f59030f;
        }
        Object[] array = toArray(f59135a);
        int i12 = AbstractC5880y.f59142c;
        return AbstractC5880y.l(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    int b(int i11, Object[] objArr) {
        f0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] e() {
        return null;
    }

    int f() {
        throw new UnsupportedOperationException();
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    abstract boolean h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract f0<E> iterator();

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
        return toArray(f59135a);
    }

    Object writeReplace() {
        return new AbstractC5880y.c(toArray(f59135a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] e11 = e();
            if (e11 != null) {
                return (T[]) Arrays.copyOfRange(e11, g(), f(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(0, tArr);
        return tArr;
    }
}
