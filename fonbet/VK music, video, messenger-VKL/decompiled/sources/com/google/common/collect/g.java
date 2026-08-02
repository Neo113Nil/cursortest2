package com.google.common.collect;

import java.util.Objects;
import xsna.fxc0;

/* compiled from: RegularImmutableList.java */
/* loaded from: classes.dex */
public final class g<E> extends ImmutableList<E> {
    public static final g f = new g(new Object[0], 0);
    public final transient Object[] d;
    public final transient int e;

    public g(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int e(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.d;
    }

    @Override // java.util.List
    public final E get(int i) {
        fxc0.s(i, this.e);
        E e = (E) this.d[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
