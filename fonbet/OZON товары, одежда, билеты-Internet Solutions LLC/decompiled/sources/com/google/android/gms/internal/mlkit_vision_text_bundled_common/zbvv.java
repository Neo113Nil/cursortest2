package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import U7.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zbvv extends zbsl implements RandomAccess {
    private static final zbvv zba = new zbvv(new Object[0], 0, false);
    private Object[] zbb;
    private int zbc;

    zbvv() {
        this(new Object[10], 0, true);
    }

    public static zbvv zbe() {
        return zba;
    }

    private final String zbf(int i11) {
        return A0.a(i11, this.zbc, "Index:", ", Size:");
    }

    private final void zbg(int i11) {
        if (i11 < 0 || i11 >= this.zbc) {
            throw new IndexOutOfBoundsException(zbf(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zba();
        if (i11 < 0 || i11 > (i12 = this.zbc)) {
            throw new IndexOutOfBoundsException(zbf(i11));
        }
        int i13 = i11 + 1;
        Object[] objArr = this.zbb;
        if (i12 < objArr.length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[i.a(i12, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            System.arraycopy(this.zbb, i11, objArr2, i13, this.zbc - i11);
            this.zbb = objArr2;
        }
        this.zbb[i11] = obj;
        this.zbc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        zbg(i11);
        return this.zbb[i11];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zba();
        zbg(i11);
        Object[] objArr = this.zbb;
        Object obj = objArr[i11];
        if (i11 < this.zbc - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zba();
        zbg(i11);
        Object[] objArr = this.zbb;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i11) {
        if (i11 >= this.zbc) {
            return new zbvv(Arrays.copyOf(this.zbb, i11), this.zbc, true);
        }
        throw new IllegalArgumentException();
    }

    private zbvv(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.zbb = objArr;
        this.zbc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zba();
        int i11 = this.zbc;
        Object[] objArr = this.zbb;
        if (i11 == objArr.length) {
            this.zbb = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zbb;
        int i12 = this.zbc;
        this.zbc = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
