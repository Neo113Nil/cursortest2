package kotlin.collections;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 implements ListIterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f19217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f19218b;

    public s0(t0 t0Var, int i5) {
        this.f19218b = t0Var;
        this.f19217a = ((List) t0Var.f19220b).listIterator(a0.u(i5, t0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19217a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19217a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f19217a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return u.e(this.f19218b) - this.f19217a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f19217a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return u.e(this.f19218b) - this.f19217a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
