package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zbva extends zbsl implements RandomAccess, zbum {
    private static final zbva zba = new zbva(new long[0], 0, false);
    private long[] zbb;
    private int zbc;

    zbva() {
        this(new long[10], 0, true);
    }

    public static zbva zbf() {
        return zba;
    }

    private final String zbh(int i11) {
        return A0.a(i11, this.zbc, "Index:", ", Size:");
    }

    private final void zbi(int i11) {
        if (i11 < 0 || i11 >= this.zbc) {
            throw new IndexOutOfBoundsException(zbh(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        long longValue = ((Long) obj).longValue();
        zba();
        if (i11 < 0 || i11 > (i12 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbh(i11));
        }
        int i13 = i11 + 1;
        long[] jArr = this.zbb;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i13, i12 - i11);
        } else {
            long[] jArr2 = new long[i.a(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.zbb, i11, jArr2, i13, this.zbc - i11);
            this.zbb = jArr2;
        }
        this.zbb[i11] = longValue;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbva)) {
            return super.addAll(collection);
        }
        zbva zbvaVar = (zbva) collection;
        int i11 = zbvaVar.zbc;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zbc;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.zbb;
        if (i13 > jArr.length) {
            this.zbb = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(zbvaVar.zbb, 0, this.zbb, this.zbc, zbvaVar.zbc);
        this.zbc = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbva)) {
            return super.equals(obj);
        }
        zbva zbvaVar = (zbva) obj;
        if (this.zbc != zbvaVar.zbc) {
            return false;
        }
        long[] jArr = zbvaVar.zbb;
        for (int i11 = 0; i11 < this.zbc; i11++) {
            if (this.zbb[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zbi(i11);
        return Long.valueOf(this.zbb[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zbc; i12++) {
            long j11 = this.zbb[i12];
            byte[] bArr = zbuo.zbb;
            i11 = (i11 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i11 = this.zbc;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zbb[i12] == longValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zba();
        zbi(i11);
        long[] jArr = this.zbb;
        long j11 = jArr[i11];
        if (i11 < this.zbc - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zba();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zbb;
        System.arraycopy(jArr, i12, jArr, i11, this.zbc - i12);
        this.zbc -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        zba();
        zbi(i11);
        long[] jArr = this.zbb;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i11) {
        if (i11 >= this.zbc) {
            return new zbva(Arrays.copyOf(this.zbb, i11), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zbe(int i11) {
        zbi(i11);
        return this.zbb[i11];
    }

    public final void zbg(long j11) {
        zba();
        int i11 = this.zbc;
        long[] jArr = this.zbb;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[i.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.zbb = jArr2;
        }
        long[] jArr3 = this.zbb;
        int i12 = this.zbc;
        this.zbc = i12 + 1;
        jArr3[i12] = j11;
    }

    private zbva(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.zbb = jArr;
        this.zbc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Long) obj).longValue());
        return true;
    }
}
