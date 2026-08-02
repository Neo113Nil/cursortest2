package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class E<T> extends f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f59013a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59014b;

    E(T t2) {
        this.f59013a = t2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f59014b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.f59014b) {
            throw new NoSuchElementException();
        }
        this.f59014b = true;
        return this.f59013a;
    }
}
