package com.google.common.collect;

import xsna.egi;
import xsna.s4q0;

/* compiled from: RegularImmutableSet.java */
/* loaded from: classes.dex */
public final class i<E> extends ImmutableSet<E> {
    public static final Object[] j;
    public static final i<Object> k;
    public final transient Object[] e;
    public final transient int f;
    public final transient Object[] g;
    public final transient int h;
    public final transient int i;

    static {
        Object[] objArr = new Object[0];
        j = objArr;
        k = new i<>(objArr, 0, objArr, 0, 0);
    }

    public i(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.e = objArr;
        this.f = i;
        this.g = objArr2;
        this.h = i2;
        this.i = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.g;
            if (objArr.length != 0) {
                int r = egi.r(obj);
                while (true) {
                    int i = r & this.h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    r = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i, Object[] objArr) {
        Object[] objArr2 = this.e;
        int i2 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final s4q0<E> iterator() {
        return d().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> o() {
        return ImmutableList.l(this.i, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
