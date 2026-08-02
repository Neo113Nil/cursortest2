package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class b0 extends AbstractC3471c implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f37273c;
    private Object[] array;

    /* renamed from: b, reason: collision with root package name */
    public int f37274b;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f37273c = b0Var;
        b0Var.makeImmutable();
    }

    public b0(Object[] objArr, int i10) {
        this.array = objArr;
        this.f37274b = i10;
    }

    public static Object[] b(int i10) {
        return new Object[i10];
    }

    public static b0 c() {
        return f37273c;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f37274b) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37274b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i10 = this.f37274b;
        Object[] objArr = this.array;
        if (i10 == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i11 = this.f37274b;
        this.f37274b = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3493z.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b0 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f37274b) {
            return new b0(Arrays.copyOf(this.array, i10), this.f37274b);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        e(i10);
        return this.array[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        a();
        e(i10);
        Object[] objArr = this.array;
        Object obj = objArr[i10];
        if (i10 < this.f37274b - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f37274b--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a();
        e(i10);
        Object[] objArr = this.array;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37274b;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f37274b)) {
            Object[] objArr = this.array;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] b10 = b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, b10, 0, i10);
                System.arraycopy(this.array, i10, b10, i10 + 1, this.f37274b - i10);
                this.array = b10;
            }
            this.array[i10] = obj;
            this.f37274b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }
}
