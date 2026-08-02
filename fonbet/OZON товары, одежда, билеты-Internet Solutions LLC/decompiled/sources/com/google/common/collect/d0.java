package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes9.dex */
abstract class d0<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f59064a;

    d0(Iterator<? extends F> it) {
        it.getClass();
        this.f59064a = it;
    }

    abstract T a(F f7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59064a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f59064a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f59064a.remove();
    }
}
