package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5900f extends AbstractC5897c<Boolean> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean[] f59367d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f59368b;

    /* renamed from: c, reason: collision with root package name */
    private int f59369c;

    static {
        boolean[] zArr = new boolean[0];
        f59367d = zArr;
        new C5900f(zArr, 0, false);
    }

    C5900f() {
        this(f59367d, 0, true);
    }

    private void b(int i11) {
        if (i11 < 0 || i11 >= this.f59369c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59369c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f59369c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59369c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        boolean[] zArr = this.f59368b;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[Ep.a.a(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59368b, 0, zArr2, 0, i11);
            System.arraycopy(this.f59368b, i11, zArr2, i11 + 1, this.f59369c - i11);
            this.f59368b = zArr2;
        }
        this.f59368b[i11] = booleanValue;
        this.f59369c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        byte[] bArr = C5919z.f59481b;
        collection.getClass();
        if (!(collection instanceof C5900f)) {
            return super.addAll(collection);
        }
        C5900f c5900f = (C5900f) collection;
        int i11 = c5900f.f59369c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f59369c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.f59368b;
        if (i13 > zArr.length) {
            this.f59368b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(c5900f.f59368b, 0, this.f59368b, this.f59369c, c5900f.f59369c);
        this.f59369c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z11) {
        a();
        int i11 = this.f59369c;
        boolean[] zArr = this.f59368b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[Ep.a.a(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59368b, 0, zArr2, 0, this.f59369c);
            this.f59368b = zArr2;
        }
        boolean[] zArr3 = this.f59368b;
        int i12 = this.f59369c;
        this.f59369c = i12 + 1;
        zArr3[i12] = z11;
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
        if (!(obj instanceof C5900f)) {
            return super.equals(obj);
        }
        C5900f c5900f = (C5900f) obj;
        if (this.f59369c != c5900f.f59369c) {
            return false;
        }
        boolean[] zArr = c5900f.f59368b;
        for (int i11 = 0; i11 < this.f59369c; i11++) {
            if (this.f59368b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Boolean.valueOf(getBoolean(i11));
    }

    public final boolean getBoolean(int i11) {
        b(i11);
        return this.f59368b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f59369c; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.f59368b[i12];
            byte[] bArr = C5919z.f59481b;
            i11 = i13 + (z11 ? 1231 : 1237);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i11 = this.f59369c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f59368b[i12] == booleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.d
    public final C5919z.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f59369c) {
            return new C5900f(i11 == 0 ? f59367d : Arrays.copyOf(this.f59368b, i11), this.f59369c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        b(i11);
        boolean[] zArr = this.f59368b;
        boolean z11 = zArr[i11];
        if (i11 < this.f59369c - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (r2 - i11) - 1);
        }
        this.f59369c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f59368b;
        System.arraycopy(zArr, i12, zArr, i11, this.f59369c - i12);
        this.f59369c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        b(i11);
        boolean[] zArr = this.f59368b;
        boolean z11 = zArr[i11];
        zArr[i11] = booleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59369c;
    }

    private C5900f(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.f59368b = zArr;
        this.f59369c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
