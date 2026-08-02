package com.google.common.collect;

import Bl0.k0;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5857a<E> extends g0<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f59057a;

    /* renamed from: b, reason: collision with root package name */
    private int f59058b;

    protected AbstractC5857a(int i11, int i12) {
        k0.h(i12, i11);
        this.f59057a = i11;
        this.f59058b = i12;
    }

    protected abstract E a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f59058b < this.f59057a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f59058b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f59058b;
        this.f59058b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f59058b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f59058b - 1;
        this.f59058b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f59058b - 1;
    }
}
