package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5918y extends AbstractC5897c<Integer> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f59477d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f59478b;

    /* renamed from: c, reason: collision with root package name */
    private int f59479c;

    static {
        int[] iArr = new int[0];
        f59477d = iArr;
        new C5918y(iArr, 0, false);
    }

    C5918y() {
        this(f59477d, 0, true);
    }

    private void c(int i11) {
        if (i11 < 0 || i11 >= this.f59479c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59479c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f59479c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59479c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        int[] iArr = this.f59478b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
        } else {
            int[] iArr2 = new int[Ep.a.a(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59478b, 0, iArr2, 0, i11);
            System.arraycopy(this.f59478b, i11, iArr2, i11 + 1, this.f59479c - i11);
            this.f59478b = iArr2;
        }
        this.f59478b[i11] = intValue;
        this.f59479c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        byte[] bArr = C5919z.f59481b;
        collection.getClass();
        if (!(collection instanceof C5918y)) {
            return super.addAll(collection);
        }
        C5918y c5918y = (C5918y) collection;
        int i11 = c5918y.f59479c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f59479c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f59478b;
        if (i13 > iArr.length) {
            this.f59478b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(c5918y.f59478b, 0, this.f59478b, this.f59479c, c5918y.f59479c);
        this.f59479c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i11) {
        a();
        int i12 = this.f59479c;
        int[] iArr = this.f59478b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[Ep.a.a(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59478b, 0, iArr2, 0, this.f59479c);
            this.f59478b = iArr2;
        }
        int[] iArr3 = this.f59478b;
        int i13 = this.f59479c;
        this.f59479c = i13 + 1;
        iArr3[i13] = i11;
    }

    final void b(int i11) {
        int[] iArr = this.f59478b;
        if (i11 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f59478b = new int[Math.max(i11, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i11) {
            length = Ep.a.a(length, 3, 2, 1, 10);
        }
        this.f59478b = Arrays.copyOf(this.f59478b, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5918y)) {
            return super.equals(obj);
        }
        C5918y c5918y = (C5918y) obj;
        if (this.f59479c != c5918y.f59479c) {
            return false;
        }
        int[] iArr = c5918y.f59478b;
        for (int i11 = 0; i11 < this.f59479c; i11++) {
            if (this.f59478b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    public final int getInt(int i11) {
        c(i11);
        return this.f59478b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f59479c; i12++) {
            i11 = (i11 * 31) + this.f59478b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i11 = this.f59479c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f59478b[i12] == intValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.d
    public final C5919z.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f59479c) {
            return new C5918y(i11 == 0 ? f59477d : Arrays.copyOf(this.f59478b, i11), this.f59479c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        c(i11);
        int[] iArr = this.f59478b;
        int i12 = iArr[i11];
        if (i11 < this.f59479c - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f59479c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f59478b;
        System.arraycopy(iArr, i12, iArr, i11, this.f59479c - i12);
        this.f59479c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i11);
        int[] iArr = this.f59478b;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59479c;
    }

    private C5918y(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f59478b = iArr;
        this.f59479c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
