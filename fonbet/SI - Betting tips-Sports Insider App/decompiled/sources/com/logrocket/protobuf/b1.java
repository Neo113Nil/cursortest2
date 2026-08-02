package com.logrocket.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 extends b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final b1 f6669d = new b1(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6670b;

    /* renamed from: c, reason: collision with root package name */
    public int f6671c;

    public b1(Object[] objArr, int i5, boolean z5) {
        super(z5);
        this.f6670b = objArr;
        this.f6671c = i5;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i5 = this.f6671c;
        Object[] objArr = this.f6670b;
        if (i5 == objArr.length) {
            this.f6670b = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6670b;
        int i10 = this.f6671c;
        this.f6671c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i5) {
        if (i5 < 0 || i5 >= this.f6671c) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
            r5.append(this.f6671c);
            throw new IndexOutOfBoundsException(r5.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        b(i5);
        return this.f6670b[i5];
    }

    @Override // com.logrocket.protobuf.c0
    public final c0 r(int i5) {
        if (i5 >= this.f6671c) {
            return new b1(Arrays.copyOf(this.f6670b, i5), this.f6671c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        b(i5);
        Object[] objArr = this.f6670b;
        Object obj = objArr[i5];
        if (i5 < this.f6671c - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f6671c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        b(i5);
        Object[] objArr = this.f6670b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6671c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        a();
        if (i5 >= 0 && i5 <= (i10 = this.f6671c)) {
            Object[] objArr = this.f6670b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i5, objArr, i5 + 1, i10 - i5);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i5);
                System.arraycopy(this.f6670b, i5, objArr2, i5 + 1, this.f6671c - i5);
                this.f6670b = objArr2;
            }
            this.f6670b[i5] = obj;
            this.f6671c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "Index:", ", Size:");
        r5.append(this.f6671c);
        throw new IndexOutOfBoundsException(r5.toString());
    }
}
