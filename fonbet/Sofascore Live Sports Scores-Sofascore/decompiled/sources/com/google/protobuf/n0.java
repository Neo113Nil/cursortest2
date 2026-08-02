package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.e7f;
import defpackage.ilg;
import defpackage.lnb;
import defpackage.pvd;
import defpackage.vxd;
import defpackage.zzl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n0 extends b implements Internal.DoubleList, RandomAccess, e7f {
    public static final n0 c = new n0(new double[0], 0, false);
    public double[] a;
    public int b;

    public n0(double[] dArr, int i, boolean z) {
        super(z);
        this.a = dArr;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
            return;
        }
        double[] dArr = this.a;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[vxd.c(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.a, i, dArr2, i + 1, this.b - i);
            this.a = dArr2;
        }
        this.a[i] = doubleValue;
        this.b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof n0)) {
            return super.addAll(collection);
        }
        n0 n0Var = (n0) collection;
        int i = n0Var.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.a;
        if (i3 > dArr.length) {
            dArr = Arrays.copyOf(dArr, i3);
            this.a = dArr;
        }
        System.arraycopy(n0Var.a, 0, dArr, this.b, n0Var.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final void addDouble(double d) {
        ensureIsMutable();
        int i = this.b;
        double[] dArr = this.a;
        if (i == dArr.length) {
            double[] dArr2 = new double[vxd.c(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.a = dArr2;
            dArr = dArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        dArr[i2] = d;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.b) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return super.equals(obj);
        }
        n0 n0Var = (n0) obj;
        if (this.b != n0Var.b) {
            return false;
        }
        double[] dArr = n0Var.a;
        for (int i = 0; i < this.b; i++) {
            if (Double.doubleToLongBits(this.a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double getDouble(int i) {
        c(i);
        return this.a[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Internal.hashLong(Double.doubleToLongBits(this.a[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i) {
        if (i >= this.b) {
            return new n0(Arrays.copyOf(this.a, i), this.b, true);
        }
        ilg.c();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        c(i);
        double[] dArr = this.a;
        double d = dArr[i];
        if (i < this.b - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            zzl.r("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.a;
        System.arraycopy(dArr, i2, dArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Double.valueOf(setDouble(i, ((Double) obj).doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double setDouble(int i, double d) {
        ensureIsMutable();
        c(i);
        double[] dArr = this.a;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
