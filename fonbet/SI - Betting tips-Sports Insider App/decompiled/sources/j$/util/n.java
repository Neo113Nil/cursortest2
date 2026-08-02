package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class n implements ListIterator, y {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f17758a;

    public n(o oVar, int i5) {
        this.f17758a = oVar.f17760b.listIterator(i5);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17758a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f17758a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17758a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f17758a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17758a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17758a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        Iterator$EL.forEachRemaining(this.f17758a, consumer);
    }
}
