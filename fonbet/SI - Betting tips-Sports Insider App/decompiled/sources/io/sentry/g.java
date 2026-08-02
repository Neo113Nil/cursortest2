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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends AbstractCollection implements Queue, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f16418a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f16419b = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient int f16420c = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient boolean f16421d = false;

    /* renamed from: e, reason: collision with root package name */
    public final int f16422e;

    public g(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i5];
        this.f16418a = objArr;
        this.f16422e = objArr.length;
    }

    private void readObject(@NotNull ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i5 = this.f16422e;
        this.f16418a = new Object[i5];
        int readInt = objectInputStream.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f16418a[i10] = objectInputStream.readObject();
        }
        this.f16419b = 0;
        boolean z5 = readInt == i5;
        this.f16421d = z5;
        if (z5) {
            this.f16420c = 0;
        } else {
            this.f16420c = readInt;
        }
    }

    private void writeObject(@NotNull ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        f fVar = new f(this);
        while (fVar.hasNext()) {
            objectOutputStream.writeObject(fVar.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i5 = this.f16422e;
        if (size == i5) {
            remove();
        }
        Object[] objArr = this.f16418a;
        int i10 = this.f16420c;
        int i11 = i10 + 1;
        this.f16420c = i11;
        objArr[i10] = obj;
        if (i11 >= i5) {
            this.f16420c = 0;
        }
        if (this.f16420c == this.f16419b) {
            this.f16421d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f16421d = false;
        this.f16419b = 0;
        this.f16420c = 0;
        Arrays.fill(this.f16418a, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
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
    public final Iterator iterator() {
        return new f(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f16418a[this.f16419b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.f16418a;
        int i5 = this.f16419b;
        Object obj = objArr[i5];
        if (obj != null) {
            int i10 = i5 + 1;
            this.f16419b = i10;
            objArr[i5] = null;
            if (i10 >= this.f16422e) {
                this.f16419b = 0;
            }
            this.f16421d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i5 = this.f16420c;
        int i10 = this.f16419b;
        int i11 = this.f16422e;
        if (i5 < i10) {
            return (i11 - i10) + i5;
        }
        if (i5 != i10) {
            return i5 - i10;
        }
        if (this.f16421d) {
            return i11;
        }
        return 0;
    }
}
