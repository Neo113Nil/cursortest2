package com.google.common.collect;

import Bl0.k0;
import java.util.Objects;

/* loaded from: classes.dex */
final class U<E> extends AbstractC5880y<E> {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC5880y<Object> f59030f = new U(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f59031d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f59032e;

    U(Object[] objArr, int i11) {
        this.f59031d = objArr;
        this.f59032e = i11;
    }

    @Override // com.google.common.collect.AbstractC5880y, com.google.common.collect.AbstractC5878w
    final int b(int i11, Object[] objArr) {
        Object[] objArr2 = this.f59031d;
        int i12 = this.f59032e;
        System.arraycopy(objArr2, 0, objArr, i11, i12);
        return i11 + i12;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final Object[] e() {
        return this.f59031d;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final int f() {
        return this.f59032e;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i11) {
        k0.f(i11, this.f59032e);
        E e11 = (E) this.f59031d[i11];
        Objects.requireNonNull(e11);
        return e11;
    }

    @Override // com.google.common.collect.AbstractC5878w
    final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59032e;
    }

    @Override // com.google.common.collect.AbstractC5880y, com.google.common.collect.AbstractC5878w
    Object writeReplace() {
        return super.writeReplace();
    }
}
