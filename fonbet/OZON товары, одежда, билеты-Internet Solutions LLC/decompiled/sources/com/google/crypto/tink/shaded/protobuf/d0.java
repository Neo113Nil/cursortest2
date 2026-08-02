package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class d0<E> extends AbstractC5897c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f59354d;

    /* renamed from: e, reason: collision with root package name */
    private static final d0<Object> f59355e;

    /* renamed from: b, reason: collision with root package name */
    private E[] f59356b;

    /* renamed from: c, reason: collision with root package name */
    private int f59357c;

    static {
        Object[] objArr = new Object[0];
        f59354d = objArr;
        f59355e = new d0<>(objArr, 0, false);
    }

    private d0(E[] eArr, int i11, boolean z11) {
        super(z11);
        this.f59356b = eArr;
        this.f59357c = i11;
    }

    public static <E> d0<E> b() {
        return (d0<E>) f59355e;
    }

    private void c(int i11) {
        if (i11 < 0 || i11 >= this.f59357c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59357c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        a();
        int i11 = this.f59357c;
        E[] eArr = this.f59356b;
        if (i11 == eArr.length) {
            this.f59356b = (E[]) Arrays.copyOf(this.f59356b, Ep.a.a(eArr.length, 3, 2, 1, 10));
        }
        E[] eArr2 = this.f59356b;
        int i12 = this.f59357c;
        this.f59357c = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        c(i11);
        return this.f59356b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.d
    public final C5919z.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f59357c) {
            return new d0(i11 == 0 ? f59354d : Arrays.copyOf(this.f59356b, i11), this.f59357c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.List
    public final E remove(int i11) {
        a();
        c(i11);
        E[] eArr = this.f59356b;
        E e11 = eArr[i11];
        if (i11 < this.f59357c - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (r2 - i11) - 1);
        }
        this.f59357c--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        a();
        c(i11);
        E[] eArr = this.f59356b;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59357c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        int i12;
        a();
        if (i11 >= 0 && i11 <= (i12 = this.f59357c)) {
            E[] eArr = this.f59356b;
            if (i12 < eArr.length) {
                System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
            } else {
                E[] eArr2 = (E[]) new Object[Ep.a.a(eArr.length, 3, 2, 1, 10)];
                System.arraycopy(this.f59356b, 0, eArr2, 0, i11);
                System.arraycopy(this.f59356b, i11, eArr2, i11 + 1, this.f59357c - i11);
                this.f59356b = eArr2;
            }
            this.f59356b[i11] = e11;
            this.f59357c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
        f7.append(this.f59357c);
        throw new IndexOutOfBoundsException(f7.toString());
    }
}
