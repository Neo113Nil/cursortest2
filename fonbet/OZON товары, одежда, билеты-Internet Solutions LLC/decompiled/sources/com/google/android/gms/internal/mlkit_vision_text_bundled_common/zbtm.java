package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zbtm extends zbsl implements RandomAccess, zbun {
    private double[] zba;
    private int zbb;

    static {
        new zbtm(new double[0], 0, false);
    }

    zbtm() {
        this(new double[10], 0, true);
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
        double doubleValue = ((Double) obj).doubleValue();
        zba();
        if (i11 < 0 || i11 > (i12 = this.zbb)) {
            throw new IndexOutOfBoundsException(zbg(i11));
        }
        int i13 = i11 + 1;
        double[] dArr = this.zba;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i13, i12 - i11);
        } else {
            double[] dArr2 = new double[i.a(i12, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            System.arraycopy(this.zba, i11, dArr2, i13, this.zbb - i11);
            this.zba = dArr2;
        }
        this.zba[i11] = doubleValue;
        this.zbb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbtm)) {
            return super.addAll(collection);
        }
        zbtm zbtmVar = (zbtm) collection;
        int i11 = zbtmVar.zbb;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zbb;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.zba;
        if (i13 > dArr.length) {
            this.zba = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(zbtmVar.zba, 0, this.zba, this.zbb, zbtmVar.zbb);
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
        if (!(obj instanceof zbtm)) {
            return super.equals(obj);
        }
        zbtm zbtmVar = (zbtm) obj;
        if (this.zbb != zbtmVar.zbb) {
            return false;
        }
        double[] dArr = zbtmVar.zba;
        for (int i11 = 0; i11 < this.zbb; i11++) {
            if (Double.doubleToLongBits(this.zba[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zbh(i11);
        return Double.valueOf(this.zba[i11]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zbb; i12++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zba[i12]);
            byte[] bArr = zbuo.zbb;
            i11 = (i11 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i11 = this.zbb;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zba[i12] == doubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zba();
        zbh(i11);
        double[] dArr = this.zba;
        double d11 = dArr[i11];
        if (i11 < this.zbb - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (r3 - i11) - 1);
        }
        this.zbb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zba();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zba;
        System.arraycopy(dArr, i12, dArr, i11, this.zbb - i12);
        this.zbb -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zba();
        zbh(i11);
        double[] dArr = this.zba;
        double d11 = dArr[i11];
        dArr[i11] = doubleValue;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i11) {
        if (i11 >= this.zbb) {
            return new zbtm(Arrays.copyOf(this.zba, i11), this.zbb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zbe(int i11) {
        zbh(i11);
        return this.zba[i11];
    }

    public final void zbf(double d11) {
        zba();
        int i11 = this.zbb;
        double[] dArr = this.zba;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[i.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.zba = dArr2;
        }
        double[] dArr3 = this.zba;
        int i12 = this.zbb;
        this.zbb = i12 + 1;
        dArr3[i12] = d11;
    }

    private zbtm(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.zba = dArr;
        this.zbb = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbf(((Double) obj).doubleValue());
        return true;
    }
}
