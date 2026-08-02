package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t5 extends r4 implements RandomAccess, l5, d6 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f5249d;

    /* renamed from: e, reason: collision with root package name */
    public static final t5 f5250e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f5251b;

    /* renamed from: c, reason: collision with root package name */
    public int f5252c;

    static {
        long[] jArr = new long[0];
        f5249d = jArr;
        f5250e = new t5(jArr, 0, false);
    }

    public t5(long[] jArr, int i5, boolean z5) {
        super(z5);
        this.f5251b = jArr;
        this.f5252c = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        a();
        if (i5 < 0 || i5 > (i10 = this.f5252c)) {
            throw new IndexOutOfBoundsException(t4.a(this.f5252c, i5, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i5 + 1;
        long[] jArr = this.f5251b;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i5, jArr, i11, i10 - i5);
        } else {
            long[] jArr2 = new long[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5251b, 0, jArr2, 0, i5);
            System.arraycopy(this.f5251b, i5, jArr2, i11, this.f5252c - i5);
            this.f5251b = jArr2;
        }
        this.f5251b[i5] = longValue;
        this.f5252c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = n5.f5148a;
        collection.getClass();
        if (!(collection instanceof t5)) {
            return super.addAll(collection);
        }
        t5 t5Var = (t5) collection;
        int i5 = t5Var.f5252c;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f5252c;
        if (Integer.MAX_VALUE - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        long[] jArr = this.f5251b;
        if (i11 > jArr.length) {
            this.f5251b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(t5Var.f5251b, 0, this.f5251b, this.f5252c, t5Var.f5252c);
        this.f5252c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i5) {
        e(i5);
        return this.f5251b[i5];
    }

    @Override // com.google.android.gms.internal.measurement.m5
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t5 i0(int i5) {
        if (i5 >= this.f5252c) {
            return new t5(i5 == 0 ? f5249d : Arrays.copyOf(this.f5251b, i5), this.f5252c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j) {
        a();
        int i5 = this.f5252c;
        int length = this.f5251b.length;
        if (i5 == length) {
            long[] jArr = new long[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5251b, 0, jArr, 0, this.f5252c);
            this.f5251b = jArr;
        }
        long[] jArr2 = this.f5251b;
        int i10 = this.f5252c;
        this.f5252c = i10 + 1;
        jArr2[i10] = j;
    }

    public final void e(int i5) {
        if (i5 < 0 || i5 >= this.f5252c) {
            throw new IndexOutOfBoundsException(t4.a(this.f5252c, i5, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return super.equals(obj);
        }
        t5 t5Var = (t5) obj;
        if (this.f5252c != t5Var.f5252c) {
            return false;
        }
        long[] jArr = t5Var.f5251b;
        for (int i5 = 0; i5 < this.f5252c; i5++) {
            if (this.f5251b[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        e(i5);
        return Long.valueOf(this.f5251b[i5]);
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.f5252c; i10++) {
            long j = this.f5251b[i10];
            Charset charset = n5.f5148a;
            i5 = (i5 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i5 = this.f5252c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f5251b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        a();
        e(i5);
        long[] jArr = this.f5251b;
        long j = jArr[i5];
        if (i5 < this.f5252c - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.f5252c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        a();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f5251b;
        System.arraycopy(jArr, i10, jArr, i5, this.f5252c - i10);
        this.f5252c -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        e(i5);
        long[] jArr = this.f5251b;
        long j = jArr[i5];
        jArr[i5] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5252c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
