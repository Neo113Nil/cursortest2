package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h3 extends u2 implements RandomAccess, j3, z3 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5470d;

    /* renamed from: e, reason: collision with root package name */
    public static final h3 f5471e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5472b;

    /* renamed from: c, reason: collision with root package name */
    public int f5473c;

    static {
        int[] iArr = new int[0];
        f5470d = iArr;
        f5471e = new h3(iArr, 0, false);
    }

    public h3(int[] iArr, int i5, boolean z5) {
        super(z5);
        this.f5472b = iArr;
        this.f5473c = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i5 < 0 || i5 > (i10 = this.f5473c)) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index:", ", Size:", this.f5473c));
        }
        int i11 = i5 + 1;
        int[] iArr = this.f5472b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i5, iArr, i11, i10 - i5);
        } else {
            int[] iArr2 = new int[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5472b, 0, iArr2, 0, i5);
            System.arraycopy(this.f5472b, i5, iArr2, i11, this.f5473c - i5);
            this.f5472b = iArr2;
        }
        this.f5472b[i5] = intValue;
        this.f5473c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = l3.f5497a;
        collection.getClass();
        if (!(collection instanceof h3)) {
            return super.addAll(collection);
        }
        h3 h3Var = (h3) collection;
        int i5 = h3Var.f5473c;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f5473c;
        if (Integer.MAX_VALUE - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        int[] iArr = this.f5472b;
        if (i11 > iArr.length) {
            this.f5472b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(h3Var.f5472b, 0, this.f5472b, this.f5473c, h3Var.f5473c);
        this.f5473c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i5) {
        d(i5);
        return this.f5472b[i5];
    }

    public final void c(int i5) {
        a();
        int i10 = this.f5473c;
        int length = this.f5472b.length;
        if (i10 == length) {
            int[] iArr = new int[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5472b, 0, iArr, 0, this.f5473c);
            this.f5472b = iArr;
        }
        int[] iArr2 = this.f5472b;
        int i11 = this.f5473c;
        this.f5473c = i11 + 1;
        iArr2[i11] = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i5) {
        if (i5 < 0 || i5 >= this.f5473c) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index:", ", Size:", this.f5473c));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return super.equals(obj);
        }
        h3 h3Var = (h3) obj;
        if (this.f5473c != h3Var.f5473c) {
            return false;
        }
        int[] iArr = h3Var.f5472b;
        for (int i5 = 0; i5 < this.f5473c; i5++) {
            if (this.f5472b[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        d(i5);
        return Integer.valueOf(this.f5472b[i5]);
    }

    @Override // com.google.android.gms.internal.play_billing.u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.f5473c; i10++) {
            i5 = (i5 * 31) + this.f5472b[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i5 = this.f5473c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f5472b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.k3
    public final /* bridge */ /* synthetic */ k3 k(int i5) {
        if (i5 >= this.f5473c) {
            return new h3(i5 == 0 ? f5470d : Arrays.copyOf(this.f5472b, i5), this.f5473c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.u2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        a();
        d(i5);
        int[] iArr = this.f5472b;
        int i10 = iArr[i5];
        if (i5 < this.f5473c - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.f5473c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        a();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5472b;
        System.arraycopy(iArr, i10, iArr, i5, this.f5473c - i10);
        this.f5473c -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i5);
        int[] iArr = this.f5472b;
        int i10 = iArr[i5];
        iArr[i5] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5473c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}
