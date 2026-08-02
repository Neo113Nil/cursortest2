package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f6 extends r4 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f5042d;

    /* renamed from: e, reason: collision with root package name */
    public static final f6 f5043e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5044b;

    /* renamed from: c, reason: collision with root package name */
    public int f5045c;

    static {
        Object[] objArr = new Object[0];
        f5042d = objArr;
        f5043e = new f6(objArr, 0, false);
    }

    public f6(Object[] objArr, int i5, boolean z5) {
        super(z5);
        this.f5044b = objArr;
        this.f5045c = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        a();
        if (i5 < 0 || i5 > (i10 = this.f5045c)) {
            throw new IndexOutOfBoundsException(t4.a(this.f5045c, i5, (byte) 13, "Index:", ", Size:"));
        }
        int i11 = i5 + 1;
        Object[] objArr = this.f5044b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i5, objArr, i11, i10 - i5);
        } else {
            Object[] objArr2 = new Object[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5044b, 0, objArr2, 0, i5);
            System.arraycopy(this.f5044b, i5, objArr2, i11, this.f5045c - i5);
            this.f5044b = objArr2;
        }
        this.f5044b[i5] = obj;
        this.f5045c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f5045c) {
            throw new IndexOutOfBoundsException(t4.a(this.f5045c, i5, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return this.f5044b[i5];
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final /* bridge */ /* synthetic */ m5 i0(int i5) {
        if (i5 >= this.f5045c) {
            return new f6(i5 == 0 ? f5042d : Arrays.copyOf(this.f5044b, i5), this.f5045c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.r4, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        Object[] objArr = this.f5044b;
        Object obj = objArr[i5];
        if (i5 < this.f5045c - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f5045c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        b(i5);
        Object[] objArr = this.f5044b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5045c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i5 = this.f5045c;
        int length = this.f5044b.length;
        if (i5 == length) {
            this.f5044b = Arrays.copyOf(this.f5044b, androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f5044b;
        int i10 = this.f5045c;
        this.f5045c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
