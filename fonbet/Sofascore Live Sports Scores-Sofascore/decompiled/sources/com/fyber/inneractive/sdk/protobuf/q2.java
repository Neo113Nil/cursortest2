package com.fyber.inneractive.sdk.protobuf;

import defpackage.ilg;
import defpackage.pvd;
import defpackage.vxd;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q2 extends c implements RandomAccess {
    public static final q2 d;
    public Object[] b;
    public int c;

    static {
        q2 q2Var = new q2(new Object[0], 0);
        d = q2Var;
        q2Var.a = false;
    }

    public q2(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.c)) {
            pvd.m(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[vxd.c(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i) {
        if (i >= this.c) {
            return new q2(Arrays.copyOf(this.b, i), this.c);
        }
        ilg.c();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i];
        }
        pvd.m(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        c();
        if (i < 0 || i >= (i2 = this.c)) {
            pvd.m(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
            return null;
        }
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        if (i < 0 || i >= this.c) {
            pvd.m(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
            return null;
        }
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.b = objArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
