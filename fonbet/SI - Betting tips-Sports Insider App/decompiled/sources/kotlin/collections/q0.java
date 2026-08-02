package kotlin.collections;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 implements ListIterator, KMutableListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f19214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f19215b;

    public q0(r0 r0Var, int i5) {
        this.f19215b = r0Var;
        this.f19214a = r0Var.f19216a.listIterator(a0.u(i5, r0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f19214a;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19214a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19214a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f19214a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return u.e(this.f19215b) - this.f19214a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f19214a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return u.e(this.f19215b) - this.f19214a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f19214a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f19214a.set(obj);
    }
}
