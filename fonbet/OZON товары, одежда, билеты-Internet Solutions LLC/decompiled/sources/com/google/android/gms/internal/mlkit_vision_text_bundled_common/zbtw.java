package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zbtw extends zbsl implements RandomAccess, zbuk {
    private static final zbtw zba = new zbtw(new float[0], 0, false);
    private float[] zbb;
    private int zbc;

    zbtw() {
        this(new float[10], 0, true);
    }

    public static zbtw zbf() {
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
        float floatValue = ((Float) obj).floatValue();
        zba();
        if (i11 < 0 || i11 > (i12 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbh(i11));
        }
        int i13 = i11 + 1;
        float[] fArr = this.zbb;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i13, i12 - i11);
        } else {
            float[] fArr2 = new float[i.a(i12, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.zbb, i11, fArr2, i13, this.zbc - i11);
            this.zbb = fArr2;
        }
        this.zbb[i11] = floatValue;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbtw)) {
            return super.addAll(collection);
        }
        zbtw zbtwVar = (zbtw) collection;
        int i11 = zbtwVar.zbc;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zbc;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.zbb;
        if (i13 > fArr.length) {
            this.zbb = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(zbtwVar.zbb, 0, this.zbb, this.zbc, zbtwVar.zbc);
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
        if (!(obj instanceof zbtw)) {
            return super.equals(obj);
        }
        zbtw zbtwVar = (zbtw) obj;
        if (this.zbc != zbtwVar.zbc) {
            return false;
        }
        float[] fArr = zbtwVar.zbb;
        for (int i11 = 0; i11 < this.zbc; i11++) {
            if (Float.floatToIntBits(this.zbb[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zbi(i11);
        return Float.valueOf(this.zbb[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zbc; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.zbb[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i11 = this.zbc;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zbb[i12] == floatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zba();
        zbi(i11);
        float[] fArr = this.zbb;
        float f7 = fArr[i11];
        if (i11 < this.zbc - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (r2 - i11) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zba();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zbb;
        System.arraycopy(fArr, i12, fArr, i11, this.zbc - i12);
        this.zbc -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zba();
        zbi(i11);
        float[] fArr = this.zbb;
        float f7 = fArr[i11];
        fArr[i11] = floatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i11) {
        if (i11 >= this.zbc) {
            return new zbtw(Arrays.copyOf(this.zbb, i11), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zbe(int i11) {
        zbi(i11);
        return this.zbb[i11];
    }

    public final void zbg(float f7) {
        zba();
        int i11 = this.zbc;
        float[] fArr = this.zbb;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[i.a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.zbb = fArr2;
        }
        float[] fArr3 = this.zbb;
        int i12 = this.zbc;
        this.zbc = i12 + 1;
        fArr3[i12] = f7;
    }

    private zbtw(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.zbb = fArr;
        this.zbc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Float) obj).floatValue());
        return true;
    }
}
