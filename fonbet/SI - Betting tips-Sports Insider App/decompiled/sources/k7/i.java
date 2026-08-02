package k7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends c0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f18871a;

    /* renamed from: b, reason: collision with root package name */
    public int f18872b;

    /* renamed from: c, reason: collision with root package name */
    public final m f18873c;

    public i(m mVar, int i5) {
        int size = mVar.size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(a.o(i5, size, "index"));
        }
        this.f18871a = size;
        this.f18872b = i5;
        this.f18873c = mVar;
    }

    public final Object a(int i5) {
        return this.f18873c.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18872b < this.f18871a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18872b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f18872b;
        this.f18872b = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18872b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f18872b - 1;
        this.f18872b = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18872b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
