package com.google.common.collect;

import java.util.ListIterator;

/* loaded from: classes9.dex */
abstract class e0<F, T> extends d0<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public final void add(T t2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f59064a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f59064a).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f59064a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f59064a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t2) {
        throw new UnsupportedOperationException();
    }
}
