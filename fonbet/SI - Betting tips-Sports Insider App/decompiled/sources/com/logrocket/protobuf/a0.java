package com.logrocket.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends b implements b0, RandomAccess, z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f6661d = new a0(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public int[] f6662b;

    /* renamed from: c, reason: collision with root package name */
    public int f6663c;

    public a0(int[] iArr, int i5, boolean z5) {
        super(z5);
        this.f6662b = iArr;
        this.f6663c = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i5 < 0 || i5 > (i10 = this.f6663c)) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
            r5.append(this.f6663c);
            throw new IndexOutOfBoundsException(r5.toString());
        }
        int[] iArr = this.f6662b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i5, iArr, i5 + 1, i10 - i5);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            System.arraycopy(this.f6662b, i5, iArr2, i5 + 1, this.f6663c - i5);
            this.f6662b = iArr2;
        }
        this.f6662b[i5] = intValue;
        this.f6663c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = d0.f6681a;
        collection.getClass();
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i5 = a0Var.f6663c;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f6663c;
        if (Integer.MAX_VALUE - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        int[] iArr = this.f6662b;
        if (i11 > iArr.length) {
            this.f6662b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(a0Var.f6662b, 0, this.f6662b, this.f6663c, a0Var.f6663c);
        this.f6663c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f6663c) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
            r5.append(this.f6663c);
            throw new IndexOutOfBoundsException(r5.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.f6663c != a0Var.f6663c) {
            return false;
        }
        int[] iArr = a0Var.f6662b;
        for (int i5 = 0; i5 < this.f6663c; i5++) {
            if (this.f6662b[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return Integer.valueOf(this.f6662b[i5]);
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.f6663c; i10++) {
            i5 = (i5 * 31) + this.f6662b[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i5 = this.f6663c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f6662b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.logrocket.protobuf.c0
    public final c0 r(int i5) {
        if (i5 >= this.f6663c) {
            return new a0(Arrays.copyOf(this.f6662b, i5), this.f6663c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        int[] iArr = this.f6662b;
        int i10 = iArr[i5];
        if (i5 < this.f6663c - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.f6663c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        a();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6662b;
        System.arraycopy(iArr, i10, iArr, i5, this.f6663c - i10);
        this.f6663c -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        b(i5);
        int[] iArr = this.f6662b;
        int i10 = iArr[i5];
        iArr[i5] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6663c;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        int i5 = this.f6663c;
        int[] iArr = this.f6662b;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f6662b = iArr2;
        }
        int[] iArr3 = this.f6662b;
        int i10 = this.f6663c;
        this.f6663c = i10 + 1;
        iArr3[i10] = intValue;
        return true;
    }
}
