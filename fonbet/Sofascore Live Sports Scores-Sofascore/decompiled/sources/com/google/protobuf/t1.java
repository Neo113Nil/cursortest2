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
public final class t1 extends b implements Internal.LongList, RandomAccess, e7f {
    public static final t1 c = new t1(new long[0], 0, false);
    public long[] a;
    public int b;

    public t1() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.a;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[vxd.c(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.a, i, jArr2, i + 1, this.b - i);
            this.a = jArr2;
        }
        this.a[i] = longValue;
        this.b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof t1)) {
            return super.addAll(collection);
        }
        t1 t1Var = (t1) collection;
        int i = t1Var.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.a;
        if (i3 > jArr.length) {
            jArr = Arrays.copyOf(jArr, i3);
            this.a = jArr;
        }
        System.arraycopy(t1Var.a, 0, jArr, this.b, t1Var.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public final void addLong(long j) {
        ensureIsMutable();
        int i = this.b;
        long[] jArr = this.a;
        if (i == jArr.length) {
            long[] jArr2 = new long[vxd.c(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.a = jArr2;
            jArr = jArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        jArr[i2] = j;
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
        if (!(obj instanceof t1)) {
            return super.equals(obj);
        }
        t1 t1Var = (t1) obj;
        if (this.b != t1Var.b) {
            return false;
        }
        long[] jArr = t1Var.a;
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long getLong(int i) {
        c(i);
        return this.a[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Internal.hashLong(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.b) {
            return new t1(Arrays.copyOf(this.a, i), this.b, true);
        }
        ilg.c();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        c(i);
        long[] jArr = this.a;
        long j = jArr[i];
        if (i < this.b - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            zzl.r("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.a;
        System.arraycopy(jArr, i2, jArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(setLong(i, ((Long) obj).longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long setLong(int i, long j) {
        ensureIsMutable();
        c(i);
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    public t1(long[] jArr, int i, boolean z) {
        super(z);
        this.a = jArr;
        this.b = i;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
