package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7145g<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private transient E[] f67911a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f67912b = 0;

    /* renamed from: c, reason: collision with root package name */
    private transient int f67913c = 0;

    /* renamed from: d, reason: collision with root package name */
    private transient boolean f67914d = false;

    /* renamed from: e, reason: collision with root package name */
    private final int f67915e;

    /* renamed from: io.sentry.g$a */
    final class a implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        private int f67916a;

        /* renamed from: b, reason: collision with root package name */
        private int f67917b = -1;

        /* renamed from: c, reason: collision with root package name */
        private boolean f67918c;

        a() {
            this.f67916a = C7145g.this.f67912b;
            this.f67918c = C7145g.this.f67914d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f67918c || this.f67916a != C7145g.this.f67913c;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f67918c = false;
            int i11 = this.f67916a;
            this.f67917b = i11;
            C7145g c7145g = C7145g.this;
            this.f67916a = C7145g.h(c7145g, i11);
            return (E) c7145g.f67911a[this.f67917b];
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i11 = this.f67917b;
            if (i11 == -1) {
                throw new IllegalStateException();
            }
            C7145g c7145g = C7145g.this;
            if (i11 == c7145g.f67912b) {
                c7145g.remove();
                this.f67917b = -1;
                return;
            }
            int i12 = this.f67917b + 1;
            if (c7145g.f67912b >= this.f67917b || i12 >= c7145g.f67913c) {
                while (i12 != c7145g.f67913c) {
                    if (i12 >= c7145g.f67915e) {
                        c7145g.f67911a[i12 - 1] = c7145g.f67911a[0];
                        i12 = 0;
                    } else {
                        c7145g.f67911a[C7145g.m(c7145g, i12)] = c7145g.f67911a[i12];
                        i12 = C7145g.h(c7145g, i12);
                    }
                }
            } else {
                System.arraycopy(c7145g.f67911a, i12, c7145g.f67911a, this.f67917b, c7145g.f67913c - i12);
            }
            this.f67917b = -1;
            c7145g.f67913c = C7145g.m(c7145g, c7145g.f67913c);
            c7145g.f67911a[c7145g.f67913c] = null;
            c7145g.f67914d = false;
            this.f67916a = C7145g.m(c7145g, this.f67916a);
        }
    }

    C7145g(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i11];
        this.f67911a = eArr;
        this.f67915e = eArr.length;
    }

    static int h(C7145g c7145g, int i11) {
        int i12 = i11 + 1;
        if (i12 >= c7145g.f67915e) {
            return 0;
        }
        return i12;
    }

    static int m(C7145g c7145g, int i11) {
        int i12 = i11 - 1;
        return i12 < 0 ? c7145g.f67915e - 1 : i12;
    }

    private void readObject(@NotNull ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i11 = this.f67915e;
        this.f67911a = (E[]) new Object[i11];
        int readInt = objectInputStream.readInt();
        for (int i12 = 0; i12 < readInt; i12++) {
            ((E[]) this.f67911a)[i12] = objectInputStream.readObject();
        }
        this.f67912b = 0;
        boolean z11 = readInt == i11;
        this.f67914d = z11;
        if (z11) {
            this.f67913c = 0;
        } else {
            this.f67913c = readInt;
        }
    }

    private void writeObject(@NotNull ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        a aVar = new a();
        while (aVar.hasNext()) {
            objectOutputStream.writeObject(aVar.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(@NotNull E e11) {
        if (e11 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i11 = this.f67915e;
        if (size == i11) {
            remove();
        }
        E[] eArr = this.f67911a;
        int i12 = this.f67913c;
        int i13 = i12 + 1;
        this.f67913c = i13;
        eArr[i12] = e11;
        if (i13 >= i11) {
            this.f67913c = 0;
        }
        if (this.f67913c == this.f67912b) {
            this.f67914d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f67914d = false;
        this.f67912b = 0;
        this.f67913c = 0;
        Arrays.fill(this.f67911a, (Object) null);
    }

    @Override // java.util.Queue
    public final E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public final boolean offer(@NotNull E e11) {
        add(e11);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f67911a[this.f67912b];
    }

    @Override // java.util.Queue
    public final E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    @NotNull
    public final E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f67911a;
        int i11 = this.f67912b;
        E e11 = eArr[i11];
        if (e11 != null) {
            int i12 = i11 + 1;
            this.f67912b = i12;
            eArr[i11] = null;
            if (i12 >= this.f67915e) {
                this.f67912b = 0;
            }
            this.f67914d = false;
        }
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i11 = this.f67913c;
        int i12 = this.f67912b;
        int i13 = this.f67915e;
        if (i11 < i12) {
            return (i13 - i12) + i11;
        }
        if (i11 != i12) {
            return i11 - i12;
        }
        if (this.f67914d) {
            return i13;
        }
        return 0;
    }
}
