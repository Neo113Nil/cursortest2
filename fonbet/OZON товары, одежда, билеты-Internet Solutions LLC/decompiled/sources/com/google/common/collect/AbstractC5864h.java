package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC5864h<T> extends f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f59101a;

    protected AbstractC5864h(T t2) {
        this.f59101a = t2;
    }

    protected abstract T a(T t2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59101a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t2 = this.f59101a;
        if (t2 == null) {
            throw new NoSuchElementException();
        }
        this.f59101a = a(t2);
        return t2;
    }
}
