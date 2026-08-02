package com.google.common.collect;

/* loaded from: classes.dex */
final class c0<E> extends A<E> {

    /* renamed from: d, reason: collision with root package name */
    final transient E f59063d;

    c0(E e11) {
        e11.getClass();
        this.f59063d = e11;
    }

    @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w
    public final AbstractC5880y<E> a() {
        return AbstractC5880y.B(this.f59063d);
    }

    @Override // com.google.common.collect.AbstractC5878w
    final int b(int i11, Object[] objArr) {
        objArr[i11] = this.f59063d;
        return i11 + 1;
    }

    @Override // com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f59063d.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC5878w
    final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.A, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f59063d.hashCode();
    }

    @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public final f0<E> iterator() {
        return new E(this.f59063d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f59063d.toString() + ']';
    }

    @Override // com.google.common.collect.A, com.google.common.collect.AbstractC5878w
    Object writeReplace() {
        return super.writeReplace();
    }
}
