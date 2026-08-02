package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5908n extends AbstractC5897c<Double> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final double[] f59435d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f59436b;

    /* renamed from: c, reason: collision with root package name */
    private int f59437c;

    static {
        double[] dArr = new double[0];
        f59435d = dArr;
        new C5908n(dArr, 0, false);
    }

    C5908n() {
        this(f59435d, 0, true);
    }

    private void c(int i11) {
        if (i11 < 0 || i11 >= this.f59437c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59437c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f59437c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59437c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        double[] dArr = this.f59436b;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
        } else {
            double[] dArr2 = new double[Ep.a.a(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59436b, 0, dArr2, 0, i11);
            System.arraycopy(this.f59436b, i11, dArr2, i11 + 1, this.f59437c - i11);
            this.f59436b = dArr2;
        }
        this.f59436b[i11] = doubleValue;
        this.f59437c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        byte[] bArr = C5919z.f59481b;
        collection.getClass();
        if (!(collection instanceof C5908n)) {
            return super.addAll(collection);
        }
        C5908n c5908n = (C5908n) collection;
        int i11 = c5908n.f59437c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f59437c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        double[] dArr = this.f59436b;
        if (i13 > dArr.length) {
            this.f59436b = Arrays.copyOf(dArr, i13);
        }
        System.arraycopy(c5908n.f59436b, 0, this.f59436b, this.f59437c, c5908n.f59437c);
        this.f59437c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d11) {
        a();
        int i11 = this.f59437c;
        double[] dArr = this.f59436b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[Ep.a.a(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59436b, 0, dArr2, 0, this.f59437c);
            this.f59436b = dArr2;
        }
        double[] dArr3 = this.f59436b;
        int i12 = this.f59437c;
        this.f59437c = i12 + 1;
        dArr3[i12] = d11;
    }

    final void b(int i11) {
        double[] dArr = this.f59436b;
        if (i11 <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.f59436b = new double[Math.max(i11, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i11) {
            length = Ep.a.a(length, 3, 2, 1, 10);
        }
        this.f59436b = Arrays.copyOf(this.f59436b, length);
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
        if (!(obj instanceof C5908n)) {
            return super.equals(obj);
        }
        C5908n c5908n = (C5908n) obj;
        if (this.f59437c != c5908n.f59437c) {
            return false;
        }
        double[] dArr = c5908n.f59436b;
        for (int i11 = 0; i11 < this.f59437c; i11++) {
            if (Double.doubleToLongBits(this.f59436b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Double.valueOf(getDouble(i11));
    }

    public final double getDouble(int i11) {
        c(i11);
        return this.f59436b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f59437c; i12++) {
            i11 = (i11 * 31) + C5919z.b(Double.doubleToLongBits(this.f59436b[i12]));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i11 = this.f59437c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f59436b[i12] == doubleValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.d
    public final C5919z.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f59437c) {
            return new C5908n(i11 == 0 ? f59435d : Arrays.copyOf(this.f59436b, i11), this.f59437c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        c(i11);
        double[] dArr = this.f59436b;
        double d11 = dArr[i11];
        if (i11 < this.f59437c - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (r3 - i11) - 1);
        }
        this.f59437c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f59436b;
        System.arraycopy(dArr, i12, dArr, i11, this.f59437c - i12);
        this.f59437c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i11);
        double[] dArr = this.f59436b;
        double d11 = dArr[i11];
        dArr[i11] = doubleValue;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59437c;
    }

    private C5908n(double[] dArr, int i11, boolean z11) {
        super(z11);
        this.f59436b = dArr;
        this.f59437c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
