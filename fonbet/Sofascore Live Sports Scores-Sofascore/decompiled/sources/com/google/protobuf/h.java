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
public final class h extends b implements Internal.BooleanList, RandomAccess, e7f {
    public static final h c = new h(new boolean[0], 0, false);
    public boolean[] a;
    public int b;

    public h(boolean[] zArr, int i, boolean z) {
        super(z);
        this.a = zArr;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
            return;
        }
        boolean[] zArr = this.a;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[vxd.c(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.a, i, zArr2, i + 1, this.b - i);
            this.a = zArr2;
        }
        this.a[i] = booleanValue;
        this.b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i = hVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.a;
        if (i3 > zArr.length) {
            zArr = Arrays.copyOf(zArr, i3);
            this.a = zArr;
        }
        System.arraycopy(hVar.a, 0, zArr, this.b, hVar.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.b;
        boolean[] zArr = this.a;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[vxd.c(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.a = zArr2;
            zArr = zArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        zArr[i2] = z;
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
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.b != hVar.b) {
            return false;
        }
        boolean[] zArr = hVar.a;
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i) {
        c(i);
        return this.a[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i) {
        if (i >= this.b) {
            return new h(Arrays.copyOf(this.a, i), this.b, true);
        }
        ilg.c();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        c(i);
        boolean[] zArr = this.a;
        boolean z = zArr[i];
        if (i < this.b - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            zzl.r("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.a;
        System.arraycopy(zArr, i2, zArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Boolean.valueOf(setBoolean(i, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        c(i);
        boolean[] zArr = this.a;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
