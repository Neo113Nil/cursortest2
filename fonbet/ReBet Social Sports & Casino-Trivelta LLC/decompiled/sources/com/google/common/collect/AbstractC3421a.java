package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3421a extends n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f36748a;

    /* renamed from: b, reason: collision with root package name */
    public int f36749b;

    public AbstractC3421a(int i10) {
        this(i10, 0);
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f36749b < this.f36748a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36749b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f36749b;
        this.f36749b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36749b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f36749b - 1;
        this.f36749b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36749b - 1;
    }

    public AbstractC3421a(int i10, int i11) {
        Ra.n.m(i11, i10);
        this.f36748a = i10;
        this.f36749b = i11;
    }
}
