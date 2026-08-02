package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.ilg;
import defpackage.lnb;
import defpackage.pvd;
import defpackage.vxd;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f2 extends b implements RandomAccess {
    public static final f2 c = new f2(new Object[0], 0, false);
    public Object[] a;
    public int b;

    public f2(Object[] objArr, int i, boolean z) {
        super(z);
        this.a = objArr;
        this.b = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.a;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[vxd.c(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.a, i, objArr2, i + 1, this.b - i);
            this.a = objArr2;
        }
        this.a[i] = obj;
        this.b++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.b) {
            pvd.m(this.b, lnb.t(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.a[i];
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i) {
        if (i >= this.b) {
            return new f2(Arrays.copyOf(this.a, i), this.b, true);
        }
        ilg.c();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        c(i);
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i < this.b - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ensureIsMutable();
        c(i);
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.a = objArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
