package f7;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements ListIterator, Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f9483a;

    /* renamed from: b, reason: collision with root package name */
    public int f9484b;

    /* renamed from: c, reason: collision with root package name */
    public final j f9485c;

    public h(j jVar, int i5) {
        int size = jVar.size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(e.f(i5, size, "index"));
        }
        this.f9483a = size;
        this.f9484b = i5;
        this.f9485c = jVar;
    }

    public final Object a(int i5) {
        return this.f9485c.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9484b < this.f9483a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9484b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f9484b;
        this.f9484b = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9484b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f9484b - 1;
        this.f9484b = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9484b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
