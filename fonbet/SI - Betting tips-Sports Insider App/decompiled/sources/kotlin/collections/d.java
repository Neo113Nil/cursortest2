package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends gf.x implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f19199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i5) {
        super(4, fVar);
        this.f19199d = fVar;
        c cVar = f.Companion;
        int size = fVar.size();
        cVar.getClass();
        c.c(i5, size);
        this.f10045b = i5;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10045b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10045b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f10045b - 1;
        this.f10045b = i5;
        return this.f19199d.get(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10045b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
