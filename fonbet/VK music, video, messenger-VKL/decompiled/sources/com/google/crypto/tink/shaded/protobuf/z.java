package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import xsna.dq;
import xsna.ji;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes.dex */
public final class z<E> extends c<E> implements RandomAccess {
    public static final z<Object> e;
    public E[] c;
    public int d;

    static {
        z<Object> zVar = new z<>(new Object[0], 0);
        e = zVar;
        zVar.b = false;
    }

    public z(E[] eArr, int i) {
        this.c = eArr;
        this.d = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        c();
        int i = this.d;
        E[] eArr = this.c;
        if (i == eArr.length) {
            this.c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        eArr2[i2] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.d) {
            StringBuilder b = ji.b(i, "Index:", ", Size:");
            b.append(this.d);
            throw new IndexOutOfBoundsException(b.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        d(i);
        return this.c[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q.d
    public final q.d mutableCopyWithCapacity(int i) {
        if (i >= this.d) {
            return new z(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        c();
        d(i);
        E[] eArr = this.c;
        E e2 = eArr[i];
        if (i < this.d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        c();
        d(i);
        E[] eArr = this.c;
        E e3 = eArr[i];
        eArr[i] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        int i2;
        c();
        if (i >= 0 && i <= (i2 = this.d)) {
            E[] eArr = this.c;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[dq.b(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.c, i, eArr2, i + 1, this.d - i);
                this.c = eArr2;
            }
            this.c[i] = e2;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder b = ji.b(i, "Index:", ", Size:");
        b.append(this.d);
        throw new IndexOutOfBoundsException(b.toString());
    }
}
