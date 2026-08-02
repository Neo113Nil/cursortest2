package m7;

import f8.t;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends t implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f20463b;

    /* renamed from: c, reason: collision with root package name */
    public int f20464c;

    /* renamed from: d, reason: collision with root package name */
    public final n f20465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, int i5) {
        super(2);
        int size = nVar.size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(y4.a.O(i5, size, "index"));
        }
        this.f20463b = size;
        this.f20464c = i5;
        this.f20465d = nVar;
    }

    public final Object a(int i5) {
        return this.f20465d.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20464c < this.f20463b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20464c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f20464c;
        this.f20464c = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20464c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f20464c - 1;
        this.f20464c = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20464c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
