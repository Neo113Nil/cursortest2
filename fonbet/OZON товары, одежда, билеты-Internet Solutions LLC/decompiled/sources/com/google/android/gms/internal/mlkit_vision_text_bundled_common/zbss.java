package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zbss extends zbsl implements RandomAccess, zbun {
    private boolean[] zba;
    private int zbb;

    static {
        new zbss(new boolean[0], 0, false);
    }

    zbss() {
        this(new boolean[10], 0, true);
    }

    private final String zbg(int i11) {
        return A0.a(i11, this.zbb, "Index:", ", Size:");
    }

    private final void zbh(int i11) {
        if (i11 < 0 || i11 >= this.zbb) {
            throw new IndexOutOfBoundsException(zbg(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zba();
        if (i11 < 0 || i11 > (i12 = this.zbb)) {
            throw new IndexOutOfBoundsException(zbg(i11));
        }
        int i13 = i11 + 1;
        boolean[] zArr = this.zba;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i13, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[i.a(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.zba, i11, zArr2, i13, this.zbb - i11);
            this.zba = zArr2;
        }
        this.zba[i11] = booleanValue;
        this.zbb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbss)) {
            return super.addAll(collection);
        }
        zbss zbssVar = (zbss) collection;
        int i11 = zbssVar.zbb;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zbb;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.zba;
        if (i13 > zArr.length) {
            this.zba = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(zbssVar.zba, 0, this.zba, this.zbb, zbssVar.zbb);
        this.zbb = i13;
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
        if (!(obj instanceof zbss)) {
            return super.equals(obj);
        }
        zbss zbssVar = (zbss) obj;
        if (this.zbb != zbssVar.zbb) {
            return false;
        }
        boolean[] zArr = zbssVar.zba;
        for (int i11 = 0; i11 < this.zbb; i11++) {
            if (this.zba[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zbh(i11);
        return Boolean.valueOf(this.zba[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zbb; i12++) {
            i11 = (i11 * 31) + zbuo.zba(this.zba[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i11 = this.zbb;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zba[i12] == booleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zba();
        zbh(i11);
        boolean[] zArr = this.zba;
        boolean z11 = zArr[i11];
        if (i11 < this.zbb - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (r2 - i11) - 1);
        }
        this.zbb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zba();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zba;
        System.arraycopy(zArr, i12, zArr, i11, this.zbb - i12);
        this.zbb -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zba();
        zbh(i11);
        boolean[] zArr = this.zba;
        boolean z11 = zArr[i11];
        zArr[i11] = booleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i11) {
        if (i11 >= this.zbb) {
            return new zbss(Arrays.copyOf(this.zba, i11), this.zbb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zbe(boolean z11) {
        zba();
        int i11 = this.zbb;
        boolean[] zArr = this.zba;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[i.a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.zba = zArr2;
        }
        boolean[] zArr3 = this.zba;
        int i12 = this.zbb;
        this.zbb = i12 + 1;
        zArr3[i12] = z11;
    }

    public final boolean zbf(int i11) {
        zbh(i11);
        return this.zba[i11];
    }

    private zbss(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.zba = zArr;
        this.zbb = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbe(((Boolean) obj).booleanValue());
        return true;
    }
}
