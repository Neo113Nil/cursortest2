package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import xsna.dq;
import xsna.ji;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes.dex */
public final class s<E> extends a<E> implements RandomAccess {
    public static final s<Object> d = new s<>(new Object[0], 0, false);
    public E[] b;
    public int c;

    public s(E[] eArr, int i, boolean z) {
        super(z);
        this.b = eArr;
        this.c = i;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ensureIsMutable();
        int i = this.c;
        E[] eArr = this.b;
        if (i == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            StringBuilder b = ji.b(i, "Index:", ", Size:");
            b.append(this.c);
            throw new IndexOutOfBoundsException(b.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        c(i);
        return this.b[i];
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i) {
        if (i >= this.c) {
            return new s(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        ensureIsMutable();
        c(i);
        E[] eArr = this.b;
        E e = eArr[i];
        if (i < this.c - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        ensureIsMutable();
        c(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.protobuf.a, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.c)) {
            E[] eArr = this.b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[dq.b(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.b, i, eArr2, i + 1, this.c - i);
                this.b = eArr2;
            }
            this.b[i] = e;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder b = ji.b(i, "Index:", ", Size:");
        b.append(this.c);
        throw new IndexOutOfBoundsException(b.toString());
    }
}
