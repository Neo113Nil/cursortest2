package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5915v extends AbstractC5897c<Float> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f59471d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f59472b;

    /* renamed from: c, reason: collision with root package name */
    private int f59473c;

    static {
        float[] fArr = new float[0];
        f59471d = fArr;
        new C5915v(fArr, 0, false);
    }

    C5915v() {
        this(f59471d, 0, true);
    }

    private void c(int i11) {
        if (i11 < 0 || i11 >= this.f59473c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59473c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f59473c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59473c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        float[] fArr = this.f59472b;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[Ep.a.a(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59472b, 0, fArr2, 0, i11);
            System.arraycopy(this.f59472b, i11, fArr2, i11 + 1, this.f59473c - i11);
            this.f59472b = fArr2;
        }
        this.f59472b[i11] = floatValue;
        this.f59473c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        byte[] bArr = C5919z.f59481b;
        collection.getClass();
        if (!(collection instanceof C5915v)) {
            return super.addAll(collection);
        }
        C5915v c5915v = (C5915v) collection;
        int i11 = c5915v.f59473c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f59473c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.f59472b;
        if (i13 > fArr.length) {
            this.f59472b = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(c5915v.f59472b, 0, this.f59472b, this.f59473c, c5915v.f59473c);
        this.f59473c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f7) {
        a();
        int i11 = this.f59473c;
        float[] fArr = this.f59472b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[Ep.a.a(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59472b, 0, fArr2, 0, this.f59473c);
            this.f59472b = fArr2;
        }
        float[] fArr3 = this.f59472b;
        int i12 = this.f59473c;
        this.f59473c = i12 + 1;
        fArr3[i12] = f7;
    }

    final void b(int i11) {
        float[] fArr = this.f59472b;
        if (i11 <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.f59472b = new float[Math.max(i11, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i11) {
            length = Ep.a.a(length, 3, 2, 1, 10);
        }
        this.f59472b = Arrays.copyOf(this.f59472b, length);
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
        if (!(obj instanceof C5915v)) {
            return super.equals(obj);
        }
        C5915v c5915v = (C5915v) obj;
        if (this.f59473c != c5915v.f59473c) {
            return false;
        }
        float[] fArr = c5915v.f59472b;
        for (int i11 = 0; i11 < this.f59473c; i11++) {
            if (Float.floatToIntBits(this.f59472b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Float.valueOf(getFloat(i11));
    }

    public final float getFloat(int i11) {
        c(i11);
        return this.f59472b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f59473c; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.f59472b[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i11 = this.f59473c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f59472b[i12] == floatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.d
    public final C5919z.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f59473c) {
            return new C5915v(i11 == 0 ? f59471d : Arrays.copyOf(this.f59472b, i11), this.f59473c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        c(i11);
        float[] fArr = this.f59472b;
        float f7 = fArr[i11];
        if (i11 < this.f59473c - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (r2 - i11) - 1);
        }
        this.f59473c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f59472b;
        System.arraycopy(fArr, i12, fArr, i11, this.f59473c - i12);
        this.f59473c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i11);
        float[] fArr = this.f59472b;
        float f7 = fArr[i11];
        fArr[i11] = floatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59473c;
    }

    private C5915v(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.f59472b = fArr;
        this.f59473c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
