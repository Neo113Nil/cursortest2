package com.google.common.collect;

import java.util.Objects;

/* loaded from: classes3.dex */
public class Z extends AbstractC3445z {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC3445z f36746c = new Z(new Object[0], 0);
    final transient Object[] array;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f36747b;

    public Z(Object[] objArr, int i10) {
        this.array = objArr;
        this.f36747b = i10;
    }

    @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.array, 0, objArr, i10, this.f36747b);
        return i10 + this.f36747b;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public Object[] c() {
        return this.array;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int e() {
        return this.f36747b;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int f() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC3443x
    public boolean g() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i10) {
        Ra.n.i(i10, this.f36747b);
        Object obj = this.array[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36747b;
    }

    @Override // com.google.common.collect.AbstractC3445z, com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return super.writeReplace();
    }
}
