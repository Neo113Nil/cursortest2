package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h5 extends r4 implements RandomAccess, k5, d6 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5073d;

    /* renamed from: e, reason: collision with root package name */
    public static final h5 f5074e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5075b;

    /* renamed from: c, reason: collision with root package name */
    public int f5076c;

    static {
        int[] iArr = new int[0];
        f5073d = iArr;
        f5074e = new h5(iArr, 0, false);
    }

    public h5(int[] iArr, int i5, boolean z5) {
        super(z5);
        this.f5075b = iArr;
        this.f5076c = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i5 < 0 || i5 > (i10 = this.f5076c)) {
            throw new IndexOutOfBoundsException(t4.a(this.f5076c, i5, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i5 + 1;
        int[] iArr = this.f5075b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i5, iArr, i11, i10 - i5);
        } else {
            int[] iArr2 = new int[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5075b, 0, iArr2, 0, i5);
            System.arraycopy(this.f5075b, i5, iArr2, i11, this.f5076c - i5);
            this.f5075b = iArr2;
        }
        this.f5075b[i5] = intValue;
        this.f5076c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = n5.f5148a;
        collection.getClass();
        if (!(collection instanceof h5)) {
            return super.addAll(collection);
        }
        h5 h5Var = (h5) collection;
        int i5 = h5Var.f5076c;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f5076c;
        if (Integer.MAX_VALUE - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        int[] iArr = this.f5075b;
        if (i11 > iArr.length) {
            this.f5075b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(h5Var.f5075b, 0, this.f5075b, this.f5076c, h5Var.f5076c);
        this.f5076c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h5 i0(int i5) {
        if (i5 >= this.f5076c) {
            return new h5(i5 == 0 ? f5073d : Arrays.copyOf(this.f5075b, i5), this.f5076c, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i5) {
        e(i5);
        return this.f5075b[i5];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i5) {
        a();
        int i10 = this.f5076c;
        int length = this.f5075b.length;
        if (i10 == length) {
            int[] iArr = new int[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5075b, 0, iArr, 0, this.f5076c);
            this.f5075b = iArr;
        }
        int[] iArr2 = this.f5075b;
        int i11 = this.f5076c;
        this.f5076c = i11 + 1;
        iArr2[i11] = i5;
    }

    public final void e(int i5) {
        if (i5 < 0 || i5 >= this.f5076c) {
            throw new IndexOutOfBoundsException(t4.a(this.f5076c, i5, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return super.equals(obj);
        }
        h5 h5Var = (h5) obj;
        if (this.f5076c != h5Var.f5076c) {
            return false;
        }
        int[] iArr = h5Var.f5075b;
        for (int i5 = 0; i5 < this.f5076c; i5++) {
            if (this.f5075b[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        e(i5);
        return Integer.valueOf(this.f5075b[i5]);
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.f5076c; i10++) {
            i5 = (i5 * 31) + this.f5075b[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i5 = this.f5076c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f5075b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        a();
        e(i5);
        int[] iArr = this.f5075b;
        int i10 = iArr[i5];
        if (i5 < this.f5076c - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.f5076c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        a();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5075b;
        System.arraycopy(iArr, i10, iArr, i5, this.f5076c - i10);
        this.f5076c -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        e(i5);
        int[] iArr = this.f5075b;
        int i10 = iArr[i5];
        iArr[i5] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5076c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
