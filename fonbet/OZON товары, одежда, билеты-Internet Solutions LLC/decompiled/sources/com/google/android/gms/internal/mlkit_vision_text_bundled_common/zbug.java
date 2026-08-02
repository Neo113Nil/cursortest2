package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zbug extends zbsl implements RandomAccess, zbul {
    private static final zbug zba = new zbug(new int[0], 0, false);
    private int[] zbb;
    private int zbc;

    zbug() {
        this(new int[10], 0, true);
    }

    public static zbug zbf() {
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
        int intValue = ((Integer) obj).intValue();
        zba();
        if (i11 < 0 || i11 > (i12 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbh(i11));
        }
        int i13 = i11 + 1;
        int[] iArr = this.zbb;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i13, i12 - i11);
        } else {
            int[] iArr2 = new int[i.a(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.zbb, i11, iArr2, i13, this.zbc - i11);
            this.zbb = iArr2;
        }
        this.zbb[i11] = intValue;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbug)) {
            return super.addAll(collection);
        }
        zbug zbugVar = (zbug) collection;
        int i11 = zbugVar.zbc;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zbc;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.zbb;
        if (i13 > iArr.length) {
            this.zbb = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(zbugVar.zbb, 0, this.zbb, this.zbc, zbugVar.zbc);
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
        if (!(obj instanceof zbug)) {
            return super.equals(obj);
        }
        zbug zbugVar = (zbug) obj;
        if (this.zbc != zbugVar.zbc) {
            return false;
        }
        int[] iArr = zbugVar.zbb;
        for (int i11 = 0; i11 < this.zbc; i11++) {
            if (this.zbb[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zbi(i11);
        return Integer.valueOf(this.zbb[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zbc; i12++) {
            i11 = (i11 * 31) + this.zbb[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i11 = this.zbc;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zbb[i12] == intValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zba();
        zbi(i11);
        int[] iArr = this.zbb;
        int i12 = iArr[i11];
        if (i11 < this.zbc - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zba();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zbb;
        System.arraycopy(iArr, i12, iArr, i11, this.zbc - i12);
        this.zbc -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zba();
        zbi(i11);
        int[] iArr = this.zbb;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i11) {
        if (i11 >= this.zbc) {
            return new zbug(Arrays.copyOf(this.zbb, i11), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zbe(int i11) {
        zbi(i11);
        return this.zbb[i11];
    }

    public final void zbg(int i11) {
        zba();
        int i12 = this.zbc;
        int[] iArr = this.zbb;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[i.a(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.zbb = iArr2;
        }
        int[] iArr3 = this.zbb;
        int i13 = this.zbc;
        this.zbc = i13 + 1;
        iArr3[i13] = i11;
    }

    private zbug(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.zbb = iArr;
        this.zbc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Integer) obj).intValue());
        return true;
    }
}
