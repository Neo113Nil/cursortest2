package j7;

import f8.t;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends t implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f18265b;

    /* renamed from: c, reason: collision with root package name */
    public int f18266c;

    /* renamed from: d, reason: collision with root package name */
    public final e f18267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i5) {
        super(1);
        int size = eVar.size();
        if (i5 < 0 || i5 > size) {
            throw new IndexOutOfBoundsException(y4.a.M(i5, size, "index"));
        }
        this.f18265b = size;
        this.f18266c = i5;
        this.f18267d = eVar;
    }

    public final Object a(int i5) {
        return this.f18267d.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18266c < this.f18265b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18266c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f18266c;
        this.f18266c = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18266c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f18266c - 1;
        this.f18266c = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18266c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
