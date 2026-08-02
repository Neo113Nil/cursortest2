package io.sentry;

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
/* loaded from: classes3.dex */
public final class C4749g extends AbstractCollection implements Queue, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;

    /* renamed from: a, reason: collision with root package name */
    public transient int f52078a = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient int f52079b = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient boolean f52080c = false;

    /* renamed from: d, reason: collision with root package name */
    public final int f52081d;

    @NotNull
    private transient Object[] elements;

    /* renamed from: io.sentry.g$a */
    public class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f52082a;

        /* renamed from: b, reason: collision with root package name */
        public int f52083b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f52084c;

        public a() {
            this.f52082a = C4749g.this.f52078a;
            this.f52084c = C4749g.this.f52080c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52084c || this.f52082a != C4749g.this.f52079b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f52084c = false;
            int i10 = this.f52082a;
            this.f52083b = i10;
            this.f52082a = C4749g.this.l(i10);
            return C4749g.this.elements[this.f52083b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f52083b;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == C4749g.this.f52078a) {
                C4749g.this.remove();
                this.f52083b = -1;
                return;
            }
            int i11 = this.f52083b + 1;
            if (C4749g.this.f52078a >= this.f52083b || i11 >= C4749g.this.f52079b) {
                while (i11 != C4749g.this.f52079b) {
                    if (i11 >= C4749g.this.f52081d) {
                        C4749g.this.elements[i11 - 1] = C4749g.this.elements[0];
                        i11 = 0;
                    } else {
                        C4749g.this.elements[C4749g.this.k(i11)] = C4749g.this.elements[i11];
                        i11 = C4749g.this.l(i11);
                    }
                }
            } else {
                System.arraycopy(C4749g.this.elements, i11, C4749g.this.elements, this.f52083b, C4749g.this.f52079b - i11);
            }
            this.f52083b = -1;
            C4749g c4749g = C4749g.this;
            c4749g.f52079b = c4749g.k(c4749g.f52079b);
            C4749g.this.elements[C4749g.this.f52079b] = null;
            C4749g.this.f52080c = false;
            this.f52082a = C4749g.this.k(this.f52082a);
        }
    }

    public C4749g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.elements = objArr;
        this.f52081d = objArr.length;
    }

    private void readObject(@NotNull ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elements = new Object[this.f52081d];
        int readInt = objectInputStream.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.elements[i10] = objectInputStream.readObject();
        }
        this.f52078a = 0;
        boolean z10 = readInt == this.f52081d;
        this.f52080c = z10;
        if (z10) {
            this.f52079b = 0;
        } else {
            this.f52079b = readInt;
        }
    }

    private void writeObject(@NotNull ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (m()) {
            remove();
        }
        Object[] objArr = this.elements;
        int i10 = this.f52079b;
        int i11 = i10 + 1;
        this.f52079b = i11;
        objArr[i10] = obj;
        if (i11 >= this.f52081d) {
            this.f52079b = 0;
        }
        if (this.f52079b == this.f52078a) {
            this.f52080c = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f52080c = false;
        this.f52078a = 0;
        this.f52079b = 0;
        Arrays.fill(this.elements, (Object) null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public final int k(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f52081d - 1 : i11;
    }

    public final int l(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f52081d) {
            return 0;
        }
        return i11;
    }

    public boolean m() {
        return size() == this.f52081d;
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.elements[this.f52078a];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.elements;
        int i10 = this.f52078a;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f52078a = i11;
            objArr[i10] = null;
            if (i11 >= this.f52081d) {
                this.f52078a = 0;
            }
            this.f52080c = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f52079b;
        int i11 = this.f52078a;
        if (i10 < i11) {
            return (this.f52081d - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f52080c) {
            return this.f52081d;
        }
        return 0;
    }
}
