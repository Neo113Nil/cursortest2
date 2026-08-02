package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends c1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f5392a;

    /* renamed from: b, reason: collision with root package name */
    public int f5393b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f5394c;

    public a0(d0 d0Var, int i5) {
        int size = d0Var.size();
        d3.r(i5, size);
        this.f5392a = size;
        this.f5393b = i5;
        this.f5394c = d0Var;
    }

    public final Object a(int i5) {
        return this.f5394c.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5393b < this.f5392a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5393b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f5393b;
        this.f5393b = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5393b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f5393b - 1;
        this.f5393b = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5393b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
