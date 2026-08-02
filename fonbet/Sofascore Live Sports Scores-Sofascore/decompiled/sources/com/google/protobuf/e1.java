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
public final class e1 extends b implements Internal.FloatList, RandomAccess, e7f {
    public static final e1 c = new e1(new float[0], 0, false);
    public float[] a;
    public int b;

    public e1(float[] fArr, int i, boolean z) {
        super(z);
        this.a = fArr;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
            return;
        }
        float[] fArr = this.a;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[vxd.c(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.a, i, fArr2, i + 1, this.b - i);
            this.a = fArr2;
        }
        this.a[i] = floatValue;
        this.b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof e1)) {
            return super.addAll(collection);
        }
        e1 e1Var = (e1) collection;
        int i = e1Var.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.a;
        if (i3 > fArr.length) {
            fArr = Arrays.copyOf(fArr, i3);
            this.a = fArr;
        }
        System.arraycopy(e1Var.a, 0, fArr, this.b, e1Var.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final void addFloat(float f) {
        ensureIsMutable();
        int i = this.b;
        float[] fArr = this.a;
        if (i == fArr.length) {
            float[] fArr2 = new float[vxd.c(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.a = fArr2;
            fArr = fArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        fArr[i2] = f;
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
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        if (this.b != e1Var.b) {
            return false;
        }
        float[] fArr = e1Var.a;
        for (int i = 0; i < this.b; i++) {
            if (Float.floatToIntBits(this.a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float getFloat(int i) {
        c(i);
        return this.a[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i) {
        if (i >= this.b) {
            return new e1(Arrays.copyOf(this.a, i), this.b, true);
        }
        ilg.c();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        c(i);
        float[] fArr = this.a;
        float f = fArr[i];
        if (i < this.b - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            zzl.r("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.a;
        System.arraycopy(fArr, i2, fArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(setFloat(i, ((Float) obj).floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float setFloat(int i, float f) {
        ensureIsMutable();
        c(i);
        float[] fArr = this.a;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
