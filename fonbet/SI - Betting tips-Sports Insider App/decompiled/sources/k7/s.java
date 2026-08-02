package k7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class s extends o implements NavigableSet, b0, SortedSet {

    /* renamed from: d, reason: collision with root package name */
    public final transient Comparator f18916d;

    /* renamed from: e, reason: collision with root package name */
    public transient s f18917e;

    public s(Comparator comparator) {
        this.f18916d = comparator;
    }

    public static y m(Comparator comparator) {
        if (u.f18923b.equals(comparator)) {
            return y.f18938g;
        }
        i iVar = m.f18895b;
        return new y(w.f18928e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f18916d;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.q(0, yVar.o(obj, false));
    }

    @Override // java.util.NavigableSet
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final s descendingSet() {
        s sVar = this.f18917e;
        if (sVar == null) {
            y yVar = (y) this;
            Comparator reverseOrder = Collections.reverseOrder(yVar.f18916d);
            sVar = yVar.isEmpty() ? m(reverseOrder) : new y(yVar.f18939f.f(), reverseOrder);
            this.f18917e = sVar;
            sVar.f18917e = this;
        }
        return sVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final y subSet(Object obj, boolean z5, Object obj2, boolean z7) {
        obj.getClass();
        obj2.getClass();
        if (this.f18916d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        y yVar = (y) this;
        y q = yVar.q(yVar.p(obj, z5), yVar.f18939f.size());
        return q.q(0, q.o(obj2, z7));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.q(yVar.p(obj, true), yVar.f18939f.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z5) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.q(0, yVar.o(obj, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z5) {
        obj.getClass();
        y yVar = (y) this;
        return yVar.q(yVar.p(obj, z5), yVar.f18939f.size());
    }
}
