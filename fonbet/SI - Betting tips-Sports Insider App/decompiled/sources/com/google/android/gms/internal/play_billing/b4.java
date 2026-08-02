package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b4 extends u2 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f5402d;

    /* renamed from: e, reason: collision with root package name */
    public static final b4 f5403e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5404b;

    /* renamed from: c, reason: collision with root package name */
    public int f5405c;

    static {
        Object[] objArr = new Object[0];
        f5402d = objArr;
        f5403e = new b4(objArr, 0, false);
    }

    public b4(Object[] objArr, int i5, boolean z5) {
        super(z5);
        this.f5404b = objArr;
        this.f5405c = i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        a();
        if (i5 < 0 || i5 > (i10 = this.f5405c)) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index:", ", Size:", this.f5405c));
        }
        int i11 = i5 + 1;
        Object[] objArr = this.f5404b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i5, objArr, i11, i10 - i5);
        } else {
            Object[] objArr2 = new Object[androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10)];
            System.arraycopy(this.f5404b, 0, objArr2, 0, i5);
            System.arraycopy(this.f5404b, i5, objArr2, i11, this.f5405c - i5);
            this.f5404b = objArr2;
        }
        this.f5404b[i5] = obj;
        this.f5405c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f5405c) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index:", ", Size:", this.f5405c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return this.f5404b[i5];
    }

    @Override // com.google.android.gms.internal.play_billing.k3
    public final /* bridge */ /* synthetic */ k3 k(int i5) {
        if (i5 >= this.f5405c) {
            return new b4(i5 == 0 ? f5402d : Arrays.copyOf(this.f5404b, i5), this.f5405c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.u2, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        Object[] objArr = this.f5404b;
        Object obj = objArr[i5];
        if (i5 < this.f5405c - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f5405c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        b(i5);
        Object[] objArr = this.f5404b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5405c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i5 = this.f5405c;
        int length = this.f5404b.length;
        if (i5 == length) {
            this.f5404b = Arrays.copyOf(this.f5404b, androidx.appcompat.widget.c1.h(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f5404b;
        int i10 = this.f5405c;
        this.f5405c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
