package com.google.common.collect;

import com.google.common.collect.AbstractC3445z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: com.google.common.collect.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3443x extends AbstractCollection implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: com.google.common.collect.x$a */
    public static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public int f36861a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f36862b;
        Object[] contents;

        public a(int i10) {
            AbstractC3431k.b(i10, "initialCapacity");
            this.contents = new Object[i10];
            this.f36861a = 0;
        }

        @Override // com.google.common.collect.AbstractC3443x.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                h(collection.size());
                if (collection instanceof AbstractC3443x) {
                    this.f36861a = ((AbstractC3443x) collection).b(this.contents, this.f36861a);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a e(Object obj) {
            Ra.n.k(obj);
            h(1);
            Object[] objArr = this.contents;
            int i10 = this.f36861a;
            this.f36861a = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b f(Object... objArr) {
            g(objArr, objArr.length);
            return this;
        }

        public final void g(Object[] objArr, int i10) {
            V.c(objArr, i10);
            h(i10);
            System.arraycopy(objArr, 0, this.contents, this.f36861a, i10);
            this.f36861a += i10;
        }

        public final void h(int i10) {
            Object[] objArr = this.contents;
            int d10 = b.d(objArr.length, this.f36861a + i10);
            if (d10 > objArr.length || this.f36862b) {
                this.contents = Arrays.copyOf(this.contents, d10);
                this.f36862b = false;
            }
        }
    }

    /* renamed from: com.google.common.collect.x$b */
    public static abstract class b {
        public static int d(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public b c(Iterator it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public AbstractC3445z a() {
        return isEmpty() ? AbstractC3445z.t() : AbstractC3445z.i(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i10) {
        m0 it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    /* renamed from: h */
    public abstract m0 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    public Object writeReplace() {
        return new AbstractC3445z.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Ra.n.k(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] c10 = c();
            if (c10 != null) {
                return X.a(c10, f(), e(), objArr);
            }
            objArr = V.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
